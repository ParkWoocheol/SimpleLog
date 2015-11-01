# SimpleLog

You can use easily Log.


```java
public class DemoActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Logging.i(); // Print Form : Class Name: Method, Line
        Logging.i("Comment"); // Print Form : Class Name: Method, Line, Comment

        Logging.e();
        Logging.e("Comment");

    }
}
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
