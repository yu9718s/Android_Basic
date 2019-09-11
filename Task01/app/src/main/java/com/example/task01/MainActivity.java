package com.example.task01;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        boolean a = true;
        String str = "Hello";
        int i = 2;
        double d = 1.0;

        Log.d("MyApp", "a=" + a + "str=" + str + "i=" + i + "d=" + d);

    }
}
