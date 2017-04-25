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
            int stackTraceSize = Thread.currentThread().getStackTrace().length;
            String className = getClassName(Thread.currentThread().getStackTrace()[stackTraceSize - 1].getClassName());
            String methodName = Thread.currentThread().getStackTrace()[stackTraceSize - 1].getMethodName();
            int lineNumber = Thread.currentThread().getStackTrace()[stackTraceSize - 1].getLineNumber();
            separate(LogSeparator.VERBOSE, className, methodName, lineNumber);
        }
    }

    public static void v(String comment) {
        if (isRunning) {
            int stackTraceSize = Thread.currentThread().getStackTrace().length;
            String className = getClassName(Thread.currentThread().getStackTrace()[stackTraceSize - 1].getClassName());
            String methodName = Thread.currentThread().getStackTrace()[stackTraceSize - 1].getMethodName();
            int lineNumber = Thread.currentThread().getStackTrace()[stackTraceSize - 1].getLineNumber();
            separate(LogSeparator.VERBOSE, className, methodName, lineNumber, comment);
        }
    }

    public static void v(String tag, String comment) {
        if (isRunning) {
            int stackTraceSize = Thread.currentThread().getStackTrace().length;
            String className = getClassName(Thread.currentThread().getStackTrace()[stackTraceSize - 1].getClassName());
            String methodName = Thread.currentThread().getStackTrace()[stackTraceSize - 1].getMethodName();
            int lineNumber = Thread.currentThread().getStackTrace()[stackTraceSize - 1].getLineNumber();
            separate(LogSeparator.VERBOSE, className, methodName, lineNumber, tag, comment);
        }
    }

    public static void v(Object object) {
        if (isRunning) {
            int stackTraceSize = Thread.currentThread().getStackTrace().length;
            String className = getClassName(Thread.currentThread().getStackTrace()[stackTraceSize - 1].getClassName());
            String methodName = Thread.currentThread().getStackTrace()[stackTraceSize - 1].getMethodName();
            int lineNumber = Thread.currentThread().getStackTrace()[stackTraceSize - 1].getLineNumber();
            separate(LogSeparator.VERBOSE, className, methodName, lineNumber, object);
        }
    }

    public static void v(String tag, Object object) {
        if (isRunning) {
            int stackTraceSize = Thread.currentThread().getStackTrace().length;
            String className = getClassName(Thread.currentThread().getStackTrace()[stackTraceSize - 1].getClassName());
            String methodName = Thread.currentThread().getStackTrace()[stackTraceSize - 1].getMethodName();
            int lineNumber = Thread.currentThread().getStackTrace()[stackTraceSize - 1].getLineNumber();
            separate(LogSeparator.VERBOSE, className, methodName, lineNumber, tag, object);
        }
    }

    public static void v(Object object, String comment) {
        if (isRunning) {
            int stackTraceSize = Thread.currentThread().getStackTrace().length;
            String className = getClassName(Thread.currentThread().getStackTrace()[stackTraceSize - 1].getClassName());
            String methodName = Thread.currentThread().getStackTrace()[stackTraceSize - 1].getMethodName();
            int lineNumber = Thread.currentThread().getStackTrace()[stackTraceSize - 1].getLineNumber();
            separate(LogSeparator.VERBOSE, className, methodName, lineNumber, object, comment);
        }
    }

    public static void v(String tag, Object object, String comment) {
        if (isRunning) {
            int stackTraceSize = Thread.currentThread().getStackTrace().length;
            String className = getClassName(Thread.currentThread().getStackTrace()[stackTraceSize - 1].getClassName());
            String methodName = Thread.currentThread().getStackTrace()[stackTraceSize - 1].getMethodName();
            int lineNumber = Thread.currentThread().getStackTrace()[stackTraceSize - 1].getLineNumber();
            separate(LogSeparator.VERBOSE, className, methodName, lineNumber, tag, object, comment);
        }
    }

    public static void v(ArrayList<?> arrayList) {
        if (isRunning) {
            int stackTraceSize = Thread.currentThread().getStackTrace().length;

            String className = getClassName(Thread.currentThread().getStackTrace()[stackTraceSize - 1].getClassName());
            String methodName = Thread.currentThread().getStackTrace()[stackTraceSize - 1].getMethodName();
            int lineNumber = Thread.currentThread().getStackTrace()[stackTraceSize - 1].getLineNumber();
            separate(LogSeparator.VERBOSE, className, methodName, lineNumber, arrayList);
        }
    }

    public static void v(String tag, ArrayList<?> arrayList) {
        if (isRunning) {
            int stackTraceSize = Thread.currentThread().getStackTrace().length;
            String className = getClassName(Thread.currentThread().getStackTrace()[stackTraceSize - 1].getClassName());
            String methodName = Thread.currentThread().getStackTrace()[stackTraceSize - 1].getMethodName();
            int lineNumber = Thread.currentThread().getStackTrace()[stackTraceSize - 1].getLineNumber();
            separate(LogSeparator.VERBOSE, className, methodName, lineNumber, tag, arrayList);
        }
    }

    public static void v(ArrayList<?> arrayList, String comment) {
        if (isRunning) {
            int stackTraceSize = Thread.currentThread().getStackTrace().length;
            String className = getClassName(Thread.currentThread().getStackTrace()[stackTraceSize - 1].getClassName());
            String methodName = Thread.currentThread().getStackTrace()[stackTraceSize - 1].getMethodName();
            int lineNumber = Thread.currentThread().getStackTrace()[stackTraceSize - 1].getLineNumber();
            separate(LogSeparator.VERBOSE, className, methodName, lineNumber, arrayList, comment);
        }
    }

    public static void v(String tag, ArrayList<?> arrayList, String comment) {
        if (isRunning) {
            int stackTraceSize = Thread.currentThread().getStackTrace().length;
            String className = getClassName(Thread.currentThread().getStackTrace()[stackTraceSize - 1].getClassName());
            String methodName = Thread.currentThread().getStackTrace()[stackTraceSize - 1].getMethodName();
            int lineNumber = Thread.currentThread().getStackTrace()[stackTraceSize - 1].getLineNumber();
            separate(LogSeparator.VERBOSE, className, methodName, lineNumber, tag, arrayList, comment);
        }
    }

    public static void v(ArrayList<?> arrayList, int index) {
        if (isRunning) {
            int stackTraceSize = Thread.currentThread().getStackTrace().length;
            String className = getClassName(Thread.currentThread().getStackTrace()[stackTraceSize - 1].getClassName());
            String methodName = Thread.currentThread().getStackTrace()[stackTraceSize - 1].getMethodName();
            int lineNumber = Thread.currentThread().getStackTrace()[stackTraceSize - 1].getLineNumber();
            separate(LogSeparator.VERBOSE, className, methodName, lineNumber, arrayList, index);
        }
    }

    public static void v(String tag, ArrayList<?> arrayList, int index) {
        if (isRunning) {
            int stackTraceSize = Thread.currentThread().getStackTrace().length;
            String className = getClassName(Thread.currentThread().getStackTrace()[stackTraceSize - 1].getClassName());
            String methodName = Thread.currentThread().getStackTrace()[stackTraceSize - 1].getMethodName();
            int lineNumber = Thread.currentThread().getStackTrace()[stackTraceSize - 1].getLineNumber();
            separate(LogSeparator.VERBOSE, className, methodName, lineNumber, tag, arrayList, index);
        }
    }

    public static void v(ArrayList<?> arrayList, int index, String comment) {
        if (isRunning) {
            int stackTraceSize = Thread.currentThread().getStackTrace().length;
            String className = getClassName(Thread.currentThread().getStackTrace()[stackTraceSize - 1].getClassName());
            String methodName = Thread.currentThread().getStackTrace()[stackTraceSize - 1].getMethodName();
            int lineNumber = Thread.currentThread().getStackTrace()[stackTraceSize - 1].getLineNumber();
            separate(LogSeparator.VERBOSE, className, methodName, lineNumber, arrayList, index, comment);
        }
    }

    public static void v(String tag, ArrayList<?> arrayList, int index, String comment) {
        if (isRunning) {
            int stackTraceSize = Thread.currentThread().getStackTrace().length;
            String className = getClassName(Thread.currentThread().getStackTrace()[stackTraceSize - 1].getClassName());
            String methodName = Thread.currentThread().getStackTrace()[stackTraceSize - 1].getMethodName();
            int lineNumber = Thread.currentThread().getStackTrace()[stackTraceSize - 1].getLineNumber();
            separate(LogSeparator.VERBOSE, className, methodName, lineNumber, tag, arrayList, index, comment);
        }
    }

    public static void v(ArrayList<?> arrayList, int startIndex, int endIndex) {
        if (isRunning) {
            int stackTraceSize = Thread.currentThread().getStackTrace().length;
            String className = getClassName(Thread.currentThread().getStackTrace()[stackTraceSize - 1].getClassName());
            String methodName = Thread.currentThread().getStackTrace()[stackTraceSize - 1].getMethodName();
            int lineNumber = Thread.currentThread().getStackTrace()[stackTraceSize - 1].getLineNumber();
            separate(LogSeparator.VERBOSE, className, methodName, lineNumber, arrayList, startIndex, endIndex);
        }
    }

    public static void v(String tag, ArrayList<?> arrayList, int startIndex, int endIndex) {
        if (isRunning) {
            int stackTraceSize = Thread.currentThread().getStackTrace().length;
            String className = getClassName(Thread.currentThread().getStackTrace()[stackTraceSize - 1].getClassName());
            String methodName = Thread.currentThread().getStackTrace()[stackTraceSize - 1].getMethodName();
            int lineNumber = Thread.currentThread().getStackTrace()[stackTraceSize - 1].getLineNumber();
            separate(LogSeparator.VERBOSE, className, methodName, lineNumber, tag, arrayList, startIndex, endIndex);
        }
    }

    public static void v(ArrayList<?> arrayList, int startIndex, int endIndex, String comment) {
        if (isRunning) {
            int stackTraceSize = Thread.currentThread().getStackTrace().length;
            String className = getClassName(Thread.currentThread().getStackTrace()[stackTraceSize - 1].getClassName());
            String methodName = Thread.currentThread().getStackTrace()[stackTraceSize - 1].getMethodName();
            int lineNumber = Thread.currentThread().getStackTrace()[stackTraceSize - 1].getLineNumber();
            separate(LogSeparator.VERBOSE, className, methodName, lineNumber, arrayList, startIndex, endIndex, comment);
        }
    }

    public static void v(String tag, ArrayList<?> arrayList, int startIndex, int endIndex, String comment) {
        if (isRunning) {
            int stackTraceSize = Thread.currentThread().getStackTrace().length;
            String className = getClassName(Thread.currentThread().getStackTrace()[stackTraceSize - 1].getClassName());
            String methodName = Thread.currentThread().getStackTrace()[stackTraceSize - 1].getMethodName();
            int lineNumber = Thread.currentThread().getStackTrace()[stackTraceSize - 1].getLineNumber();
            separate(LogSeparator.VERBOSE, className, methodName, lineNumber, tag, arrayList, startIndex, endIndex, comment);
        }
    }


    /**
     * Log Debug
     */

    public static void d() {
        if (isRunning) {
            int stackTraceSize = Thread.currentThread().getStackTrace().length;
            String className = getClassName(Thread.currentThread().getStackTrace()[stackTraceSize - 1].getClassName());
            String methodName = Thread.currentThread().getStackTrace()[stackTraceSize - 1].getMethodName();
            int lineNumber = Thread.currentThread().getStackTrace()[stackTraceSize - 1].getLineNumber();
            separate(LogSeparator.DEBUG, className, methodName, lineNumber);
        }
    }

    public static void d(String comment) {
        if (isRunning) {
            int stackTraceSize = Thread.currentThread().getStackTrace().length;
            String className = getClassName(Thread.currentThread().getStackTrace()[stackTraceSize - 1].getClassName());
            String methodName = Thread.currentThread().getStackTrace()[stackTraceSize - 1].getMethodName();
            int lineNumber = Thread.currentThread().getStackTrace()[stackTraceSize - 1].getLineNumber();
            separate(LogSeparator.DEBUG, className, methodName, lineNumber, comment);
        }
    }

    public static void d(String tag, String comment) {
        if (isRunning) {
            int stackTraceSize = Thread.currentThread().getStackTrace().length;
            String className = getClassName(Thread.currentThread().getStackTrace()[stackTraceSize - 1].getClassName());
            String methodName = Thread.currentThread().getStackTrace()[stackTraceSize - 1].getMethodName();
            int lineNumber = Thread.currentThread().getStackTrace()[stackTraceSize - 1].getLineNumber();
            separate(LogSeparator.DEBUG, className, methodName, lineNumber, tag, comment);
        }
    }

    public static void d(Object object) {
        if (isRunning) {
            int stackTraceSize = Thread.currentThread().getStackTrace().length;
            String className = getClassName(Thread.currentThread().getStackTrace()[stackTraceSize - 1].getClassName());
            String methodName = Thread.currentThread().getStackTrace()[stackTraceSize - 1].getMethodName();
            int lineNumber = Thread.currentThread().getStackTrace()[stackTraceSize - 1].getLineNumber();
            separate(LogSeparator.DEBUG, className, methodName, lineNumber, object);
        }
    }

    public static void d(String tag, Object object) {
        if (isRunning) {
            int stackTraceSize = Thread.currentThread().getStackTrace().length;
            String className = getClassName(Thread.currentThread().getStackTrace()[stackTraceSize - 1].getClassName());
            String methodName = Thread.currentThread().getStackTrace()[stackTraceSize - 1].getMethodName();
            int lineNumber = Thread.currentThread().getStackTrace()[stackTraceSize - 1].getLineNumber();
            separate(LogSeparator.DEBUG, className, methodName, lineNumber, tag, object);
        }
    }

    public static void d(Object object, String comment) {
        if (isRunning) {
            int stackTraceSize = Thread.currentThread().getStackTrace().length;
            String className = getClassName(Thread.currentThread().getStackTrace()[stackTraceSize - 1].getClassName());
            String methodName = Thread.currentThread().getStackTrace()[stackTraceSize - 1].getMethodName();
            int lineNumber = Thread.currentThread().getStackTrace()[stackTraceSize - 1].getLineNumber();
            separate(LogSeparator.DEBUG, className, methodName, lineNumber, object, comment);
        }
    }

    public static void d(String tag, Object object, String comment) {
        if (isRunning) {
            int stackTraceSize = Thread.currentThread().getStackTrace().length;
            String className = getClassName(Thread.currentThread().getStackTrace()[stackTraceSize - 1].getClassName());
            String methodName = Thread.currentThread().getStackTrace()[stackTraceSize - 1].getMethodName();
            int lineNumber = Thread.currentThread().getStackTrace()[stackTraceSize - 1].getLineNumber();
            separate(LogSeparator.DEBUG, className, methodName, lineNumber, tag, object, comment);
        }
    }

    public static void d(ArrayList<?> arrayList) {
        if (isRunning) {
            int stackTraceSize = Thread.currentThread().getStackTrace().length;

            String className = getClassName(Thread.currentThread().getStackTrace()[stackTraceSize - 1].getClassName());
            String methodName = Thread.currentThread().getStackTrace()[stackTraceSize - 1].getMethodName();
            int lineNumber = Thread.currentThread().getStackTrace()[stackTraceSize - 1].getLineNumber();
            separate(LogSeparator.DEBUG, className, methodName, lineNumber, arrayList);
        }
    }

    public static void d(String tag, ArrayList<?> arrayList) {
        if (isRunning) {
            int stackTraceSize = Thread.currentThread().getStackTrace().length;
            String className = getClassName(Thread.currentThread().getStackTrace()[stackTraceSize - 1].getClassName());
            String methodName = Thread.currentThread().getStackTrace()[stackTraceSize - 1].getMethodName();
            int lineNumber = Thread.currentThread().getStackTrace()[stackTraceSize - 1].getLineNumber();
            separate(LogSeparator.DEBUG, className, methodName, lineNumber, tag, arrayList);
        }
    }

    public static void d(ArrayList<?> arrayList, String comment) {
        if (isRunning) {
            int stackTraceSize = Thread.currentThread().getStackTrace().length;
            String className = getClassName(Thread.currentThread().getStackTrace()[stackTraceSize - 1].getClassName());
            String methodName = Thread.currentThread().getStackTrace()[stackTraceSize - 1].getMethodName();
            int lineNumber = Thread.currentThread().getStackTrace()[stackTraceSize - 1].getLineNumber();
            separate(LogSeparator.DEBUG, className, methodName, lineNumber, arrayList, comment);
        }
    }

    public static void d(String tag, ArrayList<?> arrayList, String comment) {
        if (isRunning) {
            int stackTraceSize = Thread.currentThread().getStackTrace().length;
            String className = getClassName(Thread.currentThread().getStackTrace()[stackTraceSize - 1].getClassName());
            String methodName = Thread.currentThread().getStackTrace()[stackTraceSize - 1].getMethodName();
            int lineNumber = Thread.currentThread().getStackTrace()[stackTraceSize - 1].getLineNumber();
            separate(LogSeparator.DEBUG, className, methodName, lineNumber, tag, arrayList, comment);
        }
    }

    public static void d(ArrayList<?> arrayList, int index) {
        if (isRunning) {
            int stackTraceSize = Thread.currentThread().getStackTrace().length;
            String className = getClassName(Thread.currentThread().getStackTrace()[stackTraceSize - 1].getClassName());
            String methodName = Thread.currentThread().getStackTrace()[stackTraceSize - 1].getMethodName();
            int lineNumber = Thread.currentThread().getStackTrace()[stackTraceSize - 1].getLineNumber();
            separate(LogSeparator.DEBUG, className, methodName, lineNumber, arrayList, index);
        }
    }

    public static void d(String tag, ArrayList<?> arrayList, int index) {
        if (isRunning) {
            int stackTraceSize = Thread.currentThread().getStackTrace().length;
            String className = getClassName(Thread.currentThread().getStackTrace()[stackTraceSize - 1].getClassName());
            String methodName = Thread.currentThread().getStackTrace()[stackTraceSize - 1].getMethodName();
            int lineNumber = Thread.currentThread().getStackTrace()[stackTraceSize - 1].getLineNumber();
            separate(LogSeparator.DEBUG, className, methodName, lineNumber, tag, arrayList, index);
        }
    }

    public static void d(ArrayList<?> arrayList, int index, String comment) {
        if (isRunning) {
            int stackTraceSize = Thread.currentThread().getStackTrace().length;
            String className = getClassName(Thread.currentThread().getStackTrace()[stackTraceSize - 1].getClassName());
            String methodName = Thread.currentThread().getStackTrace()[stackTraceSize - 1].getMethodName();
            int lineNumber = Thread.currentThread().getStackTrace()[stackTraceSize - 1].getLineNumber();
            separate(LogSeparator.DEBUG, className, methodName, lineNumber, arrayList, index, comment);
        }
    }

    public static void d(String tag, ArrayList<?> arrayList, int index, String comment) {
        if (isRunning) {
            int stackTraceSize = Thread.currentThread().getStackTrace().length;
            String className = getClassName(Thread.currentThread().getStackTrace()[stackTraceSize - 1].getClassName());
            String methodName = Thread.currentThread().getStackTrace()[stackTraceSize - 1].getMethodName();
            int lineNumber = Thread.currentThread().getStackTrace()[stackTraceSize - 1].getLineNumber();
            separate(LogSeparator.DEBUG, className, methodName, lineNumber, tag, arrayList, index, comment);
        }
    }

    public static void d(ArrayList<?> arrayList, int startIndex, int endIndex) {
        if (isRunning) {
            int stackTraceSize = Thread.currentThread().getStackTrace().length;
            String className = getClassName(Thread.currentThread().getStackTrace()[stackTraceSize - 1].getClassName());
            String methodName = Thread.currentThread().getStackTrace()[stackTraceSize - 1].getMethodName();
            int lineNumber = Thread.currentThread().getStackTrace()[stackTraceSize - 1].getLineNumber();
            separate(LogSeparator.DEBUG, className, methodName, lineNumber, arrayList, startIndex, endIndex);
        }
    }

    public static void d(String tag, ArrayList<?> arrayList, int startIndex, int endIndex) {
        if (isRunning) {
            int stackTraceSize = Thread.currentThread().getStackTrace().length;
            String className = getClassName(Thread.currentThread().getStackTrace()[stackTraceSize - 1].getClassName());
            String methodName = Thread.currentThread().getStackTrace()[stackTraceSize - 1].getMethodName();
            int lineNumber = Thread.currentThread().getStackTrace()[stackTraceSize - 1].getLineNumber();
            separate(LogSeparator.DEBUG, className, methodName, lineNumber, tag, arrayList, startIndex, endIndex);
        }
    }

    public static void d(ArrayList<?> arrayList, int startIndex, int endIndex, String comment) {
        if (isRunning) {
            int stackTraceSize = Thread.currentThread().getStackTrace().length;
            String className = getClassName(Thread.currentThread().getStackTrace()[stackTraceSize - 1].getClassName());
            String methodName = Thread.currentThread().getStackTrace()[stackTraceSize - 1].getMethodName();
            int lineNumber = Thread.currentThread().getStackTrace()[stackTraceSize - 1].getLineNumber();
            separate(LogSeparator.DEBUG, className, methodName, lineNumber, arrayList, startIndex, endIndex, comment);
        }
    }

    public static void d(String tag, ArrayList<?> arrayList, int startIndex, int endIndex, String comment) {
        if (isRunning) {
            int stackTraceSize = Thread.currentThread().getStackTrace().length;
            String className = getClassName(Thread.currentThread().getStackTrace()[stackTraceSize - 1].getClassName());
            String methodName = Thread.currentThread().getStackTrace()[stackTraceSize - 1].getMethodName();
            int lineNumber = Thread.currentThread().getStackTrace()[stackTraceSize - 1].getLineNumber();
            separate(LogSeparator.DEBUG, className, methodName, lineNumber, tag, arrayList, startIndex, endIndex, comment);
        }
    }

    /**
     * Log Info
     */

    public static void i() {
        if (isRunning) {
            int stackTraceSize = Thread.currentThread().getStackTrace().length;
            String className = getClassName(Thread.currentThread().getStackTrace()[stackTraceSize - 1].getClassName());
            String methodName = Thread.currentThread().getStackTrace()[stackTraceSize - 1].getMethodName();
            int lineNumber = Thread.currentThread().getStackTrace()[stackTraceSize - 1].getLineNumber();
            separate(LogSeparator.INFO, className, methodName, lineNumber);
        }
    }

    public static void i(String comment) {
        if (isRunning) {
            int stackTraceSize = Thread.currentThread().getStackTrace().length;
            String className = getClassName(Thread.currentThread().getStackTrace()[stackTraceSize - 1].getClassName());
            String methodName = Thread.currentThread().getStackTrace()[stackTraceSize - 1].getMethodName();
            int lineNumber = Thread.currentThread().getStackTrace()[stackTraceSize - 1].getLineNumber();
            separate(LogSeparator.INFO, className, methodName, lineNumber, comment);
        }
    }

    public static void i(String tag, String comment) {
        if (isRunning) {
            int stackTraceSize = Thread.currentThread().getStackTrace().length;
            String className = getClassName(Thread.currentThread().getStackTrace()[stackTraceSize - 1].getClassName());
            String methodName = Thread.currentThread().getStackTrace()[stackTraceSize - 1].getMethodName();
            int lineNumber = Thread.currentThread().getStackTrace()[stackTraceSize - 1].getLineNumber();
            separate(LogSeparator.INFO, className, methodName, lineNumber, tag, comment);
        }
    }

    public static void i(Object object) {
        if (isRunning) {
            int stackTraceSize = Thread.currentThread().getStackTrace().length;
            String className = getClassName(Thread.currentThread().getStackTrace()[stackTraceSize - 1].getClassName());
            String methodName = Thread.currentThread().getStackTrace()[stackTraceSize - 1].getMethodName();
            int lineNumber = Thread.currentThread().getStackTrace()[stackTraceSize - 1].getLineNumber();
            separate(LogSeparator.INFO, className, methodName, lineNumber, object);
        }
    }

    public static void i(String tag, Object object) {
        if (isRunning) {
            int stackTraceSize = Thread.currentThread().getStackTrace().length;
            String className = getClassName(Thread.currentThread().getStackTrace()[stackTraceSize - 1].getClassName());
            String methodName = Thread.currentThread().getStackTrace()[stackTraceSize - 1].getMethodName();
            int lineNumber = Thread.currentThread().getStackTrace()[stackTraceSize - 1].getLineNumber();
            separate(LogSeparator.INFO, className, methodName, lineNumber, tag, object);
        }
    }

    public static void i(Object object, String comment) {
        if (isRunning) {
            int stackTraceSize = Thread.currentThread().getStackTrace().length;
            String className = getClassName(Thread.currentThread().getStackTrace()[stackTraceSize - 1].getClassName());
            String methodName = Thread.currentThread().getStackTrace()[stackTraceSize - 1].getMethodName();
            int lineNumber = Thread.currentThread().getStackTrace()[stackTraceSize - 1].getLineNumber();
            separate(LogSeparator.INFO, className, methodName, lineNumber, object, comment);
        }
    }

    public static void i(String tag, Object object, String comment) {
        if (isRunning) {
            int stackTraceSize = Thread.currentThread().getStackTrace().length;
            String className = getClassName(Thread.currentThread().getStackTrace()[stackTraceSize - 1].getClassName());
            String methodName = Thread.currentThread().getStackTrace()[stackTraceSize - 1].getMethodName();
            int lineNumber = Thread.currentThread().getStackTrace()[stackTraceSize - 1].getLineNumber();
            separate(LogSeparator.INFO, className, methodName, lineNumber, tag, object, comment);
        }
    }

    public static void i(ArrayList<?> arrayList) {
        if (isRunning) {
            int stackTraceSize = Thread.currentThread().getStackTrace().length;
            String className = getClassName(Thread.currentThread().getStackTrace()[stackTraceSize - 1].getClassName());
            String methodName = Thread.currentThread().getStackTrace()[stackTraceSize - 1].getMethodName();
            int lineNumber = Thread.currentThread().getStackTrace()[stackTraceSize - 1].getLineNumber();
            separate(LogSeparator.INFO, className, methodName, lineNumber, arrayList);
        }
    }

    public static void i(String tag, ArrayList<?> arrayList) {
        if (isRunning) {
            int stackTraceSize = Thread.currentThread().getStackTrace().length;
            String className = getClassName(Thread.currentThread().getStackTrace()[stackTraceSize - 1].getClassName());
            String methodName = Thread.currentThread().getStackTrace()[stackTraceSize - 1].getMethodName();
            int lineNumber = Thread.currentThread().getStackTrace()[stackTraceSize - 1].getLineNumber();
            separate(LogSeparator.INFO, className, methodName, lineNumber, tag, arrayList);
        }
    }

    public static void i(ArrayList<?> arrayList, String comment) {
        if (isRunning) {
            int stackTraceSize = Thread.currentThread().getStackTrace().length;
            String className = getClassName(Thread.currentThread().getStackTrace()[stackTraceSize - 1].getClassName());
            String methodName = Thread.currentThread().getStackTrace()[stackTraceSize - 1].getMethodName();
            int lineNumber = Thread.currentThread().getStackTrace()[stackTraceSize - 1].getLineNumber();
            separate(LogSeparator.INFO, className, methodName, lineNumber, arrayList, comment);
        }
    }

    public static void i(String tag, ArrayList<?> arrayList, String comment) {
        if (isRunning) {
            int stackTraceSize = Thread.currentThread().getStackTrace().length;
            String className = getClassName(Thread.currentThread().getStackTrace()[stackTraceSize - 1].getClassName());
            String methodName = Thread.currentThread().getStackTrace()[stackTraceSize - 1].getMethodName();
            int lineNumber = Thread.currentThread().getStackTrace()[stackTraceSize - 1].getLineNumber();
            separate(LogSeparator.INFO, className, methodName, lineNumber, tag, arrayList, comment);
        }
    }

    public static void i(ArrayList<?> arrayList, int index) {
        if (isRunning) {
            int stackTraceSize = Thread.currentThread().getStackTrace().length;
            String className = getClassName(Thread.currentThread().getStackTrace()[stackTraceSize - 1].getClassName());
            String methodName = Thread.currentThread().getStackTrace()[stackTraceSize - 1].getMethodName();
            int lineNumber = Thread.currentThread().getStackTrace()[stackTraceSize - 1].getLineNumber();
            separate(LogSeparator.INFO, className, methodName, lineNumber, arrayList, index);
        }
    }

    public static void i(String tag, ArrayList<?> arrayList, int index) {
        if (isRunning) {
            int stackTraceSize = Thread.currentThread().getStackTrace().length;
            String className = getClassName(Thread.currentThread().getStackTrace()[stackTraceSize - 1].getClassName());
            String methodName = Thread.currentThread().getStackTrace()[stackTraceSize - 1].getMethodName();
            int lineNumber = Thread.currentThread().getStackTrace()[stackTraceSize - 1].getLineNumber();
            separate(LogSeparator.INFO, className, methodName, lineNumber, tag, arrayList, index);
        }
    }

    public static void i(ArrayList<?> arrayList, int index, String comment) {
        if (isRunning) {
            int stackTraceSize = Thread.currentThread().getStackTrace().length;
            String className = getClassName(Thread.currentThread().getStackTrace()[stackTraceSize - 1].getClassName());
            String methodName = Thread.currentThread().getStackTrace()[stackTraceSize - 1].getMethodName();
            int lineNumber = Thread.currentThread().getStackTrace()[stackTraceSize - 1].getLineNumber();
            separate(LogSeparator.INFO, className, methodName, lineNumber, arrayList, index, comment);
        }
    }

    public static void i(String tag, ArrayList<?> arrayList, int index, String comment) {
        if (isRunning) {
            int stackTraceSize = Thread.currentThread().getStackTrace().length;
            String className = getClassName(Thread.currentThread().getStackTrace()[stackTraceSize - 1].getClassName());
            String methodName = Thread.currentThread().getStackTrace()[stackTraceSize - 1].getMethodName();
            int lineNumber = Thread.currentThread().getStackTrace()[stackTraceSize - 1].getLineNumber();
            separate(LogSeparator.INFO, className, methodName, lineNumber, tag, arrayList, index, comment);
        }
    }

    public static void i(ArrayList<?> arrayList, int startIndex, int endIndex) {
        if (isRunning) {
            int stackTraceSize = Thread.currentThread().getStackTrace().length;
            String className = getClassName(Thread.currentThread().getStackTrace()[stackTraceSize - 1].getClassName());
            String methodName = Thread.currentThread().getStackTrace()[stackTraceSize - 1].getMethodName();
            int lineNumber = Thread.currentThread().getStackTrace()[stackTraceSize - 1].getLineNumber();
            separate(LogSeparator.INFO, className, methodName, lineNumber, arrayList, startIndex, endIndex);
        }
    }

    public static void i(String tag, ArrayList<?> arrayList, int startIndex, int endIndex) {
        if (isRunning) {
            int stackTraceSize = Thread.currentThread().getStackTrace().length;
            String className = getClassName(Thread.currentThread().getStackTrace()[stackTraceSize - 1].getClassName());
            String methodName = Thread.currentThread().getStackTrace()[stackTraceSize - 1].getMethodName();
            int lineNumber = Thread.currentThread().getStackTrace()[stackTraceSize - 1].getLineNumber();
            separate(LogSeparator.INFO, className, methodName, lineNumber, tag, arrayList, startIndex, endIndex);
        }
    }

    public static void i(ArrayList<?> arrayList, int startIndex, int endIndex, String comment) {
        if (isRunning) {
            int stackTraceSize = Thread.currentThread().getStackTrace().length;
            String className = getClassName(Thread.currentThread().getStackTrace()[stackTraceSize - 1].getClassName());
            String methodName = Thread.currentThread().getStackTrace()[stackTraceSize - 1].getMethodName();
            int lineNumber = Thread.currentThread().getStackTrace()[stackTraceSize - 1].getLineNumber();
            separate(LogSeparator.INFO, className, methodName, lineNumber, arrayList, startIndex, endIndex, comment);
        }
    }

    public static void i(String tag, ArrayList<?> arrayList, int startIndex, int endIndex, String comment) {
        if (isRunning) {
            int stackTraceSize = Thread.currentThread().getStackTrace().length;
            String className = getClassName(Thread.currentThread().getStackTrace()[stackTraceSize - 1].getClassName());
            String methodName = Thread.currentThread().getStackTrace()[stackTraceSize - 1].getMethodName();
            int lineNumber = Thread.currentThread().getStackTrace()[stackTraceSize - 1].getLineNumber();
            separate(LogSeparator.INFO, className, methodName, lineNumber, tag, arrayList, startIndex, endIndex, comment);
        }
    }

    /**
     * Log Warn
     */

    public static void w() {
        if (isRunning) {
            int stackTraceSize = Thread.currentThread().getStackTrace().length;
            String className = getClassName(Thread.currentThread().getStackTrace()[stackTraceSize - 1].getClassName());
            String methodName = Thread.currentThread().getStackTrace()[stackTraceSize - 1].getMethodName();
            int lineNumber = Thread.currentThread().getStackTrace()[stackTraceSize - 1].getLineNumber();
            separate(LogSeparator.WARN, className, methodName, lineNumber);
        }
    }

    public static void w(String comment) {
        if (isRunning) {
            int stackTraceSize = Thread.currentThread().getStackTrace().length;
            String className = getClassName(Thread.currentThread().getStackTrace()[stackTraceSize - 1].getClassName());
            String methodName = Thread.currentThread().getStackTrace()[stackTraceSize - 1].getMethodName();
            int lineNumber = Thread.currentThread().getStackTrace()[stackTraceSize - 1].getLineNumber();
            separate(LogSeparator.WARN, className, methodName, lineNumber, comment);
        }
    }

    public static void w(String tag, String comment) {
        if (isRunning) {
            int stackTraceSize = Thread.currentThread().getStackTrace().length;
            String className = getClassName(Thread.currentThread().getStackTrace()[stackTraceSize - 1].getClassName());
            String methodName = Thread.currentThread().getStackTrace()[stackTraceSize - 1].getMethodName();
            int lineNumber = Thread.currentThread().getStackTrace()[stackTraceSize - 1].getLineNumber();
            separate(LogSeparator.WARN, className, methodName, lineNumber, tag, comment);
        }
    }

    public static void w(Object object) {
        if (isRunning) {
            int stackTraceSize = Thread.currentThread().getStackTrace().length;
            String className = getClassName(Thread.currentThread().getStackTrace()[stackTraceSize - 1].getClassName());
            String methodName = Thread.currentThread().getStackTrace()[stackTraceSize - 1].getMethodName();
            int lineNumber = Thread.currentThread().getStackTrace()[stackTraceSize - 1].getLineNumber();
            separate(LogSeparator.WARN, className, methodName, lineNumber, object);
        }
    }

    public static void w(String tag, Object object) {
        if (isRunning) {
            int stackTraceSize = Thread.currentThread().getStackTrace().length;
            String className = getClassName(Thread.currentThread().getStackTrace()[stackTraceSize - 1].getClassName());
            String methodName = Thread.currentThread().getStackTrace()[stackTraceSize - 1].getMethodName();
            int lineNumber = Thread.currentThread().getStackTrace()[stackTraceSize - 1].getLineNumber();
            separate(LogSeparator.WARN, className, methodName, lineNumber, tag, object);
        }
    }

    public static void w(Object object, String comment) {
        if (isRunning) {
            int stackTraceSize = Thread.currentThread().getStackTrace().length;
            String className = getClassName(Thread.currentThread().getStackTrace()[stackTraceSize - 1].getClassName());
            String methodName = Thread.currentThread().getStackTrace()[stackTraceSize - 1].getMethodName();
            int lineNumber = Thread.currentThread().getStackTrace()[stackTraceSize - 1].getLineNumber();
            separate(LogSeparator.WARN, className, methodName, lineNumber, object, comment);
        }
    }

    public static void w(String tag, Object object, String comment) {
        if (isRunning) {
            int stackTraceSize = Thread.currentThread().getStackTrace().length;
            String className = getClassName(Thread.currentThread().getStackTrace()[stackTraceSize - 1].getClassName());
            String methodName = Thread.currentThread().getStackTrace()[stackTraceSize - 1].getMethodName();
            int lineNumber = Thread.currentThread().getStackTrace()[stackTraceSize - 1].getLineNumber();
            separate(LogSeparator.WARN, className, methodName, lineNumber, tag, object, comment);
        }
    }

    public static void w(ArrayList<?> arrayList) {
        if (isRunning) {
            int stackTraceSize = Thread.currentThread().getStackTrace().length;
            String className = getClassName(Thread.currentThread().getStackTrace()[stackTraceSize - 1].getClassName());
            String methodName = Thread.currentThread().getStackTrace()[stackTraceSize - 1].getMethodName();
            int lineNumber = Thread.currentThread().getStackTrace()[stackTraceSize - 1].getLineNumber();
            separate(LogSeparator.WARN, className, methodName, lineNumber, arrayList);
        }
    }

    public static void w(String tag, ArrayList<?> arrayList) {
        if (isRunning) {
            int stackTraceSize = Thread.currentThread().getStackTrace().length;
            String className = getClassName(Thread.currentThread().getStackTrace()[stackTraceSize - 1].getClassName());
            String methodName = Thread.currentThread().getStackTrace()[stackTraceSize - 1].getMethodName();
            int lineNumber = Thread.currentThread().getStackTrace()[stackTraceSize - 1].getLineNumber();
            separate(LogSeparator.WARN, className, methodName, lineNumber, tag, arrayList);
        }
    }

    public static void w(ArrayList<?> arrayList, String comment) {
        if (isRunning) {
            int stackTraceSize = Thread.currentThread().getStackTrace().length;
            String className = getClassName(Thread.currentThread().getStackTrace()[stackTraceSize - 1].getClassName());
            String methodName = Thread.currentThread().getStackTrace()[stackTraceSize - 1].getMethodName();
            int lineNumber = Thread.currentThread().getStackTrace()[stackTraceSize - 1].getLineNumber();
            separate(LogSeparator.WARN, className, methodName, lineNumber, arrayList, comment);
        }
    }

    public static void w(String tag, ArrayList<?> arrayList, String comment) {
        if (isRunning) {
            int stackTraceSize = Thread.currentThread().getStackTrace().length;
            String className = getClassName(Thread.currentThread().getStackTrace()[stackTraceSize - 1].getClassName());
            String methodName = Thread.currentThread().getStackTrace()[stackTraceSize - 1].getMethodName();
            int lineNumber = Thread.currentThread().getStackTrace()[stackTraceSize - 1].getLineNumber();
            separate(LogSeparator.WARN, className, methodName, lineNumber, tag, arrayList, comment);
        }
    }

    public static void w(ArrayList<?> arrayList, int index) {
        if (isRunning) {
            int stackTraceSize = Thread.currentThread().getStackTrace().length;
            String className = getClassName(Thread.currentThread().getStackTrace()[stackTraceSize - 1].getClassName());
            String methodName = Thread.currentThread().getStackTrace()[stackTraceSize - 1].getMethodName();
            int lineNumber = Thread.currentThread().getStackTrace()[stackTraceSize - 1].getLineNumber();
            separate(LogSeparator.WARN, className, methodName, lineNumber, arrayList, index);
        }
    }

    public static void w(String tag, ArrayList<?> arrayList, int index) {
        if (isRunning) {
            int stackTraceSize = Thread.currentThread().getStackTrace().length;
            String className = getClassName(Thread.currentThread().getStackTrace()[stackTraceSize - 1].getClassName());
            String methodName = Thread.currentThread().getStackTrace()[stackTraceSize - 1].getMethodName();
            int lineNumber = Thread.currentThread().getStackTrace()[stackTraceSize - 1].getLineNumber();
            separate(LogSeparator.WARN, className, methodName, lineNumber, tag, arrayList, index);
        }
    }

    public static void w(ArrayList<?> arrayList, int index, String comment) {
        if (isRunning) {
            int stackTraceSize = Thread.currentThread().getStackTrace().length;
            String className = getClassName(Thread.currentThread().getStackTrace()[stackTraceSize - 1].getClassName());
            String methodName = Thread.currentThread().getStackTrace()[stackTraceSize - 1].getMethodName();
            int lineNumber = Thread.currentThread().getStackTrace()[stackTraceSize - 1].getLineNumber();
            separate(LogSeparator.WARN, className, methodName, lineNumber, arrayList, index, comment);
        }
    }

    public static void w(String tag, ArrayList<?> arrayList, int index, String comment) {
        if (isRunning) {
            int stackTraceSize = Thread.currentThread().getStackTrace().length;
            String className = getClassName(Thread.currentThread().getStackTrace()[stackTraceSize - 1].getClassName());
            String methodName = Thread.currentThread().getStackTrace()[stackTraceSize - 1].getMethodName();
            int lineNumber = Thread.currentThread().getStackTrace()[stackTraceSize - 1].getLineNumber();
            separate(LogSeparator.WARN, className, methodName, lineNumber, tag, arrayList, index, comment);
        }
    }

    public static void w(ArrayList<?> arrayList, int startIndex, int endIndex) {
        if (isRunning) {
            int stackTraceSize = Thread.currentThread().getStackTrace().length;
            String className = getClassName(Thread.currentThread().getStackTrace()[stackTraceSize - 1].getClassName());
            String methodName = Thread.currentThread().getStackTrace()[stackTraceSize - 1].getMethodName();
            int lineNumber = Thread.currentThread().getStackTrace()[stackTraceSize - 1].getLineNumber();
            separate(LogSeparator.WARN, className, methodName, lineNumber, arrayList, startIndex, endIndex);
        }
    }

    public static void w(String tag, ArrayList<?> arrayList, int startIndex, int endIndex) {
        if (isRunning) {
            int stackTraceSize = Thread.currentThread().getStackTrace().length;
            String className = getClassName(Thread.currentThread().getStackTrace()[stackTraceSize - 1].getClassName());
            String methodName = Thread.currentThread().getStackTrace()[stackTraceSize - 1].getMethodName();
            int lineNumber = Thread.currentThread().getStackTrace()[stackTraceSize - 1].getLineNumber();
            separate(LogSeparator.WARN, className, methodName, lineNumber, tag, arrayList, startIndex, endIndex);
        }
    }

    public static void w(ArrayList<?> arrayList, int startIndex, int endIndex, String comment) {
        if (isRunning) {
            int stackTraceSize = Thread.currentThread().getStackTrace().length;
            String className = getClassName(Thread.currentThread().getStackTrace()[stackTraceSize - 1].getClassName());
            String methodName = Thread.currentThread().getStackTrace()[stackTraceSize - 1].getMethodName();
            int lineNumber = Thread.currentThread().getStackTrace()[stackTraceSize - 1].getLineNumber();
            separate(LogSeparator.WARN, className, methodName, lineNumber, arrayList, startIndex, endIndex, comment);
        }
    }

    public static void w(String tag, ArrayList<?> arrayList, int startIndex, int endIndex, String comment) {
        if (isRunning) {
            int stackTraceSize = Thread.currentThread().getStackTrace().length;
            String className = getClassName(Thread.currentThread().getStackTrace()[stackTraceSize - 1].getClassName());
            String methodName = Thread.currentThread().getStackTrace()[stackTraceSize - 1].getMethodName();
            int lineNumber = Thread.currentThread().getStackTrace()[stackTraceSize - 1].getLineNumber();
            separate(LogSeparator.WARN, className, methodName, lineNumber, tag, arrayList, startIndex, endIndex, comment);
        }
    }

    /**
     * Log Error
     */

    public static void e() {
        if (isRunning) {
            int stackTraceSize = Thread.currentThread().getStackTrace().length;
            String className = getClassName(Thread.currentThread().getStackTrace()[stackTraceSize - 1].getClassName());
            String methodName = Thread.currentThread().getStackTrace()[stackTraceSize - 1].getMethodName();
            int lineNumber = Thread.currentThread().getStackTrace()[stackTraceSize - 1].getLineNumber();
            separate(LogSeparator.ERROR, className, methodName, lineNumber);
        }
    }

    public static void e(String comment) {
        if (isRunning) {
            int stackTraceSize = Thread.currentThread().getStackTrace().length;
            String className = getClassName(Thread.currentThread().getStackTrace()[stackTraceSize - 1].getClassName());
            String methodName = Thread.currentThread().getStackTrace()[stackTraceSize - 1].getMethodName();
            int lineNumber = Thread.currentThread().getStackTrace()[stackTraceSize - 1].getLineNumber();
            separate(LogSeparator.ERROR, className, methodName, lineNumber, comment);
        }
    }

    public static void e(String tag, String comment) {
        if (isRunning) {
            int stackTraceSize = Thread.currentThread().getStackTrace().length;
            String className = getClassName(Thread.currentThread().getStackTrace()[stackTraceSize - 1].getClassName());
            String methodName = Thread.currentThread().getStackTrace()[stackTraceSize - 1].getMethodName();
            int lineNumber = Thread.currentThread().getStackTrace()[stackTraceSize - 1].getLineNumber();
            separate(LogSeparator.ERROR, className, methodName, lineNumber, tag, comment);
        }
    }

    public static void e(Object object) {
        if (isRunning) {
            int stackTraceSize = Thread.currentThread().getStackTrace().length;
            String className = getClassName(Thread.currentThread().getStackTrace()[stackTraceSize - 1].getClassName());
            String methodName = Thread.currentThread().getStackTrace()[stackTraceSize - 1].getMethodName();
            int lineNumber = Thread.currentThread().getStackTrace()[stackTraceSize - 1].getLineNumber();
            separate(LogSeparator.ERROR, className, methodName, lineNumber, object);
        }
    }

    public static void e(String tag, Object object) {
        if (isRunning) {
            int stackTraceSize = Thread.currentThread().getStackTrace().length;
            String className = getClassName(Thread.currentThread().getStackTrace()[stackTraceSize - 1].getClassName());
            String methodName = Thread.currentThread().getStackTrace()[stackTraceSize - 1].getMethodName();
            int lineNumber = Thread.currentThread().getStackTrace()[stackTraceSize - 1].getLineNumber();
            separate(LogSeparator.ERROR, className, methodName, lineNumber, tag, object);
        }
    }

    public static void e(Object object, String comment) {
        if (isRunning) {
            int stackTraceSize = Thread.currentThread().getStackTrace().length;
            String className = getClassName(Thread.currentThread().getStackTrace()[stackTraceSize - 1].getClassName());
            String methodName = Thread.currentThread().getStackTrace()[stackTraceSize - 1].getMethodName();
            int lineNumber = Thread.currentThread().getStackTrace()[stackTraceSize - 1].getLineNumber();
            separate(LogSeparator.ERROR, className, methodName, lineNumber, object, comment);
        }
    }

    public static void e(String tag, Object object, String comment) {
        if (isRunning) {
            int stackTraceSize = Thread.currentThread().getStackTrace().length;
            String className = getClassName(Thread.currentThread().getStackTrace()[stackTraceSize - 1].getClassName());
            String methodName = Thread.currentThread().getStackTrace()[stackTraceSize - 1].getMethodName();
            int lineNumber = Thread.currentThread().getStackTrace()[stackTraceSize - 1].getLineNumber();
            separate(LogSeparator.ERROR, className, methodName, lineNumber, tag, object, comment);
        }
    }

    public static void e(ArrayList<?> arrayList) {
        if (isRunning) {
            int stackTraceSize = Thread.currentThread().getStackTrace().length;
            String className = getClassName(Thread.currentThread().getStackTrace()[stackTraceSize - 1].getClassName());
            String methodName = Thread.currentThread().getStackTrace()[stackTraceSize - 1].getMethodName();
            int lineNumber = Thread.currentThread().getStackTrace()[stackTraceSize - 1].getLineNumber();
            separate(LogSeparator.ERROR, className, methodName, lineNumber, arrayList);
        }
    }

    public static void e(String tag, ArrayList<?> arrayList) {
        if (isRunning) {
            int stackTraceSize = Thread.currentThread().getStackTrace().length;
            String className = getClassName(Thread.currentThread().getStackTrace()[stackTraceSize - 1].getClassName());
            String methodName = Thread.currentThread().getStackTrace()[stackTraceSize - 1].getMethodName();
            int lineNumber = Thread.currentThread().getStackTrace()[stackTraceSize - 1].getLineNumber();
            separate(LogSeparator.ERROR, className, methodName, lineNumber, tag, arrayList);
        }
    }

    public static void e(ArrayList<?> arrayList, String comment) {
        if (isRunning) {
            int stackTraceSize = Thread.currentThread().getStackTrace().length;
            String className = getClassName(Thread.currentThread().getStackTrace()[stackTraceSize - 1].getClassName());
            String methodName = Thread.currentThread().getStackTrace()[stackTraceSize - 1].getMethodName();
            int lineNumber = Thread.currentThread().getStackTrace()[stackTraceSize - 1].getLineNumber();
            separate(LogSeparator.ERROR, className, methodName, lineNumber, arrayList, comment);
        }
    }

    public static void e(String tag, ArrayList<?> arrayList, String comment) {
        if (isRunning) {
            int stackTraceSize = Thread.currentThread().getStackTrace().length;
            String className = getClassName(Thread.currentThread().getStackTrace()[stackTraceSize - 1].getClassName());
            String methodName = Thread.currentThread().getStackTrace()[stackTraceSize - 1].getMethodName();
            int lineNumber = Thread.currentThread().getStackTrace()[stackTraceSize - 1].getLineNumber();
            separate(LogSeparator.ERROR, className, methodName, lineNumber, tag, arrayList, comment);
        }
    }

    public static void e(ArrayList<?> arrayList, int index) {
        if (isRunning) {
            int stackTraceSize = Thread.currentThread().getStackTrace().length;
            String className = getClassName(Thread.currentThread().getStackTrace()[stackTraceSize - 1].getClassName());
            String methodName = Thread.currentThread().getStackTrace()[stackTraceSize - 1].getMethodName();
            int lineNumber = Thread.currentThread().getStackTrace()[stackTraceSize - 1].getLineNumber();
            separate(LogSeparator.ERROR, className, methodName, lineNumber, arrayList, index);
        }
    }

    public static void e(String tag, ArrayList<?> arrayList, int index) {
        if (isRunning) {
            int stackTraceSize = Thread.currentThread().getStackTrace().length;
            String className = getClassName(Thread.currentThread().getStackTrace()[stackTraceSize - 1].getClassName());
            String methodName = Thread.currentThread().getStackTrace()[stackTraceSize - 1].getMethodName();
            int lineNumber = Thread.currentThread().getStackTrace()[stackTraceSize - 1].getLineNumber();
            separate(LogSeparator.ERROR, className, methodName, lineNumber, tag, arrayList, index);
        }
    }

    public static void e(ArrayList<?> arrayList, int index, String comment) {
        if (isRunning) {
            int stackTraceSize = Thread.currentThread().getStackTrace().length;
            String className = getClassName(Thread.currentThread().getStackTrace()[stackTraceSize - 1].getClassName());
            String methodName = Thread.currentThread().getStackTrace()[stackTraceSize - 1].getMethodName();
            int lineNumber = Thread.currentThread().getStackTrace()[stackTraceSize - 1].getLineNumber();
            separate(LogSeparator.ERROR, className, methodName, lineNumber, arrayList, index, comment);
        }
    }

    public static void e(String tag, ArrayList<?> arrayList, int index, String comment) {
        if (isRunning) {
            int stackTraceSize = Thread.currentThread().getStackTrace().length;
            String className = getClassName(Thread.currentThread().getStackTrace()[stackTraceSize - 1].getClassName());
            String methodName = Thread.currentThread().getStackTrace()[stackTraceSize - 1].getMethodName();
            int lineNumber = Thread.currentThread().getStackTrace()[stackTraceSize - 1].getLineNumber();
            separate(LogSeparator.ERROR, className, methodName, lineNumber, tag, arrayList, index, comment);
        }
    }

    public static void e(ArrayList<?> arrayList, int startIndex, int endIndex) {
        if (isRunning) {
            int stackTraceSize = Thread.currentThread().getStackTrace().length;
            String className = getClassName(Thread.currentThread().getStackTrace()[stackTraceSize - 1].getClassName());
            String methodName = Thread.currentThread().getStackTrace()[stackTraceSize - 1].getMethodName();
            int lineNumber = Thread.currentThread().getStackTrace()[stackTraceSize - 1].getLineNumber();
            separate(LogSeparator.ERROR, className, methodName, lineNumber, arrayList, startIndex, endIndex);
        }
    }

    public static void e(String tag, ArrayList<?> arrayList, int startIndex, int endIndex) {
        if (isRunning) {
            int stackTraceSize = Thread.currentThread().getStackTrace().length;
            String className = getClassName(Thread.currentThread().getStackTrace()[stackTraceSize - 1].getClassName());
            String methodName = Thread.currentThread().getStackTrace()[stackTraceSize - 1].getMethodName();
            int lineNumber = Thread.currentThread().getStackTrace()[stackTraceSize - 1].getLineNumber();
            separate(LogSeparator.ERROR, className, methodName, lineNumber, tag, arrayList, startIndex, endIndex);
        }
    }

    public static void e(ArrayList<?> arrayList, int startIndex, int endIndex, String comment) {
        if (isRunning) {
            int stackTraceSize = Thread.currentThread().getStackTrace().length;
            String className = getClassName(Thread.currentThread().getStackTrace()[stackTraceSize - 1].getClassName());
            String methodName = Thread.currentThread().getStackTrace()[stackTraceSize - 1].getMethodName();
            int lineNumber = Thread.currentThread().getStackTrace()[stackTraceSize - 1].getLineNumber();
            separate(LogSeparator.ERROR, className, methodName, lineNumber, arrayList, startIndex, endIndex, comment);
        }
    }

    public static void e(String tag, ArrayList<?> arrayList, int startIndex, int endIndex, String comment) {
        if (isRunning) {
            int stackTraceSize = Thread.currentThread().getStackTrace().length;
            String className = getClassName(Thread.currentThread().getStackTrace()[stackTraceSize - 1].getClassName());
            String methodName = Thread.currentThread().getStackTrace()[stackTraceSize - 1].getMethodName();
            int lineNumber = Thread.currentThread().getStackTrace()[stackTraceSize - 1].getLineNumber();
            separate(LogSeparator.ERROR, className, methodName, lineNumber, tag, arrayList, startIndex, endIndex, comment);
        }
    }


    /**
     * return Message
     */

    public static String getMessage() {
        int stackTraceSize = Thread.currentThread().getStackTrace().length;
        String className = getClassName(Thread.currentThread().getStackTrace()[stackTraceSize - 1].getClassName());
        String methodName = Thread.currentThread().getStackTrace()[stackTraceSize - 1].getMethodName();
        int lineNumber = Thread.currentThread().getStackTrace()[stackTraceSize - 1].getLineNumber();
        return getLogMessage(className, methodName, lineNumber);
    }

    public static String getMessage(String comment) {
        int stackTraceSize = Thread.currentThread().getStackTrace().length;
        String className = getClassName(Thread.currentThread().getStackTrace()[stackTraceSize - 1].getClassName());
        String methodName = Thread.currentThread().getStackTrace()[stackTraceSize - 1].getMethodName();
        int lineNumber = Thread.currentThread().getStackTrace()[stackTraceSize - 1].getLineNumber();
        return getLogMessage(className, methodName, lineNumber, comment);
    }

    public static String getMessage(String tag, String comment) {
        int stackTraceSize = Thread.currentThread().getStackTrace().length;
        String className = getClassName(Thread.currentThread().getStackTrace()[stackTraceSize - 1].getClassName());
        String methodName = Thread.currentThread().getStackTrace()[stackTraceSize - 1].getMethodName();
        int lineNumber = Thread.currentThread().getStackTrace()[stackTraceSize - 1].getLineNumber();
        return getLogMessage(className, methodName, lineNumber, tag, comment);
    }

    public static String getMessage(Object object) {
        int stackTraceSize = Thread.currentThread().getStackTrace().length;
        String className = getClassName(Thread.currentThread().getStackTrace()[stackTraceSize - 1].getClassName());
        String methodName = Thread.currentThread().getStackTrace()[stackTraceSize - 1].getMethodName();
        int lineNumber = Thread.currentThread().getStackTrace()[stackTraceSize - 1].getLineNumber();
        return getLogMessage(className, methodName, lineNumber, object);
    }

    public static String getMessage(String tag, Object object) {
        int stackTraceSize = Thread.currentThread().getStackTrace().length;
        String className = getClassName(Thread.currentThread().getStackTrace()[stackTraceSize - 1].getClassName());
        String methodName = Thread.currentThread().getStackTrace()[stackTraceSize - 1].getMethodName();
        int lineNumber = Thread.currentThread().getStackTrace()[stackTraceSize - 1].getLineNumber();
        return getLogMessage(className, methodName, lineNumber, tag, object);
    }

    public static String getMessage(Object object, String comment) {
        int stackTraceSize = Thread.currentThread().getStackTrace().length;
        String className = getClassName(Thread.currentThread().getStackTrace()[stackTraceSize - 1].getClassName());
        String methodName = Thread.currentThread().getStackTrace()[stackTraceSize - 1].getMethodName();
        int lineNumber = Thread.currentThread().getStackTrace()[stackTraceSize - 1].getLineNumber();
        return getLogMessage(className, methodName, lineNumber, object, comment);
    }

    public static String getMessage(String tag, Object object, String comment) {
        int stackTraceSize = Thread.currentThread().getStackTrace().length;
        String className = getClassName(Thread.currentThread().getStackTrace()[stackTraceSize - 1].getClassName());
        String methodName = Thread.currentThread().getStackTrace()[stackTraceSize - 1].getMethodName();
        int lineNumber = Thread.currentThread().getStackTrace()[stackTraceSize - 1].getLineNumber();
        return getLogMessage(className, methodName, lineNumber, tag, object, comment);
    }

    public static String getMessage(ArrayList<?> arrayList) {
        int stackTraceSize = Thread.currentThread().getStackTrace().length;
        String className = getClassName(Thread.currentThread().getStackTrace()[stackTraceSize - 1].getClassName());
        String methodName = Thread.currentThread().getStackTrace()[stackTraceSize - 1].getMethodName();
        int lineNumber = Thread.currentThread().getStackTrace()[stackTraceSize - 1].getLineNumber();
        return getLogMessage(className, methodName, lineNumber, arrayList);
    }

    public static String getMessage(String tag, ArrayList<?> arrayList) {
        int stackTraceSize = Thread.currentThread().getStackTrace().length;
        String className = getClassName(Thread.currentThread().getStackTrace()[stackTraceSize - 1].getClassName());
        String methodName = Thread.currentThread().getStackTrace()[stackTraceSize - 1].getMethodName();
        int lineNumber = Thread.currentThread().getStackTrace()[stackTraceSize - 1].getLineNumber();
        return getLogMessage(className, methodName, lineNumber, tag, arrayList);
    }

    public static String getMessage(ArrayList<?> arrayList, String comment) {
        int stackTraceSize = Thread.currentThread().getStackTrace().length;
        String className = getClassName(Thread.currentThread().getStackTrace()[stackTraceSize - 1].getClassName());
        String methodName = Thread.currentThread().getStackTrace()[stackTraceSize - 1].getMethodName();
        int lineNumber = Thread.currentThread().getStackTrace()[stackTraceSize - 1].getLineNumber();
        return getLogMessage(className, methodName, lineNumber, arrayList, comment);
    }

    public static String getMessage(String tag, ArrayList<?> arrayList, String comment) {
        int stackTraceSize = Thread.currentThread().getStackTrace().length;
        String className = getClassName(Thread.currentThread().getStackTrace()[stackTraceSize - 1].getClassName());
        String methodName = Thread.currentThread().getStackTrace()[stackTraceSize - 1].getMethodName();
        int lineNumber = Thread.currentThread().getStackTrace()[stackTraceSize - 1].getLineNumber();
        return getLogMessage(className, methodName, lineNumber, tag, arrayList, comment);
    }

    public static String getMessage(ArrayList<?> arrayList, int index) {
        int stackTraceSize = Thread.currentThread().getStackTrace().length;
        String className = getClassName(Thread.currentThread().getStackTrace()[stackTraceSize - 1].getClassName());
        String methodName = Thread.currentThread().getStackTrace()[stackTraceSize - 1].getMethodName();
        int lineNumber = Thread.currentThread().getStackTrace()[stackTraceSize - 1].getLineNumber();
        return getLogMessage(className, methodName, lineNumber, arrayList, index);
    }

    public static String getMessage(String tag, ArrayList<?> arrayList, int index) {
        int stackTraceSize = Thread.currentThread().getStackTrace().length;
        String className = getClassName(Thread.currentThread().getStackTrace()[stackTraceSize - 1].getClassName());
        String methodName = Thread.currentThread().getStackTrace()[stackTraceSize - 1].getMethodName();
        int lineNumber = Thread.currentThread().getStackTrace()[stackTraceSize - 1].getLineNumber();
        return getLogMessage(className, methodName, lineNumber, tag, arrayList, index);
    }

    public static String getMessage(ArrayList<?> arrayList, int index, String comment) {
        int stackTraceSize = Thread.currentThread().getStackTrace().length;
        String className = getClassName(Thread.currentThread().getStackTrace()[stackTraceSize - 1].getClassName());
        String methodName = Thread.currentThread().getStackTrace()[stackTraceSize - 1].getMethodName();
        int lineNumber = Thread.currentThread().getStackTrace()[stackTraceSize - 1].getLineNumber();
        return getLogMessage(className, methodName, lineNumber, arrayList, index, comment);
    }

    public static String getMessage(String tag, ArrayList<?> arrayList, int index, String comment) {
        int stackTraceSize = Thread.currentThread().getStackTrace().length;
        String className = getClassName(Thread.currentThread().getStackTrace()[stackTraceSize - 1].getClassName());
        String methodName = Thread.currentThread().getStackTrace()[stackTraceSize - 1].getMethodName();
        int lineNumber = Thread.currentThread().getStackTrace()[stackTraceSize - 1].getLineNumber();
        return getLogMessage(className, methodName, lineNumber, tag, arrayList, index, comment);
    }

    public static String getMessage(ArrayList<?> arrayList, int startIndex, int endIndex) {
        int stackTraceSize = Thread.currentThread().getStackTrace().length;
        String className = getClassName(Thread.currentThread().getStackTrace()[stackTraceSize - 1].getClassName());
        String methodName = Thread.currentThread().getStackTrace()[stackTraceSize - 1].getMethodName();
        int lineNumber = Thread.currentThread().getStackTrace()[stackTraceSize - 1].getLineNumber();
        return getLogMessage(className, methodName, lineNumber, arrayList, startIndex, endIndex);
    }

    public static String getMessage(String tag, ArrayList<?> arrayList, int startIndex, int endIndex) {
        int stackTraceSize = Thread.currentThread().getStackTrace().length;
        String className = getClassName(Thread.currentThread().getStackTrace()[stackTraceSize - 1].getClassName());
        String methodName = Thread.currentThread().getStackTrace()[stackTraceSize - 1].getMethodName();
        int lineNumber = Thread.currentThread().getStackTrace()[stackTraceSize - 1].getLineNumber();
        return getLogMessage(className, methodName, lineNumber, tag, arrayList, startIndex, endIndex);
    }

    public static String getMessage(ArrayList<?> arrayList, int startIndex, int endIndex, String comment) {
        int stackTraceSize = Thread.currentThread().getStackTrace().length;
        String className = getClassName(Thread.currentThread().getStackTrace()[stackTraceSize - 1].getClassName());
        String methodName = Thread.currentThread().getStackTrace()[stackTraceSize - 1].getMethodName();
        int lineNumber = Thread.currentThread().getStackTrace()[stackTraceSize - 1].getLineNumber();
        return getLogMessage(className, methodName, lineNumber, arrayList, startIndex, endIndex, comment);
    }

    public static String getMessage(String tag, ArrayList<?> arrayList, int startIndex, int endIndex, String comment) {
        int stackTraceSize = Thread.currentThread().getStackTrace().length;
        String className = getClassName(Thread.currentThread().getStackTrace()[stackTraceSize - 1].getClassName());
        String methodName = Thread.currentThread().getStackTrace()[stackTraceSize - 1].getMethodName();
        int lineNumber = Thread.currentThread().getStackTrace()[stackTraceSize - 1].getLineNumber();
        return getLogMessage(className, methodName, lineNumber, tag, arrayList, startIndex, endIndex, comment);
    }


}
