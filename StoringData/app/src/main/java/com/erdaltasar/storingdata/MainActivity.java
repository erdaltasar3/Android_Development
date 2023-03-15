package com.erdaltasar.storingdata;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText editText;
    TextView textView;
    Button button;
    SharedPreferences sharedPreferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sharedPreferences = this.getSharedPreferences("com.erdaltasar.storingdata",Context.MODE_PRIVATE);
        editText = findViewById(R.id.editText);
        textView = findViewById(R.id.textView);
        button = findViewById(R.id.button);

        int storedAge = sharedPreferences.getInt("storedAge",0);

        if (storedAge == 0){
            System.out.println("Your Age : ");
        }else{
            textView.setText("Your Age : "+storedAge);
        }
    }

    public void save(View view){

        int number = Integer.parseInt(editText.getText().toString());
        textView.setText("Your Age: "+number);

        sharedPreferences.edit().putInt("storedAge",number).apply();
    }

    public void delete(View view){

        int storedAge = sharedPreferences.getInt("storedAge",0);

        if (storedAge != 0){
            sharedPreferences.edit().remove("storedAge").apply();
            textView.setText("Your age : ");
        }

    }
}