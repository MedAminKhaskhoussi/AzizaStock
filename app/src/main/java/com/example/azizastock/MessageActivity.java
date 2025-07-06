package com.example.azizastock;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MessageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_message);

        EditText textArea = findViewById(R.id.text_area);
        TextView textView = findViewById(R.id.textView2);
        Button envoyerButton = findViewById(R.id.envoyer_button);

        envoyerButton.setOnClickListener(v -> {
            String userMessage = textArea.getText().toString();
            if (!userMessage.isEmpty()) {
                String updatedText = textView.getText().toString() + userMessage + "\n" +"--------------------------------------------------------\n";
                textView.setText(updatedText);
                textArea.setText("");
                Toast.makeText(MessageActivity.this, "We will read your message as soon as possible", Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(MessageActivity.this, "Please enter a message first", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
