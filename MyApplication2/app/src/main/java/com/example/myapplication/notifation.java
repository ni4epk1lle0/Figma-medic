package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;

public class notifation extends AppCompatActivity {
float x1,x2,y1,y2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notifation);
    }
    public boolean onTouchEvent(MotionEvent touchEvent){
        switch (touchEvent.getAction()){
            case MotionEvent.ACTION_DOWN:
                x1 = touchEvent.getX();
                y1 = touchEvent.getY();
                break;
            case MotionEvent.ACTION_UP:
                x2 = touchEvent.getX();
                y2 = touchEvent.getY();

                if (x1 < x2){
                    Intent i = new Intent(notifation.this, Analis.class);
                    startActivity(i);
                }else if(x1 > x2){
                    Intent i = new Intent(notifation.this, Mot.class);
                    startActivity(i);
                }
                break;
        }
        return false;
}

    public void skipActivity(View view) {
        Intent intent = new Intent(this, Youarewelc.class);
        startActivity(intent);
    }
}