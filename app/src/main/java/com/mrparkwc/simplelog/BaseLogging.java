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
abstract class BaseLogging {

    private static final String MESSAGE_NULL = "Target is Null Point.";
    private static final String MESSAGE_EMPTY = "Target is Empty List.";

    /**
     * @return Class name
     */
    static String getClassName(String packageName) {
        String[] className = packageName.split("\\.");
        return className[className.length - 1];
    }


    static void separate(LogSeparator logSeparator, String className, String methodName, int lineNumber) {
        String message = "METHOD: " + methodName
                + ", LINE: " + lineNumber;
        Print.logSeparate(logSeparator, className, message);
    }

    /**
     * Print Form : Class Name : Method Name, Line, Comment
     */
    static void separate(LogSeparator logSeparator, String className, String methodName, int lineNumber, String comment) {
        if (isNull(comment)) {
            comment = MESSAGE_NULL;
        }
        String message = "METHOD: " + methodName
                + ", LINE: " + lineNumber + ", COMMENT: " + comment;
        Print.logSeparate(logSeparator, className, message);
    }

    /**
     * Print Form : Tag : Class Name , Method Name, Line, Comment
     */
    static void separate(LogSeparator logSeparator, String className, String methodName, int lineNumber, String tag, String comment) {
        if (isNull(comment)) {
            comment = MESSAGE_NULL;
        }
        String message = "CLASS: " + className +
                ", METHOD: " + methodName
                + ", LINE: " + lineNumber + ", COMMENT: " + comment;
        Print.logSeparate(logSeparator, tag, message);
    }

    /**
     * Print Form : Class Name : [Object Name], Variable Name, Value
     */
    static void separate(LogSeparator logSeparator, String className, String methodName, int lineNumber, Object object) {
        if (isNull(object)) {
            separate(logSeparator, className, methodName, lineNumber, MESSAGE_NULL);
        } else {
            String message = "METHOD: " + methodName
                    + ", LINE: " + lineNumber;
            String objectInformationMessage = "<<------------------------- " + object.getClass().getSimpleName() + " ------------------------->>";
            Print.logSeparate(logSeparator, className, message, objectInformationMessage);
            Print.print(logSeparator, className, object);
        }
    }

    /**
     * Print Form : Tag : [Object Name], Variable Name, Value
     */
    static void separate(LogSeparator logSeparator, String className, String methodName, int lineNumber, String tag, Object object) {
        if (isNull(object)) {
            separate(logSeparator, className, methodName, lineNumber, MESSAGE_NULL);
        } else {
            String message = "CLASS: " + className +
                    ", METHOD: " + methodName
                    + ", LINE: " + lineNumber;
            String objectInformationMessage = "<<------------------------- " + object.getClass().getSimpleName() + " ------------------------->>";
            Print.logSeparate(logSeparator, tag, message, objectInformationMessage);
            Print.print(logSeparator, tag, object);
        }
    }

    /**
     * Print Form : Class Name Comment ClassName : [Object Name], Variable Name, Value
     */
    static void separate(LogSeparator logSeparator, String className, String methodName, int lineNumber, Object object, String comment) {
        if (isNull(object)) {
            separate(logSeparator, className, methodName, lineNumber, MESSAGE_NULL);
        } else {
            String message = "METHOD: " + methodName
                    + ", LINE: " + lineNumber;
            String objectInformationMessage = "<<------------------------- " + object.getClass().getSimpleName() + " ------------------------->>";
            String commentMessage = "COMMENT: " + comment;
            Print.logSeparate(logSeparator, className, message, objectInformationMessage, commentMessage);
            Print.print(logSeparator, className, object);
        }
    }

    /**
     * Print Form : Class Name Comment Tag : [Object Name], Variable Name, Value
     */
    static void separate(LogSeparator logSeparator, String className, String methodName, int lineNumber, String tag, Object object, String comment) {
        if (isNull(object)) {
            separate(logSeparator, className, methodName, lineNumber, MESSAGE_NULL);
        } else {
            String message = "CLASS: " + className +
                    ", METHOD: " + methodName
                    + ", LINE: " + lineNumber;
            String objectInformationMessage = "<<------------------------- " + object.getClass().getSimpleName() + " ------------------------->>";
            String commentMessage = "COMMENT: " + comment;
            Print.logSeparate(logSeparator, tag, message, objectInformationMessage, commentMessage);
            Print.print(logSeparator, tag, object);
        }
    }

