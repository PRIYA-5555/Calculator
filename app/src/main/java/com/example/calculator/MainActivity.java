package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,b00,plus,minus,multi,div,equal,ac;
    TextView text_num;
    int fnum,snum;
    char op;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ac = findViewById(R.id.ac);
        equal = findViewById(R.id.equal);
        text_num = findViewById(R.id.text_num);
        plus = findViewById(R.id.plus);
        minus = findViewById(R.id.minus);
        multi = findViewById(R.id.multi);
        div = findViewById(R.id.div);
        b1 = findViewById(R.id.one);
        b2 = findViewById(R.id.two);
        b3 = findViewById(R.id.three);
        b4 = findViewById(R.id.four);
        b5 = findViewById(R.id.five);
        b6 = findViewById(R.id.six);
        b7 = findViewById(R.id.seven);
        b8 = findViewById(R.id.eight);
        b9 = findViewById(R.id.nine);
        b0 = findViewById(R.id.zero);
        b00 = findViewById(R.id.d_zero);

        ac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text_num.setText("");
            }
        });
        equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (op == '+'){
                    snum = Integer.parseInt(text_num.getText().toString());
                    addition();
                }else if(op == '-'){
                    snum = Integer.parseInt(text_num.getText().toString());
                    substraction();
                }
                else if(op == '*'){
                    snum = Integer.parseInt(text_num.getText().toString());
                   multiplication();
                }
                else if(op == '/'){
                    snum = Integer.parseInt(text_num.getText().toString());
                    division();
                }
            }
        });
        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                fnum  = Integer.parseInt(text_num.getText().toString());
                text_num.setText("");
                op = '+';
            }
        });
        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                fnum  = Integer.parseInt(text_num.getText().toString());
                text_num.setText("");
                op = '-';
            }
        });
        multi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                fnum  = Integer.parseInt(text_num.getText().toString());
                text_num.setText("");
                op = '*';
            }
        });
        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                fnum  = Integer.parseInt(text_num.getText().toString());
                text_num.setText("");
                op = '/';
            }
        });

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String num = text_num.getText().toString();
                text_num.setText(num+"1");

            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String num = text_num.getText().toString();
                text_num.setText(num+"2");

            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String num = text_num.getText().toString();
                text_num.setText(num+"3");

            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String num = text_num.getText().toString();
                text_num.setText(num+"4");

            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String num = text_num.getText().toString();
                text_num.setText(num+"5");

            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String num = text_num.getText().toString();
                text_num.setText(num+"6");

            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String num = text_num.getText().toString();
                text_num.setText(num+"7");

            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String num = text_num.getText().toString();
                text_num.setText(num+"8");

            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String num = text_num.getText().toString();
                text_num.setText(num+"9");

            }
        });
        b0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String num = text_num.getText().toString();
                text_num.setText(num+"0");

            }
        });
        b00.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String num = text_num.getText().toString();
                text_num.setText(num+"00");

            }
        });
    }
    void addition(){
        int sum = fnum +  snum ;
        text_num.setText(""+sum);

    }
    void substraction(){
        int sub = fnum -  snum ;
        text_num.setText(""+sub);

    }
    void multiplication(){
        int mul = fnum *  snum ;
        text_num.setText(""+mul);

    }
    void division(){
        int div = fnum /  snum ;
        text_num.setText(""+div);

    }
}