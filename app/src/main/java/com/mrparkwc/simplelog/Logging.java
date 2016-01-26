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

import java.util.ArrayList;

/**
 * Developed by Park, Woocheol
 * Email: admin@mrparkwc.com
 * GitHub: https://github.com/ParkWoocheol
 */
public class Logging {

    /**
     * Log Debug
     */

    /**
     * Print Form :
     * Class Name : Method Name, Line
     */
    public static void d() {
        Log.d(getClassName(Thread.currentThread().getStackTrace()[3].getClassName()), "METHOD: " + Thread.currentThread().getStackTrace()[3].getMethodName()
                + ", LINE: " + Thread.currentThread().getStackTrace()[3].getLineNumber());
    }

    /**
     * Print Form :
     * Class Name : Method Name, Line, Comment
     *
     * @param comment
     */
    public static void d(String comment) {

        Log.d(getClassName(Thread.currentThread().getStackTrace()[3].getClassName()), "METHOD: " + Thread.currentThread().getStackTrace()[3].getMethodName()
                + ", LINE: " + Thread.currentThread().getStackTrace()[3].getLineNumber() + ", COMMENT: " + comment);
    }

    /**
     * Print Form :
     * Tag : Class Name , Method Name, Line, Comment
     *
     * @param tag
     * @param comment
     */
    public static void d(String tag, String comment) {

        Log.d(tag, "CLASS: " + getClassName(Thread.currentThread().getStackTrace()[3].getClassName()) +
                ", METHOD: " + Thread.currentThread().getStackTrace()[3].getMethodName()
                + ", LINE: " + Thread.currentThread().getStackTrace()[3].getLineNumber() + ", COMMENT: " + comment);
    }

    /**
     * Print Form :
     * Class Name : [Object Name], Variable Name, Value
     *
     * @param object
     */
    public static void d(Object object) {
        String className = getClassName(Thread.currentThread().getStackTrace()[3].getClassName());
        Log.d(className, "METHOD: " + Thread.currentThread().getStackTrace()[3].getMethodName()
                + ", LINE: " + Thread.currentThread().getStackTrace()[3].getLineNumber());
        Log.d(className, "<<------------------------- " + object.getClass().getSimpleName() + " ------------------------->>");
        Print.print(LogSeparate.DEBUG, className, object);
    }

    /**
     * Print Form :
     * Tag : [Object Name], Variable Name, Value
     *
     * @param tag
     * @param object
     */
    public static void d(String tag, Object object) {
        Log.d(tag, "METHOD: " + Thread.currentThread().getStackTrace()[3].getMethodName()
                + ", LINE: " + Thread.currentThread().getStackTrace()[3].getLineNumber());
        Log.d(tag, "<<------------------------- " + object.getClass().getSimpleName() + " ------------------------->>");
        Print.print(LogSeparate.DEBUG, tag, object);
    }

    /**
     * Print Form :
     * Class Name
     * Comment
     * ClassName : [Object Name], Variable Name, Value
     *
     * @param object
     * @param comment
     */
    public static void d(Object object, String comment) {
        String className = getClassName(Thread.currentThread().getStackTrace()[3].getClassName());
        Log.d(className, "METHOD: " + Thread.currentThread().getStackTrace()[3].getMethodName()
                + ", LINE: " + Thread.currentThread().getStackTrace()[3].getLineNumber());
        Log.d(className, "<<------------------------- " + object.getClass().getSimpleName() + " ------------------------->>");
        Log.d(className, "COMMENT: " + comment);
        Print.print(LogSeparate.DEBUG, className, object);
    }

    /**
     * Print Form :
     * Class Name
     * Comment
     * Tag : [Object Name], Variable Name, Value
     *
     * @param tag
     * @param object
     * @param comment
     */
    public static void d(String tag, Object object, String comment) {
        Log.d(tag, "METHOD: " + Thread.currentThread().getStackTrace()[3].getMethodName()
                + ", LINE: " + Thread.currentThread().getStackTrace()[3].getLineNumber());
        Log.d(tag, "<<------------------------- " + object.getClass().getSimpleName() + " ------------------------->>");
        Log.d(tag, "COMMENT: " + comment);
        Print.print(LogSeparate.DEBUG, tag, object);
    }

    /**
     * Print Form :
     * Class Name : [Object Name] [ArrayList Index], Variable Name, Value
     *
     * @param arrayList
     */
    public static void d(ArrayList<?> arrayList) {
        String className = getClassName(Thread.currentThread().getStackTrace()[3].getClassName());
        Log.d(className, "METHOD: " + Thread.currentThread().getStackTrace()[3].getMethodName()
                + ", LINE: " + Thread.currentThread().getStackTrace()[3].getLineNumber());
        Log.d(className, "<<------------------------- " + arrayList.get(0).getClass().getSimpleName() + " ------------------------->> Size: " + arrayList.size());
        Print.print(LogSeparate.DEBUG, className, arrayList);
    }

    /**
     * Print Form :
     * Tag : [Object Name] [ArrayList Index], Variable Name, Value
     *
     * @param tag
     * @param arrayList
     */
    public static void d(String tag, ArrayList<?> arrayList) {
        Log.d(tag, "METHOD: " + Thread.currentThread().getStackTrace()[3].getMethodName()
                + ", LINE: " + Thread.currentThread().getStackTrace()[3].getLineNumber());
        Log.d(tag, "<<------------------------- " + arrayList.get(0).getClass().getSimpleName() + " ------------------------->> Size: " + arrayList.size());
        Print.print(LogSeparate.DEBUG, tag, arrayList);
    }

