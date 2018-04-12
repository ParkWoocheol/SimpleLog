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

import java.util.ArrayList;

/**
 * Developed by Park, Woocheol Email: admin@mrparkwc.com GitHub: https://github.com/ParkWoocheol
 */
public class Logging extends BaseLogging {

    public static boolean isRunning = true;

    /**
     * Log Verbose
     */

    public static void v() {
        if (isRunning) {
            separate(LogSeparator.VERBOSE, new ClassInfo().invoke(Thread.currentThread()));
        }
    }

    public static void v(String comment) {
        if (isRunning) {
            separate(LogSeparator.VERBOSE, new ClassInfo().invoke(Thread.currentThread()), comment);
        }
    }

    public static void v(String tag, String comment) {
        if (isRunning) {
            separate(LogSeparator.VERBOSE, new ClassInfo().invoke(Thread.currentThread()), tag, comment);
        }
    }

    public static void v(Object object) {
        if (isRunning) {
            if (Util.isValidPrintDataType(object)) {
                separate(LogSeparator.VERBOSE, new ClassInfo().invoke(Thread.currentThread()), String.valueOf(object));
            } else {
                separate(LogSeparator.VERBOSE, new ClassInfo().invoke(Thread.currentThread()), object);
            }
        }
    }

    public static void v(String tag, Object object) {
        if (isRunning) {
            separate(LogSeparator.VERBOSE, new ClassInfo().invoke(Thread.currentThread()), tag, object);
        }
    }

    public static void v(Object object, String comment) {
        if (isRunning) {
            separate(LogSeparator.VERBOSE, new ClassInfo().invoke(Thread.currentThread()), object, comment);
        }
    }

    public static void v(String tag, Object object, String comment) {
        if (isRunning) {
            separate(LogSeparator.VERBOSE, new ClassInfo().invoke(Thread.currentThread()), tag, object, comment);
        }
    }

    public static void v(ArrayList<?> arrayList) {
        if (isRunning) {
            separate(LogSeparator.VERBOSE, new ClassInfo().invoke(Thread.currentThread()), arrayList);
        }
    }

    public static void v(String tag, ArrayList<?> arrayList) {
        if (isRunning) {
            separate(LogSeparator.VERBOSE, new ClassInfo().invoke(Thread.currentThread()), tag, arrayList);
        }
    }

    public static void v(ArrayList<?> arrayList, String comment) {
        if (isRunning) {
            separate(LogSeparator.VERBOSE, new ClassInfo().invoke(Thread.currentThread()), arrayList, comment);
        }
    }

    public static void v(String tag, ArrayList<?> arrayList, String comment) {
        if (isRunning) {
            separate(LogSeparator.VERBOSE, new ClassInfo().invoke(Thread.currentThread()), tag, arrayList, comment);
        }
    }

    public static void v(ArrayList<?> arrayList, int index) {
        if (isRunning) {
            separate(LogSeparator.VERBOSE, new ClassInfo().invoke(Thread.currentThread()), arrayList, index);
        }
    }

    public static void v(String tag, ArrayList<?> arrayList, int index) {
        if (isRunning) {
            separate(LogSeparator.VERBOSE, new ClassInfo().invoke(Thread.currentThread()), tag, arrayList, index);
        }
    }

    public static void v(ArrayList<?> arrayList, int index, String comment) {
        if (isRunning) {
            separate(LogSeparator.VERBOSE, new ClassInfo().invoke(Thread.currentThread()), arrayList, index, comment);
        }
    }

    public static void v(String tag, ArrayList<?> arrayList, int index, String comment) {
        if (isRunning) {
            separate(LogSeparator.VERBOSE, new ClassInfo().invoke(Thread.currentThread()), tag, arrayList, index, comment);
        }
    }

    public static void v(ArrayList<?> arrayList, int startIndex, int endIndex) {
        if (isRunning) {
            separate(LogSeparator.VERBOSE, new ClassInfo().invoke(Thread.currentThread()), arrayList, startIndex, endIndex);
        }
    }

