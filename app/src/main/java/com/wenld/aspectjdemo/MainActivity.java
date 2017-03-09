package com.wenld.aspectjdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import org.aspectj.lang.annotation.Aspect;

@Aspect
public class MainActivity extends AppCompatActivity {
    String TAG = "tag00";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.e(TAG, test());
    }

    @AspectJAnnotation(value = "权限A")
    public String test() {
        Log.i(TAG, "检查权限");
        return "test";
    }
}
