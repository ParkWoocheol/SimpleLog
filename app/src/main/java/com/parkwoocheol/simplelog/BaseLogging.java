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
abstract class BaseLogging {


    private static final String PREFIX_CLASS = "class: ";
    private static final String PREFIX_METHOD = "method: ";
    private static final String PREFIX_LINE = "line: ";
    private static final String PREFIX_COMMENT = "comment: ";
    private static final String PREFIX_SIZE = "size: ";
    private static final String PREFIX_INDEX = "index: ";
    private static final String PREFIX_START_INDEX = "start index: ";
    private static final String PREFIX_END_INDEX = "end index: ";
    private static final String LEFT_ARROW_LINE_SEPARATOR = "<<------------------------- ";
    private static final String RIGHT_ARROW_LINE_SEPARATOR = " ------------------------->>";

    private static final String MESSAGE_NULL = "Target is Null Point.";
    private static final String MESSAGE_EMPTY = "Target is Empty List.";

    /**
     * @return Class name
     */
    static String getSimpleClassName(String packageName) {
        String[] className = packageName.split("\\.");
        return className[className.length - 1];
    }


    static void separate(LogSeparator logSeparator, Logging.ClassInfo classInfo) {
        String message = PREFIX_METHOD + classInfo.getMethodName()
                + ", " + PREFIX_LINE + classInfo.getLineNumber();
        Print.logSeparate(logSeparator, classInfo.getClassName(), message);
    }

    /**
     * Print Form : Class Name : Method Name, Line, Comment
     */
    static void separate(LogSeparator logSeparator, Logging.ClassInfo classInfo, String comment) {
        if (isNull(comment)) {
            comment = MESSAGE_NULL;
        }
        String message = PREFIX_METHOD + classInfo.getMethodName()
                + ", " + PREFIX_LINE + classInfo.getLineNumber() + ", " + PREFIX_COMMENT + comment;
        Print.logSeparate(logSeparator, classInfo.getClassName(), message);
    }

    /**
     * Print Form : Tag : Class Name , Method Name, Line, Comment
     */
    static void separate(LogSeparator logSeparator, Logging.ClassInfo classInfo, String tag, String comment) {
        if (isNull(comment)) {
            comment = MESSAGE_NULL;
        }
        String message = PREFIX_CLASS + classInfo.getClassName() +
                ", " + PREFIX_METHOD + classInfo.getMethodName()
                + ", " + PREFIX_LINE + classInfo.getLineNumber() + ", " + PREFIX_COMMENT + comment;
        Print.logSeparate(logSeparator, tag, message);
    }

    /**
     * Print Form : Class Name : [Object Name], Variable Name, Value
     */
    static void separate(LogSeparator logSeparator, Logging.ClassInfo classInfo, Object object) {
        if (isNull(object)) {
            separate(logSeparator, classInfo, MESSAGE_NULL);
        } else {
            String message = PREFIX_METHOD + classInfo.getMethodName()
                    + ", " + PREFIX_LINE + classInfo.getLineNumber();
            String objectInformationMessage = LEFT_ARROW_LINE_SEPARATOR + object.getClass().getSimpleName() + RIGHT_ARROW_LINE_SEPARATOR;
            Print.logSeparate(logSeparator, classInfo.getClassName(), message, objectInformationMessage);
            Print.print(logSeparator, classInfo.getClassName(), object);
        }
    }

    /**
     * Print Form : Tag : [Object Name], Variable Name, Value
     */
    static void separate(LogSeparator logSeparator, Logging.ClassInfo classInfo, String tag, Object object) {
        if (isNull(object)) {
            separate(logSeparator, classInfo, MESSAGE_NULL);
        } else {
            String message = PREFIX_CLASS + classInfo.getClassName() +
                    ", " + PREFIX_METHOD + classInfo.getMethodName()
                    + ", " + PREFIX_LINE + classInfo.getLineNumber();
            String objectInformationMessage = LEFT_ARROW_LINE_SEPARATOR + object.getClass().getSimpleName() + RIGHT_ARROW_LINE_SEPARATOR;
            Print.logSeparate(logSeparator, tag, message, objectInformationMessage);
            Print.print(logSeparator, tag, object);
        }
    }

    /**
     * Print Form : Class Name Comment ClassName : [Object Name], Variable Name, Value
     */
    static void separate(LogSeparator logSeparator, Logging.ClassInfo classInfo, Object object, String comment) {
        if (isNull(object)) {
            separate(logSeparator, classInfo, MESSAGE_NULL);
        } else {
            String message = PREFIX_METHOD + classInfo.getMethodName()
                    + ", " + PREFIX_LINE + classInfo.getLineNumber();
            String objectInformationMessage = LEFT_ARROW_LINE_SEPARATOR + object.getClass().getSimpleName() + RIGHT_ARROW_LINE_SEPARATOR;
            String commentMessage = PREFIX_COMMENT + comment;
            Print.logSeparate(logSeparator, classInfo.getClassName(), message, objectInformationMessage, commentMessage);
            Print.print(logSeparator, classInfo.getClassName(), object);
        }
    }

