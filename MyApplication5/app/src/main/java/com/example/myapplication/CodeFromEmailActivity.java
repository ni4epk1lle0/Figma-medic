package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class CodeFromEmailActivity extends AppCompatActivity {
    private EditText editText, editText2, editText3, editText4;
    private TextView timer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_code_from_email);

        editText = findViewById(R.id.ed1);
        editText2 = findViewById(R.id.ed2);
        editText3 = findViewById(R.id.ed3);
        editText4 = findViewById(R.id.ed4);

        editText.addTextChangedListener(codeWather);
        editText2.addTextChangedListener(codeWather);
        editText3.addTextChangedListener(codeWather);
        editText4.addTextChangedListener(codeWather);

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
    TextWatcher codeWather = new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

        }

        @Override
        public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            if (editText.getText().toString().length() == 1){
                editText2.requestFocus();
            }
            if (editText2.getText().toString().length() == 1){
                editText3.requestFocus();
            }
            if (editText3.getText().toString().length() == 1){
                editText4.requestFocus();
            }
            if (editText4.getText().toString().length() == 1){
              Intent intent = new Intent(getApplicationContext(), MakePassword.class);
              startActivity(intent);
            }

        }

        @Override
        public void afterTextChanged(Editable editable) {

        }
    };

    public void backActivity(View view) {
        Intent intent = new Intent(this, Youarewelc.class);
        startActivity(intent);
    }
}