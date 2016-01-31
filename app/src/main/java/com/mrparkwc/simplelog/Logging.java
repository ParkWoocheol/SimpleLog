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
 * Developed by Park, Woocheol
 * Email: admin@mrparkwc.com
 * GitHub: https://github.com/ParkWoocheol
 */
public class Logging extends BaseLogging {

    /**
     * Log Debug
     */

    public static void d() {
        String className = getClassName(Thread.currentThread().getStackTrace()[3].getClassName());
        String methodName = Thread.currentThread().getStackTrace()[3].getMethodName();
        int lineNumber = Thread.currentThread().getStackTrace()[3].getLineNumber();
        seperate(LogSeparator.DEBUG, className, methodName, lineNumber);
    }

    public static void d(String comment) {
        String className = getClassName(Thread.currentThread().getStackTrace()[3].getClassName());
        String methodName = Thread.currentThread().getStackTrace()[3].getMethodName();
        int lineNumber = Thread.currentThread().getStackTrace()[3].getLineNumber();
        seperate(LogSeparator.DEBUG, className, methodName, lineNumber, comment);
    }

    public static void d(String tag, String comment) {
        String className = getClassName(Thread.currentThread().getStackTrace()[3].getClassName());
        String methodName = Thread.currentThread().getStackTrace()[3].getMethodName();
        int lineNumber = Thread.currentThread().getStackTrace()[3].getLineNumber();
        seperate(LogSeparator.DEBUG, className, methodName, lineNumber, tag, comment);
    }

    public static void d(Object object) {
        String className = getClassName(Thread.currentThread().getStackTrace()[3].getClassName());
        String methodName = Thread.currentThread().getStackTrace()[3].getMethodName();
        int lineNumber = Thread.currentThread().getStackTrace()[3].getLineNumber();
        seperate(LogSeparator.DEBUG, className, methodName, lineNumber, object);
    }

    public static void d(String tag, Object object) {
        String className = getClassName(Thread.currentThread().getStackTrace()[3].getClassName());
        String methodName = Thread.currentThread().getStackTrace()[3].getMethodName();
        int lineNumber = Thread.currentThread().getStackTrace()[3].getLineNumber();
        seperate(LogSeparator.DEBUG, className, methodName, lineNumber, tag, object);
    }

    public static void d(Object object, String comment) {
        String className = getClassName(Thread.currentThread().getStackTrace()[3].getClassName());
        String methodName = Thread.currentThread().getStackTrace()[3].getMethodName();
        int lineNumber = Thread.currentThread().getStackTrace()[3].getLineNumber();
        seperate(LogSeparator.DEBUG, className, methodName, lineNumber, object, comment);
    }

    public static void d(String tag, Object object, String comment) {
        String className = getClassName(Thread.currentThread().getStackTrace()[3].getClassName());
        String methodName = Thread.currentThread().getStackTrace()[3].getMethodName();
        int lineNumber = Thread.currentThread().getStackTrace()[3].getLineNumber();
        seperate(LogSeparator.DEBUG, className, methodName, lineNumber, tag, object, comment);
    }

    public static void d(ArrayList<?> arrayList) {
        String className = getClassName(Thread.currentThread().getStackTrace()[3].getClassName());
        String methodName = Thread.currentThread().getStackTrace()[3].getMethodName();
        int lineNumber = Thread.currentThread().getStackTrace()[3].getLineNumber();
        seperate(LogSeparator.DEBUG, className, methodName, lineNumber, arrayList);
    }

    public static void d(String tag, ArrayList<?> arrayList) {
        String className = getClassName(Thread.currentThread().getStackTrace()[3].getClassName());
        String methodName = Thread.currentThread().getStackTrace()[3].getMethodName();
        int lineNumber = Thread.currentThread().getStackTrace()[3].getLineNumber();
        seperate(LogSeparator.DEBUG, className, methodName, lineNumber, tag, arrayList);
    }

