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
        // Create a variable to keep track of the current index position
             int index = 0;

                        // Keep looping until we've reached the end of the list (which means keep looping
                             // as long as the current index position is less than the length of the list)
                                while (index < myarrayList.size()) {
             // Create a new TextView
                            TextView wordView = new TextView(this);

                            wordView.setText(myarrayList.get(index));
                myLinear.addView(wordView);
                     // Increment the index variable by 1
                                     index++;

        }


    }


}
