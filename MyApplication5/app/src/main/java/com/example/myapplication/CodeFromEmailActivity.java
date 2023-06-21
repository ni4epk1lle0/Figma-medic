package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.TextView;

public class CodeFromEmailActivity extends AppCompatActivity {

    private TextView timer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_code_from_email);
        timer = findViewById(R.id.Timer);


        new CountDownTimer(60000, 1000) {
            @SuppressLint("SetTextI18n")
            @Override
            public void onTick(long l) {
                timer.setText("Отправить код повторно можно будет через " + l / 1000 + " секунд");


            }

            @Override
            public void onFinish() {

            }
        }.start();{

        }
    }

    public void backActivity(View view) {
        Intent intent = new Intent(this, Youarewelc.class);
        startActivity(intent);
    }
}