    /**
     * Print Form : Class Name Comment Tag : [Object Name], Variable Name, Value
     */
    static void separate(LogSeparator logSeparator, Logging.ClassInfo classInfo, String tag, Object object, String comment) {
        if (isNull(object)) {
            separate(logSeparator, classInfo, MESSAGE_NULL);
        } else {
            String message = PREFIX_CLASS + classInfo.getClassName() +
                    ", " + PREFIX_METHOD + classInfo.getMethodName()
                    + ", " + PREFIX_LINE + classInfo.getLineNumber();
            String objectInformationMessage = LEFT_ARROW_LINE_SEPARATOR + object.getClass().getSimpleName() + RIGHT_ARROW_LINE_SEPARATOR;
            String commentMessage = PREFIX_COMMENT + comment;
            Print.logSeparate(logSeparator, tag, message, objectInformationMessage, commentMessage);
            Print.print(logSeparator, tag, object);
        }
    }

    /**
     * Print Form : Class Name : [Object Name] [ArrayList Index], Variable Name, Value
     */
    static void separate(LogSeparator logSeparator, Logging.ClassInfo classInfo, ArrayList<?> arrayList) {
        if (isNull(arrayList)) {
            separate(logSeparator, classInfo, MESSAGE_NULL);
        } else if (arrayList.isEmpty()) {
            separate(logSeparator, classInfo, MESSAGE_EMPTY);
        } else {
            String message = PREFIX_METHOD + classInfo.getMethodName()
                    + ", " + PREFIX_LINE + classInfo.getLineNumber();
            String objectInformationMessage = LEFT_ARROW_LINE_SEPARATOR + arrayList.get(0).getClass().getSimpleName() + RIGHT_ARROW_LINE_SEPARATOR + PREFIX_SIZE + arrayList.size();
            Print.logSeparate(logSeparator, classInfo.getClassName(), message, objectInformationMessage);
            Print.print(logSeparator, classInfo.getClassName(), arrayList);
        }
    }

    /**
     * Print Form : Tag : [Object Name] [ArrayList Index], Variable Name, Value
     */
    static void separate(LogSeparator logSeparator, Logging.ClassInfo classInfo, String tag, ArrayList<?> arrayList) {
        if (isNull(arrayList)) {
            separate(logSeparator, classInfo, MESSAGE_NULL);
        } else if (arrayList.isEmpty()) {
            separate(logSeparator, classInfo, MESSAGE_EMPTY);
        } else {
            String message = PREFIX_CLASS + classInfo.getClassName() +
                    ", " + PREFIX_METHOD + classInfo.getMethodName()
                    + ", " + PREFIX_LINE + classInfo.getLineNumber();
            String objectInformationMessage = LEFT_ARROW_LINE_SEPARATOR + arrayList.get(0).getClass().getSimpleName() + RIGHT_ARROW_LINE_SEPARATOR + PREFIX_SIZE + arrayList.size();
            Print.logSeparate(logSeparator, tag, message, objectInformationMessage);
            Print.print(logSeparator, tag, arrayList);
        }
    }

    /**
     * Print Form : Class Name Comment Class Name : [Object Name] [ArrayList Index], Variable Name,
     * Value
     */
    static void separate(LogSeparator logSeparator, Logging.ClassInfo classInfo, ArrayList<?> arrayList, String comment) {
        if (isNull(arrayList)) {
            separate(logSeparator, classInfo, MESSAGE_NULL);
        } else if (arrayList.isEmpty()) {
            separate(logSeparator, classInfo, MESSAGE_EMPTY);
        } else {
            String message = PREFIX_METHOD + classInfo.getMethodName()
                    + ", " + PREFIX_LINE + classInfo.getLineNumber();
            String objectInformationMessage = LEFT_ARROW_LINE_SEPARATOR + arrayList.get(0).getClass().getSimpleName() + RIGHT_ARROW_LINE_SEPARATOR + PREFIX_SIZE + arrayList.size();
            String commentMessage = PREFIX_COMMENT + comment;
            Print.logSeparate(logSeparator, classInfo.getClassName(), message, objectInformationMessage, commentMessage);
            Print.print(logSeparator, classInfo.getClassName(), arrayList);
        }
    }

