package com.mrparkwc.simplelog;

import android.util.Log;

import java.lang.reflect.Field;
import java.util.ArrayList;

/**
 * Created by magic on 2015-12-31.
 */
public class Print {

    /**
     * @param logSeparate
     * @param tag
     * @param object
     */
    public static void print(LogSeparate logSeparate, String tag, Object object) {
        inputLogMessage(logSeparate, tag, object, -1);
    }

    /**
     * @param logSeparate
     * @param tag
     * @param arrayList
     */
    public static void print(LogSeparate logSeparate, String tag, ArrayList<?> arrayList) {
        Object object;
        for (int i = 0; i < arrayList.size(); i++) {
            object = arrayList.get(i);
            inputArrayIndexLog(logSeparate, tag, i);
            inputLogMessage(logSeparate, tag, object, i);
        }
    }

    /**
     * @param logSeparate
     * @param tag
     * @param arrayList
     * @param index
     */
    public static void print(LogSeparate logSeparate, String tag, ArrayList<?> arrayList, int index) {
        Object object;
        object = arrayList.get(index);
        inputArrayIndexLog(logSeparate, tag, index);
        inputLogMessage(logSeparate, tag, object, index);
    }

    /**
     * @param logSeparate
     * @param className
     * @param arrayList
     * @param startIndex
     * @param endIndex
     */
    public static void print(LogSeparate logSeparate, String className, ArrayList<?> arrayList, int startIndex, int endIndex) {
        Object object;
        for (int i = startIndex; i <= endIndex; i++) {
            object = arrayList.get(i);
            inputArrayIndexLog(logSeparate, className, i);
            inputLogMessage(logSeparate, className, object, i);
        }
    }

    private static void inputLogMessage(LogSeparate logSeparate, String tag, Object object, int index) {
        try {
            Class<?> objClass = object.getClass();
            Field[] fields = objClass.getDeclaredFields();
            for (Field field : fields) {
                field.setAccessible(true);
                String name = field.getName();
                Object value = field.get(object);
                String logMessage;
                if (index == -1) {
                    logMessage = "[ " + object.getClass().getSimpleName() + " ], " + "Variable Name -> [ " + name + " ] Value -> [ " + value + " ]";
                } else {
                    logMessage = "[ " + object.getClass().getSimpleName() + " ][" + index + "], " + "Variable Name -> [ " + name + " ] Value -> [ " + value + " ]";
                }
                switch (logSeparate) {
                    case DEBUG:
                        Log.d(tag, logMessage);
                        break;
                    case INFO:
                        Log.i(tag, logMessage);
                        break;
                    case WARN:
                        Log.w(tag, logMessage);
                        break;
                    case ERROR:
                        Log.e(tag, logMessage);
                        break;
                }

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void inputArrayIndexLog(LogSeparate logSeparate, String className, int index) {
        String logMessage = "------------------------- Index: " + index + " -------------------------";
        switch (logSeparate) {
            case DEBUG:
                Log.d(className, logMessage);
                break;
            case INFO:
                Log.i(className, logMessage);
                break;
            case WARN:
                Log.w(className, logMessage);
                break;
            case ERROR:
                Log.e(className, logMessage);
                break;
        }
    }

}
