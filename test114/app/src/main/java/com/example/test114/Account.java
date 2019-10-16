package com.example.test114;

import android.util.Log;

public class Account {
    private String name;
    private Integer age;
    private String sex;
    private String lang;

    Account() {
    }

    Account(String n, Integer a, String s,String l)
    {
        name = n;
        age = a;
        sex = s;
        lang = l;
    }

    public void setname(String n) {
        name = n;
    }

    public void setage(Integer a) {
        age = a;
    }

    public void setsex(String s) {
        sex = s;
    }

    public void setlang(String l) {
        lang = l;
    }

    void show() {
        Log.d("test1.1.4", ("名前:" + name));
        Log.d("test1.1.4", ("年齢:" + age));
        Log.d("test1.1.4", ("性別:" + sex));
        Log.d("test1.1.4", ("言語:" + lang));
    }
    public void introduction(){
        if (sex == "男性") {
            Log.d("test1.1.4", ("「"+ name + "君は、"+ lang + "が得意な"+ age + "歳です。」"));
        }
        else{
            Log.d("test1.1.4", ("「"+ name + "さんは、"+ lang + "が得意な"+ age + "歳です。」"));
        }
    }

}