    /**
     * Print Form : Class Name : [Object Name] [ArrayList Index], Variable Name, Value
     */
    static void separate(LogSeparator logSeparator, String className, String methodName, int lineNumber, ArrayList<?> arrayList) {
        if (isNull(arrayList)) {
            separate(logSeparator, className, methodName, lineNumber, MESSAGE_NULL);
        } else if (arrayList.isEmpty()) {
            separate(logSeparator, className, methodName, lineNumber, MESSAGE_EMPTY);
        } else {
            String message = "METHOD: " + methodName
                    + ", LINE: " + lineNumber;
            String objectInformationMessage = "<<------------------------- " + arrayList.get(0).getClass().getSimpleName() + " ------------------------->> Size: " + arrayList.size();
            Print.logSeparate(logSeparator, className, message, objectInformationMessage);
            Print.print(logSeparator, className, arrayList);
        }
    }

    /**
     * Print Form : Tag : [Object Name] [ArrayList Index], Variable Name, Value
     */
    static void separate(LogSeparator logSeparator, String className, String methodName, int lineNumber, String tag, ArrayList<?> arrayList) {
        if (isNull(arrayList)) {
            separate(logSeparator, className, methodName, lineNumber, MESSAGE_NULL);
        } else if (arrayList.isEmpty()) {
            separate(logSeparator, className, methodName, lineNumber, MESSAGE_EMPTY);
        } else {
            String message = "CLASS: " + className +
                    ", METHOD: " + methodName
                    + ", LINE: " + lineNumber;
            String objectInformationMessage = "<<------------------------- " + arrayList.get(0).getClass().getSimpleName() + " ------------------------->> Size: " + arrayList.size();
            Print.logSeparate(logSeparator, tag, message, objectInformationMessage);
            Print.print(logSeparator, tag, arrayList);
        }
    }

    /**
     * Print Form : Class Name Comment Class Name : [Object Name] [ArrayList Index], Variable Name,
     * Value
     */
    static void separate(LogSeparator logSeparator, String className, String methodName, int lineNumber, ArrayList<?> arrayList, String comment) {
        if (isNull(arrayList)) {
            separate(logSeparator, className, methodName, lineNumber, MESSAGE_NULL);
        } else if (arrayList.isEmpty()) {
            separate(logSeparator, className, methodName, lineNumber, MESSAGE_EMPTY);
        } else {
            String message = "METHOD: " + methodName
                    + ", LINE: " + lineNumber;
            String objectInformationMessage = "<<------------------------- " + arrayList.get(0).getClass().getSimpleName() + " ------------------------->> Size: " + arrayList.size();
            String commentMessage = "COMMENT: " + comment;
            Print.logSeparate(logSeparator, className, message, objectInformationMessage, commentMessage);
            Print.print(logSeparator, className, arrayList);
        }
    }

    /**
     * Print Form : Class Name Comment Tag : [Object Name] [ArrayList Index], Variable Name, Value
     */
    static void separate(LogSeparator logSeparator, String className, String methodName, int lineNumber, String tag, ArrayList<?> arrayList, String comment) {
        if (isNull(arrayList)) {
            separate(logSeparator, className, methodName, lineNumber, MESSAGE_NULL);
        } else if (arrayList.isEmpty()) {
            separate(logSeparator, className, methodName, lineNumber, MESSAGE_EMPTY);
        } else {
            String message = "CLASS: " + className +
                    ", METHOD: " + methodName
                    + ", LINE: " + lineNumber;
            String objectInformationMessage = "<<------------------------- " + arrayList.get(0).getClass().getSimpleName() + " ------------------------->> Size: " + arrayList.size();
            String commentMessage = "COMMENT: " + comment;
            Print.logSeparate(logSeparator, tag, message, objectInformationMessage, commentMessage);
            Print.print(logSeparator, tag, arrayList);
        }
    }