    public static void d(ArrayList<?> arrayList, String comment) {
        String className = getClassName(Thread.currentThread().getStackTrace()[3].getClassName());
        String methodName = Thread.currentThread().getStackTrace()[3].getMethodName();
        int lineNumber = Thread.currentThread().getStackTrace()[3].getLineNumber();
        seperate(LogSeparator.DEBUG, className, methodName, lineNumber, arrayList, comment);
    }

    public static void d(String tag, ArrayList<?> arrayList, String comment) {
        String className = getClassName(Thread.currentThread().getStackTrace()[3].getClassName());
        String methodName = Thread.currentThread().getStackTrace()[3].getMethodName();
        int lineNumber = Thread.currentThread().getStackTrace()[3].getLineNumber();
        seperate(LogSeparator.DEBUG, className, methodName, lineNumber, tag, arrayList, comment);
    }

    public static void d(ArrayList<?> arrayList, int index) {
        String className = getClassName(Thread.currentThread().getStackTrace()[3].getClassName());
        String methodName = Thread.currentThread().getStackTrace()[3].getMethodName();
        int lineNumber = Thread.currentThread().getStackTrace()[3].getLineNumber();
        seperate(LogSeparator.DEBUG, className, methodName, lineNumber, arrayList, index);
    }

    public static void d(String tag, ArrayList<?> arrayList, int index) {
        String className = getClassName(Thread.currentThread().getStackTrace()[3].getClassName());
        String methodName = Thread.currentThread().getStackTrace()[3].getMethodName();
        int lineNumber = Thread.currentThread().getStackTrace()[3].getLineNumber();
        seperate(LogSeparator.DEBUG, className, methodName, lineNumber, tag, arrayList, index);
    }

    public static void d(ArrayList<?> arrayList, int index, String comment) {
        String className = getClassName(Thread.currentThread().getStackTrace()[3].getClassName());
        String methodName = Thread.currentThread().getStackTrace()[3].getMethodName();
        int lineNumber = Thread.currentThread().getStackTrace()[3].getLineNumber();
        seperate(LogSeparator.DEBUG, className, methodName, lineNumber, arrayList, index, comment);
    }

    public static void d(String tag, ArrayList<?> arrayList, int index, String comment) {
        String className = getClassName(Thread.currentThread().getStackTrace()[3].getClassName());
        String methodName = Thread.currentThread().getStackTrace()[3].getMethodName();
        int lineNumber = Thread.currentThread().getStackTrace()[3].getLineNumber();
        seperate(LogSeparator.DEBUG, className, methodName, lineNumber, tag, arrayList, index, comment);
    }

    public static void d(ArrayList<?> arrayList, int startIndex, int endIndex) {
        String className = getClassName(Thread.currentThread().getStackTrace()[3].getClassName());
        String methodName = Thread.currentThread().getStackTrace()[3].getMethodName();
        int lineNumber = Thread.currentThread().getStackTrace()[3].getLineNumber();
        seperate(LogSeparator.DEBUG, className, methodName, lineNumber, arrayList, startIndex, endIndex);
    }

    public static void d(String tag, ArrayList<?> arrayList, int startIndex, int endIndex) {
        String className = getClassName(Thread.currentThread().getStackTrace()[3].getClassName());
        String methodName = Thread.currentThread().getStackTrace()[3].getMethodName();
        int lineNumber = Thread.currentThread().getStackTrace()[3].getLineNumber();
        seperate(LogSeparator.DEBUG, className, methodName, lineNumber, tag, arrayList, startIndex, endIndex);
    }

    public static void d(ArrayList<?> arrayList, int startIndex, int endIndex, String comment) {
        String className = getClassName(Thread.currentThread().getStackTrace()[3].getClassName());
        String methodName = Thread.currentThread().getStackTrace()[3].getMethodName();
        int lineNumber = Thread.currentThread().getStackTrace()[3].getLineNumber();
        seperate(LogSeparator.DEBUG, className, methodName, lineNumber, arrayList, startIndex, endIndex, comment);
    }