    public static void v(String tag, ArrayList<?> arrayList, int startIndex, int endIndex) {
        if (isRunning) {
            separate(LogSeparator.VERBOSE, new ClassInfo().invoke(Thread.currentThread()), tag, arrayList, startIndex, endIndex);
        }
    }

    public static void v(ArrayList<?> arrayList, int startIndex, int endIndex, String comment) {
        if (isRunning) {
            separate(LogSeparator.VERBOSE, new ClassInfo().invoke(Thread.currentThread()), arrayList, startIndex, endIndex, comment);
        }
    }

    public static void v(String tag, ArrayList<?> arrayList, int startIndex, int endIndex, String comment) {
        if (isRunning) {
            separate(LogSeparator.VERBOSE, new ClassInfo().invoke(Thread.currentThread()), tag, arrayList, startIndex, endIndex, comment);
        }
    }


    /**
     * Log Debug
     */

    public static void d() {
        if (isRunning) {
            separate(LogSeparator.DEBUG, new ClassInfo().invoke(Thread.currentThread()));
        }
    }

    public static void d(String comment) {
        if (isRunning) {
            separate(LogSeparator.DEBUG, new ClassInfo().invoke(Thread.currentThread()), comment);
        }
    }

    public static void d(String tag, String comment) {
        if (isRunning) {
            separate(LogSeparator.DEBUG, new ClassInfo().invoke(Thread.currentThread()), tag, comment);
        }
    }

    public static void d(Object object) {
        if (isRunning) {
            if (Util.isValidPrintDataType(object)) {
                separate(LogSeparator.VERBOSE, new ClassInfo().invoke(Thread.currentThread()), String.valueOf(object));
            } else {
                separate(LogSeparator.DEBUG, new ClassInfo().invoke(Thread.currentThread()), object);
            }
        }
    }

    public static void d(String tag, Object object) {
        if (isRunning) {
            separate(LogSeparator.DEBUG, new ClassInfo().invoke(Thread.currentThread()), tag, object);
        }
    }

    public static void d(Object object, String comment) {
        if (isRunning) {
            separate(LogSeparator.DEBUG, new ClassInfo().invoke(Thread.currentThread()), object, comment);
        }
    }

    public static void d(String tag, Object object, String comment) {
        if (isRunning) {
            separate(LogSeparator.DEBUG, new ClassInfo().invoke(Thread.currentThread()), tag, object, comment);
        }
    }

    public static void d(ArrayList<?> arrayList) {
        if (isRunning) {
            separate(LogSeparator.DEBUG, new ClassInfo().invoke(Thread.currentThread()), arrayList);
        }
    }

    public static void d(String tag, ArrayList<?> arrayList) {
        if (isRunning) {
            separate(LogSeparator.DEBUG, new ClassInfo().invoke(Thread.currentThread()), tag, arrayList);
        }
    }

    public static void d(ArrayList<?> arrayList, String comment) {
        if (isRunning) {
            separate(LogSeparator.DEBUG, new ClassInfo().invoke(Thread.currentThread()), arrayList, comment);
        }
    }

    public static void d(String tag, ArrayList<?> arrayList, String comment) {
        if (isRunning) {
            separate(LogSeparator.DEBUG, new ClassInfo().invoke(Thread.currentThread()), tag, arrayList, comment);
        }
    }

    public static void d(ArrayList<?> arrayList, int index) {
        if (isRunning) {
            separate(LogSeparator.DEBUG, new ClassInfo().invoke(Thread.currentThread()), arrayList, index);
        }
    }

    public static void d(String tag, ArrayList<?> arrayList, int index) {
        if (isRunning) {
            separate(LogSeparator.DEBUG, new ClassInfo().invoke(Thread.currentThread()), tag, arrayList, index);
        }
    }