    /**
     * Print Form : Class Name Comment Tag : [Object Name] [ArrayList Index], Variable Name, Value
     */
    static void separate(LogSeparator logSeparator, Logging.ClassInfo classInfo, String tag, ArrayList<?> arrayList, String comment) {
        if (isNull(arrayList)) {
            separate(logSeparator, classInfo, MESSAGE_NULL);
        } else if (arrayList.isEmpty()) {
            separate(logSeparator, classInfo, MESSAGE_EMPTY);
        } else {
            String message = PREFIX_CLASS + classInfo.getClassName() +
                    ", " + PREFIX_METHOD + classInfo.getMethodName()
                    + ", " + PREFIX_LINE + classInfo.getLineNumber();
            String objectInformationMessage = LEFT_ARROW_LINE_SEPARATOR + arrayList.get(0).getClass().getSimpleName() + RIGHT_ARROW_LINE_SEPARATOR + PREFIX_SIZE + arrayList.size();
            String commentMessage = PREFIX_COMMENT + comment;
            Print.logSeparate(logSeparator, tag, message, objectInformationMessage, commentMessage);
            Print.print(logSeparator, tag, arrayList);
        }
    }

    /**
     * Print Form : Class Name Class Name : [Object Name] [ArrayList Index], Variable Name, Value
     */
    static void separate(LogSeparator logSeparator, Logging.ClassInfo classInfo, ArrayList<?> arrayList, int index) {
        if (isNull(arrayList)) {
            separate(logSeparator, classInfo, MESSAGE_NULL);
        } else if (arrayList.isEmpty()) {
            separate(logSeparator, classInfo, MESSAGE_EMPTY);
        } else {
            String message = PREFIX_METHOD + classInfo.getMethodName()
                    + ", " + PREFIX_LINE + classInfo.getLineNumber();
            String objectInformationMessage = LEFT_ARROW_LINE_SEPARATOR + arrayList.get(0).getClass().getSimpleName() + RIGHT_ARROW_LINE_SEPARATOR + PREFIX_INDEX + index;
            Print.logSeparate(logSeparator, classInfo.getClassName(), message, objectInformationMessage);
            Print.print(logSeparator, classInfo.getClassName(), arrayList, index);
        }
    }

    /**
     * Print Form : Class Name, Index Tag : [Object Name] [ArrayList Index], Variable Name, Value
     */
    static void separate(LogSeparator logSeparator, Logging.ClassInfo classInfo, String tag, ArrayList<?> arrayList, int index) {
        if (isNull(arrayList)) {
            separate(logSeparator, classInfo, MESSAGE_NULL);
        } else if (arrayList.isEmpty()) {
            separate(logSeparator, classInfo, MESSAGE_EMPTY);
        } else {
            String message = PREFIX_CLASS + classInfo.getClassName() +
                    ", " + PREFIX_METHOD + classInfo.getMethodName()
                    + ", " + PREFIX_LINE + classInfo.getLineNumber();
            String objectInformationMessage = LEFT_ARROW_LINE_SEPARATOR + arrayList.get(0).getClass().getSimpleName() + RIGHT_ARROW_LINE_SEPARATOR + PREFIX_INDEX + index;
            Print.logSeparate(logSeparator, tag, message, objectInformationMessage);
            Print.print(logSeparator, tag, arrayList, index);
        }
    }

    /**
     * Print Form : Class Name, Index Comment Class Name : [Object Name] [ArrayList Index], Variable
     * Name, Value
     */
    static void separate(LogSeparator logSeparator, Logging.ClassInfo classInfo, ArrayList<?> arrayList, int index, String comment) {
        if (isNull(arrayList)) {
            separate(logSeparator, classInfo, MESSAGE_NULL);
        } else if (arrayList.isEmpty()) {
            separate(logSeparator, classInfo, MESSAGE_EMPTY);
        } else {
            String message = PREFIX_METHOD + classInfo.getMethodName()
                    + ", " + PREFIX_LINE + classInfo.getLineNumber();
            String objectInformationMessage = LEFT_ARROW_LINE_SEPARATOR + arrayList.get(0).getClass().getSimpleName() + RIGHT_ARROW_LINE_SEPARATOR + PREFIX_INDEX + index;
            String commentMessage = PREFIX_COMMENT + comment;
            Print.logSeparate(logSeparator, classInfo.getClassName(), message, objectInformationMessage, commentMessage);
            Print.print(logSeparator, classInfo.getClassName(), arrayList, index);
        }
    }

    /**
     * Print Form : Class Name, Index Comment Tag : [Object Name] [ArrayList Index], Variable Name,
     * Value
     */
    static void separate(LogSeparator logSeparator, Logging.ClassInfo classInfo, String tag, ArrayList<?> arrayList, int index, String comment) {
        if (isNull(arrayList)) {
            separate(logSeparator, classInfo, MESSAGE_NULL);
        } else if (arrayList.isEmpty()) {
            separate(logSeparator, classInfo, MESSAGE_EMPTY);
        } else {
            String message = PREFIX_CLASS + classInfo.getClassName() +
                    ", " + PREFIX_METHOD + classInfo.getMethodName()
                    + ", " + PREFIX_LINE + classInfo.getLineNumber();
            String objectInformationMessage = LEFT_ARROW_LINE_SEPARATOR + arrayList.get(0).getClass().getSimpleName() + RIGHT_ARROW_LINE_SEPARATOR + PREFIX_INDEX + index;
            String commentMessage = PREFIX_COMMENT + comment;
            Print.logSeparate(logSeparator, tag, message, objectInformationMessage, commentMessage);
            Print.print(logSeparator, tag, arrayList, index);
        }
    }