    /**
     * Print Form :
     * Class Name
     * Comment
     * Class Name : [Object Name] [ArrayList Index], Variable Name, Value
     *
     * @param arrayList
     * @param comment
     */
    public static void d(ArrayList<?> arrayList, String comment) {
        String className = getClassName(Thread.currentThread().getStackTrace()[3].getClassName());
        Log.d(className, "METHOD: " + Thread.currentThread().getStackTrace()[3].getMethodName()
                + ", LINE: " + Thread.currentThread().getStackTrace()[3].getLineNumber());
        Log.d(className, "<<------------------------- " + arrayList.get(0).getClass().getSimpleName() + " ------------------------->> Size: " + arrayList.size());
        Log.d(className, "COMMENT: " + comment);
        Print.print(LogSeparate.DEBUG, className, arrayList);
    }

    /**
     * Print Form :
     * Class Name
     * Comment
     * Tag : [Object Name] [ArrayList Index], Variable Name, Value
     *
     * @param tag
     * @param arrayList
     * @param comment
     */
    public static void d(String tag, ArrayList<?> arrayList, String comment) {
        Log.d(tag, "METHOD: " + Thread.currentThread().getStackTrace()[3].getMethodName()
                + ", LINE: " + Thread.currentThread().getStackTrace()[3].getLineNumber());
        Log.d(tag, "<<------------------------- " + arrayList.get(0).getClass().getSimpleName() + " ------------------------->> Size: " + arrayList.size());
        Log.d(tag, "COMMENT: " + comment);
        Print.print(LogSeparate.DEBUG, tag, arrayList);
    }

    /**
     * Print Form :
     * Class Name
     * Class Name : [Object Name] [ArrayList Index], Variable Name, Value
     *
     * @param arrayList
     * @param index
     */
    public static void d(ArrayList<?> arrayList, int index) {
        String className = getClassName(Thread.currentThread().getStackTrace()[3].getClassName());
        Log.d(className, "METHOD: " + Thread.currentThread().getStackTrace()[3].getMethodName()
                + ", LINE: " + Thread.currentThread().getStackTrace()[3].getLineNumber());
        Log.d(className, "<<------------------------- " + arrayList.get(index).getClass().getSimpleName() + " ------------------------->> Index: " + index);
        Print.print(LogSeparate.DEBUG, className, arrayList, index);
    }

    /**
     * Print Form :
     * Class Name, Index
     * Tag : [Object Name] [ArrayList Index], Variable Name, Value
     *
     * @param tag
     * @param arrayList
     * @param index
     */
    public static void d(String tag, ArrayList<?> arrayList, int index) {
        Log.d(tag, "METHOD: " + Thread.currentThread().getStackTrace()[3].getMethodName()
                + ", LINE: " + Thread.currentThread().getStackTrace()[3].getLineNumber());
        Log.d(tag, "<<------------------------- " + arrayList.get(index).getClass().getSimpleName() + " ------------------------->> Index: " + index);
        Print.print(LogSeparate.DEBUG, tag, arrayList, index);
    }

    /**
     * Print Form :
     * Class Name, Index
     * Comment
     * Class Name : [Object Name] [ArrayList Index], Variable Name, Value
     *
     * @param arrayList
     * @param index
     * @param comment
     */
    public static void d(ArrayList<?> arrayList, int index, String comment) {
        String className = getClassName(Thread.currentThread().getStackTrace()[3].getClassName());
        Log.d(className, "METHOD: " + Thread.currentThread().getStackTrace()[3].getMethodName()
                + ", LINE: " + Thread.currentThread().getStackTrace()[3].getLineNumber());
        Log.d(className, "<<------------------------- " + arrayList.get(index).getClass().getSimpleName() + " ------------------------->> Index: " + index);
        Log.d(className, "COMMENT: " + comment);
        Print.print(LogSeparate.DEBUG, className, arrayList, index);
    }

    /**
     * Print Form :
     * Class Name, Index
     * Comment
     * Tag : [Object Name] [ArrayList Index], Variable Name, Value
     *
     * @param tag
     * @param arrayList
     * @param index
     * @param comment
     */
    public static void d(String tag, ArrayList<?> arrayList, int index, String comment) {
        Log.d(tag, "METHOD: " + Thread.currentThread().getStackTrace()[3].getMethodName()
                + ", LINE: " + Thread.currentThread().getStackTrace()[3].getLineNumber());
        Log.d(tag, "<<------------------------- " + arrayList.get(index).getClass().getSimpleName() + " ------------------------->> Index: " + index);
        Log.d(tag, "COMMENT: " + comment);
        Print.print(LogSeparate.DEBUG, tag, arrayList, index);
    }


    /**
     * Print Form :
     * Class Name, Start Index,End Index
     * Comment
     * Class Name : [Object Name] [ArrayList Index], Variable Name, Value
     *
     * @param arrayList
     * @param startIndex
     * @param endIndex
     */
    public static void d(ArrayList<?> arrayList, int startIndex, int endIndex, String comment) {
        String className = getClassName(Thread.currentThread().getStackTrace()[3].getClassName());
        Log.d(className, "METHOD: " + Thread.currentThread().getStackTrace()[3].getMethodName()
                + ", LINE: " + Thread.currentThread().getStackTrace()[3].getLineNumber());
        Log.d(className, "<<------------------------- " + arrayList.get(0).getClass().getSimpleName() + " ------------------------->> START INDEX: " + startIndex + ", END INDEX: " + endIndex);
        Log.d(className, "COMMENT: " + comment);
        Print.print(LogSeparate.DEBUG, className, arrayList, startIndex, endIndex);
    }

    /**
     * Print Form :
     * Class Name, Start Index,End Index
     * Comment
     * Tag : [Object Name] [ArrayList Index], Variable Name, Value
     *
     * @param tag
     * @param arrayList
     * @param startIndex
     * @param endIndex
     * @param comment
     */
    public static void d(String tag, ArrayList<?> arrayList, int startIndex, int endIndex, String comment) {
        Log.d(tag, "METHOD: " + Thread.currentThread().getStackTrace()[3].getMethodName()
                + ", LINE: " + Thread.currentThread().getStackTrace()[3].getLineNumber());
        Log.d(tag, "<<------------------------- " + arrayList.get(0).getClass().getSimpleName() + " ------------------------->> START INDEX: " + startIndex + ", END INDEX: " + endIndex);
        Log.d(tag, "COMMENT: " + comment);
        Print.print(LogSeparate.DEBUG, tag, arrayList, startIndex, endIndex);
    }