    /**
     * Print Form : Class Name Class Name : [Object Name] [ArrayList Index], Variable Name, Value
     */
    static void separate(LogSeparator logSeparator, String className, String methodName, int lineNumber, ArrayList<?> arrayList, int index) {
        if (isNull(arrayList)) {
            separate(logSeparator, className, methodName, lineNumber, MESSAGE_NULL);
        } else if (arrayList.isEmpty()) {
            separate(logSeparator, className, methodName, lineNumber, MESSAGE_EMPTY);
        } else {
            String message = "METHOD: " + methodName
                    + ", LINE: " + lineNumber;
            String objectInformationMessage = "<<------------------------- " + arrayList.get(0).getClass().getSimpleName() + " ------------------------->> Index: " + index;
            Print.logSeparate(logSeparator, className, message, objectInformationMessage);
            Print.print(logSeparator, className, arrayList, index);
        }
    }

    /**
     * Print Form : Class Name, Index Tag : [Object Name] [ArrayList Index], Variable Name, Value
     */
    static void separate(LogSeparator logSeparator, String className, String methodName, int lineNumber, String tag, ArrayList<?> arrayList, int index) {
        if (isNull(arrayList)) {
            separate(logSeparator, className, methodName, lineNumber, MESSAGE_NULL);
        } else if (arrayList.isEmpty()) {
            separate(logSeparator, className, methodName, lineNumber, MESSAGE_EMPTY);
        } else {
            String message = "CLASS: " + className +
                    ", METHOD: " + methodName
                    + ", LINE: " + lineNumber;
            String objectInformationMessage = "<<------------------------- " + arrayList.get(0).getClass().getSimpleName() + " ------------------------->> Index: " + index;
            Print.logSeparate(logSeparator, tag, message, objectInformationMessage);
            Print.print(logSeparator, tag, arrayList, index);
        }
    }

    /**
     * Print Form : Class Name, Index Comment Class Name : [Object Name] [ArrayList Index], Variable
     * Name, Value
     */
    static void separate(LogSeparator logSeparator, String className, String methodName, int lineNumber, ArrayList<?> arrayList, int index, String comment) {
        if (isNull(arrayList)) {
            separate(logSeparator, className, methodName, lineNumber, MESSAGE_NULL);
        } else if (arrayList.isEmpty()) {
            separate(logSeparator, className, methodName, lineNumber, MESSAGE_EMPTY);
        } else {
            String message = "METHOD: " + methodName
                    + ", LINE: " + lineNumber;
            String objectInformationMessage = "<<------------------------- " + arrayList.get(0).getClass().getSimpleName() + " ------------------------->> Index: " + index;
            String commentMessage = "COMMENT: " + comment;
            Print.logSeparate(logSeparator, className, message, objectInformationMessage, commentMessage);
            Print.print(logSeparator, className, arrayList, index);
        }
    }

    /**
     * Print Form : Class Name, Index Comment Tag : [Object Name] [ArrayList Index], Variable Name,
     * Value
     */
    static void separate(LogSeparator logSeparator, String className, String methodName, int lineNumber, String tag, ArrayList<?> arrayList, int index, String comment) {
        if (isNull(arrayList)) {
            separate(logSeparator, className, methodName, lineNumber, MESSAGE_NULL);
        } else if (arrayList.isEmpty()) {
            separate(logSeparator, className, methodName, lineNumber, MESSAGE_EMPTY);
        } else {
            String message = "CLASS: " + className +
                    ", METHOD: " + methodName
                    + ", LINE: " + lineNumber;
            String objectInformationMessage = "<<------------------------- " + arrayList.get(0).getClass().getSimpleName() + " ------------------------->> Index: " + index;
            String commentMessage = "COMMENT: " + comment;
            Print.logSeparate(logSeparator, tag, message, objectInformationMessage, commentMessage);
            Print.print(logSeparator, tag, arrayList, index);
        }
    }

