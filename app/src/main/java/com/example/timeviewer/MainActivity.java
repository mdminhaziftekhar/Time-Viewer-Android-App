package com.example.timeviewer;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextClock;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    String text = "Now showing : your time";

    public void onClickIndia(View view) {
        TextClock clock = findViewById(R.id.myClock);
        clock.setTimeZone("Asia/Kolkata");
        TextView text = findViewById(R.id.text);
        text.setText("Now showing : India's Time");
    }

    public void onClickGermany(View view) {
        TextClock clock = findViewById(R.id.myClock);
        clock.setTimeZone("Europe/Berlin");
        TextView text = findViewById(R.id.text);
        text.setText("Now showing : German Time");
    }

    public void onClickBangladesh(View view){
        TextClock clock = findViewById(R.id.myClock);
        clock.setTimeZone("Asia/Dhaka");
        TextView text = findViewById(R.id.text);
        text.setText("Now showing : Time in Bangladesh");
    }
    public void onClickUSA(View view){
        TextClock clock = findViewById(R.id.myClock);
        clock.setTimeZone("Europe/Washington");
        TextView text = findViewById(R.id.text);
        text.setText("Now showing : Time in USA");
    }
}