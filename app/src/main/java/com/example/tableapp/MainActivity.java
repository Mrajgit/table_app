package com.example.tableapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText n1;
    Button button;
    TextView text1;
    TextView text2;
    TextView text3;
    TextView text4;
    TextView text5;
    TextView text6;
    TextView text7;
    TextView text8;
    TextView text9;
    TextView text10;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        n1 = findViewById(R.id.n1);
        button = findViewById(R.id.button);
        text1 = findViewById(R.id.text1);
        text2 = findViewById(R.id.text2);
        text3 = findViewById(R.id.text3);
        text4 = findViewById(R.id.text4);
        text5 = findViewById(R.id.text5);
        text6 = findViewById(R.id.text6);
        text7 = findViewById(R.id.text7);
        text8 = findViewById(R.id.text8);
        text9 = findViewById(R.id.text9);
        text10 = findViewById(R.id.text10);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int t = Integer.parseInt(n1.getText().toString());
                text1.setText(t +" * 1 = "+(t*1));
                text2.setText(t +" * 2 = "+(t*2));
                text3.setText(t +" * 3 = "+(t*3));
                text4.setText(t +" * 4 = "+(t*4));
                text5.setText(t +" * 5 = "+(t*5));
                text6.setText(t +" * 6 = "+(t*6));
                text7.setText(t +" * 7 = "+(t*7));
                text8.setText(t +" * 8 = "+(t*8));
                text9.setText(t +" * 9 = "+(t*9));
                text10.setText(t +" * 10 = "+(t*10));

            }
        });
    }
}