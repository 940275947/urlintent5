# urlintent5
本实验通过自定义WebView加载URL来验证隐式Intent 的使用。
 实验包含两个应用： 
 第一个应用：获取URL地址并启动隐式Intent的调用。
关键代码：
                String web=webrurl.getText().toString();
                Uri uri=Uri.parse(web);
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(web));
                startActivity(intent)
 第二个应用：自定义WebView来加载URL
关键代码：
        <intent-filter>
                <action android:name="android.intent.action.VIEW" />
                <category android:name="android.intent.category.DEFAULT" />
                <data android:scheme="http" />
                <data android:scheme="https" />
            </intent-filter>
![image](https://github.com/940275947/urlintent5/blob/master/images/myweb1%20.png)
![image](https://github.com/940275947/urlintent5/blob/master/images/myweb2.png)
![image](https://github.com/940275947/urlintent5/blob/master/images/myweb3.png)
![image](https://github.com/940275947/urlintent5/blob/master/images/myweb4.png)
隐士调用
