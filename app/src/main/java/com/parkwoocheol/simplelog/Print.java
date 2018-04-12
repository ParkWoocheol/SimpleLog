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


package com.parkwoocheol.simplelog;

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

    static void print(LogSeparator logSeparator, String tag, Object object) {
        inputLogMessage(logSeparator, tag, object, SINGLE_OBJECT);
    }

    static void print(LogSeparator logSeparator, String tag, ArrayList<?> arrayList) {
        int lastIndex = arrayList.size();
        for (int index = 0; index < lastIndex; index++) {
            input(arrayList.get(index), logSeparator, tag, index);
        }
    }

    static void print(LogSeparator logSeparator, String tag, ArrayList<?> arrayList, int index) {
        input(arrayList.get(index), logSeparator, tag, index);
    }

    static void print(LogSeparator logSeparator, String className, ArrayList<?> arrayList, int startIndex, int endIndex) {
        for (int index = startIndex; index <= endIndex; index++) {
            input(arrayList.get(index), logSeparator, className, index);
        }
    }

    private static void input(Object object, LogSeparator logSeparator, String tag, int index) {
        inputArrayIndexLog(logSeparator, tag, index);
        inputLogMessage(logSeparator, tag, object, index);
    }

    private static void inputLogMessage(LogSeparator logSeparator, String tag, Object object, int index) {
        String logMessage;

        if (object instanceof String) {
            logMessage = getLogMessage(object, index);
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
                    valueMessage = getValueMessage(value, type);
                    logMessage = getLogMessage(object, index, name, valueMessage);
                    logSeparate(logSeparator, tag, logMessage);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    private static String getLogMessage(Object object, int index) {
        String logMessage;
        if (index == SINGLE_OBJECT) {
            logMessage = " comment: " + object.toString();
        } else {
            logMessage = "[" + index + "], comment: " + object.toString();
        }
        return logMessage;
    }

    private static String getLogMessage(Object object, int index, String name, String valueMessage) {
        String logMessage;
        if (index == SINGLE_OBJECT) {
            logMessage = "[ " + object.getClass().getSimpleName() + " ], " + "variable name -> [ " + name + " ] " + valueMessage;
        } else {
            logMessage = "[ " + object.getClass().getSimpleName() + " ][" + index + "], " + "variable name -> [ " + name + " ] " + valueMessage;
        }
        return logMessage;
    }

    private static String getValueMessage(Object value, String type) {
        String valueMessage;
        if (Util.isValidPrintDataType(value)) {
            valueMessage = "type -> [" + type + "]" + ", value -> [ " + value + " ]";
        } else if (value == null) {
            valueMessage = "type -> [" + type + "]" + ", value -> [ target is null point. ]";
        } else {
            valueMessage = "type -> [" + type + "]" + ", value -> [ unsupported data type, please specify this object separately. ]";

        }
        return valueMessage;
    }

    private static void inputArrayIndexLog(LogSeparator logSeparator, String className, int index) {
        String logMessage = "------------------------- index: " + index + " -------------------------";
        logSeparate(logSeparator, className, logMessage);
    }

    static void logSeparate(LogSeparator logSeparator, String tag, String... logMessages) {
        for (String logMessage : logMessages) {
            switch (logSeparator) {
                case VERBOSE:
                    Log.v(tag, logMessage);
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
