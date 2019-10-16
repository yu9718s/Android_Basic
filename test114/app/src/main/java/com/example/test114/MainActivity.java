package com.example.test114;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Account account1 = new Account("山田花子", 22, "女性", "java");


        Account account2 = new Account("鈴木一郎", 43, "男性", "swift");

        account1.introduction();
        account2.introduction();
    }
}