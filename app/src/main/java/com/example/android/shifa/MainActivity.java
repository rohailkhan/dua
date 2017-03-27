/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.android.shifa;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);

        // Find the View that shows the numbers category
        TextView myone = (TextView) findViewById(R.id.one);

        // Set a click listener on that View
        myone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent oneIntent=new Intent(MainActivity.this, one.class);
                startActivity(oneIntent);
            }
        });


        TextView mytwoview=(TextView)findViewById(R.id.two);
        mytwoview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent twoIntent=new Intent(MainActivity.this,two.class);
                startActivity(twoIntent);
            }
        });

        TextView threeview=(TextView)findViewById(R.id.four);
        threeview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent threeIntent=new Intent(MainActivity.this,three.class);
                startActivity(threeIntent);
            }
        });

        TextView myfourview=(TextView)findViewById(R.id.four);

        myfourview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent fourintent=new Intent(MainActivity.this, four.class);
                startActivity(fourintent);
            }
        });

    }



//        mythreeview.setOnClickListener(new View.OnClickListener(){
//            @Override
//            public void OnClick(View myview){
//                Toast.makeText(MainActivity.this,"This is 3rd toast " ,Toast.LENGTH_SHORT).show();
//
//            }
//        });




    public void onclick2(View myview){
        Intent y=new Intent(this,two.class);
        startActivity(y);
    }
    public void onclick3(View myview){
        Intent y=new Intent(this,two.class);
        startActivity(y);
    }
    public void onclick4(View myview){
        Intent y=new Intent(this,two.class);
        startActivity(y);
    }
}