    public static void d(String tag, ArrayList<?> arrayList, int startIndex, int endIndex, String comment) {
        String className = getClassName(Thread.currentThread().getStackTrace()[3].getClassName());
        String methodName = Thread.currentThread().getStackTrace()[3].getMethodName();
        int lineNumber = Thread.currentThread().getStackTrace()[3].getLineNumber();
        seperate(LogSeparator.DEBUG, className, methodName, lineNumber, tag, arrayList, startIndex, endIndex, comment);
    }

    /**
     * Log Info
     */

    public static void i() {
        String className = getClassName(Thread.currentThread().getStackTrace()[3].getClassName());
        String methodName = Thread.currentThread().getStackTrace()[3].getMethodName();
        int lineNumber = Thread.currentThread().getStackTrace()[3].getLineNumber();
        seperate(LogSeparator.INFO, className, methodName, lineNumber);
    }

    public static void i(String comment) {
        String className = getClassName(Thread.currentThread().getStackTrace()[3].getClassName());
        String methodName = Thread.currentThread().getStackTrace()[3].getMethodName();
        int lineNumber = Thread.currentThread().getStackTrace()[3].getLineNumber();
        seperate(LogSeparator.INFO, className, methodName, lineNumber, comment);
    }

    public static void i(String tag, String comment) {
        String className = getClassName(Thread.currentThread().getStackTrace()[3].getClassName());
        String methodName = Thread.currentThread().getStackTrace()[3].getMethodName();
        int lineNumber = Thread.currentThread().getStackTrace()[3].getLineNumber();
        seperate(LogSeparator.INFO, className, methodName, lineNumber, tag, comment);
    }

    public static void i(Object object) {
        String className = getClassName(Thread.currentThread().getStackTrace()[3].getClassName());
        String methodName = Thread.currentThread().getStackTrace()[3].getMethodName();
        int lineNumber = Thread.currentThread().getStackTrace()[3].getLineNumber();
        seperate(LogSeparator.INFO, className, methodName, lineNumber, object);
    }

    public static void i(String tag, Object object) {
        String className = getClassName(Thread.currentThread().getStackTrace()[3].getClassName());
        String methodName = Thread.currentThread().getStackTrace()[3].getMethodName();
        int lineNumber = Thread.currentThread().getStackTrace()[3].getLineNumber();
        seperate(LogSeparator.INFO, className, methodName, lineNumber, tag, object);
    }

    public static void i(Object object, String comment) {
        String className = getClassName(Thread.currentThread().getStackTrace()[3].getClassName());
        String methodName = Thread.currentThread().getStackTrace()[3].getMethodName();
        int lineNumber = Thread.currentThread().getStackTrace()[3].getLineNumber();
        seperate(LogSeparator.INFO, className, methodName, lineNumber, object, comment);
    }

    public static void i(String tag, Object object, String comment) {
        String className = getClassName(Thread.currentThread().getStackTrace()[3].getClassName());
        String methodName = Thread.currentThread().getStackTrace()[3].getMethodName();
        int lineNumber = Thread.currentThread().getStackTrace()[3].getLineNumber();
        seperate(LogSeparator.INFO, className, methodName, lineNumber, tag, object, comment);
    }

    public static void i(ArrayList<?> arrayList) {
        String className = getClassName(Thread.currentThread().getStackTrace()[3].getClassName());
        String methodName = Thread.currentThread().getStackTrace()[3].getMethodName();
        int lineNumber = Thread.currentThread().getStackTrace()[3].getLineNumber();
        seperate(LogSeparator.INFO, className, methodName, lineNumber, arrayList);
    }

    public static void i(String tag, ArrayList<?> arrayList) {
        String className = getClassName(Thread.currentThread().getStackTrace()[3].getClassName());
        String methodName = Thread.currentThread().getStackTrace()[3].getMethodName();
        int lineNumber = Thread.currentThread().getStackTrace()[3].getLineNumber();
        seperate(LogSeparator.INFO, className, methodName, lineNumber, tag, arrayList);
    }

    public static void i(ArrayList<?> arrayList, String comment) {
        String className = getClassName(Thread.currentThread().getStackTrace()[3].getClassName());
        String methodName = Thread.currentThread().getStackTrace()[3].getMethodName();
        int lineNumber = Thread.currentThread().getStackTrace()[3].getLineNumber();
        seperate(LogSeparator.INFO, className, methodName, lineNumber, arrayList, comment);
    }

