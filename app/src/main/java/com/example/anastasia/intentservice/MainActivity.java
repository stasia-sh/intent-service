package com.example.anastasia.intentservice;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void startService(View view) {
        Intent intent = new Intent(this, MyService.class);
        startService(intent);

        setContentView(R.layout.activity_main);
        TextView textView = (TextView) findViewById(R.id.textView);
        int min = 0;
        int max = 9;

        Random r = new Random();
        int i1 = r.nextInt(max - min + 1) + min;
        String finalString = Integer.toString(i1);
        textView.setText(finalString);

    }

    public void stopService(View view) {
        Intent intent = new Intent(this, MyService.class);
        stopService(intent);
    }
}
