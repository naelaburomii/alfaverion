package com.testapp.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
Button prfoile,orders,list;
Intent t ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        list = findViewById(R.id.listbutton);
        list.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                t=new Intent(MainActivity.this,StudentsList.class);
                startActivity(t);

            }
        });

    }
}