package com.example.liz.mysimplecalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText number1,number2;
    TextView answer;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        number1=findViewById(R.id.num1);
        number2=findViewById(R.id.num2);

        answer=findViewById(R.id.result);







    }

    public void add(View view) {
        String s1=number1.getText().toString();
        String s2=number2.getText().toString();
        if (s1.isEmpty()||s2.isEmpty()){
            Toast.makeText(this, "Please enter the number", Toast.LENGTH_SHORT).show();
        }else {
            int num1=Integer.parseInt(s1);
            int num2=Integer.parseInt(s2);
            int ans=num1+num2;
            answer.setText(String.valueOf(ans));
        }
    }

    public void sub(View view) {
        String s1=number1.getText().toString();
        String s2=number2.getText().toString();
        if (s1.isEmpty()||s2.isEmpty()){
            Toast.makeText(this, "Please enter the number", Toast.LENGTH_SHORT).show();
        }else{
            int num1=Integer.parseInt(s1);
            int num2=Integer.parseInt(s2);
            int ans=num1-num2;
            answer.setText(String.valueOf(ans));
        }
    }

    public void multi(View view) {
        String s1=number1.getText().toString();
        String s2=number2.getText().toString();
        if (s1.isEmpty()||s2.isEmpty()){
            Toast.makeText(this, "Please enter the number", Toast.LENGTH_SHORT).show();
        }else{
            int num1=Integer.parseInt(s1);
            int num2=Integer.parseInt(s2);
            int ans=num1*num2;
            answer.setText(String.valueOf(ans));
        }
    }

    public void div(View view) {
        String s1=number1.getText().toString();
        String s2=number2.getText().toString();
        if (s1.isEmpty()||s1.isEmpty()){
            Toast.makeText(this, "PLease enter the number", Toast.LENGTH_SHORT).show();
        }else {
            int num1=Integer.parseInt(s1);
            int num2=Integer.parseInt(s2);
            int ans=num1/num2;
            answer.setText(String.valueOf(ans));
        }
    }
}