    public static void i(String tag, ArrayList<?> arrayList, String comment) {
        String className = getClassName(Thread.currentThread().getStackTrace()[3].getClassName());
        String methodName = Thread.currentThread().getStackTrace()[3].getMethodName();
        int lineNumber = Thread.currentThread().getStackTrace()[3].getLineNumber();
        seperate(LogSeparator.INFO, className, methodName, lineNumber, tag, arrayList, comment);
    }

    public static void i(ArrayList<?> arrayList, int index) {
        String className = getClassName(Thread.currentThread().getStackTrace()[3].getClassName());
        String methodName = Thread.currentThread().getStackTrace()[3].getMethodName();
        int lineNumber = Thread.currentThread().getStackTrace()[3].getLineNumber();
        seperate(LogSeparator.INFO, className, methodName, lineNumber, arrayList, index);
    }

    public static void i(String tag, ArrayList<?> arrayList, int index) {
        String className = getClassName(Thread.currentThread().getStackTrace()[3].getClassName());
        String methodName = Thread.currentThread().getStackTrace()[3].getMethodName();
        int lineNumber = Thread.currentThread().getStackTrace()[3].getLineNumber();
        seperate(LogSeparator.INFO, className, methodName, lineNumber, tag, arrayList, index);
    }

    public static void i(ArrayList<?> arrayList, int index, String comment) {
        String className = getClassName(Thread.currentThread().getStackTrace()[3].getClassName());
        String methodName = Thread.currentThread().getStackTrace()[3].getMethodName();
        int lineNumber = Thread.currentThread().getStackTrace()[3].getLineNumber();
        seperate(LogSeparator.INFO, className, methodName, lineNumber, arrayList, index, comment);
    }

    public static void i(String tag, ArrayList<?> arrayList, int index, String comment) {
        String className = getClassName(Thread.currentThread().getStackTrace()[3].getClassName());
        String methodName = Thread.currentThread().getStackTrace()[3].getMethodName();
        int lineNumber = Thread.currentThread().getStackTrace()[3].getLineNumber();
        seperate(LogSeparator.INFO, className, methodName, lineNumber, tag, arrayList, index, comment);
    }

    public static void i(ArrayList<?> arrayList, int startIndex, int endIndex) {
        String className = getClassName(Thread.currentThread().getStackTrace()[3].getClassName());
        String methodName = Thread.currentThread().getStackTrace()[3].getMethodName();
        int lineNumber = Thread.currentThread().getStackTrace()[3].getLineNumber();
        seperate(LogSeparator.INFO, className, methodName, lineNumber, arrayList, startIndex, endIndex);
    }

    public static void i(String tag, ArrayList<?> arrayList, int startIndex, int endIndex) {
        String className = getClassName(Thread.currentThread().getStackTrace()[3].getClassName());
        String methodName = Thread.currentThread().getStackTrace()[3].getMethodName();
        int lineNumber = Thread.currentThread().getStackTrace()[3].getLineNumber();
        seperate(LogSeparator.INFO, className, methodName, lineNumber, tag, arrayList, startIndex, endIndex);
    }

    public static void i(ArrayList<?> arrayList, int startIndex, int endIndex, String comment) {
        String className = getClassName(Thread.currentThread().getStackTrace()[3].getClassName());
        String methodName = Thread.currentThread().getStackTrace()[3].getMethodName();
        int lineNumber = Thread.currentThread().getStackTrace()[3].getLineNumber();
        seperate(LogSeparator.INFO, className, methodName, lineNumber, arrayList, startIndex, endIndex, comment);
    }

    public static void i(String tag, ArrayList<?> arrayList, int startIndex, int endIndex, String comment) {
        String className = getClassName(Thread.currentThread().getStackTrace()[3].getClassName());
        String methodName = Thread.currentThread().getStackTrace()[3].getMethodName();
        int lineNumber = Thread.currentThread().getStackTrace()[3].getLineNumber();
        seperate(LogSeparator.INFO, className, methodName, lineNumber, tag, arrayList, startIndex, endIndex, comment);
    }