    /**
     * Log Info
     */

    /**
     * Print Form :
     * Class Name : Method Name, Line
     */
    public static void i() {
        Log.i(getClassName(Thread.currentThread().getStackTrace()[3].getClassName()), "METHOD: " + Thread.currentThread().getStackTrace()[3].getMethodName()
                + ", LINE: " + Thread.currentThread().getStackTrace()[3].getLineNumber());
    }

    /**
     * Print Form :
     * Class Name : Method Name, Line, Comment
     *
     * @param comment
     */
    public static void i(String comment) {

        Log.i(getClassName(Thread.currentThread().getStackTrace()[3].getClassName()), "METHOD: " + Thread.currentThread().getStackTrace()[3].getMethodName()
                + ", LINE: " + Thread.currentThread().getStackTrace()[3].getLineNumber() + ", COMMENT: " + comment);
    }

    /**
     * Print Form :
     * tag : Class Name , Method Name, Line, Comment
     *
     * @param tag
     * @param comment
     */
    public static void i(String tag, String comment) {

        Log.i(tag, "CLASS: " + getClassName(Thread.currentThread().getStackTrace()[3].getClassName()) +
                ", METHOD: " + Thread.currentThread().getStackTrace()[3].getMethodName()
                + ", LINE: " + Thread.currentThread().getStackTrace()[3].getLineNumber() + ", COMMENT: " + comment);
    }

    /**
     * Print Form :
     * Class Name : [Object Name], Variable Name, Value
     *
     * @param object
     */
    public static void i(Object object) {
        String className = getClassName(Thread.currentThread().getStackTrace()[3].getClassName());
        Log.i(className, "METHOD: " + Thread.currentThread().getStackTrace()[3].getMethodName()
                + ", LINE: " + Thread.currentThread().getStackTrace()[3].getLineNumber());
        Log.i(className, "<<------------------------- " + object.getClass().getSimpleName() + " ------------------------->>");
        Print.print(LogSeparate.INFO, className, object);
    }

    /**
     * Print Form :
     * Tag : [Object Name], Variable Name, Value
     *
     * @param tag
     * @param object
     */
    public static void i(String tag, Object object) {
        Log.i(tag, "METHOD: " + Thread.currentThread().getStackTrace()[3].getMethodName()
                + ", LINE: " + Thread.currentThread().getStackTrace()[3].getLineNumber());
        Log.i(tag, "<<------------------------- " + object.getClass().getSimpleName() + " ------------------------->>");
        Print.print(LogSeparate.INFO, tag, object);
    }

    /**
     * Print Form :
     * Class Name
     * Comment
     * ClassName : [Object Name], Variable Name, Value
     *
     * @param object
     * @param comment
     */
    public static void i(Object object, String comment) {
        String className = getClassName(Thread.currentThread().getStackTrace()[3].getClassName());
        Log.i(className, "METHOD: " + Thread.currentThread().getStackTrace()[3].getMethodName()
                + ", LINE: " + Thread.currentThread().getStackTrace()[3].getLineNumber());
        Log.i(className, "<<------------------------- " + object.getClass().getSimpleName() + " ------------------------->>");
        Log.i(className, "COMMENT: " + comment);
        Print.print(LogSeparate.INFO, className, object);
    }

    /**
     * Print Form :
     * Class Name
     * Comment
     * Tag : [Object Name], Variable Name, Value
     *
     * @param tag
     * @param object
     * @param comment
     */
    public static void i(String tag, Object object, String comment) {
        Log.i(tag, "METHOD: " + Thread.currentThread().getStackTrace()[3].getMethodName()
                + ", LINE: " + Thread.currentThread().getStackTrace()[3].getLineNumber());
        Log.i(tag, "<<------------------------- " + object.getClass().getSimpleName() + " ------------------------->>");
        Log.i(tag, "COMMENT: " + comment);
        Print.print(LogSeparate.INFO, tag, object);
    }

    /**
     * Print Form :
     * Class Name : [Object Name] [ArrayList Index], Variable Name, Value
     *
     * @param arrayList
     */
    public static void i(ArrayList<?> arrayList) {
        String className = getClassName(Thread.currentThread().getStackTrace()[3].getClassName());
        Log.i(className, "METHOD: " + Thread.currentThread().getStackTrace()[3].getMethodName()
                + ", LINE: " + Thread.currentThread().getStackTrace()[3].getLineNumber());
        Log.i(className, "<<------------------------- " + arrayList.get(0).getClass().getSimpleName() + " ------------------------->> Size: " + arrayList.size());
        Print.print(LogSeparate.INFO, className, arrayList);
    }

    /**
     * Print Form :
     * Tag : [Object Name] [ArrayList Index], Variable Name, Value
     *
     * @param tag
     * @param arrayList
     */
    public static void i(String tag, ArrayList<?> arrayList) {
        Log.i(tag, "METHOD: " + Thread.currentThread().getStackTrace()[3].getMethodName()
                + ", LINE: " + Thread.currentThread().getStackTrace()[3].getLineNumber());
        Log.i(tag, "<<------------------------- " + arrayList.get(0).getClass().getSimpleName() + " ------------------------->> Size: " + arrayList.size());
        Print.print(LogSeparate.INFO, tag, arrayList);
    }

    /**
     * Print Form :
     * Class Name
     * Comment
     * Class Name : [Object Name] [ArrayList Index], Variable Name, Value
     *
     * @param arrayList
     * @param comment
     */
    public static void i(ArrayList<?> arrayList, String comment) {
        String className = getClassName(Thread.currentThread().getStackTrace()[3].getClassName());
        Log.i(className, "METHOD: " + Thread.currentThread().getStackTrace()[3].getMethodName()
                + ", LINE: " + Thread.currentThread().getStackTrace()[3].getLineNumber());
        Log.i(className, "<<------------------------- " + arrayList.get(0).getClass().getSimpleName() + " ------------------------->> Size: " + arrayList.size());
        Log.i(className, "COMMENT: " + comment);
        Print.print(LogSeparate.INFO, className, arrayList);
    }

