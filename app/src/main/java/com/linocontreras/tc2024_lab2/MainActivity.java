package com.linocontreras.tc2024_lab2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button btnSendData;
    Button btnOrientation;
    Button btnChangeTitle;
    TextView header;
    EditText name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnSendData = findViewById(R.id.btnSendData);
        btnOrientation= findViewById(R.id.btnOrientation);
        btnChangeTitle = findViewById(R.id.btnChangeTitle);
        header = findViewById(R.id.header);
        name = findViewById(R.id.name);

        btnSendData.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent sendExtra = new Intent(MainActivity.this, Activity2.class);
                sendExtra.putExtra("name", name.getText().toString());
                startActivity(sendExtra);
            }
        });

        btnOrientation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent orientation = new Intent(MainActivity.this, Activity3.class);
                startActivity(orientation);
            }
        });

        btnChangeTitle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                header.setText("Hello!");
            }
        });
    }
}
