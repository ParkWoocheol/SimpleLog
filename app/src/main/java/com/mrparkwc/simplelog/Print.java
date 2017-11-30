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
class Print {

    private static final int SINGLE_OBJECT = -1;

    /**
     * @param logSeparator {@link LogSeparator}
     */
    static void print(LogSeparator logSeparator, String tag, Object object) {
        inputLogMessage(logSeparator, tag, object, SINGLE_OBJECT);
    }

    /**
     * @param logSeparator {@link LogSeparator}
     */
    static void print(LogSeparator logSeparator, String tag, ArrayList<?> arrayList) {
        int lastIndex = arrayList.size();
        for (int index = 0; index < lastIndex; index++) {
            input(arrayList.get(index), logSeparator, tag, index);
        }
    }

    /**
     * @param logSeparator {@link LogSeparator}
     */
    static void print(LogSeparator logSeparator, String tag, ArrayList<?> arrayList, int index) {
        input(arrayList.get(index), logSeparator, tag, index);
    }

    /**
     * @param logSeparator {@link LogSeparator}
     */
    static void print(LogSeparator logSeparator, String className, ArrayList<?> arrayList, int startIndex, int endIndex) {
        for (int index = startIndex; index <= endIndex; index++) {
            input(arrayList.get(index), logSeparator, className, index);
        }
    }

    /**
     * @param logSeparator {@link LogSeparator}
     */
    private static void input(Object object, LogSeparator logSeparator, String tag, int index) {
        inputArrayIndexLog(logSeparator, tag, index);
        inputLogMessage(logSeparator, tag, object, index);
    }

    /**
     * @param logSeparator {@link LogSeparator}
     */
    private static void inputLogMessage(LogSeparator logSeparator, String tag, Object object, int index) {
        String logMessage;

        if (object instanceof String) {
            if (index == SINGLE_OBJECT) {
                logMessage = " COMMENT: " + object.toString();
            } else {
                logMessage = "[" + index + "], COMMENT: " + object.toString();
            }
            logSeparate(logSeparator, tag, logMessage);
        } else {
            try {
                Class<?> objClass = object.getClass();
                Field[] fields = objClass.getDeclaredFields();
                for (Field field : fields) {
                    field.setAccessible(true);
                    String name = field.getName();
                    Object value = field.get(object);
                    String valueMessage;
                    String type = field.getType().getCanonicalName();
                    if (Util.isValidPrintDataType(value)) {
                        valueMessage = "Type -> [" + type + "]" + ", Value -> [ " + value + " ]";
                    } else if (value == null) {
                        valueMessage = "Type -> [" + type + "]" + ", Value -> [ Target is Null Point. ]";
                    } else {
                        valueMessage = "Type -> [" + type + "]" + ", Value -> [ Unsupported data type, Please specify this object separately. ]";

                    }
                    if (index == SINGLE_OBJECT) {
                        logMessage = "[ " + object.getClass().getSimpleName() + " ], " + "Variable Name -> [ " + name + " ] " + valueMessage;
                    } else {
                        logMessage = "[ " + object.getClass().getSimpleName() + " ][" + index + "], " + "Variable Name -> [ " + name + " ] " + valueMessage;
                    }
                    logSeparate(logSeparator, tag, logMessage);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /**
     * @param logSeparator {@link LogSeparator}
     */
    private static void inputArrayIndexLog(LogSeparator logSeparator, String className, int index) {
        String logMessage = "------------------------- Index: " + index + " -------------------------";
        logSeparate(logSeparator, className, logMessage);
    }

    /**
     * @param logSeparator {@link LogSeparator}
     */
    static void logSeparate(LogSeparator logSeparator, String tag, String... logMessages) {
        for (String logMessage : logMessages) {
            switch (logSeparator) {
                case VERBOSE:
                    Log.d(tag, logMessage);
                    break;
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
    }
}