    /**
     * Print Form :
     * Class Name
     * Comment
     * Tag : [Object Name] [ArrayList Index], Variable Name, Value
     *
     * @param tag
     * @param arrayList
     * @param comment
     */
    public static void i(String tag, ArrayList<?> arrayList, String comment) {
        Log.i(tag, "METHOD: " + Thread.currentThread().getStackTrace()[3].getMethodName()
                + ", LINE: " + Thread.currentThread().getStackTrace()[3].getLineNumber());
        Log.i(tag, "<<------------------------- " + arrayList.get(0).getClass().getSimpleName() + " ------------------------->> Size: " + arrayList.size());
        Log.i(tag, "COMMENT: " + comment);
        Print.print(LogSeparate.INFO, tag, arrayList);
    }

    /**
     * Print Form :
     * Class Name
     * Class Name : [Object Name] [ArrayList Index], Variable Name, Value
     *
     * @param arrayList
     * @param index
     */
    public static void i(ArrayList<?> arrayList, int index) {
        String className = getClassName(Thread.currentThread().getStackTrace()[3].getClassName());
        Log.i(className, "METHOD: " + Thread.currentThread().getStackTrace()[3].getMethodName()
                + ", LINE: " + Thread.currentThread().getStackTrace()[3].getLineNumber());
        Log.i(className, "<<------------------------- " + arrayList.get(index).getClass().getSimpleName() + " ------------------------->> Index: " + index);
        Print.print(LogSeparate.INFO, className, arrayList, index);
    }

    /**
     * Print Form :
     * Class Name, Index
     * Tag : [Object Name] [ArrayList Index], Variable Name, Value
     *
     * @param tag
     * @param arrayList
     * @param index
     */
    public static void i(String tag, ArrayList<?> arrayList, int index) {
        Log.i(tag, "METHOD: " + Thread.currentThread().getStackTrace()[3].getMethodName()
                + ", LINE: " + Thread.currentThread().getStackTrace()[3].getLineNumber());
        Log.i(tag, "<<------------------------- " + arrayList.get(index).getClass().getSimpleName() + " ------------------------->> Index: " + index);
        Print.print(LogSeparate.INFO, tag, arrayList, index);
    }

    /**
     * Print Form :
     * Class Name, Index
     * Comment
     * Class Name : [Object Name] [ArrayList Index], Variable Name, Value
     *
     * @param arrayList
     * @param index
     * @param comment
     */
    public static void i(ArrayList<?> arrayList, int index, String comment) {
        String className = getClassName(Thread.currentThread().getStackTrace()[3].getClassName());
        Log.i(className, "METHOD: " + Thread.currentThread().getStackTrace()[3].getMethodName()
                + ", LINE: " + Thread.currentThread().getStackTrace()[3].getLineNumber());
        Log.i(className, "<<------------------------- " + arrayList.get(index).getClass().getSimpleName() + " ------------------------->> Index: " + index);
        Log.i(className, "COMMENT: " + comment);
        Print.print(LogSeparate.INFO, className, arrayList, index);
    }

    /**
     * Print Form :
     * Class Name, Index
     * Comment
     * Tag : [Object Name] [ArrayList Index], Variable Name, Value
     *
     * @param tag
     * @param arrayList
     * @param index
     * @param comment
     */
    public static void i(String tag, ArrayList<?> arrayList, int index, String comment) {
        Log.i(tag, "METHOD: " + Thread.currentThread().getStackTrace()[3].getMethodName()
                + ", LINE: " + Thread.currentThread().getStackTrace()[3].getLineNumber());
        Log.i(tag, "<<------------------------- " + arrayList.get(index).getClass().getSimpleName() + " ------------------------->> Index: " + index);
        Log.i(tag, "COMMENT: " + comment);
        Print.print(LogSeparate.INFO, tag, arrayList, index);
    }


    /**
     * Print Form :
     * Class Name, Start Index,End Index
     * Comment
     * Class Name : [Object Name] [ArrayList Index], Variable Name, Value
     *
     * @param arrayList
     * @param startIndex
     * @param endIndex
     */
    public static void i(ArrayList<?> arrayList, int startIndex, int endIndex, String comment) {
        String className = getClassName(Thread.currentThread().getStackTrace()[3].getClassName());
        Log.i(className, "METHOD: " + Thread.currentThread().getStackTrace()[3].getMethodName()
                + ", LINE: " + Thread.currentThread().getStackTrace()[3].getLineNumber());
        Log.i(className, "<<------------------------- " + arrayList.get(0).getClass().getSimpleName() + " ------------------------->> START INDEX: " + startIndex + ", END INDEX: " + endIndex);
        Log.i(className, "COMMENT: " + comment);
        Print.print(LogSeparate.INFO, className, arrayList, startIndex, endIndex);
    }

    /**
     * Print Form :
     * Class Name, Start Index,End Index
     * Comment
     * Tag : [Object Name] [ArrayList Index], Variable Name, Value
     *
     * @param tag
     * @param arrayList
     * @param startIndex
     * @param endIndex
     * @param comment
     */
    public static void i(String tag, ArrayList<?> arrayList, int startIndex, int endIndex, String comment) {
        Log.i(tag, "METHOD: " + Thread.currentThread().getStackTrace()[3].getMethodName()
                + ", LINE: " + Thread.currentThread().getStackTrace()[3].getLineNumber());
        Log.i(tag, "<<------------------------- " + arrayList.get(0).getClass().getSimpleName() + " ------------------------->> START INDEX: " + startIndex + ", END INDEX: " + endIndex);
        Log.i(tag, "COMMENT: " + comment);
        Print.print(LogSeparate.INFO, tag, arrayList, startIndex, endIndex);
    }