    /**
     * Log Warn
     */

    public static void w() {
        String className = getClassName(Thread.currentThread().getStackTrace()[3].getClassName());
        String methodName = Thread.currentThread().getStackTrace()[3].getMethodName();
        int lineNumber = Thread.currentThread().getStackTrace()[3].getLineNumber();
        seperate(LogSeparator.WARN, className, methodName, lineNumber);
    }

    public static void w(String comment) {
        String className = getClassName(Thread.currentThread().getStackTrace()[3].getClassName());
        String methodName = Thread.currentThread().getStackTrace()[3].getMethodName();
        int lineNumber = Thread.currentThread().getStackTrace()[3].getLineNumber();
        seperate(LogSeparator.WARN, className, methodName, lineNumber, comment);
    }

    public static void w(String tag, String comment) {
        String className = getClassName(Thread.currentThread().getStackTrace()[3].getClassName());
        String methodName = Thread.currentThread().getStackTrace()[3].getMethodName();
        int lineNumber = Thread.currentThread().getStackTrace()[3].getLineNumber();
        seperate(LogSeparator.WARN, className, methodName, lineNumber, tag, comment);
    }

    public static void w(Object object) {
        String className = getClassName(Thread.currentThread().getStackTrace()[3].getClassName());
        String methodName = Thread.currentThread().getStackTrace()[3].getMethodName();
        int lineNumber = Thread.currentThread().getStackTrace()[3].getLineNumber();
        seperate(LogSeparator.WARN, className, methodName, lineNumber, object);
    }

    public static void w(String tag, Object object) {
        String className = getClassName(Thread.currentThread().getStackTrace()[3].getClassName());
        String methodName = Thread.currentThread().getStackTrace()[3].getMethodName();
        int lineNumber = Thread.currentThread().getStackTrace()[3].getLineNumber();
        seperate(LogSeparator.WARN, className, methodName, lineNumber, tag, object);
    }

    public static void w(Object object, String comment) {
        String className = getClassName(Thread.currentThread().getStackTrace()[3].getClassName());
        String methodName = Thread.currentThread().getStackTrace()[3].getMethodName();
        int lineNumber = Thread.currentThread().getStackTrace()[3].getLineNumber();
        seperate(LogSeparator.WARN, className, methodName, lineNumber, object, comment);
    }

    public static void w(String tag, Object object, String comment) {
        String className = getClassName(Thread.currentThread().getStackTrace()[3].getClassName());
        String methodName = Thread.currentThread().getStackTrace()[3].getMethodName();
        int lineNumber = Thread.currentThread().getStackTrace()[3].getLineNumber();
        seperate(LogSeparator.WARN, className, methodName, lineNumber, tag, object, comment);
    }

    public static void w(ArrayList<?> arrayList) {
        String className = getClassName(Thread.currentThread().getStackTrace()[3].getClassName());
        String methodName = Thread.currentThread().getStackTrace()[3].getMethodName();
        int lineNumber = Thread.currentThread().getStackTrace()[3].getLineNumber();
        seperate(LogSeparator.WARN, className, methodName, lineNumber, arrayList);
    }

    public static void w(String tag, ArrayList<?> arrayList) {
        String className = getClassName(Thread.currentThread().getStackTrace()[3].getClassName());
        String methodName = Thread.currentThread().getStackTrace()[3].getMethodName();
        int lineNumber = Thread.currentThread().getStackTrace()[3].getLineNumber();
        seperate(LogSeparator.WARN, className, methodName, lineNumber, tag, arrayList);
    }

    public static void w(ArrayList<?> arrayList, String comment) {
        String className = getClassName(Thread.currentThread().getStackTrace()[3].getClassName());
        String methodName = Thread.currentThread().getStackTrace()[3].getMethodName();
        int lineNumber = Thread.currentThread().getStackTrace()[3].getLineNumber();
        seperate(LogSeparator.WARN, className, methodName, lineNumber, arrayList, comment);
    }

