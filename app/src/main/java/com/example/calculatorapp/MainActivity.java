package com.example.calculatorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView myTextView;
    EditText myEditText1;
    EditText myEditText2;
    Button myButtonPlus;
    Button myButtonMinus;
    Button myButtonDivide;
    Button myButtonMultiply;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myEditText1 = findViewById(R.id.editText1);
        myEditText2 = findViewById(R.id.editText2);
        myTextView = findViewById(R.id.textViewAnswer);
        myButtonPlus = findViewById(R.id.btnPlus);
        myButtonMinus = findViewById(R.id.btnMinus);
        myButtonDivide = findViewById(R.id.btnDivide);
        myButtonMultiply = findViewById(R.id.btnMultiply);

        myButtonPlus.setOnClickListener(new MyButtonPlusOnClickListener());
        myButtonMinus.setOnClickListener(new MyButtonMinusOnClickListener());
        myButtonDivide.setOnClickListener(new MyButtonDivideOnClickListener());
        myButtonMultiply.setOnClickListener(new MyButtonMultiplyOnClickListener());


    }

    private class MyButtonPlusOnClickListener implements View.OnClickListener {

        @Override
        public void onClick(View view) {
            float answer;
            float input1 = Float.parseFloat(myEditText1.getText().toString());
            float input2 = Float.parseFloat(myEditText2.getText().toString());
            answer = input1 + input2;
            myTextView.setText(String.format("%.0f", answer));
        }
    }

    private class MyButtonMinusOnClickListener implements View.OnClickListener {

        @Override
        public void onClick(View view) {
            float answer;
            float input1 = Float.parseFloat(myEditText1.getText().toString());
            float input2 = Float.parseFloat(myEditText2.getText().toString());
            answer = input1 - input2;
            myTextView.setText(String.format("%.0f", answer));
        }
    }

    private class MyButtonDivideOnClickListener implements View.OnClickListener {

        @Override
        public void onClick(View view) {
            float answer;
            float input1 = Float.parseFloat(myEditText1.getText().toString());
            float input2 = Float.parseFloat(myEditText2.getText().toString());
            answer = input1 / input2;
            myTextView.setText(String.format("%.2f", answer));
        }
    }

    private class MyButtonMultiplyOnClickListener implements View.OnClickListener {

        @Override
        public void onClick(View view) {
            float answer;
            float input1 = Float.parseFloat(myEditText1.getText().toString());
            float input2 = Float.parseFloat(myEditText2.getText().toString());
            answer = input1 * input2;
            myTextView.setText(String.format("%.0f", answer));
        }
    }

}