    /**
     * Log Warn
     */

    /**
     * Print Form :
     * Class Name : Method Name, Line
     */
    public static void w() {
        Log.w(getClassName(Thread.currentThread().getStackTrace()[3].getClassName()), "METHOD: " + Thread.currentThread().getStackTrace()[3].getMethodName()
                + ", LINE: " + Thread.currentThread().getStackTrace()[3].getLineNumber());
    }

    /**
     * Print Form :
     * Class Name : Method Name, Line, Comment
     *
     * @param comment
     */
    public static void w(String comment) {

        Log.w(getClassName(Thread.currentThread().getStackTrace()[3].getClassName()), "METHOD: " + Thread.currentThread().getStackTrace()[3].getMethodName()
                + ", LINE: " + Thread.currentThread().getStackTrace()[3].getLineNumber() + ", COMMENT: " + comment);
    }

    /**
     * Print Form :
     * tag : Class Name , Method Name, Line, Comment
     *
     * @param tag
     * @param comment
     */
    public static void w(String tag, String comment) {

        Log.w(tag, "CLASS: " + getClassName(Thread.currentThread().getStackTrace()[3].getClassName()) +
                ", METHOD: " + Thread.currentThread().getStackTrace()[3].getMethodName()
                + ", LINE: " + Thread.currentThread().getStackTrace()[3].getLineNumber() + ", COMMENT: " + comment);
    }

    /**
     * Print Form :
     * Class Name : [Object Name], Variable Name, Value
     *
     * @param object
     */
    public static void w(Object object) {
        String className = getClassName(Thread.currentThread().getStackTrace()[3].getClassName());
        Log.w(className, "METHOD: " + Thread.currentThread().getStackTrace()[3].getMethodName()
                + ", LINE: " + Thread.currentThread().getStackTrace()[3].getLineNumber());
        Log.w(className, "<<------------------------- " + object.getClass().getSimpleName() + " ------------------------->>");
        Print.print(LogSeparate.WARN, className, object);
    }

    /**
     * Print Form :
     * Tag : [Object Name], Variable Name, Value
     *
     * @param tag
     * @param object
     */
    public static void w(String tag, Object object) {
        Log.w(tag, "METHOD: " + Thread.currentThread().getStackTrace()[3].getMethodName()
                + ", LINE: " + Thread.currentThread().getStackTrace()[3].getLineNumber());
        Log.w(tag, "<<------------------------- " + object.getClass().getSimpleName() + " ------------------------->>");
        Print.print(LogSeparate.WARN, tag, object);
    }

    /**
     * Print Form :
     * Class Name
     * Comment
     * ClassName : [Object Name], Variable Name, Value
     *
     * @param object
     * @param comment
     */
    public static void w(Object object, String comment) {
        String className = getClassName(Thread.currentThread().getStackTrace()[3].getClassName());
        Log.w(className, "METHOD: " + Thread.currentThread().getStackTrace()[3].getMethodName()
                + ", LINE: " + Thread.currentThread().getStackTrace()[3].getLineNumber());
        Log.w(className, "<<------------------------- " + object.getClass().getSimpleName() + " ------------------------->>");
        Log.w(className, "COMMENT: " + comment);
        Print.print(LogSeparate.WARN, className, object);
    }

    /**
     * Print Form :
     * Class Name
     * Comment
     * Tag : [Object Name], Variable Name, Value
     *
     * @param tag
     * @param object
     * @param comment
     */
    public static void w(String tag, Object object, String comment) {
        Log.w(tag, "METHOD: " + Thread.currentThread().getStackTrace()[3].getMethodName()
                + ", LINE: " + Thread.currentThread().getStackTrace()[3].getLineNumber());
        Log.w(tag, "<<------------------------- " + object.getClass().getSimpleName() + " ------------------------->>");
        Log.w(tag, "COMMENT: " + comment);
        Print.print(LogSeparate.WARN, tag, object);
    }

    /**
     * Print Form :
     * Class Name : [Object Name] [ArrayList Index], Variable Name, Value
     *
     * @param arrayList
     */
    public static void w(ArrayList<?> arrayList) {
        String className = getClassName(Thread.currentThread().getStackTrace()[3].getClassName());
        Log.w(className, "METHOD: " + Thread.currentThread().getStackTrace()[3].getMethodName()
                + ", LINE: " + Thread.currentThread().getStackTrace()[3].getLineNumber());
        Log.w(className, "<<------------------------- " + arrayList.get(0).getClass().getSimpleName() + " ------------------------->> Size: " + arrayList.size());
        Print.print(LogSeparate.WARN, className, arrayList);
    }

    /**
     * Print Form :
     * Tag : [Object Name] [ArrayList Index], Variable Name, Value
     *
     * @param tag
     * @param arrayList
     */
    public static void w(String tag, ArrayList<?> arrayList) {
        Log.w(tag, "METHOD: " + Thread.currentThread().getStackTrace()[3].getMethodName()
                + ", LINE: " + Thread.currentThread().getStackTrace()[3].getLineNumber());
        Log.w(tag, "<<------------------------- " + arrayList.get(0).getClass().getSimpleName() + " ------------------------->> Size: " + arrayList.size());
        Print.print(LogSeparate.WARN, tag, arrayList);
    }

    /**
     * Print Form :
     * Class Name
     * Comment
     * Class Name : [Object Name] [ArrayList Index], Variable Name, Value
     *
     * @param arrayList
     * @param comment
     */
    public static void w(ArrayList<?> arrayList, String comment) {
        String className = getClassName(Thread.currentThread().getStackTrace()[3].getClassName());
        Log.w(className, "METHOD: " + Thread.currentThread().getStackTrace()[3].getMethodName()
                + ", LINE: " + Thread.currentThread().getStackTrace()[3].getLineNumber());
        Log.w(className, "<<------------------------- " + arrayList.get(0).getClass().getSimpleName() + " ------------------------->> Size: " + arrayList.size());
        Log.w(className, "COMMENT: " + comment);
        Print.print(LogSeparate.WARN, className, arrayList);
    }

