package com.codinginflow.additionexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText mEditText1;
    private EditText mEditText2;
    private TextView mTextViewResult;
    private Button mButtonAdd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mEditText1 = findViewById(R.id.edittext_number_1);
        mEditText2 = findViewById(R.id.edittext_number_2);
        mTextViewResult = findViewById(R.id.textview_result);
        mButtonAdd = findViewById(R.id.button_add);

        mButtonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mEditText1.getText().toString().length() == 0) {
                    mEditText1.setText("0");
                }

                if (mEditText2.getText().toString().length() == 0) {
                    mEditText2.setText("0");
                }


                int num1 = Integer.parseInt(mEditText1.getText().toString());
                int num2 = Integer.parseInt(mEditText2.getText().toString());

                int sum = num1 + num2;

                mTextViewResult.setText(String.valueOf(sum));
            }
        });
    }
}














public class MainActivity extends AppCompatActivity {

Button b1;

EditText 11, 12;

TextView ti;

@Override

protected void onCreate(Bundle savedInstanceState) {

super.onCreate(savedInstanceState);

setContentView(R.layout.activity_main);

n1 = findViewById(R.id.number1);
n2 = findViewById(R.id.number2);
b1 = findViewById(R.id.button1);

findViewById(R.id.text1); t1 =

bl.setOnClickListener(new View.OnClickListener() {

@Override

public void onClick(View view) {

(t1.getText().toString().length()==0);

I

int p = Integer.parseInt(n1.getText().toString());

int m = Integer.parseInt(n2.getText().toString());

int sum = p + m;

ti.setText(String.valueOf(sum));
