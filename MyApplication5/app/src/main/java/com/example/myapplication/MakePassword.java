package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;

public class MakePassword extends AppCompatActivity implements View.OnClickListener {

    View view_1, view_2,view_3,view_4;
    Button One, Two, Three, Four, Five, Six, Seven, Eight, Nine, Zero, Kill;

    ArrayList<String> numbers_list = new ArrayList<>();
    String passcode = "";
    String num_1, num_2, num_3, num_4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_make_password);
        initializeComponents();

    }

    private void initializeComponents() {
        view_1 = findViewById(R.id.view_1);
        view_2 = findViewById(R.id.view_2);
        view_3 = findViewById(R.id.view_3);
        view_4 = findViewById(R.id.view_4);

        One = findViewById(R.id.One);
        Two = findViewById(R.id.Two);
        Three = findViewById(R.id.Three);
        Four = findViewById(R.id.Four);
        Five = findViewById(R.id.Five);
        Six = findViewById(R.id.Six);
        Seven = findViewById(R.id.Seven);
        Eight = findViewById(R.id.Eight);
        Nine = findViewById(R.id.Nine);
        Zero = findViewById(R.id.Zero);
        Kill = findViewById(R.id.Kill);

        One.setOnClickListener(this);
        Two.setOnClickListener(this);
        Three.setOnClickListener(this);
        Four.setOnClickListener(this);
        Five.setOnClickListener(this);
        Six.setOnClickListener(this);
        Seven.setOnClickListener(this);
        Eight.setOnClickListener(this);
        Nine.setOnClickListener(this);
        Zero.setOnClickListener(this);
        Kill.setOnClickListener(this);
    }

    @Override
    public void onClick(View view){
         switch (view.getId()){
             case R.id.One:
                 numbers_list.add("1");
                 passNumber(numbers_list);
                 break;
             case R.id.Two:
                 numbers_list.add("2");
                 passNumber(numbers_list);
                 break;
             case R.id.Three:
                 numbers_list.add("3");
                 passNumber(numbers_list);
                 break;
             case R.id.Four:
                 numbers_list.add("4");
                 passNumber(numbers_list);
                 break;
             case R.id.Five:
                 numbers_list.add("5");
                 passNumber(numbers_list);
                 break;
             case R.id.Six:
                 numbers_list.add("6");
                 passNumber(numbers_list);
                 break;
             case R.id.Seven:
                 numbers_list.add("7");
                 passNumber(numbers_list);
                 break;
             case R.id.Eight:
                 numbers_list.add("8");
                 passNumber(numbers_list);
                 break;
             case R.id.Nine:
                 numbers_list.add("9");
                 passNumber(numbers_list);
                 break;
             case R.id.Zero:
                 numbers_list.add("0");
                 passNumber(numbers_list);
                 break;
             case R.id.Kill:
                 numbers_list.clear();
                 passNumber(numbers_list);
                 break;
         }
    }

    private void passNumber(ArrayList<String> numbers_list) {
        if(numbers_list == null){
            view_1.setBackgroundResource(R.drawable.white_krug_with_blue_line);
            view_2.setBackgroundResource(R.drawable.white_krug_with_blue_line);
            view_3.setBackgroundResource(R.drawable.white_krug_with_blue_line);
            view_4.setBackgroundResource(R.drawable.white_krug_with_blue_line);
        }else {
            switch (numbers_list.size()){
                case 1:
                    num_1 = numbers_list.get(0);
                    view_1.setBackgroundResource(R.drawable.blue_krug);
                    break;
                case 2:
                    num_1 = numbers_list.get(1);
                    view_2.setBackgroundResource(R.drawable.blue_krug);
                    break;
                case 3:
                    num_1 = numbers_list.get(2);
                    view_3.setBackgroundResource(R.drawable.blue_krug);
                    break;
                case 4:
                    num_1 = numbers_list.get(3);
                    view_4.setBackgroundResource(R.drawable.blue_krug);
                    passcode = num_1 + num_2 + num_3 + num_4;

                    break;
            }
        }
    }


    private SharedPreferences.Editor savePassCode(String passcode){

        return null;
    }
    public void skipActivity(View view) {
        Intent intent = new Intent(this, MakePacientCard.class);
        startActivity(intent);
    }
}