    /**
     * Print Form :
     * Class Name
     * Comment
     * Tag : [Object Name] [ArrayList Index], Variable Name, Value
     *
     * @param tag
     * @param arrayList
     * @param comment
     */
    public static void w(String tag, ArrayList<?> arrayList, String comment) {
        Log.w(tag, "METHOD: " + Thread.currentThread().getStackTrace()[3].getMethodName()
                + ", LINE: " + Thread.currentThread().getStackTrace()[3].getLineNumber());
        Log.w(tag, "<<------------------------- " + arrayList.get(0).getClass().getSimpleName() + " ------------------------->> Size: " + arrayList.size());
        Log.w(tag, "COMMENT: " + comment);
        Print.print(LogSeparate.WARN, tag, arrayList);
    }

    /**
     * Print Form :
     * Class Name
     * Class Name : [Object Name] [ArrayList Index], Variable Name, Value
     *
     * @param arrayList
     * @param index
     */
    public static void w(ArrayList<?> arrayList, int index) {
        String className = getClassName(Thread.currentThread().getStackTrace()[3].getClassName());
        Log.w(className, "METHOD: " + Thread.currentThread().getStackTrace()[3].getMethodName()
                + ", LINE: " + Thread.currentThread().getStackTrace()[3].getLineNumber());
        Log.w(className, "<<------------------------- " + arrayList.get(index).getClass().getSimpleName() + " ------------------------->> Index: " + index);
        Print.print(LogSeparate.WARN, className, arrayList, index);
    }

    /**
     * Print Form :
     * Class Name, Index
     * Tag : [Object Name] [ArrayList Index], Variable Name, Value
     *
     * @param tag
     * @param arrayList
     * @param index
     */
    public static void w(String tag, ArrayList<?> arrayList, int index) {
        Log.w(tag, "METHOD: " + Thread.currentThread().getStackTrace()[3].getMethodName()
                + ", LINE: " + Thread.currentThread().getStackTrace()[3].getLineNumber());
        Log.w(tag, "<<------------------------- " + arrayList.get(index).getClass().getSimpleName() + " ------------------------->> Index: " + index);
        Print.print(LogSeparate.WARN, tag, arrayList, index);
    }

    /**
     * Print Form :
     * Class Name, Index
     * Comment
     * Class Name : [Object Name] [ArrayList Index], Variable Name, Value
     *
     * @param arrayList
     * @param index
     * @param comment
     */
    public static void w(ArrayList<?> arrayList, int index, String comment) {
        String className = getClassName(Thread.currentThread().getStackTrace()[3].getClassName());
        Log.w(className, "METHOD: " + Thread.currentThread().getStackTrace()[3].getMethodName()
                + ", LINE: " + Thread.currentThread().getStackTrace()[3].getLineNumber());
        Log.w(className, "<<------------------------- " + arrayList.get(index).getClass().getSimpleName() + " ------------------------->> Index: " + index);
        Log.w(className, "COMMENT: " + comment);
        Print.print(LogSeparate.WARN, className, arrayList, index);
    }

    /**
     * Print Form :
     * Class Name, Index
     * Comment
     * Tag : [Object Name] [ArrayList Index], Variable Name, Value
     *
     * @param tag
     * @param arrayList
     * @param index
     * @param comment
     */
    public static void w(String tag, ArrayList<?> arrayList, int index, String comment) {
        Log.w(tag, "METHOD: " + Thread.currentThread().getStackTrace()[3].getMethodName()
                + ", LINE: " + Thread.currentThread().getStackTrace()[3].getLineNumber());
        Log.w(tag, "<<------------------------- " + arrayList.get(index).getClass().getSimpleName() + " ------------------------->> Index: " + index);
        Log.w(tag, "COMMENT: " + comment);
        Print.print(LogSeparate.WARN, tag, arrayList, index);
    }


    /**
     * Print Form :
     * Class Name, Start Index,End Index
     * Comment
     * Class Name : [Object Name] [ArrayList Index], Variable Name, Value
     *
     * @param arrayList
     * @param startIndex
     * @param endIndex
     */
    public static void w(ArrayList<?> arrayList, int startIndex, int endIndex, String comment) {
        String className = getClassName(Thread.currentThread().getStackTrace()[3].getClassName());
        Log.w(className, "METHOD: " + Thread.currentThread().getStackTrace()[3].getMethodName()
                + ", LINE: " + Thread.currentThread().getStackTrace()[3].getLineNumber());
        Log.w(className, "<<------------------------- " + arrayList.get(0).getClass().getSimpleName() + " ------------------------->> START INDEX: " + startIndex + ", END INDEX: " + endIndex);
        Log.w(className, "COMMENT: " + comment);
        Print.print(LogSeparate.WARN, className, arrayList, startIndex, endIndex);
    }

    /**
     * Print Form :
     * Class Name, Start Index,End Index
     * Comment
     * Tag : [Object Name] [ArrayList Index], Variable Name, Value
     *
     * @param tag
     * @param arrayList
     * @param startIndex
     * @param endIndex
     * @param comment
     */
    public static void w(String tag, ArrayList<?> arrayList, int startIndex, int endIndex, String comment) {
        Log.w(tag, "METHOD: " + Thread.currentThread().getStackTrace()[3].getMethodName()
                + ", LINE: " + Thread.currentThread().getStackTrace()[3].getLineNumber());
        Log.w(tag, "<<------------------------- " + arrayList.get(0).getClass().getSimpleName() + " ------------------------->> START INDEX: " + startIndex + ", END INDEX: " + endIndex);
        Log.w(tag, "COMMENT: " + comment);
        Print.print(LogSeparate.WARN, tag, arrayList, startIndex, endIndex);
    }

    /**
     * Log Error
     */

