package com.example.test115;

import android.util.Log;

public class TenYearsTeacher extends Teacher{
    public TenYearsTeacher(String 佐藤二朗, int i, String 男性, String s) {
        super(佐藤二朗, i, 男性, s);
    }

    public void show(){
        Log.d("test1.1.5", String.valueOf((salary * 1.3)));
    }
}
