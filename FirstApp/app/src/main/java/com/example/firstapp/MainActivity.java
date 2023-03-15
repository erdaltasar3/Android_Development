package com.example.firstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {


    public int i = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void changeImage(View view){

        ImageView imageView = findViewById(R.id.imageView);
        i+=1;
        if (i % 2 == 1){
            imageView.setImageResource(R.drawable.img2);
        }else{
            imageView.setImageResource(R.drawable.img1);
        }
    }
}