    /**
     * Print Form :
     * Class Name : Method Name, Line
     */
    public static void e() {
        Log.e(getClassName(Thread.currentThread().getStackTrace()[3].getClassName()), "METHOD: " + Thread.currentThread().getStackTrace()[3].getMethodName()
                + ", LINE: " + Thread.currentThread().getStackTrace()[3].getLineNumber());
    }

    /**
     * Print Form :
     * Class Name : Method Name, Line, Comment
     *
     * @param comment
     */
    public static void e(String comment) {

        Log.e(getClassName(Thread.currentThread().getStackTrace()[3].getClassName()), "METHOD: " + Thread.currentThread().getStackTrace()[3].getMethodName()
                + ", LINE: " + Thread.currentThread().getStackTrace()[3].getLineNumber() + ", COMMENT: " + comment);
    }

    /**
     * Print Form :
     * tag : Class Name , Method Name, Line, Comment
     *
     * @param tag
     * @param comment
     */
    public static void e(String tag, String comment) {

        Log.e(tag, "CLASS: " + getClassName(Thread.currentThread().getStackTrace()[3].getClassName()) +
                ", METHOD: " + Thread.currentThread().getStackTrace()[3].getMethodName()
                + ", LINE: " + Thread.currentThread().getStackTrace()[3].getLineNumber() + ", COMMENT: " + comment);
    }

    /**
     * Print Form :
     * Class Name : [Object Name], Variable Name, Value
     *
     * @param object
     */
    public static void e(Object object) {
        String className = getClassName(Thread.currentThread().getStackTrace()[3].getClassName());
        Log.e(className, "METHOD: " + Thread.currentThread().getStackTrace()[3].getMethodName()
                + ", LINE: " + Thread.currentThread().getStackTrace()[3].getLineNumber());
        Log.e(className, "<<------------------------- " + object.getClass().getSimpleName() + " ------------------------->>");
        Print.print(LogSeparate.ERROR, className, object);
    }

    /**
     * Print Form :
     * Tag : [Object Name], Variable Name, Value
     *
     * @param tag
     * @param object
     */
    public static void e(String tag, Object object) {
        Log.e(tag, "METHOD: " + Thread.currentThread().getStackTrace()[3].getMethodName()
                + ", LINE: " + Thread.currentThread().getStackTrace()[3].getLineNumber());
        Log.e(tag, "<<------------------------- " + object.getClass().getSimpleName() + " ------------------------->>");
        Print.print(LogSeparate.ERROR, tag, object);
    }

    /**
     * Print Form :
     * Class Name
     * Comment
     * ClassName : [Object Name], Variable Name, Value
     *
     * @param object
     * @param comment
     */
    public static void e(Object object, String comment) {
        String className = getClassName(Thread.currentThread().getStackTrace()[3].getClassName());
        Log.e(className, "METHOD: " + Thread.currentThread().getStackTrace()[3].getMethodName()
                + ", LINE: " + Thread.currentThread().getStackTrace()[3].getLineNumber());
        Log.e(className, "<<------------------------- " + object.getClass().getSimpleName() + " ------------------------->>");
        Log.e(className, "COMMENT: " + comment);
        Print.print(LogSeparate.ERROR, className, object);
    }

    /**
     * Print Form :
     * Class Name
     * Comment
     * Tag : [Object Name], Variable Name, Value
     *
     * @param tag
     * @param object
     * @param comment
     */
    public static void e(String tag, Object object, String comment) {
        Log.e(tag, "METHOD: " + Thread.currentThread().getStackTrace()[3].getMethodName()
                + ", LINE: " + Thread.currentThread().getStackTrace()[3].getLineNumber());
        Log.e(tag, "<<------------------------- " + object.getClass().getSimpleName() + " ------------------------->>");
        Log.e(tag, "COMMENT: " + comment);
        Print.print(LogSeparate.ERROR, tag, object);
    }

    /**
     * Print Form :
     * Class Name : [Object Name] [ArrayList Index], Variable Name, Value
     *
     * @param arrayList
     */
    public static void e(ArrayList<?> arrayList) {
        String className = getClassName(Thread.currentThread().getStackTrace()[3].getClassName());
        Log.e(className, "METHOD: " + Thread.currentThread().getStackTrace()[3].getMethodName()
                + ", LINE: " + Thread.currentThread().getStackTrace()[3].getLineNumber());
        Log.e(className, "<<------------------------- " + arrayList.get(0).getClass().getSimpleName() + " ------------------------->> Size: " + arrayList.size());
        Print.print(LogSeparate.ERROR, className, arrayList);
    }

    /**
     * Print Form :
     * Tag : [Object Name] [ArrayList Index], Variable Name, Value
     *
     * @param tag
     * @param arrayList
     */
    public static void e(String tag, ArrayList<?> arrayList) {
        Log.e(tag, "METHOD: " + Thread.currentThread().getStackTrace()[3].getMethodName()
                + ", LINE: " + Thread.currentThread().getStackTrace()[3].getLineNumber());
        Log.e(tag, "<<------------------------- " + arrayList.get(0).getClass().getSimpleName() + " ------------------------->> Size: " + arrayList.size());
        Print.print(LogSeparate.ERROR, tag, arrayList);
    }

    /**
     * Print Form :
     * Class Name
     * Comment
     * Class Name : [Object Name] [ArrayList Index], Variable Name, Value
     *
     * @param arrayList
     * @param comment
     */
    public static void e(ArrayList<?> arrayList, String comment) {
        String className = getClassName(Thread.currentThread().getStackTrace()[3].getClassName());
        Log.e(className, "METHOD: " + Thread.currentThread().getStackTrace()[3].getMethodName()
                + ", LINE: " + Thread.currentThread().getStackTrace()[3].getLineNumber());
        Log.e(className, "<<------------------------- " + arrayList.get(0).getClass().getSimpleName() + " ------------------------->> Size: " + arrayList.size());
        Log.e(className, "COMMENT: " + comment);
        Print.print(LogSeparate.ERROR, className, arrayList);
    }

