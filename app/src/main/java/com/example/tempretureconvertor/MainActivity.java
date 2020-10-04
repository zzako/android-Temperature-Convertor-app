package com.example.tempretureconvertor;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    double Celsius;
    double Fahrenheit;
    EditText inputTxt;
    TextView output1;
    TextView output2;
    String c = "°C";
    String f =  "°F";
    String cel = String.format("%s" , "c");
    String fah = String.format("%s" , "f");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button1 = findViewById(R.id.button1);
        Button button2 = findViewById(R.id.button2);
        inputTxt = (EditText) findViewById(R.id.EditText1);
        output1 = (TextView) findViewById(R.id.output1);
        output2 = (TextView) findViewById(R.id.output2);



        button1.setOnClickListener(new View.OnClickListener()
        {
            @Override
                    public void onClick(View v)
            {
                Fahrenheit = Double.parseDouble(inputTxt.getText().toString());
                double res = (Fahrenheit - 32) * 5 / 9;
                String result = res + c;
                output1.setText(String.valueOf(result));
            }
        });
        button2.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Celsius = Double.parseDouble(inputTxt.getText().toString());
                double res = Celsius * 1.8 + 32;
                String result = res + f;
                output2.setText(String.valueOf(result));
            }
        });
    }



}