    /**
     * Print Form : Class Name, Start Index,End Index Comment Class Name : [Object Name] [ArrayList
     * Index], Variable Name, Value
     */
    static void separate(LogSeparator logSeparator, Logging.ClassInfo classInfo, ArrayList<?> arrayList, int startIndex, int endIndex) {
        if (isNull(arrayList)) {
            separate(logSeparator, classInfo, MESSAGE_NULL);
        } else if (arrayList.isEmpty()) {
            separate(logSeparator, classInfo, MESSAGE_EMPTY);
        } else {
            String message = PREFIX_METHOD + classInfo.getMethodName()
                    + ", " + PREFIX_LINE + classInfo.getLineNumber();
            String objectInformationMessage = LEFT_ARROW_LINE_SEPARATOR + arrayList.get(0).getClass().getSimpleName() + RIGHT_ARROW_LINE_SEPARATOR + PREFIX_START_INDEX + startIndex + ", " + PREFIX_END_INDEX + endIndex;
            Print.logSeparate(logSeparator, classInfo.getClassName(), message, objectInformationMessage);
            Print.print(logSeparator, classInfo.getClassName(), arrayList, startIndex, endIndex);
        }
    }


    /**
     * Print Form : Class Name, Start Index,End Index Comment Class Name : [Object Name] [ArrayList
     * Index], Variable Name, Value
     */
    static void separate(LogSeparator logSeparator, Logging.ClassInfo classInfo, String tag, ArrayList<?> arrayList, int startIndex, int endIndex) {
        if (isNull(arrayList)) {
            separate(logSeparator, classInfo, MESSAGE_NULL);
        } else if (arrayList.isEmpty()) {
            separate(logSeparator, classInfo, MESSAGE_EMPTY);
        } else {
            String message = PREFIX_CLASS + classInfo.getClassName() +
                    ", " + PREFIX_METHOD + classInfo.getMethodName()
                    + ", " + PREFIX_LINE + classInfo.getLineNumber();
            String objectInformationMessage = LEFT_ARROW_LINE_SEPARATOR + arrayList.get(0).getClass().getSimpleName() + RIGHT_ARROW_LINE_SEPARATOR + PREFIX_START_INDEX + startIndex + ", " + PREFIX_END_INDEX + endIndex;
            Print.logSeparate(logSeparator, tag, message, objectInformationMessage);
            Print.print(logSeparator, classInfo.getClassName(), arrayList, startIndex, endIndex);
        }
    }


    /**
     * Print Form : Class Name, Start Index,End Index Comment Class Name : [Object Name] [ArrayList
     * Index], Variable Name, Value
     */
    static void separate(LogSeparator logSeparator, Logging.ClassInfo classInfo, ArrayList<?> arrayList, int startIndex, int endIndex, String comment) {
        if (isNull(arrayList)) {
            separate(logSeparator, classInfo, MESSAGE_NULL);
        } else if (arrayList.isEmpty()) {
            separate(logSeparator, classInfo, MESSAGE_EMPTY);
        } else {
            String message = PREFIX_METHOD + classInfo.getMethodName()
                    + ", " + PREFIX_LINE + classInfo.getLineNumber();
            String objectInformationMessage = LEFT_ARROW_LINE_SEPARATOR + arrayList.get(0).getClass().getSimpleName() + RIGHT_ARROW_LINE_SEPARATOR + PREFIX_START_INDEX + startIndex + ", " + PREFIX_END_INDEX + endIndex;
            String commentMessage = PREFIX_COMMENT + comment;
            Print.logSeparate(logSeparator, classInfo.getClassName(), message, objectInformationMessage, commentMessage);
            Print.print(logSeparator, classInfo.getClassName(), arrayList, startIndex, endIndex);
        }
    }

    /**
     * Print Form : Class Name, Start Index,End Index Comment Tag : [Object Name] [ArrayList Index],
     * Variable Name, Value
     */
    static void separate(LogSeparator logSeparator, Logging.ClassInfo classInfo, String tag, ArrayList<?> arrayList, int startIndex, int endIndex, String comment) {
        if (isNull(arrayList)) {
            separate(logSeparator, classInfo, MESSAGE_NULL);
        } else if (arrayList.isEmpty()) {
            separate(logSeparator, classInfo, MESSAGE_EMPTY);
        } else {
            String message = PREFIX_CLASS + classInfo.getClassName() +
                    ", " + PREFIX_METHOD + classInfo.getMethodName()
                    + ", " + PREFIX_LINE + classInfo.getLineNumber();
            String objectInformationMessage = LEFT_ARROW_LINE_SEPARATOR + arrayList.get(0).getClass().getSimpleName() + RIGHT_ARROW_LINE_SEPARATOR + PREFIX_START_INDEX + startIndex + ", " + PREFIX_END_INDEX + endIndex;
            String commentMessage = PREFIX_COMMENT + comment;
            Print.logSeparate(logSeparator, tag, message, objectInformationMessage, commentMessage);
            Print.print(logSeparator, tag, arrayList, startIndex, endIndex);
        }
    }