    public static void w(String tag, ArrayList<?> arrayList, String comment) {
        String className = getClassName(Thread.currentThread().getStackTrace()[3].getClassName());
        String methodName = Thread.currentThread().getStackTrace()[3].getMethodName();
        int lineNumber = Thread.currentThread().getStackTrace()[3].getLineNumber();
        seperate(LogSeparator.WARN, className, methodName, lineNumber, tag, arrayList, comment);
    }

    public static void w(ArrayList<?> arrayList, int index) {
        String className = getClassName(Thread.currentThread().getStackTrace()[3].getClassName());
        String methodName = Thread.currentThread().getStackTrace()[3].getMethodName();
        int lineNumber = Thread.currentThread().getStackTrace()[3].getLineNumber();
        seperate(LogSeparator.WARN, className, methodName, lineNumber, arrayList, index);
    }

    public static void w(String tag, ArrayList<?> arrayList, int index) {
        String className = getClassName(Thread.currentThread().getStackTrace()[3].getClassName());
        String methodName = Thread.currentThread().getStackTrace()[3].getMethodName();
        int lineNumber = Thread.currentThread().getStackTrace()[3].getLineNumber();
        seperate(LogSeparator.WARN, className, methodName, lineNumber, tag, arrayList, index);
    }

    public static void w(ArrayList<?> arrayList, int index, String comment) {
        String className = getClassName(Thread.currentThread().getStackTrace()[3].getClassName());
        String methodName = Thread.currentThread().getStackTrace()[3].getMethodName();
        int lineNumber = Thread.currentThread().getStackTrace()[3].getLineNumber();
        seperate(LogSeparator.WARN, className, methodName, lineNumber, arrayList, index, comment);
    }

    public static void w(String tag, ArrayList<?> arrayList, int index, String comment) {
        String className = getClassName(Thread.currentThread().getStackTrace()[3].getClassName());
        String methodName = Thread.currentThread().getStackTrace()[3].getMethodName();
        int lineNumber = Thread.currentThread().getStackTrace()[3].getLineNumber();
        seperate(LogSeparator.WARN, className, methodName, lineNumber, tag, arrayList, index, comment);
    }

    public static void w(ArrayList<?> arrayList, int startIndex, int endIndex) {
        String className = getClassName(Thread.currentThread().getStackTrace()[3].getClassName());
        String methodName = Thread.currentThread().getStackTrace()[3].getMethodName();
        int lineNumber = Thread.currentThread().getStackTrace()[3].getLineNumber();
        seperate(LogSeparator.WARN, className, methodName, lineNumber, arrayList, startIndex, endIndex);
    }

    public static void w(String tag, ArrayList<?> arrayList, int startIndex, int endIndex) {
        String className = getClassName(Thread.currentThread().getStackTrace()[3].getClassName());
        String methodName = Thread.currentThread().getStackTrace()[3].getMethodName();
        int lineNumber = Thread.currentThread().getStackTrace()[3].getLineNumber();
        seperate(LogSeparator.WARN, className, methodName, lineNumber, tag, arrayList, startIndex, endIndex);
    }

    public static void w(ArrayList<?> arrayList, int startIndex, int endIndex, String comment) {
        String className = getClassName(Thread.currentThread().getStackTrace()[3].getClassName());
        String methodName = Thread.currentThread().getStackTrace()[3].getMethodName();
        int lineNumber = Thread.currentThread().getStackTrace()[3].getLineNumber();
        seperate(LogSeparator.WARN, className, methodName, lineNumber, arrayList, startIndex, endIndex, comment);
    }

    public static void w(String tag, ArrayList<?> arrayList, int startIndex, int endIndex, String comment) {
        String className = getClassName(Thread.currentThread().getStackTrace()[3].getClassName());
        String methodName = Thread.currentThread().getStackTrace()[3].getMethodName();
        int lineNumber = Thread.currentThread().getStackTrace()[3].getLineNumber();
        seperate(LogSeparator.WARN, className, methodName, lineNumber, tag, arrayList, startIndex, endIndex, comment);
    }

