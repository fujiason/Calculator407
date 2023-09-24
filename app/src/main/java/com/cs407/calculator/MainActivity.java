package com.cs407.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public void clickFunctionMul(View view){
        EditText  myTextField1=(EditText) findViewById(R.id.editTextText);
        EditText  myTextField2=(EditText) findViewById(R.id.editTextText2);
        int value1 = Integer.parseInt(myTextField1.getText().toString());
        int value2 = Integer.parseInt(myTextField2.getText().toString());
        goToActivity(String.valueOf(value1 * value2));
    }

    public void clickFunctionDiv(View view){
        EditText  myTextField1=(EditText) findViewById(R.id.editTextText);
        EditText  myTextField2=(EditText) findViewById(R.id.editTextText2);
        int value1 = Integer.parseInt(myTextField1.getText().toString());
        int value2 = Integer.parseInt(myTextField2.getText().toString());
        if(value2 == 0){
            goToActivity("Cannot divide by zero!");
        }
        else{
            goToActivity(String.valueOf((double) value1 / (double) value2));
        }
    }

    public void clickFunctionSum(View view){
        EditText  myTextField1=(EditText) findViewById(R.id.editTextText);
        EditText  myTextField2=(EditText) findViewById(R.id.editTextText2);
        int value1 = Integer.parseInt(myTextField1.getText().toString());
        int value2 = Integer.parseInt(myTextField2.getText().toString());
        goToActivity(String.valueOf(value1 + value2));
    }

    public void clickFunctionSub(View view){
        EditText  myTextField1=(EditText) findViewById(R.id.editTextText);
        EditText  myTextField2=(EditText) findViewById(R.id.editTextText2);
        int value1 = Integer.parseInt(myTextField1.getText().toString());
        int value2 = Integer.parseInt(myTextField2.getText().toString());
        goToActivity(String.valueOf(value1 - value2));
    }

    public void goToActivity(String s){
        Intent intent = new Intent(this, Result.class);
        intent.putExtra("message", s);
        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}