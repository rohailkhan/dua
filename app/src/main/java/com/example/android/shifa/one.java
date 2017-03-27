package com.example.android.shifa;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class one extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.duas_list);

        ArrayList<String> myarrayList= new ArrayList<String>();
        myarrayList.add("one");
        myarrayList.add("two");
        myarrayList.add("three");
        myarrayList.add("four");
        myarrayList.add("five");
        myarrayList.add("six");
        myarrayList.add("seven");
        myarrayList.add("eigght");

        LinearLayout myLinear=(LinearLayout)findViewById(R.id.list);
        TextView mytext=new TextView(this);
        mytext.setText(myarrayList.get(0));
        
        myLinear.addView(mytext);


    }


}