    public static void d(ArrayList<?> arrayList, int index, String comment) {
        if (isRunning) {
            separate(LogSeparator.DEBUG, new ClassInfo().invoke(Thread.currentThread()), arrayList, index, comment);
        }
    }

    public static void d(String tag, ArrayList<?> arrayList, int index, String comment) {
        if (isRunning) {
            separate(LogSeparator.DEBUG, new ClassInfo().invoke(Thread.currentThread()), tag, arrayList, index, comment);
        }
    }

    public static void d(ArrayList<?> arrayList, int startIndex, int endIndex) {
        if (isRunning) {
            separate(LogSeparator.DEBUG, new ClassInfo().invoke(Thread.currentThread()), arrayList, startIndex, endIndex);
        }
    }

    public static void d(String tag, ArrayList<?> arrayList, int startIndex, int endIndex) {
        if (isRunning) {
            separate(LogSeparator.DEBUG, new ClassInfo().invoke(Thread.currentThread()), tag, arrayList, startIndex, endIndex);
        }
    }

    public static void d(ArrayList<?> arrayList, int startIndex, int endIndex, String comment) {
        if (isRunning) {
            separate(LogSeparator.DEBUG, new ClassInfo().invoke(Thread.currentThread()), arrayList, startIndex, endIndex, comment);
        }
    }

    public static void d(String tag, ArrayList<?> arrayList, int startIndex, int endIndex, String comment) {
        if (isRunning) {
            separate(LogSeparator.DEBUG, new ClassInfo().invoke(Thread.currentThread()), tag, arrayList, startIndex, endIndex, comment);
        }
    }

    /**
     * Log Info
     */

    public static void i() {
        if (isRunning) {
            separate(LogSeparator.INFO, new ClassInfo().invoke(Thread.currentThread()));
        }
    }

    public static void i(String comment) {
        if (isRunning) {
            separate(LogSeparator.INFO, new ClassInfo().invoke(Thread.currentThread()), comment);
        }
    }

    public static void i(String tag, String comment) {
        if (isRunning) {
            separate(LogSeparator.INFO, new ClassInfo().invoke(Thread.currentThread()), tag, comment);
        }
    }

    public static void i(Object object) {
        if (isRunning) {
            if (Util.isValidPrintDataType(object)) {
                separate(LogSeparator.VERBOSE, new ClassInfo().invoke(Thread.currentThread()), String.valueOf(object));
            } else {
                separate(LogSeparator.INFO, new ClassInfo().invoke(Thread.currentThread()), object);
            }
        }
    }

    public static void i(String tag, Object object) {
        if (isRunning) {
            separate(LogSeparator.INFO, new ClassInfo().invoke(Thread.currentThread()), tag, object);
        }
    }

    public static void i(Object object, String comment) {
        if (isRunning) {
            separate(LogSeparator.INFO, new ClassInfo().invoke(Thread.currentThread()), object, comment);
        }
    }

    public static void i(String tag, Object object, String comment) {
        if (isRunning) {
            separate(LogSeparator.INFO, new ClassInfo().invoke(Thread.currentThread()), tag, object, comment);
        }
    }

    public static void i(ArrayList<?> arrayList) {
        if (isRunning) {
            separate(LogSeparator.INFO, new ClassInfo().invoke(Thread.currentThread()), arrayList);
        }
    }

    public static void i(String tag, ArrayList<?> arrayList) {
        if (isRunning) {
            separate(LogSeparator.INFO, new ClassInfo().invoke(Thread.currentThread()), tag, arrayList);
        }
    }

    public static void i(ArrayList<?> arrayList, String comment) {
        if (isRunning) {
            separate(LogSeparator.INFO, new ClassInfo().invoke(Thread.currentThread()), arrayList, comment);
        }
    }

    public static void i(String tag, ArrayList<?> arrayList, String comment) {
        if (isRunning) {
            separate(LogSeparator.INFO, new ClassInfo().invoke(Thread.currentThread()), tag, arrayList, comment);
        }
    }