    /**
     * Log Error
     */

    public static void e() {
        String className = getClassName(Thread.currentThread().getStackTrace()[3].getClassName());
        String methodName = Thread.currentThread().getStackTrace()[3].getMethodName();
        int lineNumber = Thread.currentThread().getStackTrace()[3].getLineNumber();
        seperate(LogSeparator.ERROR, className, methodName, lineNumber);
    }

    public static void e(String comment) {
        String className = getClassName(Thread.currentThread().getStackTrace()[3].getClassName());
        String methodName = Thread.currentThread().getStackTrace()[3].getMethodName();
        int lineNumber = Thread.currentThread().getStackTrace()[3].getLineNumber();
        seperate(LogSeparator.ERROR, className, methodName, lineNumber, comment);
    }

    public static void e(String tag, String comment) {
        String className = getClassName(Thread.currentThread().getStackTrace()[3].getClassName());
        String methodName = Thread.currentThread().getStackTrace()[3].getMethodName();
        int lineNumber = Thread.currentThread().getStackTrace()[3].getLineNumber();
        seperate(LogSeparator.ERROR, className, methodName, lineNumber, tag, comment);
    }

    public static void e(Object object) {
        String className = getClassName(Thread.currentThread().getStackTrace()[3].getClassName());
        String methodName = Thread.currentThread().getStackTrace()[3].getMethodName();
        int lineNumber = Thread.currentThread().getStackTrace()[3].getLineNumber();
        seperate(LogSeparator.ERROR, className, methodName, lineNumber, object);
    }

    public static void e(String tag, Object object) {
        String className = getClassName(Thread.currentThread().getStackTrace()[3].getClassName());
        String methodName = Thread.currentThread().getStackTrace()[3].getMethodName();
        int lineNumber = Thread.currentThread().getStackTrace()[3].getLineNumber();
        seperate(LogSeparator.ERROR, className, methodName, lineNumber, tag, object);
    }

    public static void e(Object object, String comment) {
        String className = getClassName(Thread.currentThread().getStackTrace()[3].getClassName());
        String methodName = Thread.currentThread().getStackTrace()[3].getMethodName();
        int lineNumber = Thread.currentThread().getStackTrace()[3].getLineNumber();
        seperate(LogSeparator.ERROR, className, methodName, lineNumber, object, comment);
    }

    public static void e(String tag, Object object, String comment) {
        String className = getClassName(Thread.currentThread().getStackTrace()[3].getClassName());
        String methodName = Thread.currentThread().getStackTrace()[3].getMethodName();
        int lineNumber = Thread.currentThread().getStackTrace()[3].getLineNumber();
        seperate(LogSeparator.ERROR, className, methodName, lineNumber, tag, object, comment);
    }

    public static void e(ArrayList<?> arrayList) {
        String className = getClassName(Thread.currentThread().getStackTrace()[3].getClassName());
        String methodName = Thread.currentThread().getStackTrace()[3].getMethodName();
        int lineNumber = Thread.currentThread().getStackTrace()[3].getLineNumber();
        seperate(LogSeparator.ERROR, className, methodName, lineNumber, arrayList);
    }

    public static void e(String tag, ArrayList<?> arrayList) {
        String className = getClassName(Thread.currentThread().getStackTrace()[3].getClassName());
        String methodName = Thread.currentThread().getStackTrace()[3].getMethodName();
        int lineNumber = Thread.currentThread().getStackTrace()[3].getLineNumber();
        seperate(LogSeparator.ERROR, className, methodName, lineNumber, tag, arrayList);
    }

    public static void e(ArrayList<?> arrayList, String comment) {
        String className = getClassName(Thread.currentThread().getStackTrace()[3].getClassName());
        String methodName = Thread.currentThread().getStackTrace()[3].getMethodName();
        int lineNumber = Thread.currentThread().getStackTrace()[3].getLineNumber();
        seperate(LogSeparator.ERROR, className, methodName, lineNumber, arrayList, comment);
    }

