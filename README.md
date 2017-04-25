# SimpleLog

You can use easily Log.

JavaDoc
============
<http://mrparkwc.com/simplelog>

Demo
============
<img src="https://github.com/ParkWoocheol/SimpleLog/blob/master/images/capture.PNG" alt="SimpleLog"/>

Example
============
```java
public class DemoActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        if(BuildConfig.DEBUG){
            Logging.isRunning = true;
        }else{
            Logging.isRunning = false;
        }
        
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
        * TAG : Class Name , Method Name, Line, Comment
        */
        Logging.i("TAG","Comment"); 
       /**
        * Print Form :
        * Class Name : [Object Name], Variable Name, Value
        */
        Logging.i(Object); 
       /**
        * Print Form :
        * TAG : [Object Name], Variable Name, Value
        */
        Logging.i(TAG,Object); 
       /**
        * Print Form :
        * ClassName : [Object Name], Variable Name, Value
        */
        Logging.i(Object,"Comment");
       /**
        * Print Form :
        * Class Name
        * Comment
        * TAG : [Object Name], Variable Name, Value
        */
        Logging.i(TAG,Object,"Comment");
       /**
        * Print Form :
        * Class Name : [Object Name] [ArrayList Index], Variable Name, Value
        */
        Logging.i(ArrayList<?>); 
       /**
        * Print Form :
        * TAG : [Object Name] [ArrayList Index], Variable Name, Value
        */
        Logging.i(TAG,ArrayList<?>); 
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
        * TAG : [Object Name] [ArrayList Index], Variable Name, Value
        */
        Logging.i(TAG,ArrayList<?>,"Comment");
       /**
        * Print Form :
        * Class Name
        * Class Name : [Object Name] [ArrayList Index], Variable Name, Value
        */
        Logging.i(ArrayList<?>, int index); 
       /**
        * Print Form :
        * Class Name, Index
        * TAG : [Object Name] [ArrayList Index], Variable Name, Value
        */
        Logging.i(TAG,ArrayList<?>, int index); 
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
        * TAG : [Object Name] [ArrayList Index], Variable Name, Value
        */
        Logging.i(TAG,ArrayList<?>, int index,"Comment");
       /**
        * Print Form :
        * Class Name, Start Index,End Index
        * Class Name : [Object Name] [ArrayList Index], Variable Name, Value
        */
        Logging.i(ArrayList<?>, int startIndex, int endIndex); 
       /**
        * Print Form :
        * Class Name, Start Index,End Index
        * TAG : [Object Name] [ArrayList Index], Variable Name, Value
        */
        Logging.i(TAG,ArrayList<?>, int startIndex, int endIndex); 
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
        * TAG : [Object Name] [ArrayList Index], Variable Name, Value
        */
        Logging.i(TAG,ArrayList<?>, int startIndex, int endIndex,"Comment"); 
        
        Logging.e();
        ...
        Logging.w();
        ...
        Logging.d();
        ...
        
        /**
         * If you want to get a String Log message
         * uses Same Logging.(i, e, w, d) parameter
         * @return String log messages.
         */
         Logging.getMessage( ... )
    
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
  <version>2.0.3</version>
  <type>aar</type>
</dependency>
```
Gradle:
```groovy
compile 'com.mrparkwc:simplelog:2.0.3'
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
