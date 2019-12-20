package com.example.test115;

import android.util.Log;

public class FiveYearsTeacher extends Teacher {
    public FiveYearsTeacher(String 佐藤二朗, int i, String 男性, String s) {
        super(佐藤二朗, i, 男性, s);
    }

    public void show(){
        Log.d("test1.1.5", String.valueOf((salary * 1.1)));
    }
}
