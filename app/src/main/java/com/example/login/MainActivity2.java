package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity2 extends AppCompatActivity  {

    private Button mBtnbutton_on;
    private Button mBtnbutton_off;
    private ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        imageView = findViewById(R.id.imageView_gray);
        mBtnbutton_on = findViewById(R.id.button_on);
        mBtnbutton_off = findViewById(R.id.button_off);
        mBtnbutton_on.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageView.setImageResource(R.drawable.yellow);
            }
        });
        mBtnbutton_off.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageView.setImageResource(R.drawable.gray1);
            }
        });
    }
}