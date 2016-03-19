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
public abstract class BaseLogging {

    private static final String NULL_MESSAGE = "Target is Null Point.";

    /**
     * @param packageName
     * @return Class name
     */
    static String getClassName(String packageName) {
        String[] className = packageName.split("\\.");
        return className[className.length - 1];
    }


    static void seperate(LogSeparator logSeparator, String className, String methodName, int lineNumber) {
        String message = "METHOD: " + methodName
                + ", LINE: " + lineNumber;
        switch (logSeparator) {
            case DEBUG:
                Log.d(className, message);
                break;
            case INFO:
                Log.i(className, message);
                break;
            case ERROR:
                Log.e(className, message);
                break;
            case WARN:
                Log.w(className, message);
                break;
        }

    }

    /**
     * Print Form :
     * Class Name : Method Name, Line, Comment
     *
     * @param comment
     */
    static void seperate(LogSeparator logSeparator, String className, String methodName, int lineNumber, String comment) {
        if (isNull(comment)) {
            comment = NULL_MESSAGE;
        }
        String message = "METHOD: " + methodName
                + ", LINE: " + lineNumber + ", COMMENT: " + comment;
        switch (logSeparator) {
            case DEBUG:
                Log.d(className, message);
                break;
            case INFO:
                Log.i(className, message);
                break;
            case ERROR:
                Log.e(className, message);
                break;
            case WARN:
                Log.w(className, message);
                break;
        }
    }

    /**
     * Print Form :
     * Tag : Class Name , Method Name, Line, Comment
     *
     * @param tag
     * @param comment
     */
    static void seperate(LogSeparator logSeparator, String className, String methodName, int lineNumber, String tag, String comment) {
        if (isNull(comment)) {
            comment = NULL_MESSAGE;
        }
        String message = "CLASS: " + className +
                ", METHOD: " + methodName
                + ", LINE: " + lineNumber + ", COMMENT: " + comment;
        switch (logSeparator) {
            case DEBUG:
                Log.d(tag, message);
                break;
            case INFO:
                Log.i(tag, message);
                break;
            case ERROR:
                Log.e(tag, message);
                break;
            case WARN:
                Log.w(tag, message);
                break;
        }
    }

    /**
     * Print Form :
     * Class Name : [Object Name], Variable Name, Value
     *
     * @param object
     */
    static void seperate(LogSeparator logSeparator, String className, String methodName, int lineNumber, Object object) {
        if (isNull(object)) {
            seperate(logSeparator, className, methodName, lineNumber, NULL_MESSAGE);
        } else {
            String message = "METHOD: " + methodName
                    + ", LINE: " + lineNumber;
            String objectInformationMessage = "<<------------------------- " + object.getClass().getSimpleName() + " ------------------------->>";
            switch (logSeparator) {

                case DEBUG:
                    Log.d(className, message);
                    Log.d(className, objectInformationMessage);
                    break;
                case INFO:
                    Log.i(className, message);
                    Log.i(className, objectInformationMessage);
                    break;
                case ERROR:
                    Log.e(className, message);
                    Log.e(className, objectInformationMessage);
                    break;
                case WARN:
                    Log.w(className, message);
                    Log.w(className, objectInformationMessage);
                    break;
            }
            Print.print(logSeparator, className, object);
        }
    }

