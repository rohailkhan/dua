package com.example.android.shifa;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class one extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.duas_list);
String [] words=new String[10];
        words[0]="zero";
        words[1]="one";
        words[2]="zero";
        words[3]="one";
        words[4]="zero";
        words[5]="one";
        words[6]="zero";
        words[7]="one";
        words[8]="zero";
        words[9]="one";
        Log.v("one Activity" , "words at index" + words[0]);
        Log.v("one" , "words at index" + words[1]);

    }


}