    /**
     * @return logMessage
     */
    static String getLogMessage(Logging.ClassInfo classInfo) {
        String message = PREFIX_METHOD + classInfo.getMethodName()
                + ", " + PREFIX_LINE + classInfo.getLineNumber();
        return Message.getBasicMessage(classInfo.getClassName(), message);
    }

    /**
     * @return Print Form : Class Name : Method Name, Line, Comment
     */
    static String getLogMessage(Logging.ClassInfo classInfo, String comment) {
        if (isNull(comment)) {
            comment = MESSAGE_NULL;
        }
        String message = PREFIX_METHOD + classInfo.getMethodName()
                + ", " + PREFIX_LINE + classInfo.getLineNumber() + ", " + PREFIX_COMMENT + comment;
        return Message.getBasicMessage(classInfo.getClassName(), message);
    }

    /**
     * @return Print Form : Tag : Class Name , Method Name, Line, Comment
     */
    static String getLogMessage(Logging.ClassInfo classInfo, String tag, String comment) {
        if (isNull(comment)) {
            comment = MESSAGE_NULL;
        }
        String message = PREFIX_CLASS + classInfo.getClassName() +
                ", " + PREFIX_METHOD + classInfo.getMethodName()
                + ", " + PREFIX_LINE + classInfo.getLineNumber() + ", " + PREFIX_COMMENT + comment;
        return Message.getBasicMessage(tag, classInfo.getClassName(), message);
    }

    /**
     * @return Print Form : Class Name : [Object Name], Variable Name, Value
     */
    static String getLogMessage(Logging.ClassInfo classInfo, Object object) {
        if (isNull(object)) {
            return getLogMessage(classInfo, MESSAGE_NULL);
        } else {
            String message = PREFIX_METHOD + classInfo.getMethodName()
                    + ", " + PREFIX_LINE + classInfo.getLineNumber();
            String objectInformationMessage = LEFT_ARROW_LINE_SEPARATOR + object.getClass().getSimpleName() + RIGHT_ARROW_LINE_SEPARATOR;
            return Message.getBasicMessage(classInfo.getClassName(), message, objectInformationMessage) + "\n" +
                    Message.getObjectInformationMessage(classInfo.getClassName(), object);
        }
    }

    /**
     * @return Print Form : Tag : [Object Name], Variable Name, Value
     */
    static String getLogMessage(Logging.ClassInfo classInfo, String tag, Object object) {
        if (isNull(object)) {
            return getLogMessage(classInfo, MESSAGE_NULL);
        } else {
            String message = PREFIX_CLASS + classInfo.getClassName() +
                    ", " + PREFIX_METHOD + classInfo.getMethodName()
                    + ", " + PREFIX_LINE + classInfo.getLineNumber();
            String objectInformationMessage = LEFT_ARROW_LINE_SEPARATOR + object.getClass().getSimpleName() + RIGHT_ARROW_LINE_SEPARATOR;
            return Message.getBasicMessage(tag, message, objectInformationMessage) + "\n" +
                    Message.getObjectInformationMessage(tag, object);
        }
    }

    /**
     * @return Print Form : Class Name Comment ClassName : [Object Name], Variable Name, Value
     */
    static String getLogMessage(Logging.ClassInfo classInfo, Object object, String comment) {
        if (isNull(object)) {
            return getLogMessage(classInfo, MESSAGE_NULL);
        } else {
            String message = PREFIX_METHOD + classInfo.getMethodName()
                    + ", " + PREFIX_LINE + classInfo.getLineNumber();
            String objectInformationMessage = LEFT_ARROW_LINE_SEPARATOR + object.getClass().getSimpleName() + RIGHT_ARROW_LINE_SEPARATOR;
            String commentMessage = PREFIX_COMMENT + comment;
            return Message.getBasicMessage(classInfo.getClassName(), message, objectInformationMessage, commentMessage) + "\n" +
                    Message.getObjectInformationMessage(classInfo.getClassName(), object);
        }
    }

