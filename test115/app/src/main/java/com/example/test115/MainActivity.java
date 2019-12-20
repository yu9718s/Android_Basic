package com.example.test115;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public  static void main(String[] args) {

        Teacher teacher = new Teacher("佐藤二朗", 22, "男性", "200000");

        FiveYearsTeacher fiveyearsteacher = new FiveYearsTeacher();

        TenYearsTeacher tenyearsteacher = new TenYearsTeacher();
    }
}
