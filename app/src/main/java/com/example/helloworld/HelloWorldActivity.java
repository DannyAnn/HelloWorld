package com.example.helloworld;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.LoginFilter;
import android.util.Log;

public class HelloWorldActivity extends AppCompatActivity {

    private static final String TAG = "HelloWorldActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hello_world_layout);

        //在Android Studio中我们使用Log来打印日志
        //这种方式更优于
        Log.i(TAG,"onCreate");
    }
}
