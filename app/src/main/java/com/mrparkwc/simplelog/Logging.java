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
 * Created by ParkWoocheol on 2015-10-13.
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
     * Print Form : Class Name: Method Name, Line
     */
    public static void d() {
        Log.d(getClassName(Thread.currentThread().getStackTrace()[3].getClassName()), "METHOD: " + Thread.currentThread().getStackTrace()[3].getMethodName()
                + ", LINE: " + Thread.currentThread().getStackTrace()[3].getLineNumber());
    }

    /**
     * Print Form : Class Name: Method Name, Line, Comment
     *
     * @param comment
     */
    public static void d(String comment) {

        Log.d(getClassName(Thread.currentThread().getStackTrace()[3].getClassName()), "METHOD: " + Thread.currentThread().getStackTrace()[3].getMethodName()
                + ", LINE: " + Thread.currentThread().getStackTrace()[3].getLineNumber() + ", COMMENT: " + comment);
    }

    /**
     * Print Form : tag: Class Name , Method Name, Line, Comment
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
     * Print Form : Class Name: Method Name, Line, Tag, String ArrayList Data
     *
     * @param dataTag
     * @param arrayList
     */
    public static void d(String dataTag, ArrayList<String> arrayList) {
        for (int i = 0; i < arrayList.size(); i++) {
            Log.d(getClassName(Thread.currentThread().getStackTrace()[3].getClassName()), "METHOD: " + Thread.currentThread().getStackTrace()[3].getMethodName()
                    + ", LINE: " + Thread.currentThread().getStackTrace()[3].getLineNumber() + ", " + dataTag + " [" + i + "] :" + arrayList.get(i));
        }
    }

    /**
     * Print Form : Class Name : [Object Name], Variable Name, Value
     *
     * @param object
     */
    public static void d(Object object) {
        print(DEBUG, getClassName(Thread.currentThread().getStackTrace()[3].getClassName()), object);
    }

    /**
     * Print Form : Class Name : [Object Name] [ArrayList Index], Variable Name, Value
     *
     * @param arrayList
     */
    public static void d(ArrayList<?> arrayList) {
        print(DEBUG, getClassName(Thread.currentThread().getStackTrace()[3].getClassName()), arrayList);
    }

    /**
     * Print Form : Class Name : [Object Name] [ArrayList Index], Variable Name, Value
     *
     * @param arrayList
     * @param index
     */
    public static void d(ArrayList<?> arrayList, int index) {
        print(DEBUG, getClassName(Thread.currentThread().getStackTrace()[3].getClassName()), arrayList, index);
    }

    /**
     * Print Form : Class Name : [Object Name] [ArrayList Index], Variable Name, Value
     *
     * @param arrayList
     * @param startIndex
     * @param endIndex
     */
    public static void d(ArrayList<?> arrayList, int startIndex, int endIndex) {
        print(DEBUG, getClassName(Thread.currentThread().getStackTrace()[3].getClassName()), arrayList, startIndex, endIndex);
    }


    /**
     * Log Info
     */

    /**
     * Print Form : Class Name: Method Name, Line
     */
    public static void i() {
        Log.i(getClassName(Thread.currentThread().getStackTrace()[3].getClassName()), "METHOD: " + Thread.currentThread().getStackTrace()[3].getMethodName()
                + ", LINE: " + Thread.currentThread().getStackTrace()[3].getLineNumber());
    }

    /**
     * Print Form : Class Name: Method Name, Line, Comment
     *
     * @param comment
     */
    public static void i(String comment) {
        Log.i(getClassName(Thread.currentThread().getStackTrace()[3].getClassName()), "METHOD: " + Thread.currentThread().getStackTrace()[3].getMethodName()
                + ", LINE: " + Thread.currentThread().getStackTrace()[3].getLineNumber() + ", COMMENT: " + comment);
    }

    /**
     * Print Form : tag: Class Name , Method Name, Line, Comment
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
     * Print Form : Class Name: Method, Line, Tag, String ArrayList Data
     *
     * @param dataTag
     * @param arrayList
     */
    public static void i(String dataTag, ArrayList<String> arrayList) {
        for (int i = 0; i < arrayList.size(); i++) {
            Log.i(getClassName(Thread.currentThread().getStackTrace()[3].getClassName()), "METHOD: " + Thread.currentThread().getStackTrace()[3].getMethodName()
                    + ", LINE: " + Thread.currentThread().getStackTrace()[3].getLineNumber() + ", " + dataTag + " [" + i + "] :" + arrayList.get(i));
        }
    }

    /**
     * Print Form : Class Name : [Object Name], Variable Name, Value
     *
     * @param object
     */
    public static void i(Object object) {
        print(INFO, getClassName(Thread.currentThread().getStackTrace()[3].getClassName()), object);
    }

    /**
     * Print Form : Class Name : [Object Name] [ArrayList Index], Variable Name, Value
     *
     * @param arrayList
     */
    public static void i(ArrayList<?> arrayList) {
        print(INFO, getClassName(Thread.currentThread().getStackTrace()[3].getClassName()), arrayList);
    }

    /**
     * Print Form : Class Name : [Object Name] [ArrayList Index], Variable Name, Value
     *
     * @param arrayList
     * @param index
     */
    public static void i(ArrayList<?> arrayList, int index) {
        print(INFO, getClassName(Thread.currentThread().getStackTrace()[3].getClassName()), arrayList, index);
    }

    /**
     * Print Form : Class Name : [Object Name] [ArrayList Index], Variable Name, Value
     *
     * @param arrayList
     * @param startIndex
     * @param endIndex
     */
    public static void i(ArrayList<?> arrayList, int startIndex, int endIndex) {
        print(INFO, getClassName(Thread.currentThread().getStackTrace()[3].getClassName()), arrayList, startIndex, endIndex);
    }


    /**
     * Log Warn
     */

    /**
     * Print Form : Class Name: Method Name, Line
     */
    public static void w() {
        Log.w(getClassName(Thread.currentThread().getStackTrace()[3].getClassName()), "METHOD: " + Thread.currentThread().getStackTrace()[3].getMethodName()
                + ", LINE: " + Thread.currentThread().getStackTrace()[3].getLineNumber());
    }

    /**
     * Print Form : Class Name: Method Name, Line, Comment
     *
     * @param comment
     */
    public static void w(String comment) {
        Log.w(getClassName(Thread.currentThread().getStackTrace()[3].getClassName()), "METHOD: " + Thread.currentThread().getStackTrace()[3].getMethodName()
                + ", LINE: " + Thread.currentThread().getStackTrace()[3].getLineNumber() + ", COMMENT: " + comment);
    }

    /**
     * Print Form : tag: Class Name , Method Name, Line, Comment
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
     * Print Form : Class Name: Method Name, Line, Tag, String ArrayList Data
     *
     * @param dataTag
     * @param arrayList
     */
    public static void w(String dataTag, ArrayList<String> arrayList) {
        for (int i = 0; i < arrayList.size(); i++) {
            Log.w(getClassName(Thread.currentThread().getStackTrace()[3].getClassName()), "METHOD: " + Thread.currentThread().getStackTrace()[3].getMethodName()
                    + ", LINE: " + Thread.currentThread().getStackTrace()[3].getLineNumber() + ", " + dataTag + " [" + i + "] :" + arrayList.get(i));
        }
    }

    /**
     * Print Form : Class Name : [Object Name], Variable Name, Value
     *
     * @param object
     */
    public static void w(Object object) {
        print(WARN, getClassName(Thread.currentThread().getStackTrace()[3].getClassName()), object);
    }

    /**
     * Print Form : Class Name : [Object Name] [ArrayList Index], Variable Name, Value
     *
     * @param arrayList
     */
    public static void w(ArrayList<?> arrayList) {
        print(WARN, getClassName(Thread.currentThread().getStackTrace()[3].getClassName()), arrayList);
    }

    /**
     * Print Form : Class Name : [Object Name] [ArrayList Index], Variable Name, Value
     *
     * @param arrayList
     * @param index
     */
    public static void w(ArrayList<?> arrayList, int index) {
        print(WARN, getClassName(Thread.currentThread().getStackTrace()[3].getClassName()), arrayList, index);
    }

    /**
     * Print Form : Class Name : [Object Name] [ArrayList Index], Variable Name, Value
     *
     * @param arrayList
     * @param startIndex
     * @param endIndex
     */
    public static void w(ArrayList<?> arrayList, int startIndex, int endIndex) {
        print(WARN, getClassName(Thread.currentThread().getStackTrace()[3].getClassName()), arrayList, startIndex, endIndex);
    }


    /**
     * Log Error
     */

    /**
     * Print Form : Class Name: Method Name, Line
     */
    public static void e() {
        Log.e(getClassName(Thread.currentThread().getStackTrace()[3].getClassName()), "METHOD: " + Thread.currentThread().getStackTrace()[3].getMethodName()
                + ", LINE: " + Thread.currentThread().getStackTrace()[3].getLineNumber());
    }

    /**
     * Print Form : Class Name: Method Name, Line, Comment
     *
     * @param comment
     */
    public static void e(String comment) {
        Log.e(getClassName(Thread.currentThread().getStackTrace()[3].getClassName()), "METHOD: " + Thread.currentThread().getStackTrace()[3].getMethodName()
                + ", LINE: " + Thread.currentThread().getStackTrace()[3].getLineNumber() + ", COMMENT: " + comment);
    }

    /**
     * Print Form : tag: Class Name , Method Name, Line, Comment
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
     * Print Form : Class Name: Method Name, Line, Tag, String ArrayList Data
     *
     * @param dataTag
     * @param arrayList
     */
    public static void e(String dataTag, ArrayList<String> arrayList) {
        for (int i = 0; i < arrayList.size(); i++) {
            Log.e(getClassName(Thread.currentThread().getStackTrace()[3].getClassName()), "METHOD: " + Thread.currentThread().getStackTrace()[3].getMethodName()
                    + ", LINE: " + Thread.currentThread().getStackTrace()[3].getLineNumber() + ", " + dataTag + " [" + i + "] :" + arrayList.get(i));
        }
    }

    /**
     * Print Form : Class Name : [Object Name], Variable Name, Value
     *
     * @param object
     */
    public static void e(Object object) {
        print(ERROR, getClassName(Thread.currentThread().getStackTrace()[3].getClassName()), object);
    }

    /**
     * Print Form : Class Name : [Object Name] [ArrayList Index], Variable Name, Value
     *
     * @param arrayList
     */
    public static void e(ArrayList<?> arrayList) {
        print(ERROR, getClassName(Thread.currentThread().getStackTrace()[3].getClassName()), arrayList);
    }

    /**
     * Print Form : Class Name : [Object Name] [ArrayList Index], Variable Name, Value
     *
     * @param arrayList
     * @param index
     */
    public static void e(ArrayList<?> arrayList, int index) {
        print(ERROR, getClassName(Thread.currentThread().getStackTrace()[3].getClassName()), arrayList, index);
    }

    /**
     * Print Form : Class Name : [Object Name] [ArrayList Index], Variable Name, Value
     *
     * @param arrayList
     * @param startIndex
     * @param endIndex
     */
    public static void e(ArrayList<?> arrayList, int startIndex, int endIndex) {
        print(ERROR, getClassName(Thread.currentThread().getStackTrace()[3].getClassName()), arrayList, startIndex, endIndex);
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
     * @param className
     * @param object
     */
    private static void print(int printType, String className, Object object) {
        try {
            Class<?> objClass = object.getClass();
            Field[] fields = objClass.getDeclaredFields();
            for (Field field : fields) {
                field.setAccessible(true);
                String name = field.getName();
                Object value = field.get(object);
                switch (printType) {
                    case DEBUG:
                        Log.d(className,
                                "[ " + object.getClass().getSimpleName() + " ], " + "Variable Name: " + name + ", Value: " + value);
                        break;
                    case INFO:
                        Log.i(className,
                                "[ " + object.getClass().getSimpleName() + " ], " + "Variable Name: " + name + ", Value: " + value);
                        break;
                    case WARN:
                        Log.w(className,
                                "[ " + object.getClass().getSimpleName() + " ], " + "Variable Name: " + name + ", Value: " + value);
                        break;
                    case ERROR:
                        Log.e(className,
                                "[ " + object.getClass().getSimpleName() + " ], " + "Variable Name: " + name + ", Value: " + value);
                        break;
                }

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * @param printType
     * @param className
     * @param arrayList
     */
    private static void print(int printType, String className, ArrayList<?> arrayList) {
        try {
            Object object;
            for (int i = 0; i < arrayList.size(); i++) {
                object = arrayList.get(i);
                Class<?> objClass = object.getClass();
                Field[] fields = objClass.getDeclaredFields();
                for (Field field : fields) {
                    field.setAccessible(true);
                    String name = field.getName();
                    Object value = field.get(object);
                    switch (printType) {
                        case DEBUG:
                            Log.d(className,
                                    "[ " + object.getClass().getSimpleName() + " ][ " + i + " ], " + "Variable Name: " + name + ", Value: " + value);
                            break;
                        case INFO:
                            Log.i(className,
                                    "[ " + object.getClass().getSimpleName() + " ][ " + i + " ], " + "Variable Name: " + name + ", Value: " + value);
                            break;
                        case WARN:
                            Log.w(className,
                                    "[ " + object.getClass().getSimpleName() + " ][ " + i + " ], " + "Variable Name: " + name + ", Value: " + value);
                            break;
                        case ERROR:
                            Log.e(className,
                                    "[ " + object.getClass().getSimpleName() + " ][ " + i + " ], " + "Variable Name: " + name + ", Value: " + value);
                            break;
                    }

                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * @param printType
     * @param className
     * @param arrayList
     * @param index
     */
    private static void print(int printType, String className, ArrayList<?> arrayList, int index) {
        try {
            Object object;
            object = arrayList.get(index);
            Class<?> objClass = object.getClass();
            Field[] fields = objClass.getDeclaredFields();
            for (Field field : fields) {
                field.setAccessible(true);
                String name = field.getName();
                Object value = field.get(object);
                switch (printType) {
                    case DEBUG:
                        Log.d(className,
                                "[ " + object.getClass().getSimpleName() + " ][ " + index + " ], " + "Variable Name: " + name + ", Value: " + value);
                        break;
                    case INFO:
                        Log.i(className,
                                "[ " + object.getClass().getSimpleName() + " ][ " + index + " ], " + "Variable Name: " + name + ", Value: " + value);
                        break;
                    case WARN:
                        Log.w(className,
                                "[ " + object.getClass().getSimpleName() + " ][ " + index + " ], " + "Variable Name: " + name + ", Value: " + value);
                        break;
                    case ERROR:
                        Log.e(className,
                                "[ " + object.getClass().getSimpleName() + " ][ " + index + " ], " + "Variable Name: " + name + ", Value: " + value);
                        break;
                }

            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * @param printType
     * @param className
     * @param arrayList
     * @param startIndex
     * @param endIndex
     */
    private static void print(int printType, String className, ArrayList<?> arrayList, int startIndex, int endIndex) {
        try {
            Object object;
            for (int i = startIndex; i <= endIndex; i++) {
                object = arrayList.get(i);
                Class<?> objClass = object.getClass();
                Field[] fields = objClass.getDeclaredFields();
                for (Field field : fields) {
                    field.setAccessible(true);
                    String name = field.getName();
                    Object value = field.get(object);
                    switch (printType) {
                        case DEBUG:
                            Log.d(className,
                                    "[ " + object.getClass().getSimpleName() + " ][ " + i + " ], " + "Variable Name: " + name + ", Value: " + value);
                            break;
                        case INFO:
                            Log.i(className,
                                    "[ " + object.getClass().getSimpleName() + " ][ " + i + " ], " + "Variable Name: " + name + ", Value: " + value);
                            break;
                        case WARN:
                            Log.w(className,
                                    "[ " + object.getClass().getSimpleName() + " ][ " + i + " ], " + "Variable Name: " + name + ", Value: " + value);
                            break;
                        case ERROR:
                            Log.e(className,
                                    "[ " + object.getClass().getSimpleName() + " ][ " + i + " ], " + "Variable Name: " + name + ", Value: " + value);
                            break;
                    }

                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
