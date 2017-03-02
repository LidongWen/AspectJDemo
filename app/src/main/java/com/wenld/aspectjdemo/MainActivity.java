package com.wenld.aspectjdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import org.aspectj.lang.annotation.Aspect;

@Aspect
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        test();
    }
    @AspectJAnnotation(value = "测试")
    public void test(){
        Log.i("tag00","检查权限");
    }
}