    /**
     * Print Form : Class Name, Start Index,End Index Comment Class Name : [Object Name] [ArrayList
     * Index], Variable Name, Value
     */
    static void separate(LogSeparator logSeparator, String className, String methodName, int lineNumber, ArrayList<?> arrayList, int startIndex, int endIndex) {
        if (isNull(arrayList)) {
            separate(logSeparator, className, methodName, lineNumber, MESSAGE_NULL);
        } else if (arrayList.isEmpty()) {
            separate(logSeparator, className, methodName, lineNumber, MESSAGE_EMPTY);
        } else {
            String message = "METHOD: " + methodName
                    + ", LINE: " + lineNumber;
            String objectInformationMessage = "<<------------------------- " + arrayList.get(0).getClass().getSimpleName() + " ------------------------->> START INDEX: " + startIndex + ", END INDEX: " + endIndex;
            Print.logSeparate(logSeparator, className, message, objectInformationMessage);
            Print.print(logSeparator, className, arrayList, startIndex, endIndex);
        }
    }


    /**
     * Print Form : Class Name, Start Index,End Index Comment Class Name : [Object Name] [ArrayList
     * Index], Variable Name, Value
     */
    static void separate(LogSeparator logSeparator, String className, String methodName, int lineNumber, String tag, ArrayList<?> arrayList, int startIndex, int endIndex) {
        if (isNull(arrayList)) {
            separate(logSeparator, className, methodName, lineNumber, MESSAGE_NULL);
        } else if (arrayList.isEmpty()) {
            separate(logSeparator, className, methodName, lineNumber, MESSAGE_EMPTY);
        } else {
            String message = "CLASS: " + className +
                    ", METHOD: " + methodName
                    + ", LINE: " + lineNumber;
            String objectInformationMessage = "<<------------------------- " + arrayList.get(0).getClass().getSimpleName() + " ------------------------->> START INDEX: " + startIndex + ", END INDEX: " + endIndex;
            Print.logSeparate(logSeparator, tag, message, objectInformationMessage);
            Print.print(logSeparator, className, arrayList, startIndex, endIndex);
        }
    }


    /**
     * Print Form : Class Name, Start Index,End Index Comment Class Name : [Object Name] [ArrayList
     * Index], Variable Name, Value
     */
    static void separate(LogSeparator logSeparator, String className, String methodName, int lineNumber, ArrayList<?> arrayList, int startIndex, int endIndex, String comment) {
        if (isNull(arrayList)) {
            separate(logSeparator, className, methodName, lineNumber, MESSAGE_NULL);
        } else if (arrayList.isEmpty()) {
            separate(logSeparator, className, methodName, lineNumber, MESSAGE_EMPTY);
        } else {
            String message = "METHOD: " + methodName
                    + ", LINE: " + lineNumber;
            String objectInformationMessage = "<<------------------------- " + arrayList.get(0).getClass().getSimpleName() + " ------------------------->> START INDEX: " + startIndex + ", END INDEX: " + endIndex;
            String commentMessage = "COMMENT: " + comment;
            Print.logSeparate(logSeparator, className, message, objectInformationMessage, commentMessage);
            Print.print(logSeparator, className, arrayList, startIndex, endIndex);
        }
    }

    /**
     * Print Form : Class Name, Start Index,End Index Comment Tag : [Object Name] [ArrayList Index],
     * Variable Name, Value
     */
    static void separate(LogSeparator logSeparator, String className, String methodName, int lineNumber, String tag, ArrayList<?> arrayList, int startIndex, int endIndex, String comment) {
        if (isNull(arrayList)) {
            separate(logSeparator, className, methodName, lineNumber, MESSAGE_NULL);
        } else if (arrayList.isEmpty()) {
            separate(logSeparator, className, methodName, lineNumber, MESSAGE_EMPTY);
        } else {
            String message = "CLASS: " + className +
                    ", METHOD: " + methodName
                    + ", LINE: " + lineNumber;
            String objectInformationMessage = "<<------------------------- " + arrayList.get(0).getClass().getSimpleName() + " ------------------------->> START INDEX: " + startIndex + ", END INDEX: " + endIndex;
            String commentMessage = "COMMENT: " + comment;
            Print.logSeparate(logSeparator, tag, message, objectInformationMessage, commentMessage);
            Print.print(logSeparator, tag, arrayList, startIndex, endIndex);
        }
    }

