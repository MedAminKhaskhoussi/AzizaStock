package com.example.azizastock;

import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class RateActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rate);

        Button sendButton = findViewById(R.id.send_rate);

        sendButton.setOnClickListener(v -> {
            Toast.makeText(RateActivity.this, "Thanks for your review", Toast.LENGTH_SHORT).show();
        });
    }
}
