/*
 * Copyright (C) 2015 Park, Woocheol
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.mrparkwc.simplelog;

import java.lang.reflect.Field;
import java.util.ArrayList;


/**
 * Developed by Park, Woocheol
 * Email: admin@mrparkwc.com
 * GitHub: https://github.com/ParkWoocheol
 */
class Message {

    private static final int SINGLE_OBJECT = -1;

    static String getBasicMessage(String tag, String... logMessages) {
        StringBuilder message = new StringBuilder();
        for (String logMessage : logMessages) {
            message.append("[TAG: ").append(tag).append("] : ").append(logMessage).append("\n");
        }
        return message.toString();
    }


    /**
     * @param tag
     * @param object
     */
    static String getObjectInformationMessage(String tag, Object object) {
        return getReflectMessage(tag, object, SINGLE_OBJECT);
    }

    /**
     * @param tag
     * @param arrayList
     */
    static String getObjectInformationMessage(String tag, ArrayList<?> arrayList) {
        int lastIndex = arrayList.size();
        StringBuilder message = new StringBuilder();
        for (int index = 0; index < lastIndex; index++) {
            message.append(getArrayReflectMessage(arrayList.get(index), tag, index)).append("\n");
        }
        return message.toString();
    }

    /**
     * @param tag
     * @param arrayList
     * @param index
     */
    static String getObjectInformationMessage(String tag, ArrayList<?> arrayList, int index) {
        return getArrayReflectMessage(arrayList.get(index), tag, index);
    }

    /**
     * @param className
     * @param arrayList
     * @param startIndex
     * @param endIndex
     */
    static String getObjectInformationMessage(String className, ArrayList<?> arrayList, int startIndex, int endIndex) {
        StringBuilder message = new StringBuilder();
        for (int index = startIndex; index <= endIndex; index++) {
            message.append(getArrayReflectMessage(arrayList.get(index), className, index)).append("\n");
        }
        return message.toString();
    }

    /**
     * @param object
     * @param tag
     * @param index
     */
    private static String getArrayReflectMessage(Object object, String tag, int index) {
        return getArrayIndexMessage(tag, index) + "\n" + getReflectMessage(tag, object, index);
    }

    /**
     * @param tag
     * @param object
     * @param index
     */
    private static String getReflectMessage(String tag, Object object, int index) {
        String logMessage;

        if (object instanceof String) {
            if (index == SINGLE_OBJECT) {
                logMessage = " COMMENT: " + object.toString();
            } else {
                logMessage = "[" + index + "], COMMENT: " + object.toString();
            }
            return getBasicMessage(tag, logMessage);
        } else {
            StringBuilder message = new StringBuilder();
            try {
                Class<?> objClass = object.getClass();
                Field[] fields = objClass.getDeclaredFields();
                for (Field field : fields) {
                    field.setAccessible(true);
                    String name = field.getName();
                    Object value = field.get(object);
                    String valueMessage;
                    if (Util.isValidPrintDataType(value)) {
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
                    message.append("\n").append(getBasicMessage(tag, logMessage));
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            return message.toString();
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

}
