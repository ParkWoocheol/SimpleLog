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

import android.util.Log;

import java.lang.reflect.Field;
import java.util.ArrayList;

/**
 * Developed by Park, Woocheol
 * Email: admin@mrparkwc.com
 * GitHub: https://github.com/ParkWoocheol
 */
public class Print {

    private static final int SINGLE_OBJECT = -1;

    /**
     * @param logSeparator
     * @param tag
     * @param object
     */
    public static void print(LogSeparator logSeparator, String tag, Object object) {
        inputLogMessage(logSeparator, tag, object, SINGLE_OBJECT);
    }

    /**
     * @param logSeparator
     * @param tag
     * @param arrayList
     */
    public static void print(LogSeparator logSeparator, String tag, ArrayList<?> arrayList) {
        Object object;
        for (int i = 0; i < arrayList.size(); i++) {
            object = arrayList.get(i);
            inputArrayIndexLog(logSeparator, tag, i);
            inputLogMessage(logSeparator, tag, object, i);
        }
    }

    /**
     * @param logSeparator
     * @param tag
     * @param arrayList
     * @param index
     */
    public static void print(LogSeparator logSeparator, String tag, ArrayList<?> arrayList, int index) {
        Object object;
        object = arrayList.get(index);
        inputArrayIndexLog(logSeparator, tag, index);
        inputLogMessage(logSeparator, tag, object, index);
    }

    /**
     * @param logSeparator
     * @param className
     * @param arrayList
     * @param startIndex
     * @param endIndex
     */
    public static void print(LogSeparator logSeparator, String className, ArrayList<?> arrayList, int startIndex, int endIndex) {
        Object object;
        for (int i = startIndex; i <= endIndex; i++) {
            object = arrayList.get(i);
            inputArrayIndexLog(logSeparator, className, i);
            inputLogMessage(logSeparator, className, object, i);
        }
    }

    /**
     * @param logSeparator
     * @param tag
     * @param object
     * @param index
     */
    private static void inputLogMessage(LogSeparator logSeparator, String tag, Object object, int index) {
        try {
            Class<?> objClass = object.getClass();
            Field[] fields = objClass.getDeclaredFields();
            for (Field field : fields) {
                field.setAccessible(true);
                String name = field.getName();
                Object value = field.get(object);
                String logMessage;
                if (index == SINGLE_OBJECT) {
                    logMessage = "[ " + object.getClass().getSimpleName() + " ], " + "Variable Name -> [ " + name + " ] Value -> [ " + value + " ]";
                } else {
                    logMessage = "[ " + object.getClass().getSimpleName() + " ][" + index + "], " + "Variable Name -> [ " + name + " ] Value -> [ " + value + " ]";
                }
                switch (logSeparator) {
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

    /**
     * @param logSeparator
     * @param className
     * @param index
     */
    private static void inputArrayIndexLog(LogSeparator logSeparator, String className, int index) {
        String logMessage = "------------------------- Index: " + index + " -------------------------";
        switch (logSeparator) {
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
