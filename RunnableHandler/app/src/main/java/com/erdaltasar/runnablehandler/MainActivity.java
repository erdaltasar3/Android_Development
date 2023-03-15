package com.erdaltasar.runnablehandler;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    TextView textView;
    int number;
    Button button;
    Runnable runnable;
    Handler handler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.textView);
        button = findViewById(R.id.button);
        number = 0;

    }

    public void start(View view){

        handler = new Handler();
        runnable = new Runnable() {
            @Override
            public void run() {
                textView.setText("Time : "+number);
                number++;
                textView.setText("Time : "+number);
                handler.postDelayed(runnable,1000);
            }
        };

        handler.post(runnable);
        button.setEnabled(false);

    }

    public void stop(View view){

        button.setEnabled(true);
        handler.removeCallbacks(runnable);

        textView.setText("Time : "+number);
    }

    public void reset(View view){

        button.setEnabled(true);
        handler.removeCallbacks(runnable);
        number = 0;
        textView.setText("Time : "+number);

    }

}