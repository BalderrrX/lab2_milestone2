package com.cs407.lab2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText input1;
    private EditText input2;
    private Button addbtn;
    private Button subbtn;
    private Button mulbtn;
    private Button divbtn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        input1 = (EditText)findViewById(R.id.myTextField1);
        input2 = (EditText)findViewById(R.id.myTextField2);
        addbtn = (Button) findViewById(R.id.add);
        subbtn = (Button) findViewById(R.id.sub);
        mulbtn = (Button) findViewById(R.id.mul);
        divbtn = (Button) findViewById(R.id.div);

        //Add
        addbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if((input1.getText().length()>0) && (input2.getText().length()>0)){
                    double num1 = Double.parseDouble(input1.getText().toString());
                    double num2 = Double.parseDouble(input2.getText().toString());
                    double result = num1 + num2;
                    goToActicity(result);
                }else {
                    Toast.makeText(MainActivity.this, "Please check your numbers", Toast.LENGTH_LONG).show();
                }
            }
        });
        //Sub
        subbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if((input1.getText().length()>0) && (input2.getText().length()>0)){
                    double num1 = Double.parseDouble(input1.getText().toString());
                    double num2 = Double.parseDouble(input2.getText().toString());
                    double result = num1 - num2;
                    goToActicity(result);
                }else {
                    Toast.makeText(MainActivity.this, "Please check your numbers", Toast.LENGTH_LONG).show();
                }
            }
        });
        //Mul
        mulbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if((input1.getText().length()>0) && (input2.getText().length()>0)){
                    double num1 = Double.parseDouble(input1.getText().toString());
                    double num2 = Double.parseDouble(input2.getText().toString());
                    double result = num1 * num2;
                    goToActicity(result);
                }else {
                    Toast.makeText(MainActivity.this, "Please check your numbers", Toast.LENGTH_LONG).show();
                }
            }
        });
        //Div
        divbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if((input1.getText().length()>0) && (input2.getText().length()>0)){
                    double num1 = Double.parseDouble(input1.getText().toString());
                    double num2 = Double.parseDouble(input2.getText().toString());
                    double result = num1 / num2;
                    goToActicity(result);
                }else {
                    Toast.makeText(MainActivity.this, "Please check your numbers", Toast.LENGTH_LONG).show();
                }
            }
        });
    }

    public void goToActicity(double num){
        Intent intent = new Intent(this, resultPage.class);
        String str = Double.toString(num);
        intent.putExtra("message", str);
        startActivity(intent);
    }
}