    /**
     * @return logMessage
     */
    static String getLogMessage(String className, String methodName, int lineNumber) {
        String message = "METHOD: " + methodName
                + ", LINE: " + lineNumber;
        return Message.getBasicMessage(className, message);
    }

    /**
     * @return Print Form : Class Name : Method Name, Line, Comment
     */
    static String getLogMessage(String className, String methodName, int lineNumber, String comment) {
        if (isNull(comment)) {
            comment = MESSAGE_NULL;
        }
        String message = "METHOD: " + methodName
                + ", LINE: " + lineNumber + ", COMMENT: " + comment;
        return Message.getBasicMessage(className, message);
    }

    /**
     * @return Print Form : Tag : Class Name , Method Name, Line, Comment
     */
    static String getLogMessage(String className, String methodName, int lineNumber, String tag, String comment) {
        if (isNull(comment)) {
            comment = MESSAGE_NULL;
        }
        String message = "CLASS: " + className +
                ", METHOD: " + methodName
                + ", LINE: " + lineNumber + ", COMMENT: " + comment;
        return Message.getBasicMessage(className, message);
    }

    /**
     * @return Print Form : Class Name : [Object Name], Variable Name, Value
     */
    static String getLogMessage(String className, String methodName, int lineNumber, Object object) {
        if (isNull(object)) {
            return getLogMessage(className, methodName, lineNumber, MESSAGE_NULL);
        } else {
            String message = "METHOD: " + methodName
                    + ", LINE: " + lineNumber;
            String objectInformationMessage = "<<------------------------- " + object.getClass().getSimpleName() + " ------------------------->>";
            return Message.getBasicMessage(className, message, objectInformationMessage) + "\n" +
                    Message.getObjectInformationMessage(className, object);
        }
    }

    /**
     * @return Print Form : Tag : [Object Name], Variable Name, Value
     */
    static String getLogMessage(String className, String methodName, int lineNumber, String tag, Object object) {
        if (isNull(object)) {
            return getLogMessage(className, methodName, lineNumber, MESSAGE_NULL);
        } else {
            String message = "CLASS: " + className +
                    ", METHOD: " + methodName
                    + ", LINE: " + lineNumber;
            String objectInformationMessage = "<<------------------------- " + object.getClass().getSimpleName() + " ------------------------->>";
            return Message.getBasicMessage(tag, message, objectInformationMessage) + "\n" +
                    Message.getObjectInformationMessage(tag, object);
        }
    }

    /**
     * @return Print Form : Class Name Comment ClassName : [Object Name], Variable Name, Value
     */
    static String getLogMessage(String className, String methodName, int lineNumber, Object object, String comment) {
        if (isNull(object)) {
            return getLogMessage(className, methodName, lineNumber, MESSAGE_NULL);
        } else {
            String message = "METHOD: " + methodName
                    + ", LINE: " + lineNumber;
            String objectInformationMessage = "<<------------------------- " + object.getClass().getSimpleName() + " ------------------------->>";
            String commentMessage = "COMMENT: " + comment;
            return Message.getBasicMessage(className, message, objectInformationMessage, commentMessage) + "\n" +
                    Message.getObjectInformationMessage(className, object);
        }
    }

    /**
     * @return Print Form : Class Name Comment Tag : [Object Name], Variable Name, Value
     */
    static String getLogMessage(String className, String methodName, int lineNumber, String tag, Object object, String comment) {
        if (isNull(object)) {
            return getLogMessage(className, methodName, lineNumber, MESSAGE_NULL);
        } else {
            String message = "CLASS: " + className +
                    ", METHOD: " + methodName
                    + ", LINE: " + lineNumber;
            String objectInformationMessage = "<<------------------------- " + object.getClass().getSimpleName() + " ------------------------->>";
            String commentMessage = "COMMENT: " + comment;
            return Message.getBasicMessage(tag, message, objectInformationMessage, commentMessage) + "\n" +
                    Message.getObjectInformationMessage(tag, object);
        }
    }