    /**
     * @return Print Form : Class Name Comment Tag : [Object Name], Variable Name, Value
     */
    static String getLogMessage(Logging.ClassInfo classInfo, String tag, Object object, String comment) {
        if (isNull(object)) {
            return getLogMessage(classInfo, MESSAGE_NULL);
        } else {
            String message = PREFIX_CLASS + classInfo.getClassName() +
                    ", " + PREFIX_METHOD + classInfo.getMethodName()
                    + ", " + PREFIX_LINE + classInfo.getLineNumber();
            String objectInformationMessage = LEFT_ARROW_LINE_SEPARATOR + object.getClass().getSimpleName() + RIGHT_ARROW_LINE_SEPARATOR;
            String commentMessage = PREFIX_COMMENT + comment;
            return Message.getBasicMessage(tag, message, objectInformationMessage, commentMessage) + "\n" +
                    Message.getObjectInformationMessage(tag, object);
        }
    }

    /**
     * @return Print Form : Class Name : [Object Name] [ArrayList Index], Variable Name, Value
     */
    static String getLogMessage(Logging.ClassInfo classInfo, ArrayList<?> arrayList) {
        if (isNull(arrayList)) {
            return getLogMessage(classInfo, MESSAGE_NULL);
        } else if (arrayList.isEmpty()) {
            return getLogMessage(classInfo, MESSAGE_EMPTY);
        } else {
            String message = PREFIX_METHOD + classInfo.getMethodName()
                    + ", " + PREFIX_LINE + classInfo.getLineNumber();
            String objectInformationMessage = LEFT_ARROW_LINE_SEPARATOR + arrayList.get(0).getClass().getSimpleName() + RIGHT_ARROW_LINE_SEPARATOR + PREFIX_SIZE + arrayList.size();
            return Message.getBasicMessage(classInfo.getClassName(), message, objectInformationMessage) + "\n" +
                    Message.getObjectInformationMessage(classInfo.getClassName(), arrayList);
        }
    }

    /**
     * @return Print Form : Tag : [Object Name] [ArrayList Index], Variable Name, Value
     */
    static String getLogMessage(Logging.ClassInfo classInfo, String tag, ArrayList<?> arrayList) {
        if (isNull(arrayList)) {
            return getLogMessage(classInfo, MESSAGE_NULL);
        } else if (arrayList.isEmpty()) {
            return getLogMessage(classInfo, MESSAGE_EMPTY);
        } else {
            String message = PREFIX_CLASS + classInfo.getClassName() +
                    ", " + PREFIX_METHOD + classInfo.getMethodName()
                    + ", " + PREFIX_LINE + classInfo.getLineNumber();
            String objectInformationMessage = LEFT_ARROW_LINE_SEPARATOR + arrayList.get(0).getClass().getSimpleName() + RIGHT_ARROW_LINE_SEPARATOR + PREFIX_SIZE + arrayList.size();
            return Message.getBasicMessage(tag, message, objectInformationMessage) + "\n" +
                    Message.getObjectInformationMessage(tag, arrayList);
        }
    }

    /**
     * @return Print Form : Class Name Comment Class Name : [Object Name] [ArrayList Index], Variable
     * Name, Value
     */
    static String getLogMessage(Logging.ClassInfo classInfo, ArrayList<?> arrayList, String comment) {
        if (isNull(arrayList)) {
            return getLogMessage(classInfo, MESSAGE_NULL);
        } else if (arrayList.isEmpty()) {
            return getLogMessage(classInfo, MESSAGE_EMPTY);
        } else {
            String message = PREFIX_METHOD + classInfo.getMethodName()
                    + ", " + PREFIX_LINE + classInfo.getLineNumber();
            String objectInformationMessage = LEFT_ARROW_LINE_SEPARATOR + arrayList.get(0).getClass().getSimpleName() + RIGHT_ARROW_LINE_SEPARATOR + PREFIX_SIZE + arrayList.size();
            String commentMessage = PREFIX_COMMENT + comment;
            return Message.getBasicMessage(classInfo.getClassName(), message, objectInformationMessage, commentMessage) + "\n" +
                    Message.getObjectInformationMessage(classInfo.getClassName(), arrayList);
        }
    }

    /**
     * @return Print Form : Class Name Comment Tag : [Object Name] [ArrayList Index], Variable Name,
     * Value
     */
    static String getLogMessage(Logging.ClassInfo classInfo, String tag, ArrayList<?> arrayList, String comment) {
        if (isNull(arrayList)) {
            return getLogMessage(classInfo, MESSAGE_NULL);
        } else if (arrayList.isEmpty()) {
            return getLogMessage(classInfo, MESSAGE_EMPTY);
        } else {
            String message = PREFIX_CLASS + classInfo.getClassName() +
                    ", " + PREFIX_METHOD + classInfo.getMethodName()
                    + ", " + PREFIX_LINE + classInfo.getLineNumber();
            String objectInformationMessage = LEFT_ARROW_LINE_SEPARATOR + arrayList.get(0).getClass().getSimpleName() + RIGHT_ARROW_LINE_SEPARATOR + PREFIX_SIZE + arrayList.size();
            String commentMessage = PREFIX_COMMENT + comment;
            return Message.getBasicMessage(tag, message, objectInformationMessage, commentMessage) + "\n" +
                    Message.getObjectInformationMessage(classInfo.getClassName(), arrayList);
        }
    }