    /**
     * Print Form :
     * Tag : [Object Name], Variable Name, Value
     *
     * @param tag
     * @param object
     */
    static void seperate(LogSeparator logSeparator, String className, String methodName, int lineNumber, String tag, Object object) {
        if (isNull(object)) {
            seperate(logSeparator, className, methodName, lineNumber, NULL_MESSAGE);
        } else {
            String message = "CLASS: " + className +
                    ", METHOD: " + methodName
                    + ", LINE: " + lineNumber;
            String objectInformationMessage = "<<------------------------- " + object.getClass().getSimpleName() + " ------------------------->>";
            switch (logSeparator) {
                case DEBUG:
                    Log.d(tag, message);
                    Log.d(tag, objectInformationMessage);
                    break;
                case INFO:
                    Log.i(tag, message);
                    Log.i(tag, objectInformationMessage);
                    break;
                case ERROR:
                    Log.e(tag, message);
                    Log.e(tag, objectInformationMessage);
                    break;
                case WARN:
                    Log.w(tag, message);
                    Log.w(tag, objectInformationMessage);
                    break;
            }
            Print.print(logSeparator, tag, object);
        }
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
    static void seperate(LogSeparator logSeparator, String className, String methodName, int lineNumber, Object object, String comment) {
        if (isNull(object)) {
            seperate(logSeparator, className, methodName, lineNumber, NULL_MESSAGE);
        } else {
            String message = "METHOD: " + methodName
                    + ", LINE: " + lineNumber;
            String objectInformationMessage = "<<------------------------- " + object.getClass().getSimpleName() + " ------------------------->>";
            String commentMessage = "COMMENT: " + comment;
            switch (logSeparator) {
                case DEBUG:
                    Log.d(className, message);
                    Log.d(className, objectInformationMessage);
                    Log.d(className, commentMessage);
                    break;
                case INFO:
                    Log.i(className, message);
                    Log.i(className, objectInformationMessage);
                    Log.i(className, commentMessage);
                    break;
                case ERROR:
                    Log.e(className, message);
                    Log.e(className, objectInformationMessage);
                    Log.e(className, commentMessage);
                    break;
                case WARN:
                    Log.w(className, message);
                    Log.w(className, objectInformationMessage);
                    Log.w(className, commentMessage);
                    break;
            }
            Print.print(logSeparator, className, object);
        }
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
    static void seperate(LogSeparator logSeparator, String className, String methodName, int lineNumber, String tag, Object object, String comment) {
        if (isNull(object)) {
            seperate(logSeparator, className, methodName, lineNumber, NULL_MESSAGE);
        } else {
            String message = "CLASS: " + className +
                    ", METHOD: " + methodName
                    + ", LINE: " + lineNumber;
            String objectInformationMessage = "<<------------------------- " + object.getClass().getSimpleName() + " ------------------------->>";
            String commentMessage = "COMMENT: " + comment;
            switch (logSeparator) {
                case DEBUG:
                    Log.d(tag, message);
                    Log.d(tag, objectInformationMessage);
                    Log.d(tag, commentMessage);
                    break;
                case INFO:
                    Log.i(tag, message);
                    Log.i(tag, objectInformationMessage);
                    Log.i(tag, commentMessage);
                    break;
                case ERROR:
                    Log.e(tag, message);
                    Log.e(tag, objectInformationMessage);
                    Log.e(tag, commentMessage);
                    break;
                case WARN:
                    Log.w(tag, message);
                    Log.w(tag, objectInformationMessage);
                    Log.w(tag, commentMessage);
                    break;
            }
            Print.print(logSeparator, tag, object);
        }
    }

    /**
     * Print Form :
     * Class Name : [Object Name] [ArrayList Index], Variable Name, Value
     *
     * @param arrayList
     */
    static void seperate(LogSeparator logSeparator, String className, String methodName, int lineNumber, ArrayList<?> arrayList) {
        if (isNull(arrayList)) {
            seperate(logSeparator, className, methodName, lineNumber, NULL_MESSAGE);
        } else {
            String message = "METHOD: " + methodName
                    + ", LINE: " + lineNumber;
            String objectInformationMessage = "<<------------------------- " + arrayList.get(0).getClass().getSimpleName() + " ------------------------->> Size: " + arrayList.size();
            switch (logSeparator) {
                case DEBUG:
                    Log.d(className, message);
                    Log.d(className, objectInformationMessage);
                    break;
                case INFO:
                    Log.i(className, message);
                    Log.i(className, objectInformationMessage);
                    break;
                case ERROR:
                    Log.e(className, message);
                    Log.e(className, objectInformationMessage);
                    break;
                case WARN:
                    Log.w(className, message);
                    Log.w(className, objectInformationMessage);
                    break;
            }
            Print.print(logSeparator, className, arrayList);
        }
    }

    /**
     * Print Form :
     * Tag : [Object Name] [ArrayList Index], Variable Name, Value
     *
     * @param tag
     * @param arrayList
     */
    static void seperate(LogSeparator logSeparator, String className, String methodName, int lineNumber, String tag, ArrayList<?> arrayList) {
        if (isNull(arrayList)) {
            seperate(logSeparator, className, methodName, lineNumber, NULL_MESSAGE);
        } else {
            String message = "CLASS: " + className +
                    ", METHOD: " + methodName
                    + ", LINE: " + lineNumber;
            String objectInformationMessage = "<<------------------------- " + arrayList.get(0).getClass().getSimpleName() + " ------------------------->> Size: " + arrayList.size();
            switch (logSeparator) {
                case DEBUG:
                    Log.d(tag, message);
                    Log.d(tag, objectInformationMessage);
                    break;
                case INFO:
                    Log.i(tag, message);
                    Log.i(tag, objectInformationMessage);
                    break;
                case ERROR:
                    Log.e(tag, message);
                    Log.e(tag, objectInformationMessage);
                    break;
                case WARN:
                    Log.w(tag, message);
                    Log.w(tag, objectInformationMessage);
                    break;
            }
            Print.print(logSeparator, tag, arrayList);
        }
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
    static void seperate(LogSeparator logSeparator, String className, String methodName, int lineNumber, ArrayList<?> arrayList, String comment) {
        if (isNull(arrayList)) {
            seperate(logSeparator, className, methodName, lineNumber, NULL_MESSAGE);
        } else {
            String message = "METHOD: " + methodName
                    + ", LINE: " + lineNumber;
            String objectInformationMessage = "<<------------------------- " + arrayList.get(0).getClass().getSimpleName() + " ------------------------->> Size: " + arrayList.size();
            String commentMessage = "COMMENT: " + comment;
            switch (logSeparator) {
                case DEBUG:
                    Log.d(className, message);
                    Log.d(className, objectInformationMessage);
                    Log.d(className, commentMessage);
                    break;
                case INFO:
                    Log.i(className, message);
                    Log.i(className, objectInformationMessage);
                    Log.i(className, commentMessage);
                    break;
                case ERROR:
                    Log.e(className, message);
                    Log.e(className, objectInformationMessage);
                    Log.e(className, commentMessage);
                    break;
                case WARN:
                    Log.w(className, message);
                    Log.w(className, objectInformationMessage);
                    Log.w(className, commentMessage);
                    break;
            }
            Print.print(logSeparator, className, arrayList);
        }
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
    static void seperate(LogSeparator logSeparator, String className, String methodName, int lineNumber, String tag, ArrayList<?> arrayList, String comment) {
        if (isNull(arrayList)) {
            seperate(logSeparator, className, methodName, lineNumber, NULL_MESSAGE);
        } else {
            String message = "CLASS: " + className +
                    ", METHOD: " + methodName
                    + ", LINE: " + lineNumber;
            String objectInformationMessage = "<<------------------------- " + arrayList.get(0).getClass().getSimpleName() + " ------------------------->> Size: " + arrayList.size();
            String commentMessage = "COMMENT: " + comment;
            switch (logSeparator) {
                case DEBUG:
                    Log.d(tag, message);
                    Log.d(tag, objectInformationMessage);
                    Log.d(tag, commentMessage);
                    break;
                case INFO:
                    Log.i(tag, message);
                    Log.i(tag, objectInformationMessage);
                    Log.i(tag, commentMessage);
                    break;
                case ERROR:
                    Log.e(tag, message);
                    Log.e(tag, objectInformationMessage);
                    Log.e(tag, commentMessage);
                    break;
                case WARN:
                    Log.w(tag, message);
                    Log.w(tag, objectInformationMessage);
                    Log.w(tag, commentMessage);
                    break;
            }
            Print.print(logSeparator, tag, arrayList);
        }
    }

    /**
     * Print Form :
     * Class Name
     * Class Name : [Object Name] [ArrayList Index], Variable Name, Value
     *
     * @param arrayList
     * @param index
     */
    static void seperate(LogSeparator logSeparator, String className, String methodName, int lineNumber, ArrayList<?> arrayList, int index) {
        if (isNull(arrayList)) {
            seperate(logSeparator, className, methodName, lineNumber, NULL_MESSAGE);
        } else {
            String message = "METHOD: " + methodName
                    + ", LINE: " + lineNumber;
            String objectInformationMessage = "<<------------------------- " + arrayList.get(0).getClass().getSimpleName() + " ------------------------->> Index: " + index;

            switch (logSeparator) {
                case DEBUG:
                    Log.d(className, message);
                    Log.d(className, objectInformationMessage);
                    break;
                case INFO:
                    Log.i(className, message);
                    Log.i(className, objectInformationMessage);
                    break;
                case ERROR:
                    Log.e(className, message);
                    Log.e(className, objectInformationMessage);
                    break;
                case WARN:
                    Log.w(className, message);
                    Log.w(className, objectInformationMessage);
                    break;
            }
            Print.print(logSeparator, className, arrayList, index);
        }
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
    static void seperate(LogSeparator logSeparator, String className, String methodName, int lineNumber, String tag, ArrayList<?> arrayList, int index) {
        if (isNull(arrayList)) {
            seperate(logSeparator, className, methodName, lineNumber, NULL_MESSAGE);
        } else {
            String message = "CLASS: " + className +
                    ", METHOD: " + methodName
                    + ", LINE: " + lineNumber;
            String objectInformationMessage = "<<------------------------- " + arrayList.get(0).getClass().getSimpleName() + " ------------------------->> Index: " + index;
            switch (logSeparator) {
                case DEBUG:
                    Log.d(tag, message);
                    Log.d(tag, objectInformationMessage);
                    break;
                case INFO:
                    Log.i(tag, message);
                    Log.i(tag, objectInformationMessage);
                    break;
                case ERROR:
                    Log.e(tag, message);
                    Log.e(tag, objectInformationMessage);
                    break;
                case WARN:
                    Log.w(tag, message);
                    Log.w(tag, objectInformationMessage);
                    break;
            }
            Print.print(logSeparator, tag, arrayList, index);
        }
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
    static void seperate(LogSeparator logSeparator, String className, String methodName, int lineNumber, ArrayList<?> arrayList, int index, String comment) {
        if (isNull(arrayList)) {
            seperate(logSeparator, className, methodName, lineNumber, NULL_MESSAGE);
        } else {
            String message = "METHOD: " + methodName
                    + ", LINE: " + lineNumber;
            String objectInformationMessage = "<<------------------------- " + arrayList.get(0).getClass().getSimpleName() + " ------------------------->> Index: " + index;
            String commentMessage = "COMMENT: " + comment;
            switch (logSeparator) {
                case DEBUG:
                    Log.d(className, message);
                    Log.d(className, objectInformationMessage);
                    Log.d(className, commentMessage);
                    break;
                case INFO:
                    Log.i(className, message);
                    Log.i(className, objectInformationMessage);
                    Log.i(className, commentMessage);
                    break;
                case ERROR:
                    Log.e(className, message);
                    Log.e(className, objectInformationMessage);
                    Log.e(className, commentMessage);
                    break;
                case WARN:
                    Log.w(className, message);
                    Log.w(className, objectInformationMessage);
                    Log.w(className, commentMessage);
                    break;
            }
            Print.print(logSeparator, className, arrayList, index);
        }
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
    static void seperate(LogSeparator logSeparator, String className, String methodName, int lineNumber, String tag, ArrayList<?> arrayList, int index, String comment) {
        if (isNull(arrayList)) {
            seperate(logSeparator, className, methodName, lineNumber, NULL_MESSAGE);
        } else {
            String message = "CLASS: " + className +
                    ", METHOD: " + methodName
                    + ", LINE: " + lineNumber;
            String objectInformationMessage = "<<------------------------- " + arrayList.get(0).getClass().getSimpleName() + " ------------------------->> Index: " + index;
            String commentMessage = "COMMENT: " + comment;
            switch (logSeparator) {
                case DEBUG:
                    Log.d(tag, message);
                    Log.d(tag, objectInformationMessage);
                    Log.d(tag, commentMessage);
                    break;
                case INFO:
                    Log.i(tag, message);
                    Log.i(tag, objectInformationMessage);
                    Log.i(tag, commentMessage);
                    break;
                case ERROR:
                    Log.e(tag, message);
                    Log.e(tag, objectInformationMessage);
                    Log.e(tag, commentMessage);
                    break;
                case WARN:
                    Log.w(tag, message);
                    Log.w(tag, objectInformationMessage);
                    Log.w(tag, commentMessage);
                    break;
            }
            Print.print(logSeparator, tag, arrayList, index);
        }
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
    static void seperate(LogSeparator logSeparator, String className, String methodName, int lineNumber, ArrayList<?> arrayList, int startIndex, int endIndex) {
        if (isNull(arrayList)) {
            seperate(logSeparator, className, methodName, lineNumber, NULL_MESSAGE);
        } else {
            String message = "METHOD: " + methodName
                    + ", LINE: " + lineNumber;
            String objectInformationMessage = "<<------------------------- " + arrayList.get(0).getClass().getSimpleName() + " ------------------------->> START INDEX: " + startIndex + ", END INDEX: " + endIndex;
            switch (logSeparator) {
                case DEBUG:
                    Log.d(className, message);
                    Log.d(className, objectInformationMessage);
                    break;
                case INFO:
                    Log.i(className, message);
                    Log.i(className, objectInformationMessage);
                    break;
                case ERROR:
                    Log.e(className, message);
                    Log.e(className, objectInformationMessage);
                    break;
                case WARN:
                    Log.w(className, message);
                    Log.w(className, objectInformationMessage);
                    break;
            }
            Print.print(logSeparator, className, arrayList, startIndex, endIndex);
        }
    }


    /**
     * Print Form :
     * Class Name, Start Index,End Index
     * Comment
     * Class Name : [Object Name] [ArrayList Index], Variable Name, Value
     *
     * @param tag
     * @param arrayList
     * @param startIndex
     * @param endIndex
     */
    static void seperate(LogSeparator logSeparator, String className, String methodName, int lineNumber, String tag, ArrayList<?> arrayList, int startIndex, int endIndex) {
        if (isNull(arrayList)) {
            seperate(logSeparator, className, methodName, lineNumber, NULL_MESSAGE);
        } else {
            String message = "CLASS: " + className +
                    ", METHOD: " + methodName
                    + ", LINE: " + lineNumber;
            String objectInformationMessage = "<<------------------------- " + arrayList.get(0).getClass().getSimpleName() + " ------------------------->> START INDEX: " + startIndex + ", END INDEX: " + endIndex;
            switch (logSeparator) {
                case DEBUG:
                    Log.d(tag, message);
                    Log.d(tag, objectInformationMessage);
                    break;
                case INFO:
                    Log.i(tag, message);
                    Log.i(tag, objectInformationMessage);
                    break;
                case ERROR:
                    Log.e(tag, message);
                    Log.e(tag, objectInformationMessage);
                    break;
                case WARN:
                    Log.w(tag, message);
                    Log.w(tag, objectInformationMessage);
                    break;
            }
            Print.print(logSeparator, className, arrayList, startIndex, endIndex);
        }
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
     * @param comment
     */
    static void seperate(LogSeparator logSeparator, String className, String methodName, int lineNumber, ArrayList<?> arrayList, int startIndex, int endIndex, String comment) {
        if (isNull(arrayList)) {
            seperate(logSeparator, className, methodName, lineNumber, NULL_MESSAGE);
        } else {
            String message = "METHOD: " + methodName
                    + ", LINE: " + lineNumber;
            String objectInformationMessage = "<<------------------------- " + arrayList.get(0).getClass().getSimpleName() + " ------------------------->> START INDEX: " + startIndex + ", END INDEX: " + endIndex;
            String commentMessage = "COMMENT: " + comment;
            switch (logSeparator) {
                case DEBUG:
                    Log.d(className, message);
                    Log.d(className, objectInformationMessage);
                    Log.d(className, commentMessage);
                    break;
                case INFO:
                    Log.i(className, message);
                    Log.i(className, objectInformationMessage);
                    Log.i(className, commentMessage);
                    break;
                case ERROR:
                    Log.e(className, message);
                    Log.e(className, objectInformationMessage);
                    Log.e(className, commentMessage);
                    break;
                case WARN:
                    Log.w(className, message);
                    Log.w(className, objectInformationMessage);
                    Log.w(className, commentMessage);
                    break;
            }
            Print.print(logSeparator, className, arrayList, startIndex, endIndex);
        }
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
    static void seperate(LogSeparator logSeparator, String className, String methodName, int lineNumber, String tag, ArrayList<?> arrayList, int startIndex, int endIndex, String comment) {
        if (isNull(arrayList)) {
            seperate(logSeparator, className, methodName, lineNumber, NULL_MESSAGE);
        } else {
            String message = "CLASS: " + className +
                    ", METHOD: " + methodName
                    + ", LINE: " + lineNumber;
            String objectInformationMessage = "<<------------------------- " + arrayList.get(0).getClass().getSimpleName() + " ------------------------->> START INDEX: " + startIndex + ", END INDEX: " + endIndex;
            String commentMessage = "COMMENT: " + comment;
            switch (logSeparator) {
                case DEBUG:
                    Log.d(tag, message);
                    Log.d(tag, objectInformationMessage);
                    Log.d(tag, commentMessage);
                    break;
                case INFO:
                    Log.i(tag, message);
                    Log.i(tag, objectInformationMessage);
                    Log.i(tag, commentMessage);
                    break;
                case ERROR:
                    Log.e(tag, message);
                    Log.e(tag, objectInformationMessage);
                    Log.e(tag, commentMessage);
                    break;
                case WARN:
                    Log.w(tag, message);
                    Log.w(tag, objectInformationMessage);
                    Log.w(tag, commentMessage);
                    break;
            }
            Print.print(logSeparator, tag, arrayList, startIndex, endIndex);
        }
    }

    private static boolean isNull(Object object) {
        return (object == null);
    }
}