    /**
     * @return Print Form : Class Name : [Object Name] [ArrayList Index], Variable Name, Value
     */
    static String getLogMessage(String className, String methodName, int lineNumber, ArrayList<?> arrayList) {
        if (isNull(arrayList)) {
            return getLogMessage(className, methodName, lineNumber, MESSAGE_NULL);
        } else if (arrayList.isEmpty()) {
            return getLogMessage(className, methodName, lineNumber, MESSAGE_EMPTY);
        } else {
            String message = "METHOD: " + methodName
                    + ", LINE: " + lineNumber;
            String objectInformationMessage = "<<------------------------- " + arrayList.get(0).getClass().getSimpleName() + " ------------------------->> Size: " + arrayList.size();
            return Message.getBasicMessage(className, message, objectInformationMessage) + "\n" +
                    Message.getObjectInformationMessage(className, arrayList);
        }
    }

    /**
     * @return Print Form : Tag : [Object Name] [ArrayList Index], Variable Name, Value
     */
    static String getLogMessage(String className, String methodName, int lineNumber, String tag, ArrayList<?> arrayList) {
        if (isNull(arrayList)) {
            return getLogMessage(className, methodName, lineNumber, MESSAGE_NULL);
        } else if (arrayList.isEmpty()) {
            return getLogMessage(className, methodName, lineNumber, MESSAGE_EMPTY);
        } else {
            String message = "CLASS: " + className +
                    ", METHOD: " + methodName
                    + ", LINE: " + lineNumber;
            String objectInformationMessage = "<<------------------------- " + arrayList.get(0).getClass().getSimpleName() + " ------------------------->> Size: " + arrayList.size();
            return Message.getBasicMessage(tag, message, objectInformationMessage) + "\n" +
                    Message.getObjectInformationMessage(tag, arrayList);
        }
    }

    /**
     * @return Print Form : Class Name Comment Class Name : [Object Name] [ArrayList Index], Variable
     * Name, Value
     */
    static String getLogMessage(String className, String methodName, int lineNumber, ArrayList<?> arrayList, String comment) {
        if (isNull(arrayList)) {
            return getLogMessage(className, methodName, lineNumber, MESSAGE_NULL);
        } else if (arrayList.isEmpty()) {
            return getLogMessage(className, methodName, lineNumber, MESSAGE_EMPTY);
        } else {
            String message = "METHOD: " + methodName
                    + ", LINE: " + lineNumber;
            String objectInformationMessage = "<<------------------------- " + arrayList.get(0).getClass().getSimpleName() + " ------------------------->> Size: " + arrayList.size();
            String commentMessage = "COMMENT: " + comment;
            return Message.getBasicMessage(className, message, objectInformationMessage, commentMessage) + "\n" +
                    Message.getObjectInformationMessage(className, arrayList);
        }
    }

    /**
     * @return Print Form : Class Name Comment Tag : [Object Name] [ArrayList Index], Variable Name,
     * Value
     */
    static String getLogMessage(String className, String methodName, int lineNumber, String tag, ArrayList<?> arrayList, String comment) {
        if (isNull(arrayList)) {
            return getLogMessage(className, methodName, lineNumber, MESSAGE_NULL);
        } else if (arrayList.isEmpty()) {
            return getLogMessage(className, methodName, lineNumber, MESSAGE_EMPTY);
        } else {
            String message = "CLASS: " + className +
                    ", METHOD: " + methodName
                    + ", LINE: " + lineNumber;
            String objectInformationMessage = "<<------------------------- " + arrayList.get(0).getClass().getSimpleName() + " ------------------------->> Size: " + arrayList.size();
            String commentMessage = "COMMENT: " + comment;
            return Message.getBasicMessage(tag, message, objectInformationMessage, commentMessage) + "\n" +
                    Message.getObjectInformationMessage(className, arrayList);
        }
    }

