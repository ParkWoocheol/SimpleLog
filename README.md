# SimpleLog

You can use easily Log.

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
        * print form :
        * class name : method name, line
        */
        Logging.i(); 
       /**
        * print form :
        * class name : method name, line, comment
        */  
        Logging.i("comment"); 
       /**
        * print form :
        * TAG : class name , method name, line, comment
        */
        Logging.i("TAG","comment"); 
       /**
        * print form :
        * class name : [object name], variable name, value
        */
        Logging.i(Object object); 
       /**
        * print form :
        * TAG : [object name], variable name, value
        */
        Logging.i(TAG,Object object); 
       /**
        * print form :
        * class name : [object name], variable name, value
        */
        Logging.i(Object object,"comment");
       /**
        * print form :
        * class name
        * comment
        * TAG : [object name], variable name, value
        */
        Logging.i(TAG,Object object,"comment");
       /**
        * print form :
        * class name : [object name] [index], variable name, value
        */
        Logging.i(ArrayList<?> arrayList); 
       /**
        * print form :
        * TAG : [object name] [index], variable name, value
        */
        Logging.i(TAG,ArrayList<?> arrayList); 
       /**
        * print form :
        * class name
        * comment
        * class name : [object name] [index], variable name, value
        */
        Logging.i(ArrayList<?> arrayList,"comment");
       /**
        * print form :
        * class name
        * comment
        * TAG : [object name] [index], variable name, value
        */
        Logging.i(TAG,ArrayList<?> arrayList,"comment");
       /**
        * print form :
        * class name
        * class name : [object name] [index], variable name, value
        */
        Logging.i(ArrayList<?> arrayList, int index); 
       /**
        * print form :
        * class name, index
        * TAG : [object name] [index], variable name, value
        */
        Logging.i(TAG,ArrayList<?> arrayList, int index); 
       /**
        * print form :
        * class name, index
        * comment
        * class name : [object name] [index], variable name, value
        */
        Logging.i(ArrayList<?> arrayList, int index,"comment");
       /**
        * print form :
        * class name, index
        * comment
        * TAG : [object name] [index], variable name, value
        */
        Logging.i(TAG,ArrayList<?> arrayList, int index,"comment");
       /**
        * print form :
        * class name, start index, end index
        * class name : [object name] [index], variable name, value
        */
        Logging.i(ArrayList<?> arrayList, int startIndex, int endIndex); 
       /**
        * Print Form :
        * class name, start index, end index
        * TAG : [object name] [index], variable name, value
        */
        Logging.i(TAG,ArrayList<?> arrayList, int startIndex, int endIndex); 
      /**
        * print form :
        * class name, start index, end index
        * comment
        * class name : [object name] [index], variable name, value
        */
        Logging.i(ArrayList<?> arrayList, int startIndex, int endIndex,"comment"); 
       /**
        * print form :
        * class name, start index, end index
        * comment
        * TAG : [object name] [index], variable name, value
        */
        Logging.i(Tag,ArrayList<?> arrayList, int startIndex, int endIndex,"comment"); 
        
        Logging.e();
        ...
        Logging.w();
        ...
        Logging.d();
        ...
        
        /**
         * If you want to get a json log message
         */
         Logging.json(Object object, LogSeparator logSeparator);
        
        /**
         * If you want to get a string log message
         * uses Same Logging.(i, e, w, d) parameter
         * @return String log messages.
         */
         Logging.getMessage( ... );
         
        /**
         * If you want to get a string lson Log message
         * @return String json log messages.
         */
         Logging.getJsonMessage(Object object);

    }
}
```
Download
============
Maven:
```xml
<dependency>
  <groupId>com.parkwoocheol</groupId>
  <artifactId>simplelog-android</artifactId>
  <version>2.3.0</version>
  <type>pom</type>
</dependency>
```
Gradle:
```groovy
compile 'com.parkwoocheol:simplelog-android:2.3.0'
```
Developed By
============

* Park, Woocheol - <mrparkwc@gmail.com>



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