    public static void i(ArrayList<?> arrayList, int index) {
        if (isRunning) {
            separate(LogSeparator.INFO, new ClassInfo().invoke(Thread.currentThread()), arrayList, index);
        }
    }

    public static void i(String tag, ArrayList<?> arrayList, int index) {
        if (isRunning) {
            separate(LogSeparator.INFO, new ClassInfo().invoke(Thread.currentThread()), tag, arrayList, index);
        }
    }

    public static void i(ArrayList<?> arrayList, int index, String comment) {
        if (isRunning) {
            separate(LogSeparator.INFO, new ClassInfo().invoke(Thread.currentThread()), arrayList, index, comment);
        }
    }

    public static void i(String tag, ArrayList<?> arrayList, int index, String comment) {
        if (isRunning) {
            separate(LogSeparator.INFO, new ClassInfo().invoke(Thread.currentThread()), tag, arrayList, index, comment);
        }
    }

    public static void i(ArrayList<?> arrayList, int startIndex, int endIndex) {
        if (isRunning) {
            separate(LogSeparator.INFO, new ClassInfo().invoke(Thread.currentThread()), arrayList, startIndex, endIndex);
        }
    }

    public static void i(String tag, ArrayList<?> arrayList, int startIndex, int endIndex) {
        if (isRunning) {
            separate(LogSeparator.INFO, new ClassInfo().invoke(Thread.currentThread()), tag, arrayList, startIndex, endIndex);
        }
    }

    public static void i(ArrayList<?> arrayList, int startIndex, int endIndex, String comment) {
        if (isRunning) {
            separate(LogSeparator.INFO, new ClassInfo().invoke(Thread.currentThread()), arrayList, startIndex, endIndex, comment);
        }
    }

    public static void i(String tag, ArrayList<?> arrayList, int startIndex, int endIndex, String comment) {
        if (isRunning) {
            separate(LogSeparator.INFO, new ClassInfo().invoke(Thread.currentThread()), tag, arrayList, startIndex, endIndex, comment);
        }
    }

    /**
     * Log Warn
     */

    public static void w() {
        if (isRunning) {
            separate(LogSeparator.WARN, new ClassInfo().invoke(Thread.currentThread()));
        }
    }

    public static void w(String comment) {
        if (isRunning) {
            separate(LogSeparator.WARN, new ClassInfo().invoke(Thread.currentThread()), comment);
        }
    }

    public static void w(String tag, String comment) {
        if (isRunning) {
            separate(LogSeparator.WARN, new ClassInfo().invoke(Thread.currentThread()), tag, comment);
        }
    }

    public static void w(Object object) {
        if (isRunning) {
            if (Util.isValidPrintDataType(object)) {
                separate(LogSeparator.VERBOSE, new ClassInfo().invoke(Thread.currentThread()), String.valueOf(object));
            } else {
                separate(LogSeparator.WARN, new ClassInfo().invoke(Thread.currentThread()), object);
            }
        }
    }

    public static void w(String tag, Object object) {
        if (isRunning) {
            separate(LogSeparator.WARN, new ClassInfo().invoke(Thread.currentThread()), tag, object);
        }
    }

    public static void w(Object object, String comment) {
        if (isRunning) {
            separate(LogSeparator.WARN, new ClassInfo().invoke(Thread.currentThread()), object, comment);
        }
    }

    public static void w(String tag, Object object, String comment) {
        if (isRunning) {
            separate(LogSeparator.WARN, new ClassInfo().invoke(Thread.currentThread()), tag, object, comment);
        }
    }

    public static void w(ArrayList<?> arrayList) {
        if (isRunning) {
            separate(LogSeparator.WARN, new ClassInfo().invoke(Thread.currentThread()), arrayList);
        }
    }

