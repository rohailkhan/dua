package com.example.android.shifa;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class one extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.duas_list);

        ArrayList<String> myArrayList=new ArrayList<String>();
        myArrayList.add("one");
        myArrayList.add("two");
        myArrayList.add("three");
        myArrayList.add("four");
        myArrayList.add("five");
        myArrayList.add("six");
        myArrayList.add("seven");
        myArrayList.add("eight");
        myArrayList.add("nine");
        myArrayList.add("ten");

        ArrayAdapter<String> myadapter=new ArrayAdapter<String>(this,R.layout.duas_list,myArrayList);
        ListView mylistview=(ListView)findViewById(R.id.list);
        mylistview.setAdapter(myadapter);

}






    }
}