    public static void e(String tag, ArrayList<?> arrayList, String comment) {
        String className = getClassName(Thread.currentThread().getStackTrace()[3].getClassName());
        String methodName = Thread.currentThread().getStackTrace()[3].getMethodName();
        int lineNumber = Thread.currentThread().getStackTrace()[3].getLineNumber();
        seperate(LogSeparator.ERROR, className, methodName, lineNumber, tag, arrayList, comment);
    }

    public static void e(ArrayList<?> arrayList, int index) {
        String className = getClassName(Thread.currentThread().getStackTrace()[3].getClassName());
        String methodName = Thread.currentThread().getStackTrace()[3].getMethodName();
        int lineNumber = Thread.currentThread().getStackTrace()[3].getLineNumber();
        seperate(LogSeparator.ERROR, className, methodName, lineNumber, arrayList, index);
    }

    public static void e(String tag, ArrayList<?> arrayList, int index) {
        String className = getClassName(Thread.currentThread().getStackTrace()[3].getClassName());
        String methodName = Thread.currentThread().getStackTrace()[3].getMethodName();
        int lineNumber = Thread.currentThread().getStackTrace()[3].getLineNumber();
        seperate(LogSeparator.ERROR, className, methodName, lineNumber, tag, arrayList, index);
    }

    public static void e(ArrayList<?> arrayList, int index, String comment) {
        String className = getClassName(Thread.currentThread().getStackTrace()[3].getClassName());
        String methodName = Thread.currentThread().getStackTrace()[3].getMethodName();
        int lineNumber = Thread.currentThread().getStackTrace()[3].getLineNumber();
        seperate(LogSeparator.ERROR, className, methodName, lineNumber, arrayList, index, comment);
    }

    public static void e(String tag, ArrayList<?> arrayList, int index, String comment) {
        String className = getClassName(Thread.currentThread().getStackTrace()[3].getClassName());
        String methodName = Thread.currentThread().getStackTrace()[3].getMethodName();
        int lineNumber = Thread.currentThread().getStackTrace()[3].getLineNumber();
        seperate(LogSeparator.ERROR, className, methodName, lineNumber, tag, arrayList, index, comment);
    }

    public static void e(ArrayList<?> arrayList, int startIndex, int endIndex) {
        String className = getClassName(Thread.currentThread().getStackTrace()[3].getClassName());
        String methodName = Thread.currentThread().getStackTrace()[3].getMethodName();
        int lineNumber = Thread.currentThread().getStackTrace()[3].getLineNumber();
        seperate(LogSeparator.ERROR, className, methodName, lineNumber, arrayList, startIndex, endIndex);
    }

    public static void e(String tag, ArrayList<?> arrayList, int startIndex, int endIndex) {
        String className = getClassName(Thread.currentThread().getStackTrace()[3].getClassName());
        String methodName = Thread.currentThread().getStackTrace()[3].getMethodName();
        int lineNumber = Thread.currentThread().getStackTrace()[3].getLineNumber();
        seperate(LogSeparator.ERROR, className, methodName, lineNumber, tag, arrayList, startIndex, endIndex);
    }

    public static void e(ArrayList<?> arrayList, int startIndex, int endIndex, String comment) {
        String className = getClassName(Thread.currentThread().getStackTrace()[3].getClassName());
        String methodName = Thread.currentThread().getStackTrace()[3].getMethodName();
        int lineNumber = Thread.currentThread().getStackTrace()[3].getLineNumber();
        seperate(LogSeparator.ERROR, className, methodName, lineNumber, arrayList, startIndex, endIndex, comment);
    }

    public static void e(String tag, ArrayList<?> arrayList, int startIndex, int endIndex, String comment) {
        String className = getClassName(Thread.currentThread().getStackTrace()[3].getClassName());
        String methodName = Thread.currentThread().getStackTrace()[3].getMethodName();
        int lineNumber = Thread.currentThread().getStackTrace()[3].getLineNumber();
        seperate(LogSeparator.ERROR, className, methodName, lineNumber, tag, arrayList, startIndex, endIndex, comment);
    }

}
