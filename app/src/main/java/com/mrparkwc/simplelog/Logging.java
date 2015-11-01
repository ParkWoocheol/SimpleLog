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
 * Created by ParkWoocheol on 2015-10-13.
 */
public class Logging {


    /**
     * Log Debug
     */

    /**
     * Print Form : Class Name: Method, Line
     */
    public static void d() {
        Log.i(getClassName(Thread.currentThread().getStackTrace()[3].getClassName()), "METHOD: " + Thread.currentThread().getStackTrace()[3].getMethodName()
                + ", LINE: " + Thread.currentThread().getStackTrace()[3].getLineNumber());
    }

    /**
     * Print Form : Class Name: Method, Line, Comment
     *
     * @param comment
     */
    public static void d(String comment) {

        Log.i(getClassName(Thread.currentThread().getStackTrace()[3].getClassName()), "METHOD: " + Thread.currentThread().getStackTrace()[3].getMethodName()
                + ", LINE: " + Thread.currentThread().getStackTrace()[3].getLineNumber() + ", COMMENT: " + comment);
    }

    /**
     * Print Form : Class Name: Method, Line, Tag, String ArrayList Data
     *
     * @param dataTag
     * @param arrayList
     */
    public static void d(String dataTag, ArrayList<String> arrayList) {
        for (int i = 0; i < arrayList.size(); i++) {
            Log.i(getClassName(Thread.currentThread().getStackTrace()[3].getClassName()), "METHOD: " + Thread.currentThread().getStackTrace()[3].getMethodName()
                    + ", LINE: " + Thread.currentThread().getStackTrace()[3].getLineNumber() + ", " + dataTag + " [" + i + "] :" + arrayList);
        }
    }


    /**
     * Log Info
     */

    /**
     * Print Form : Class Name: Method, Line
     */
    public static void i() {
        Log.i(getClassName(Thread.currentThread().getStackTrace()[3].getClassName()), "METHOD: " + Thread.currentThread().getStackTrace()[3].getMethodName()
                + ", LINE: " + Thread.currentThread().getStackTrace()[3].getLineNumber());
    }

    /**
     * Print Form : Class Name: Method, Line, Comment
     *
     * @param comment
     */
    public static void i(String comment) {
        Log.i(getClassName(Thread.currentThread().getStackTrace()[3].getClassName()), "METHOD: " + Thread.currentThread().getStackTrace()[3].getMethodName()
                + ", LINE: " + Thread.currentThread().getStackTrace()[3].getLineNumber() + ", COMMENT: " + comment);
    }

    /**
     * Print Form : Class Name: Method, Line, Tag, String ArrayList Data
     *
     * @param dataTag
     * @param arrayList
     */
    public static void i(String dataTag, ArrayList<String> arrayList) {
        for (int i = 0; i < arrayList.size(); i++) {
            Log.i(getClassName(Thread.currentThread().getStackTrace()[3].getClassName()), "METHOD: " + Thread.currentThread().getStackTrace()[3].getMethodName()
                    + ", LINE: " + Thread.currentThread().getStackTrace()[3].getLineNumber() + ", " + dataTag + " [" + i + "] :" + arrayList);
        }
    }

    /**
     * Log Warn
     */

    /**
     * Print Form : Class Name: Method, Line
     */
    public static void w() {
        Log.e(getClassName(Thread.currentThread().getStackTrace()[3].getClassName()), "METHOD: " + Thread.currentThread().getStackTrace()[3].getMethodName()
                + ", LINE: " + Thread.currentThread().getStackTrace()[3].getLineNumber());
    }

    /**
     * Print Form : Class Name: Method, Line, Comment
     *
     * @param comment
     */
    public static void w(String comment) {
        Log.e(getClassName(Thread.currentThread().getStackTrace()[3].getClassName()), "METHOD: " + Thread.currentThread().getStackTrace()[3].getMethodName()
                + ", LINE: " + Thread.currentThread().getStackTrace()[3].getLineNumber() + ", COMMENT: " + comment);
    }

    /**
     * Print Form : Class Name: Method, Line, Tag, String ArrayList Data
     *
     * @param dataTag
     * @param arrayList
     */
    public static void w(String dataTag, ArrayList<String> arrayList) {
        for (int i = 0; i < arrayList.size(); i++) {
            Log.e(getClassName(Thread.currentThread().getStackTrace()[3].getClassName()), "METHOD: " + Thread.currentThread().getStackTrace()[3].getMethodName()
                    + ", LINE: " + Thread.currentThread().getStackTrace()[3].getLineNumber() + ", " + dataTag + " [" + i + "] :" + arrayList);
        }
    }


    /**
     * Log Error
     */

    /**
     * Print Form : Class Name: Method, Line
     */
    public static void e() {
        Log.e(getClassName(Thread.currentThread().getStackTrace()[3].getClassName()), "METHOD: " + Thread.currentThread().getStackTrace()[3].getMethodName()
                + ", LINE: " + Thread.currentThread().getStackTrace()[3].getLineNumber());
    }

    /**
     * Print Form : Class Name: Method, Line, Comment
     *
     * @param comment
     */
    public static void e(String comment) {
        Log.e(getClassName(Thread.currentThread().getStackTrace()[3].getClassName()), "METHOD: " + Thread.currentThread().getStackTrace()[3].getMethodName()
                + ", LINE: " + Thread.currentThread().getStackTrace()[3].getLineNumber() + ", COMMENT: " + comment);
    }

    /**
     * Print Form : Class Name: Method, Line, Tag, String ArrayList Data
     *
     * @param dataTag
     * @param arrayList
     */
    public static void e(String dataTag, ArrayList<String> arrayList) {
        for (int i = 0; i < arrayList.size(); i++) {
            Log.e(getClassName(Thread.currentThread().getStackTrace()[3].getClassName()), "METHOD: " + Thread.currentThread().getStackTrace()[3].getMethodName()
                    + ", LINE: " + Thread.currentThread().getStackTrace()[3].getLineNumber() + ", " + dataTag + " [" + i + "] :" + arrayList);
        }
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
