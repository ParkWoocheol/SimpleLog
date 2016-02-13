# SimpleLog

You can use easily Log.

JavaDoc
============
<http://mrparkwc.com/simplelog>

Example
============
```java
public class DemoActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

       /**
        * Print Form :
        * Class Name : Method Name, Line
        */
        Logging.i(); 
       /**
        * Print Form :
        * Class Name : Method Name, Line, Comment
        */  
        Logging.i("Comment"); 
       /**
        * Print Form :
        * Tag : Class Name , Method Name, Line, Comment
        */
        Logging.i("Tag","Comment"); 
       /**
        * Print Form :
        * Class Name : [Object Name], Variable Name, Value
        */
        Logging.i(Object); 
       /**
        * Print Form :
        * Tag : [Object Name], Variable Name, Value
        */
        Logging.i(Tag,Object); 
       /**
        * Print Form :
        * ClassName : [Object Name], Variable Name, Value
        */
        Logging.i(Object,"Comment");
       /**
        * Print Form :
        * Class Name
        * Comment
        * Tag : [Object Name], Variable Name, Value
        */
        Logging.i(Tag,Object,"Comment");
       /**
        * Print Form :
        * Class Name : [Object Name] [ArrayList Index], Variable Name, Value
        */
        Logging.i(ArrayList<?>); 
       /**
        * Print Form :
        * Tag : [Object Name] [ArrayList Index], Variable Name, Value
        */
        Logging.i(Tag,ArrayList<?>); 
       /**
        * Print Form :
        * Class Name
        * Comment
        * Class Name : [Object Name] [ArrayList Index], Variable Name, Value
        */
        Logging.i(ArrayList<?>,"Comment");
       /**
        * Print Form :
        * Class Name
        * Comment
        * Tag : [Object Name] [ArrayList Index], Variable Name, Value
        */
        Logging.i(Tag,ArrayList<?>,"Comment");
       /**
        * Print Form :
        * Class Name
        * Class Name : [Object Name] [ArrayList Index], Variable Name, Value
        */
        Logging.i(ArrayList<?>, int index); 
       /**
        * Print Form :
        * Class Name, Index
        * Tag : [Object Name] [ArrayList Index], Variable Name, Value
        */
        Logging.i(Tag,ArrayList<?>, int index); 
       /**
        * Print Form :
        * Class Name, Index
        * Comment
        * Class Name : [Object Name] [ArrayList Index], Variable Name, Value
        */
        Logging.i(ArrayList<?>, int index,"Comment");
       /**
        * Print Form :
        * Class Name, Index
        * Comment
        * Tag : [Object Name] [ArrayList Index], Variable Name, Value
        */
        Logging.i(Tag,ArrayList<?>, int index,"Comment");
       /**
        * Print Form :
        * Class Name, Start Index,End Index
        * Class Name : [Object Name] [ArrayList Index], Variable Name, Value
        */
        Logging.i(ArrayList<?>, int startIndex, int endIndex); 
       /**
        * Print Form :
        * Class Name, Start Index,End Index
        * Tag : [Object Name] [ArrayList Index], Variable Name, Value
        */
        Logging.i(Tag,ArrayList<?>, int startIndex, int endIndex); 
      /**
        * Print Form :
        * Class Name, Start Index,End Index
        * Comment
        * Class Name : [Object Name] [ArrayList Index], Variable Name, Value
        */
        Logging.i(ArrayList<?>, int startIndex, int endIndex,"Comment"); 
       /**
        * Print Form :
        * Class Name, Start Index,End Index
        * Comment
        * Tag : [Object Name] [ArrayList Index], Variable Name, Value
        */
        Logging.i(Tag,ArrayList<?>, int startIndex, int endIndex,"Comment"); 
        
        Logging.e();
        ...
        Logging.w();
        ...
        Logging.d();
        ...
    }
}
```
Download
============
Maven:
```xml
<dependency>
  <groupId>com.mrparkwc</groupId>
  <artifactId>simplelog</artifactId>
  <version>1.1.0</version>
  <type>aar</type>
</dependency>
```
Gradle:
```groovy
compile 'com.mrparkwc:simplelog:1.1.0'
```
Developed By
============

* Park, Woocheol - <admin@mrparkwc.com>



License
=======

    Copyright (C) 2015 Park, Woocheol

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.
