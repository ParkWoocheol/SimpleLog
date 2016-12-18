package com.mrparkwc.simplelog;

import java.lang.reflect.Field;
import java.util.ArrayList;

/**
 * Created by ParkWoocheol on 2016-12-18.
 */

public class Message {

  private static final int SINGLE_OBJECT = -1;

  static String getBasicMessage(String tag, String... logMessages) {
    String message = "";
    for (String logMessage : logMessages) {
      message += "[TAG: " + tag + "] : " + logMessage + "\n";
    }
    return message;
  }


  /**
   * @param tag
   * @param object
   */
  static String getObjectInformationMessage(String tag, Object object) {
    return getRefrectMessage(tag, object, SINGLE_OBJECT);
  }

  /**
   * @param tag
   * @param arrayList
   */
  static String getObjectInformationMessage(String tag, ArrayList<?> arrayList) {
    int lastIndex = arrayList.size();
    String message = "";
    for (int index = 0; index < lastIndex; index++) {
      message += getArrayRefrectMessage(arrayList.get(index), tag, index) + "\n";
    }
    return message;
  }

  /**
   * @param tag
   * @param arrayList
   * @param index
   */
  static String getObjectInformationMessage(String tag, ArrayList<?> arrayList, int index) {
    return getArrayRefrectMessage(arrayList.get(index), tag, index);
  }

  /**
   * @param className
   * @param arrayList
   * @param startIndex
   * @param endIndex
   */
  static String getObjectInformationMessage(String className, ArrayList<?> arrayList, int startIndex, int endIndex) {
    String message = "";
    for (int index = startIndex; index <= endIndex; index++) {
      message += getArrayRefrectMessage(arrayList.get(index), className, index) + "\n";
    }
    return message;
  }

  /**
   * @param object
   * @param tag
   * @param index
   */
  private static String getArrayRefrectMessage(Object object, String tag, int index) {
    return getArrayIndexMessage(tag, index) + "\n" + getRefrectMessage(tag, object, index);
  }

  /**
   * @param tag
   * @param object
   * @param index
   */
  private static String getRefrectMessage(String tag, Object object, int index) {
    String logMessage;

    if (object instanceof String) {
      if (index == SINGLE_OBJECT) {
        logMessage = " COMMENT: " + object.toString();
      } else {
        logMessage = "[" + index + "], COMMENT: " + object.toString();
      }
      return getBasicMessage(tag, logMessage);
    } else {
      String message = "";
      try {
        Class<?> objClass = object.getClass();
        Field[] fields = objClass.getDeclaredFields();
        for (Field field : fields) {
          field.setAccessible(true);
          String name = field.getName();
          Object value = field.get(object);
          String valueMessage;
          if (isValidPrintDataType(value)) {
            valueMessage = "Value -> [ " + value + " ]";
          } else if (value == null) {
            valueMessage = "Value -> [ Target is Null Point. ]";
          } else {
            valueMessage = "Value -> [ Unsupported data type, Please specify this object separately. ]";

          }
          if (index == SINGLE_OBJECT) {
            logMessage = "[ " + object.getClass().getSimpleName() + " ], " + "Variable Name -> [ " + name + " ] " + valueMessage;
          } else {
            logMessage = "[ " + object.getClass().getSimpleName() + " ][" + index + "], " + "Variable Name -> [ " + name + " ] " + valueMessage;
          }
          message += "\n" + getBasicMessage(tag, logMessage);
        }
      } catch (Exception e) {
        e.printStackTrace();
      }
      return message;
    }
  }

  /**
   * @param className
   * @param index
   */
  private static String getArrayIndexMessage(String className, int index) {
    String logMessage = "------------------------- Index: " + index + " -------------------------";
    return getBasicMessage(className, logMessage);
  }

  /**
   * InComplete Function.
   */
  private static boolean isValidPrintDataType(Object object) {
    return object instanceof String || object instanceof Boolean || object instanceof Integer || object instanceof Double
        || object instanceof Long || object instanceof Float || object instanceof Short || object instanceof Character;
  }


}