    /**
     * @return Print Form : Class Name Class Name : [Object Name] [ArrayList Index], Variable Name,
     * Value
     */
    static String getLogMessage(String className, String methodName, int lineNumber, ArrayList<?> arrayList, int index) {
        if (isNull(arrayList)) {
            return getLogMessage(className, methodName, lineNumber, MESSAGE_NULL);
        } else if (arrayList.isEmpty()) {
            return getLogMessage(className, methodName, lineNumber, MESSAGE_EMPTY);
        } else {
            String message = "METHOD: " + methodName
                    + ", LINE: " + lineNumber;
            String objectInformationMessage = "<<------------------------- " + arrayList.get(0).getClass().getSimpleName() + " ------------------------->> Index: " + index;
            return Message.getBasicMessage(className, message, objectInformationMessage) + "\n" +
                    Message.getObjectInformationMessage(className, arrayList, index);
        }
    }

    /**
     * @return Print Form : Class Name, Index Tag : [Object Name] [ArrayList Index], Variable Name,
     * Value
     */
    static String getLogMessage(String className, String methodName, int lineNumber, String tag, ArrayList<?> arrayList, int index) {
        if (isNull(arrayList)) {
            return getLogMessage(className, methodName, lineNumber, MESSAGE_NULL);
        } else if (arrayList.isEmpty()) {
            return getLogMessage(className, methodName, lineNumber, MESSAGE_EMPTY);
        } else {
            String message = "CLASS: " + className +
                    ", METHOD: " + methodName
                    + ", LINE: " + lineNumber;
            String objectInformationMessage = "<<------------------------- " + arrayList.get(0).getClass().getSimpleName() + " ------------------------->> Index: " + index;
            return Message.getBasicMessage(tag, message, objectInformationMessage) + "\n" +
                    Message.getObjectInformationMessage(tag, arrayList, index);
        }
    }

    /**
     * @return Print Form : Class Name, Index Comment Class Name : [Object Name] [ArrayList Index],
     * Variable Name, Value
     */
    static String getLogMessage(String className, String methodName, int lineNumber, ArrayList<?> arrayList, int index, String comment) {
        if (isNull(arrayList)) {
            return getLogMessage(className, methodName, lineNumber, MESSAGE_NULL);
        } else if (arrayList.isEmpty()) {
            return getLogMessage(className, methodName, lineNumber, MESSAGE_EMPTY);
        } else {
            String message = "METHOD: " + methodName
                    + ", LINE: " + lineNumber;
            String objectInformationMessage = "<<------------------------- " + arrayList.get(0).getClass().getSimpleName() + " ------------------------->> Index: " + index;
            String commentMessage = "COMMENT: " + comment;
            return Message.getBasicMessage(className, message, objectInformationMessage, commentMessage) + "\n" +
                    Message.getObjectInformationMessage(className, arrayList, index);
        }
    }

    /**
     * @return Print Form : Class Name, Index Comment Tag : [Object Name] [ArrayList Index], Variable
     * Name, Value
     */
    static String getLogMessage(String className, String methodName, int lineNumber, String tag, ArrayList<?> arrayList, int index, String comment) {
        if (isNull(arrayList)) {
            return getLogMessage(className, methodName, lineNumber, MESSAGE_NULL);
        } else if (arrayList.isEmpty()) {
            return getLogMessage(className, methodName, lineNumber, MESSAGE_EMPTY);
        } else {
            String message = "CLASS: " + className +
                    ", METHOD: " + methodName
                    + ", LINE: " + lineNumber;
            String objectInformationMessage = "<<------------------------- " + arrayList.get(0).getClass().getSimpleName() + " ------------------------->> Index: " + index;
            String commentMessage = "COMMENT: " + comment;
            return Message.getBasicMessage(tag, message, objectInformationMessage, commentMessage) + "\n" +
                    Message.getObjectInformationMessage(tag, arrayList, index);
        }
    }