    public static void w(String tag, ArrayList<?> arrayList) {
        if (isRunning) {
            separate(LogSeparator.WARN, new ClassInfo().invoke(Thread.currentThread()), tag, arrayList);
        }
    }

    public static void w(ArrayList<?> arrayList, String comment) {
        if (isRunning) {
            separate(LogSeparator.WARN, new ClassInfo().invoke(Thread.currentThread()), arrayList, comment);
        }
    }

    public static void w(String tag, ArrayList<?> arrayList, String comment) {
        if (isRunning) {
            separate(LogSeparator.WARN, new ClassInfo().invoke(Thread.currentThread()), tag, arrayList, comment);
        }
    }

    public static void w(ArrayList<?> arrayList, int index) {
        if (isRunning) {
            separate(LogSeparator.WARN, new ClassInfo().invoke(Thread.currentThread()), arrayList, index);
        }
    }

    public static void w(String tag, ArrayList<?> arrayList, int index) {
        if (isRunning) {
            separate(LogSeparator.WARN, new ClassInfo().invoke(Thread.currentThread()), tag, arrayList, index);
        }
    }

    public static void w(ArrayList<?> arrayList, int index, String comment) {
        if (isRunning) {
            separate(LogSeparator.WARN, new ClassInfo().invoke(Thread.currentThread()), arrayList, index, comment);
        }
    }

    public static void w(String tag, ArrayList<?> arrayList, int index, String comment) {
        if (isRunning) {
            separate(LogSeparator.WARN, new ClassInfo().invoke(Thread.currentThread()), tag, arrayList, index, comment);
        }
    }

    public static void w(ArrayList<?> arrayList, int startIndex, int endIndex) {
        if (isRunning) {
            separate(LogSeparator.WARN, new ClassInfo().invoke(Thread.currentThread()), arrayList, startIndex, endIndex);
        }
    }

    public static void w(String tag, ArrayList<?> arrayList, int startIndex, int endIndex) {
        if (isRunning) {
            separate(LogSeparator.WARN, new ClassInfo().invoke(Thread.currentThread()), tag, arrayList, startIndex, endIndex);
        }
    }

    public static void w(ArrayList<?> arrayList, int startIndex, int endIndex, String comment) {
        if (isRunning) {
            separate(LogSeparator.WARN, new ClassInfo().invoke(Thread.currentThread()), arrayList, startIndex, endIndex, comment);
        }
    }

    public static void w(String tag, ArrayList<?> arrayList, int startIndex, int endIndex, String comment) {
        if (isRunning) {
            separate(LogSeparator.WARN, new ClassInfo().invoke(Thread.currentThread()), tag, arrayList, startIndex, endIndex, comment);
        }
    }

    /**
     * Log Error
     */

    public static void e() {
        if (isRunning) {
            separate(LogSeparator.ERROR, new ClassInfo().invoke(Thread.currentThread()));
        }
    }

    public static void e(String comment) {
        if (isRunning) {
            separate(LogSeparator.ERROR, new ClassInfo().invoke(Thread.currentThread()), comment);
        }
    }

    public static void e(String tag, String comment) {
        if (isRunning) {
            separate(LogSeparator.ERROR, new ClassInfo().invoke(Thread.currentThread()), tag, comment);
        }
    }

    public static void e(Object object) {
        if (isRunning) {
            if (Util.isValidPrintDataType(object)) {
                separate(LogSeparator.VERBOSE, new ClassInfo().invoke(Thread.currentThread()), String.valueOf(object));
            } else {
                separate(LogSeparator.ERROR, new ClassInfo().invoke(Thread.currentThread()), object);
            }
        }
    }

    public static void e(String tag, Object object) {
        if (isRunning) {
            separate(LogSeparator.ERROR, new ClassInfo().invoke(Thread.currentThread()), tag, object);
        }
    }

    public static void e(Object object, String comment) {
        if (isRunning) {
            separate(LogSeparator.ERROR, new ClassInfo().invoke(Thread.currentThread()), object, comment);
        }
    }