    /**
     * @return Print Form : Class Name Class Name : [Object Name] [ArrayList Index], Variable Name,
     * Value
     */
    static String getLogMessage(Logging.ClassInfo classInfo, ArrayList<?> arrayList, int index) {
        if (isNull(arrayList)) {
            return getLogMessage(classInfo, MESSAGE_NULL);
        } else if (arrayList.isEmpty()) {
            return getLogMessage(classInfo, MESSAGE_EMPTY);
        } else {
            String message = PREFIX_METHOD + classInfo.getMethodName()
                    + ", " + PREFIX_LINE + classInfo.getLineNumber();
            String objectInformationMessage = LEFT_ARROW_LINE_SEPARATOR + arrayList.get(0).getClass().getSimpleName() + RIGHT_ARROW_LINE_SEPARATOR + PREFIX_INDEX + index;
            return Message.getBasicMessage(classInfo.getClassName(), message, objectInformationMessage) + "\n" +
                    Message.getObjectInformationMessage(classInfo.getClassName(), arrayList, index);
        }
    }

    /**
     * @return Print Form : Class Name, Index Tag : [Object Name] [ArrayList Index], Variable Name,
     * Value
     */
    static String getLogMessage(Logging.ClassInfo classInfo, String tag, ArrayList<?> arrayList, int index) {
        if (isNull(arrayList)) {
            return getLogMessage(classInfo, MESSAGE_NULL);
        } else if (arrayList.isEmpty()) {
            return getLogMessage(classInfo, MESSAGE_EMPTY);
        } else {
            String message = PREFIX_CLASS + classInfo.getClassName() +
                    ", " + PREFIX_METHOD + classInfo.getMethodName()
                    + ", " + PREFIX_LINE + classInfo.getLineNumber();
            String objectInformationMessage = LEFT_ARROW_LINE_SEPARATOR + arrayList.get(0).getClass().getSimpleName() + RIGHT_ARROW_LINE_SEPARATOR + PREFIX_INDEX + index;
            return Message.getBasicMessage(tag, message, objectInformationMessage) + "\n" +
                    Message.getObjectInformationMessage(tag, arrayList, index);
        }
    }

    /**
     * @return Print Form : Class Name, Index Comment Class Name : [Object Name] [ArrayList Index],
     * Variable Name, Value
     */
    static String getLogMessage(Logging.ClassInfo classInfo, ArrayList<?> arrayList, int index, String comment) {
        if (isNull(arrayList)) {
            return getLogMessage(classInfo, MESSAGE_NULL);
        } else if (arrayList.isEmpty()) {
            return getLogMessage(classInfo, MESSAGE_EMPTY);
        } else {
            String message = PREFIX_METHOD + classInfo.getMethodName()
                    + ", " + PREFIX_LINE + classInfo.getLineNumber();
            String objectInformationMessage = LEFT_ARROW_LINE_SEPARATOR + arrayList.get(0).getClass().getSimpleName() + RIGHT_ARROW_LINE_SEPARATOR + PREFIX_INDEX + index;
            String commentMessage = PREFIX_COMMENT + comment;
            return Message.getBasicMessage(classInfo.getClassName(), message, objectInformationMessage, commentMessage) + "\n" +
                    Message.getObjectInformationMessage(classInfo.getClassName(), arrayList, index);
        }
    }

    /**
     * @return Print Form : Class Name, Index Comment Tag : [Object Name] [ArrayList Index], Variable
     * Name, Value
     */
    static String getLogMessage(Logging.ClassInfo classInfo, String tag, ArrayList<?> arrayList, int index, String comment) {
        if (isNull(arrayList)) {
            return getLogMessage(classInfo, MESSAGE_NULL);
        } else if (arrayList.isEmpty()) {
            return getLogMessage(classInfo, MESSAGE_EMPTY);
        } else {
            String message = PREFIX_CLASS + classInfo.getClassName() +
                    ", " + PREFIX_METHOD + classInfo.getMethodName()
                    + ", " + PREFIX_LINE + classInfo.getLineNumber();
            String objectInformationMessage = LEFT_ARROW_LINE_SEPARATOR + arrayList.get(0).getClass().getSimpleName() + RIGHT_ARROW_LINE_SEPARATOR + PREFIX_INDEX + index;
            String commentMessage = PREFIX_COMMENT + comment;
            return Message.getBasicMessage(tag, message, objectInformationMessage, commentMessage) + "\n" +
                    Message.getObjectInformationMessage(tag, arrayList, index);
        }
    }

