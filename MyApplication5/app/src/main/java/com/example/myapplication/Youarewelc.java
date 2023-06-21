package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Youarewelc extends AppCompatActivity {

    private EditText editText;
    private Button BtnNext;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_youarewelc);

        editText = findViewById(R.id.EditText);
        BtnNext = findViewById(R.id.btnNext);

        editText.addTextChangedListener(emailWather);

    }
    private  TextWatcher emailWather = new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

        }

        @Override
        public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
            String emailInput = editText.getText().toString().trim();
            BtnNext.setEnabled(!emailInput.isEmpty());

        }

        @Override
        public void afterTextChanged(Editable editable) {

        }
    };

    public void Next(View view) {
        Intent intent = new Intent(this, CodeFromEmailActivity.class);
        startActivity(intent);
    }
}