    public static void e(String tag, Object object, String comment) {
        if (isRunning) {
            separate(LogSeparator.ERROR, new ClassInfo().invoke(Thread.currentThread()), tag, object, comment);
        }
    }

    public static void e(ArrayList<?> arrayList) {
        if (isRunning) {
            separate(LogSeparator.ERROR, new ClassInfo().invoke(Thread.currentThread()), arrayList);
        }
    }

    public static void e(String tag, ArrayList<?> arrayList) {
        if (isRunning) {
            separate(LogSeparator.ERROR, new ClassInfo().invoke(Thread.currentThread()), tag, arrayList);
        }
    }

    public static void e(ArrayList<?> arrayList, String comment) {
        if (isRunning) {
            separate(LogSeparator.ERROR, new ClassInfo().invoke(Thread.currentThread()), arrayList, comment);
        }
    }

    public static void e(String tag, ArrayList<?> arrayList, String comment) {
        if (isRunning) {
            separate(LogSeparator.ERROR, new ClassInfo().invoke(Thread.currentThread()), tag, arrayList, comment);
        }
    }

    public static void e(ArrayList<?> arrayList, int index) {
        if (isRunning) {
            separate(LogSeparator.ERROR, new ClassInfo().invoke(Thread.currentThread()), arrayList, index);
        }
    }

    public static void e(String tag, ArrayList<?> arrayList, int index) {
        if (isRunning) {
            separate(LogSeparator.ERROR, new ClassInfo().invoke(Thread.currentThread()), tag, arrayList, index);
        }
    }

    public static void e(ArrayList<?> arrayList, int index, String comment) {
        if (isRunning) {
            separate(LogSeparator.ERROR, new ClassInfo().invoke(Thread.currentThread()), arrayList, index, comment);
        }
    }

    public static void e(String tag, ArrayList<?> arrayList, int index, String comment) {
        if (isRunning) {
            separate(LogSeparator.ERROR, new ClassInfo().invoke(Thread.currentThread()), tag, arrayList, index, comment);
        }
    }

    public static void e(ArrayList<?> arrayList, int startIndex, int endIndex) {
        if (isRunning) {
            separate(LogSeparator.ERROR, new ClassInfo().invoke(Thread.currentThread()), arrayList, startIndex, endIndex);
        }
    }

    public static void e(String tag, ArrayList<?> arrayList, int startIndex, int endIndex) {
        if (isRunning) {
            separate(LogSeparator.ERROR, new ClassInfo().invoke(Thread.currentThread()), tag, arrayList, startIndex, endIndex);
        }
    }

    public static void e(ArrayList<?> arrayList, int startIndex, int endIndex, String comment) {
        if (isRunning) {
            separate(LogSeparator.ERROR, new ClassInfo().invoke(Thread.currentThread()), arrayList, startIndex, endIndex, comment);
        }
    }

    public static void e(String tag, ArrayList<?> arrayList, int startIndex, int endIndex, String comment) {
        if (isRunning) {
            separate(LogSeparator.ERROR, new ClassInfo().invoke(Thread.currentThread()), tag, arrayList, startIndex, endIndex, comment);
        }
    }

    public static void json(Object object, LogSeparator logSeparator){
        if (isRunning){
            separate(logSeparator, new ClassInfo().invoke(Thread.currentThread()), "\n"+GsonManager.getInstance().toJson(object));
        }
    }

    /**
     * return Message
     */

    public static String getMessage() {
        return getLogMessage(new ClassInfo().invoke(Thread.currentThread()));
    }

    public static String getMessage(String comment) {
        return getLogMessage(new ClassInfo().invoke(Thread.currentThread()), comment);
    }

    public static String getMessage(String tag, String comment) {
        return getLogMessage(new ClassInfo().invoke(Thread.currentThread()), tag, comment);
    }