    /**
     * @return Print Form : Class Name, Start Index,End Index Comment Class Name : [Object Name]
     * [ArrayList Index], Variable Name, Value
     */
    static String getLogMessage(Logging.ClassInfo classInfo, ArrayList<?> arrayList, int startIndex, int endIndex) {
        if (isNull(arrayList)) {
            return getLogMessage(classInfo, MESSAGE_NULL);
        } else if (arrayList.isEmpty()) {
            return getLogMessage(classInfo, MESSAGE_EMPTY);
        } else {
            String message = PREFIX_METHOD + classInfo.getMethodName()
                    + ", " + PREFIX_LINE + classInfo.getLineNumber();
            String objectInformationMessage = LEFT_ARROW_LINE_SEPARATOR + arrayList.get(0).getClass().getSimpleName() + RIGHT_ARROW_LINE_SEPARATOR + PREFIX_START_INDEX + startIndex + ", " + PREFIX_END_INDEX + endIndex;
            return Message.getBasicMessage(classInfo.getClassName(), message, objectInformationMessage) + "\n" +
                    Message.getObjectInformationMessage(classInfo.getClassName(), arrayList, startIndex, endIndex);
        }
    }


    /**
     * @return Print Form : Class Name, Start Index,End Index Comment Class Name : [Object Name]
     * [ArrayList Index], Variable Name, Value
     */
    static String getLogMessage(Logging.ClassInfo classInfo, String tag, ArrayList<?> arrayList, int startIndex, int endIndex) {
        if (isNull(arrayList)) {
            return getLogMessage(classInfo, MESSAGE_NULL);
        } else if (arrayList.isEmpty()) {
            return getLogMessage(classInfo, MESSAGE_EMPTY);
        } else {
            String message = PREFIX_CLASS + classInfo.getClassName() +
                    ", " + PREFIX_METHOD + classInfo.getMethodName()
                    + ", " + PREFIX_LINE + classInfo.getLineNumber();
            String objectInformationMessage = LEFT_ARROW_LINE_SEPARATOR + arrayList.get(0).getClass().getSimpleName() + RIGHT_ARROW_LINE_SEPARATOR + PREFIX_START_INDEX + startIndex + ", " + PREFIX_END_INDEX + endIndex;
            return Message.getBasicMessage(tag, message, objectInformationMessage) + "\n" +
                    Message.getObjectInformationMessage(classInfo.getClassName(), arrayList, startIndex, endIndex);
        }
    }


    /**
     * @return Print Form : Class Name, Start Index,End Index Comment Class Name : [Object Name]
     * [ArrayList Index], Variable Name, Value
     */
    static String getLogMessage(Logging.ClassInfo classInfo, ArrayList<?> arrayList, int startIndex, int endIndex, String comment) {
        if (isNull(arrayList)) {
            return getLogMessage(classInfo, MESSAGE_NULL);
        } else if (arrayList.isEmpty()) {
            return getLogMessage(classInfo, MESSAGE_EMPTY);
        } else {
            String message = PREFIX_METHOD + classInfo.getMethodName()
                    + ", " + PREFIX_LINE + classInfo.getLineNumber();
            String objectInformationMessage = LEFT_ARROW_LINE_SEPARATOR + arrayList.get(0).getClass().getSimpleName() + RIGHT_ARROW_LINE_SEPARATOR + PREFIX_START_INDEX + startIndex + ", " + PREFIX_END_INDEX + endIndex;
            String commentMessage = PREFIX_COMMENT + comment;
            return Message.getBasicMessage(classInfo.getClassName(), message, objectInformationMessage, commentMessage) + "\n" +
                    Message.getObjectInformationMessage(classInfo.getClassName(), arrayList, startIndex, endIndex);
        }
    }

    /**
     * @return Print Form : Class Name, Start Index,End Index Comment Tag : [Object Name] [ArrayList
     * Index], Variable Name, Value
     */
    static String getLogMessage(Logging.ClassInfo classInfo, String tag, ArrayList<?> arrayList, int startIndex, int endIndex, String comment) {
        if (isNull(arrayList)) {
            return getLogMessage(classInfo, MESSAGE_NULL);
        } else if (arrayList.isEmpty()) {
            return getLogMessage(classInfo, MESSAGE_EMPTY);
        } else {
            String message = PREFIX_CLASS + classInfo.getClassName() +
                    ", " + PREFIX_METHOD + classInfo.getMethodName()
                    + ", " + PREFIX_LINE + classInfo.getLineNumber();
            String objectInformationMessage = LEFT_ARROW_LINE_SEPARATOR + arrayList.get(0).getClass().getSimpleName() + RIGHT_ARROW_LINE_SEPARATOR + PREFIX_START_INDEX + startIndex + ", " + PREFIX_END_INDEX + endIndex;
            String commentMessage = PREFIX_COMMENT + comment;
            return Message.getBasicMessage(tag, message, objectInformationMessage, commentMessage) + "\n" +
                    Message.getObjectInformationMessage(tag, arrayList, startIndex, endIndex);
        }
    }


    private static boolean isNull(Object object) {
        return object == null;
    }
}
