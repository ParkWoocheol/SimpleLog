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
public class Logging {

    private static final int DEBUG = 0;
    private static final int INFO = 1;
    private static final int WARN = 2;
    private static final int ERROR = 3;

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
     * tag : Class Name , Method Name, Line, Comment
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
        Log.d(className, "<<------------------------- " + object.getClass().getSimpleName() + " ------------------------->>");
        print(DEBUG, className, object);
    }

    /**
     * Print Form :
     * Tag : [Object Name], Variable Name, Value
     *
     * @param tag
     * @param object
     */
    public static void d(String tag, Object object) {
        Log.d(tag, "<<------------------------- " + object.getClass().getSimpleName() + " ------------------------->>");
        print(DEBUG, tag, object);
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
        Log.d(className, "<<------------------------- " + object.getClass().getSimpleName() + " ------------------------->>");
        Log.d(className, "COMMENT: " + comment);
        print(DEBUG, className, object);
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
        Log.d(tag, "<<------------------------- " + object.getClass().getSimpleName() + " ------------------------->>");
        Log.d(tag, "COMMENT: " + comment);
        print(DEBUG, tag, object);
    }

    /**
     * Print Form :
     * Class Name : [Object Name] [ArrayList Index], Variable Name, Value
     *
     * @param arrayList
     */
    public static void d(ArrayList<?> arrayList) {
        String className = getClassName(Thread.currentThread().getStackTrace()[3].getClassName());
        Log.d(className, "<<------------------------- " + arrayList.get(0).getClass().getSimpleName() + " ------------------------->> Size: " + arrayList.size());
        print(DEBUG, className, arrayList);
    }

    /**
     * Print Form :
     * Tag : [Object Name] [ArrayList Index], Variable Name, Value
     *
     * @param tag
     * @param arrayList
     */
    public static void d(String tag, ArrayList<?> arrayList) {
        Log.d(tag, "<<------------------------- " + arrayList.get(0).getClass().getSimpleName() + " ------------------------->> Size: " + arrayList.size());
        print(DEBUG, tag, arrayList);
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
        Log.d(className, "<<------------------------- " + arrayList.get(0).getClass().getSimpleName() + " ------------------------->> Size: " + arrayList.size());
        Log.d(className, "COMMENT: " + comment);
        print(DEBUG, className, arrayList);
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
        Log.d(tag, "<<------------------------- " + arrayList.get(0).getClass().getSimpleName() + " ------------------------->> Size: " + arrayList.size());
        Log.d(tag, "COMMENT: " + comment);
        print(DEBUG, tag, arrayList);
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
        Log.d(className, "<<------------------------- " + arrayList.get(index).getClass().getSimpleName() + " ------------------------->> Index: " + index);
        print(DEBUG, className, arrayList, index);
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
        Log.d(tag, "<<------------------------- " + arrayList.get(index).getClass().getSimpleName() + " ------------------------->> Index: " + index);
        print(DEBUG, tag, arrayList, index);
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
        Log.d(className, "<<------------------------- " + arrayList.get(index).getClass().getSimpleName() + " ------------------------->> Index: " + index);
        Log.d(className, "COMMENT: " + comment);
        print(DEBUG, className, arrayList, index);
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
        Log.d(tag, "<<------------------------- " + arrayList.get(index).getClass().getSimpleName() + " ------------------------->> Index: " + index);
        Log.d(tag, "COMMENT: " + comment);
        print(DEBUG, tag, arrayList, index);
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
        Log.d(className, "<<------------------------- " + arrayList.get(0).getClass().getSimpleName() + " ------------------------->> START INDEX: " + startIndex + ", END INDEX: " + endIndex);
        Log.d(className, "COMMENT: " + comment);
        print(DEBUG, className, arrayList, startIndex, endIndex);
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
        Log.d(tag, "<<------------------------- " + arrayList.get(0).getClass().getSimpleName() + " ------------------------->> START INDEX: " + startIndex + ", END INDEX: " + endIndex);
        Log.d(tag, "COMMENT: " + comment);
        print(DEBUG, tag, arrayList, startIndex, endIndex);
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
        Log.i(className, "<<------------------------- " + object.getClass().getSimpleName() + " ------------------------->>");
        print(INFO, className, object);
    }

    /**
     * Print Form :
     * Tag : [Object Name], Variable Name, Value
     *
     * @param tag
     * @param object
     */
    public static void i(String tag, Object object) {
        Log.i(tag, "<<------------------------- " + object.getClass().getSimpleName() + " ------------------------->>");
        print(INFO, tag, object);
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
        Log.i(className, "<<------------------------- " + object.getClass().getSimpleName() + " ------------------------->>");
        Log.i(className, "COMMENT: " + comment);
        print(INFO, className, object);
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
        Log.i(tag, "<<------------------------- " + object.getClass().getSimpleName() + " ------------------------->>");
        Log.i(tag, "COMMENT: " + comment);
        print(INFO, tag, object);
    }

    /**
     * Print Form :
     * Class Name : [Object Name] [ArrayList Index], Variable Name, Value
     *
     * @param arrayList
     */
    public static void i(ArrayList<?> arrayList) {
        String className = getClassName(Thread.currentThread().getStackTrace()[3].getClassName());
        Log.i(className, "<<------------------------- " + arrayList.get(0).getClass().getSimpleName() + " ------------------------->> Size: " + arrayList.size());
        print(INFO, className, arrayList);
    }

    /**
     * Print Form :
     * Tag : [Object Name] [ArrayList Index], Variable Name, Value
     *
     * @param tag
     * @param arrayList
     */
    public static void i(String tag, ArrayList<?> arrayList) {
        Log.i(tag, "<<------------------------- " + arrayList.get(0).getClass().getSimpleName() + " ------------------------->> Size: " + arrayList.size());
        print(INFO, tag, arrayList);
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
        Log.i(className, "<<------------------------- " + arrayList.get(0).getClass().getSimpleName() + " ------------------------->> Size: " + arrayList.size());
        Log.i(className, "COMMENT: " + comment);
        print(INFO, className, arrayList);
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
        Log.i(tag, "<<------------------------- " + arrayList.get(0).getClass().getSimpleName() + " ------------------------->> Size: " + arrayList.size());
        Log.i(tag, "COMMENT: " + comment);
        print(INFO, tag, arrayList);
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
        Log.i(className, "<<------------------------- " + arrayList.get(index).getClass().getSimpleName() + " ------------------------->> Index: " + index);
        print(INFO, className, arrayList, index);
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
        Log.i(tag, "<<------------------------- " + arrayList.get(index).getClass().getSimpleName() + " ------------------------->> Index: " + index);
        print(INFO, tag, arrayList, index);
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
        Log.i(className, "<<------------------------- " + arrayList.get(index).getClass().getSimpleName() + " ------------------------->> Index: " + index);
        Log.i(className, "COMMENT: " + comment);
        print(INFO, className, arrayList, index);
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
        Log.i(tag, "<<------------------------- " + arrayList.get(index).getClass().getSimpleName() + " ------------------------->> Index: " + index);
        Log.i(tag, "COMMENT: " + comment);
        print(INFO, tag, arrayList, index);
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
        Log.i(className, "<<------------------------- " + arrayList.get(0).getClass().getSimpleName() + " ------------------------->> START INDEX: " + startIndex + ", END INDEX: " + endIndex);
        Log.i(className, "COMMENT: " + comment);
        print(INFO, className, arrayList, startIndex, endIndex);
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
        Log.i(tag, "<<------------------------- " + arrayList.get(0).getClass().getSimpleName() + " ------------------------->> START INDEX: " + startIndex + ", END INDEX: " + endIndex);
        Log.i(tag, "COMMENT: " + comment);
        print(INFO, tag, arrayList, startIndex, endIndex);
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
        Log.w(className, "<<------------------------- " + object.getClass().getSimpleName() + " ------------------------->>");
        print(WARN, className, object);
    }

    /**
     * Print Form :
     * Tag : [Object Name], Variable Name, Value
     *
     * @param tag
     * @param object
     */
    public static void w(String tag, Object object) {
        Log.w(tag, "<<------------------------- " + object.getClass().getSimpleName() + " ------------------------->>");
        print(WARN, tag, object);
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
        Log.w(className, "<<------------------------- " + object.getClass().getSimpleName() + " ------------------------->>");
        Log.w(className, "COMMENT: " + comment);
        print(WARN, className, object);
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
        Log.w(tag, "<<------------------------- " + object.getClass().getSimpleName() + " ------------------------->>");
        Log.w(tag, "COMMENT: " + comment);
        print(WARN, tag, object);
    }

    /**
     * Print Form :
     * Class Name : [Object Name] [ArrayList Index], Variable Name, Value
     *
     * @param arrayList
     */
    public static void w(ArrayList<?> arrayList) {
        String className = getClassName(Thread.currentThread().getStackTrace()[3].getClassName());
        Log.w(className, "<<------------------------- " + arrayList.get(0).getClass().getSimpleName() + " ------------------------->> Size: " + arrayList.size());
        print(WARN, className, arrayList);
    }

    /**
     * Print Form :
     * Tag : [Object Name] [ArrayList Index], Variable Name, Value
     *
     * @param tag
     * @param arrayList
     */
    public static void w(String tag, ArrayList<?> arrayList) {
        Log.w(tag, "<<------------------------- " + arrayList.get(0).getClass().getSimpleName() + " ------------------------->> Size: " + arrayList.size());
        print(WARN, tag, arrayList);
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
        Log.w(className, "<<------------------------- " + arrayList.get(0).getClass().getSimpleName() + " ------------------------->> Size: " + arrayList.size());
        Log.w(className, "COMMENT: " + comment);
        print(WARN, className, arrayList);
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
        Log.w(tag, "<<------------------------- " + arrayList.get(0).getClass().getSimpleName() + " ------------------------->> Size: " + arrayList.size());
        Log.w(tag, "COMMENT: " + comment);
        print(WARN, tag, arrayList);
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
        Log.w(className, "<<------------------------- " + arrayList.get(index).getClass().getSimpleName() + " ------------------------->> Index: " + index);
        print(WARN, className, arrayList, index);
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
        Log.w(tag, "<<------------------------- " + arrayList.get(index).getClass().getSimpleName() + " ------------------------->> Index: " + index);
        print(WARN, tag, arrayList, index);
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
        Log.w(className, "<<------------------------- " + arrayList.get(index).getClass().getSimpleName() + " ------------------------->> Index: " + index);
        Log.w(className, "COMMENT: " + comment);
        print(WARN, className, arrayList, index);
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
        Log.w(tag, "<<------------------------- " + arrayList.get(index).getClass().getSimpleName() + " ------------------------->> Index: " + index);
        Log.w(tag, "COMMENT: " + comment);
        print(WARN, tag, arrayList, index);
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
        Log.w(className, "<<------------------------- " + arrayList.get(0).getClass().getSimpleName() + " ------------------------->> START INDEX: " + startIndex + ", END INDEX: " + endIndex);
        Log.w(className, "COMMENT: " + comment);
        print(WARN, className, arrayList, startIndex, endIndex);
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
        Log.w(tag, "<<------------------------- " + arrayList.get(0).getClass().getSimpleName() + " ------------------------->> START INDEX: " + startIndex + ", END INDEX: " + endIndex);
        Log.w(tag, "COMMENT: " + comment);
        print(WARN, tag, arrayList, startIndex, endIndex);
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
        Log.e(className, "<<------------------------- " + object.getClass().getSimpleName() + " ------------------------->>");
        print(ERROR, className, object);
    }

    /**
     * Print Form :
     * Tag : [Object Name], Variable Name, Value
     *
     * @param tag
     * @param object
     */
    public static void e(String tag, Object object) {
        Log.e(tag, "<<------------------------- " + object.getClass().getSimpleName() + " ------------------------->>");
        print(ERROR, tag, object);
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
        Log.e(className, "<<------------------------- " + object.getClass().getSimpleName() + " ------------------------->>");
        Log.e(className, "COMMENT: " + comment);
        print(ERROR, className, object);
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
        Log.e(tag, "<<------------------------- " + object.getClass().getSimpleName() + " ------------------------->>");
        Log.e(tag, "COMMENT: " + comment);
        print(ERROR, tag, object);
    }

    /**
     * Print Form :
     * Class Name : [Object Name] [ArrayList Index], Variable Name, Value
     *
     * @param arrayList
     */
    public static void e(ArrayList<?> arrayList) {
        String className = getClassName(Thread.currentThread().getStackTrace()[3].getClassName());
        Log.e(className, "<<------------------------- " + arrayList.get(0).getClass().getSimpleName() + " ------------------------->> Size: " + arrayList.size());
        print(ERROR, className, arrayList);
    }

    /**
     * Print Form :
     * Tag : [Object Name] [ArrayList Index], Variable Name, Value
     *
     * @param tag
     * @param arrayList
     */
    public static void e(String tag, ArrayList<?> arrayList) {
        Log.e(tag, "<<------------------------- " + arrayList.get(0).getClass().getSimpleName() + " ------------------------->> Size: " + arrayList.size());
        print(ERROR, tag, arrayList);
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
        Log.e(className, "<<------------------------- " + arrayList.get(0).getClass().getSimpleName() + " ------------------------->> Size: " + arrayList.size());
        Log.e(className, "COMMENT: " + comment);
        print(ERROR, className, arrayList);
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
        Log.e(tag, "<<------------------------- " + arrayList.get(0).getClass().getSimpleName() + " ------------------------->> Size: " + arrayList.size());
        Log.e(tag, "COMMENT: " + comment);
        print(ERROR, tag, arrayList);
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
        Log.e(className, "<<------------------------- " + arrayList.get(index).getClass().getSimpleName() + " ------------------------->> Index: " + index);
        print(ERROR, className, arrayList, index);
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
        Log.e(tag, "<<------------------------- " + arrayList.get(index).getClass().getSimpleName() + " ------------------------->> Index: " + index);
        print(ERROR, tag, arrayList, index);
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
        Log.e(className, "<<------------------------- " + arrayList.get(index).getClass().getSimpleName() + " ------------------------->> Index: " + index);
        Log.e(className, "COMMENT: " + comment);
        print(ERROR, className, arrayList, index);
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
        Log.e(tag, "<<------------------------- " + arrayList.get(index).getClass().getSimpleName() + " ------------------------->> Index: " + index);
        Log.e(tag, "COMMENT: " + comment);
        print(ERROR, tag, arrayList, index);
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
        Log.e(className, "<<------------------------- " + arrayList.get(0).getClass().getSimpleName() + " ------------------------->> START INDEX: " + startIndex + ", END INDEX: " + endIndex);
        Log.e(className, "COMMENT: " + comment);
        print(ERROR, className, arrayList, startIndex, endIndex);
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
        Log.e(tag, "<<------------------------- " + arrayList.get(0).getClass().getSimpleName() + " ------------------------->> START INDEX: " + startIndex + ", END INDEX: " + endIndex);
        Log.e(tag, "COMMENT: " + comment);
        print(ERROR, tag, arrayList, startIndex, endIndex);
    }

    /**
     * @param packageName
     * @return Class name
     */
    private static String getClassName(String packageName) {
        String[] className = packageName.split("\\.");
        return className[className.length - 1].toString();
    }

    /**
     * @param printType
     * @param tag
     * @param object
     */
    private static void print(int printType, String tag, Object object) {
        inputLogMessage(printType, tag, object, -1);
    }

    /**
     * @param printType
     * @param tag
     * @param arrayList
     */
    private static void print(int printType, String tag, ArrayList<?> arrayList) {
        Object object;
        for (int i = 0; i < arrayList.size(); i++) {
            object = arrayList.get(i);
            inputArrayIndexLog(printType, tag, i);
            inputLogMessage(printType, tag, object, i);
        }
    }

    /**
     * @param printType
     * @param tag
     * @param arrayList
     * @param index
     */
    private static void print(int printType, String tag, ArrayList<?> arrayList, int index) {
        Object object;
        object = arrayList.get(index);
        inputArrayIndexLog(printType, tag, index);
        inputLogMessage(printType, tag, object, index);
    }

    /**
     * @param printType
     * @param className
     * @param arrayList
     * @param startIndex
     * @param endIndex
     */
    private static void print(int printType, String className, ArrayList<?> arrayList, int startIndex, int endIndex) {
        Object object;
        for (int i = startIndex; i <= endIndex; i++) {
            object = arrayList.get(i);
            inputArrayIndexLog(printType, className, i);
            inputLogMessage(printType, className, object, i);
        }
    }

    private static void inputLogMessage(int printType, String tag, Object object, int index) {
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
                switch (printType) {
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

    private static void inputArrayIndexLog(int printType, String className, int index) {
        String logMessage = "------------------------- Index: " + index + " -------------------------";
        switch (printType) {
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