    public static String getMessage(Object object) {
        ClassInfo classInfo = new ClassInfo().invoke(Thread.currentThread());
        if (Util.isValidPrintDataType(object)) {
            return getLogMessage(classInfo, String.valueOf(object));
        } else {
            return getLogMessage(classInfo, object);
        }
    }

    public static String getMessage(String tag, Object object) {
        return getLogMessage(new ClassInfo().invoke(Thread.currentThread()), tag, object);
    }

    public static String getMessage(Object object, String comment) {
        return getLogMessage(new ClassInfo().invoke(Thread.currentThread()), object, comment);
    }

    public static String getMessage(String tag, Object object, String comment) {
        return getLogMessage(new ClassInfo().invoke(Thread.currentThread()), tag, object, comment);
    }

    public static String getMessage(ArrayList<?> arrayList) {
        return getLogMessage(new ClassInfo().invoke(Thread.currentThread()), arrayList);
    }

    public static String getMessage(String tag, ArrayList<?> arrayList) {
        return getLogMessage(new ClassInfo().invoke(Thread.currentThread()), tag, arrayList);
    }

    public static String getMessage(ArrayList<?> arrayList, String comment) {
        return getLogMessage(new ClassInfo().invoke(Thread.currentThread()), arrayList, comment);
    }

    public static String getMessage(String tag, ArrayList<?> arrayList, String comment) {
        return getLogMessage(new ClassInfo().invoke(Thread.currentThread()), tag, arrayList, comment);
    }

    public static String getMessage(ArrayList<?> arrayList, int index) {
        return getLogMessage(new ClassInfo().invoke(Thread.currentThread()), arrayList, index);
    }

    public static String getMessage(String tag, ArrayList<?> arrayList, int index) {
        return getLogMessage(new ClassInfo().invoke(Thread.currentThread()), tag, arrayList, index);
    }

    public static String getMessage(ArrayList<?> arrayList, int index, String comment) {
        return getLogMessage(new ClassInfo().invoke(Thread.currentThread()), arrayList, index, comment);
    }

    public static String getMessage(String tag, ArrayList<?> arrayList, int index, String comment) {
        return getLogMessage(new ClassInfo().invoke(Thread.currentThread()), tag, arrayList, index, comment);
    }

    public static String getMessage(ArrayList<?> arrayList, int startIndex, int endIndex) {
        return getLogMessage(new ClassInfo().invoke(Thread.currentThread()), arrayList, startIndex, endIndex);
    }

    public static String getMessage(String tag, ArrayList<?> arrayList, int startIndex, int endIndex) {
        return getLogMessage(new ClassInfo().invoke(Thread.currentThread()), tag, arrayList, startIndex, endIndex);
    }

    public static String getMessage(ArrayList<?> arrayList, int startIndex, int endIndex, String comment) {
        return getLogMessage(new ClassInfo().invoke(Thread.currentThread()), arrayList, startIndex, endIndex, comment);
    }

    public static String getMessage(String tag, ArrayList<?> arrayList, int startIndex, int endIndex, String comment) {
        return getLogMessage(new ClassInfo().invoke(Thread.currentThread()), tag, arrayList, startIndex, endIndex, comment);
    }

    public static String getJsonMessage(Object object){
        return getLogMessage(new ClassInfo().invoke(Thread.currentThread()), GsonManager.getInstance().toJson(object));
    }

    static class ClassInfo {
        private String className;
        private String methodName;
        private int lineNumber;

        String getClassName() {
            return className;
        }

        String getMethodName() {
            return methodName;
        }

        int getLineNumber() {
            return lineNumber;
        }

        private ClassInfo invoke(Thread currentThread) {
            className = getSimpleClassName(currentThread.getStackTrace()[3].getClassName());
            methodName = currentThread.getStackTrace()[3].getMethodName();
            lineNumber = currentThread.getStackTrace()[3].getLineNumber();
            return this;
        }
    }
}
