package com.forwards.mathapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText et1,et2,et3;
    TextView tvDisplay;
    Button b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1 = (EditText) findViewById(R.id.no1);
        et2 = (EditText) findViewById(R.id.opt);
        et3 = (EditText) findViewById(R.id.no2);

    }

    public void result(View v){

        String no1 = et1.getText().toString();
        String opt = et2.getText().toString();
        String no2 = et3.getText().toString();

//        Converting to Interger

        int a = Integer.parseInt(no1);
        int b = Integer.parseInt(no2);
        int c = 0;

        switch (opt){

            case "+": {
                c = a + b;
                break;
            }
            case "*":{
                c = a * b;
                break;
            }
            case "-": {
                c = a - b;
                break;
            }
            case "/": {
                try {
                    c  = a / b;
                }catch(ArithmeticException ae){
                    Log.e("Division Error",""+ae);
                }
                break;
            }
            default:
                Toast.makeText(getApplicationContext(),"Invalid Operation",Toast.LENGTH_LONG).show();
                break;
        }
        Toast.makeText(getApplicationContext(),"Result is " +c,Toast.LENGTH_LONG).show();





    }
}