    /**
     * @return Print Form : Class Name, Start Index,End Index Comment Class Name : [Object Name]
     * [ArrayList Index], Variable Name, Value
     */
    static String getLogMessage(String className, String methodName, int lineNumber, ArrayList<?> arrayList, int startIndex, int endIndex) {
        if (isNull(arrayList)) {
            return getLogMessage(className, methodName, lineNumber, MESSAGE_NULL);
        } else if (arrayList.isEmpty()) {
            return getLogMessage(className, methodName, lineNumber, MESSAGE_EMPTY);
        } else {
            String message = "METHOD: " + methodName
                    + ", LINE: " + lineNumber;
            String objectInformationMessage = "<<------------------------- " + arrayList.get(0).getClass().getSimpleName() + " ------------------------->> START INDEX: " + startIndex + ", END INDEX: " + endIndex;
            return Message.getBasicMessage(className, message, objectInformationMessage) + "\n" +
                    Message.getObjectInformationMessage(className, arrayList, startIndex, endIndex);
        }
    }


    /**
     * @return Print Form : Class Name, Start Index,End Index Comment Class Name : [Object Name]
     * [ArrayList Index], Variable Name, Value
     */
    static String getLogMessage(String className, String methodName, int lineNumber, String tag, ArrayList<?> arrayList, int startIndex, int endIndex) {
        if (isNull(arrayList)) {
            return getLogMessage(className, methodName, lineNumber, MESSAGE_NULL);
        } else if (arrayList.isEmpty()) {
            return getLogMessage(className, methodName, lineNumber, MESSAGE_EMPTY);
        } else {
            String message = "CLASS: " + className +
                    ", METHOD: " + methodName
                    + ", LINE: " + lineNumber;
            String objectInformationMessage = "<<------------------------- " + arrayList.get(0).getClass().getSimpleName() + " ------------------------->> START INDEX: " + startIndex + ", END INDEX: " + endIndex;
            return Message.getBasicMessage(tag, message, objectInformationMessage) + "\n" +
                    Message.getObjectInformationMessage(className, arrayList, startIndex, endIndex);
        }
    }


    /**
     * @return Print Form : Class Name, Start Index,End Index Comment Class Name : [Object Name]
     * [ArrayList Index], Variable Name, Value
     */
    static String getLogMessage(String className, String methodName, int lineNumber, ArrayList<?> arrayList, int startIndex, int endIndex, String comment) {
        if (isNull(arrayList)) {
            return getLogMessage(className, methodName, lineNumber, MESSAGE_NULL);
        } else if (arrayList.isEmpty()) {
            return getLogMessage(className, methodName, lineNumber, MESSAGE_EMPTY);
        } else {
            String message = "METHOD: " + methodName
                    + ", LINE: " + lineNumber;
            String objectInformationMessage = "<<------------------------- " + arrayList.get(0).getClass().getSimpleName() + " ------------------------->> START INDEX: " + startIndex + ", END INDEX: " + endIndex;
            String commentMessage = "COMMENT: " + comment;
            return Message.getBasicMessage(className, message, objectInformationMessage, commentMessage) + "\n" +
                    Message.getObjectInformationMessage(className, arrayList, startIndex, endIndex);
        }
    }

    /**
     * @return Print Form : Class Name, Start Index,End Index Comment Tag : [Object Name] [ArrayList
     * Index], Variable Name, Value
     */
    static String getLogMessage(String className, String methodName, int lineNumber, String tag, ArrayList<?> arrayList, int startIndex, int endIndex, String comment) {
        if (isNull(arrayList)) {
            return getLogMessage(className, methodName, lineNumber, MESSAGE_NULL);
        } else if (arrayList.isEmpty()) {
            return getLogMessage(className, methodName, lineNumber, MESSAGE_EMPTY);
        } else {
            String message = "CLASS: " + className +
                    ", METHOD: " + methodName
                    + ", LINE: " + lineNumber;
            String objectInformationMessage = "<<------------------------- " + arrayList.get(0).getClass().getSimpleName() + " ------------------------->> START INDEX: " + startIndex + ", END INDEX: " + endIndex;
            String commentMessage = "COMMENT: " + comment;
            return Message.getBasicMessage(tag, message, objectInformationMessage, commentMessage) + "\n" +
                    Message.getObjectInformationMessage(tag, arrayList, startIndex, endIndex);
        }
    }


    private static boolean isNull(Object object) {
        return object == null;
    }
}
