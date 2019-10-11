package com.example.test113;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        int testnum = 90;

        if (testnum > 80) {
            Log.d("test1.1.3", ("合格です。"));
        }else if (testnum < 70){
            Log.d("test1.1.3", ("追試です。"));
        }else {
            Log.d("test1.1.3", ("不合格です。"));
        }

        int num = 4;
        String result = ((num % 2) == 0) ? ((num % 3 == 0)) ? "numは2でも3でも割り切れます" : "numは2では割り切れますが3では割り切れません":((num % 3 == 0)) ? "numは2で割り切れませんが3では割り切れます":"numは2でも3でも割りきれません";
        Log.d("test1.1.3",(result));

        int i = 0;
        while (i < 3) {
            Log.d("test1.1.3", ((i + 1) + "回目の処理です" ));
            i++;
        }
        Log.d("test1.1.3",  ("処理が終了しました"));

        int p = 0;
        do {
            Log.d("test1.1.3",(p + 1) + "回目の処理です");
            p++;
        } while (p < 3);
        Log.d("test1.1.3", ("処理が終了しました"));

        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.forEach(s -> Log.d("test1.1.3", (s)));

        for (int t = 0; t < list.size(); t++) {
            Log.d("test1.1.3", t + " : " + list.get(t));
        }

        int Evanum = 3;

        switch (Evanum){
            case 1:
                Log.d("test1.1.3", ("非常に不満"));
                break;
            case 2:
                Log.d("test1.1.3", ("少し不満"));
                break;
            case 3:
                Log.d("test1.1.3", ("どちらとも言えない"));
                break;
            case 4:
                Log.d("test1.1.3", ("少し満足"));
                break;
            case 5:
                Log.d("test1.1.3", ("大変満足"));
                break;


        }

    }



}