    /**
     * Print Form :
     * Class Name
     * Comment
     * Tag : [Object Name] [ArrayList Index], Variable Name, Value
     *
     * @param tag
     * @param arrayList
     * @param comment
     */
    public static void e(String tag, ArrayList<?> arrayList, String comment) {
        Log.e(tag, "METHOD: " + Thread.currentThread().getStackTrace()[3].getMethodName()
                + ", LINE: " + Thread.currentThread().getStackTrace()[3].getLineNumber());
        Log.e(tag, "<<------------------------- " + arrayList.get(0).getClass().getSimpleName() + " ------------------------->> Size: " + arrayList.size());
        Log.e(tag, "COMMENT: " + comment);
        Print.print(LogSeparate.ERROR, tag, arrayList);
    }

    /**
     * Print Form :
     * Class Name
     * Class Name : [Object Name] [ArrayList Index], Variable Name, Value
     *
     * @param arrayList
     * @param index
     */
    public static void e(ArrayList<?> arrayList, int index) {
        String className = getClassName(Thread.currentThread().getStackTrace()[3].getClassName());
        Log.e(className, "METHOD: " + Thread.currentThread().getStackTrace()[3].getMethodName()
                + ", LINE: " + Thread.currentThread().getStackTrace()[3].getLineNumber());
        Log.e(className, "<<------------------------- " + arrayList.get(index).getClass().getSimpleName() + " ------------------------->> Index: " + index);
        Print.print(LogSeparate.ERROR, className, arrayList, index);
    }

    /**
     * Print Form :
     * Class Name, Index
     * Tag : [Object Name] [ArrayList Index], Variable Name, Value
     *
     * @param tag
     * @param arrayList
     * @param index
     */
    public static void e(String tag, ArrayList<?> arrayList, int index) {
        Log.e(tag, "METHOD: " + Thread.currentThread().getStackTrace()[3].getMethodName()
                + ", LINE: " + Thread.currentThread().getStackTrace()[3].getLineNumber());
        Log.e(tag, "<<------------------------- " + arrayList.get(index).getClass().getSimpleName() + " ------------------------->> Index: " + index);
        Print.print(LogSeparate.ERROR, tag, arrayList, index);
    }

    /**
     * Print Form :
     * Class Name, Index
     * Comment
     * Class Name : [Object Name] [ArrayList Index], Variable Name, Value
     *
     * @param arrayList
     * @param index
     * @param comment
     */
    public static void e(ArrayList<?> arrayList, int index, String comment) {
        String className = getClassName(Thread.currentThread().getStackTrace()[3].getClassName());
        Log.e(className, "METHOD: " + Thread.currentThread().getStackTrace()[3].getMethodName()
                + ", LINE: " + Thread.currentThread().getStackTrace()[3].getLineNumber());
        Log.e(className, "<<------------------------- " + arrayList.get(index).getClass().getSimpleName() + " ------------------------->> Index: " + index);
        Log.e(className, "COMMENT: " + comment);
        Print.print(LogSeparate.ERROR, className, arrayList, index);
    }

    /**
     * Print Form :
     * Class Name, Index
     * Comment
     * Tag : [Object Name] [ArrayList Index], Variable Name, Value
     *
     * @param tag
     * @param arrayList
     * @param index
     * @param comment
     */
    public static void e(String tag, ArrayList<?> arrayList, int index, String comment) {
        Log.e(tag, "METHOD: " + Thread.currentThread().getStackTrace()[3].getMethodName()
                + ", LINE: " + Thread.currentThread().getStackTrace()[3].getLineNumber());
        Log.e(tag, "<<------------------------- " + arrayList.get(index).getClass().getSimpleName() + " ------------------------->> Index: " + index);
        Log.e(tag, "COMMENT: " + comment);
        Print.print(LogSeparate.ERROR, tag, arrayList, index);
    }


    /**
     * Print Form :
     * Class Name, Start Index,End Index
     * Comment
     * Class Name : [Object Name] [ArrayList Index], Variable Name, Value
     *
     * @param arrayList
     * @param startIndex
     * @param endIndex
     */
    public static void e(ArrayList<?> arrayList, int startIndex, int endIndex, String comment) {
        String className = getClassName(Thread.currentThread().getStackTrace()[3].getClassName());
        Log.e(className, "METHOD: " + Thread.currentThread().getStackTrace()[3].getMethodName()
                + ", LINE: " + Thread.currentThread().getStackTrace()[3].getLineNumber());
        Log.e(className, "<<------------------------- " + arrayList.get(0).getClass().getSimpleName() + " ------------------------->> START INDEX: " + startIndex + ", END INDEX: " + endIndex);
        Log.e(className, "COMMENT: " + comment);
        Print.print(LogSeparate.ERROR, className, arrayList, startIndex, endIndex);
    }

    /**
     * Print Form :
     * Class Name, Start Index,End Index
     * Comment
     * Tag : [Object Name] [ArrayList Index], Variable Name, Value
     *
     * @param tag
     * @param arrayList
     * @param startIndex
     * @param endIndex
     * @param comment
     */
    public static void e(String tag, ArrayList<?> arrayList, int startIndex, int endIndex, String comment) {
        Log.e(tag, "METHOD: " + Thread.currentThread().getStackTrace()[3].getMethodName()
                + ", LINE: " + Thread.currentThread().getStackTrace()[3].getLineNumber());
        Log.e(tag, "<<------------------------- " + arrayList.get(0).getClass().getSimpleName() + " ------------------------->> START INDEX: " + startIndex + ", END INDEX: " + endIndex);
        Log.e(tag, "COMMENT: " + comment);
        Print.print(LogSeparate.ERROR, tag, arrayList, startIndex, endIndex);
    }

    /**
     * @param packageName
     * @return Class name
     */
    private static String getClassName(String packageName) {
        String[] className = packageName.split("\\.");
        return className[className.length - 1].toString();
    }

}
