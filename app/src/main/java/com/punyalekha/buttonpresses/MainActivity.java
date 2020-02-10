package com.punyalekha.buttonpresses;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button incrementButton;
    Button decrementButton;
    TextView displayText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        incrementButton=findViewById(R.id.clickButton);
        decrementButton=findViewById(R.id.clickButton2);
        displayText=findViewById(R.id.textBox);
        incrementButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("testButton", "Incremented!");
                int i = Integer.parseInt(displayText.getText().toString())+1;
                displayText.setText(""+i);
            }
        });
        decrementButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("testButton2", "Decremented!");
                int i = Integer.parseInt(displayText.getText().toString())-1;
                displayText.setText(""+i);
            }
        });
    }
}
