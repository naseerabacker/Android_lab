package com.example.ksb.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity  implements View.OnClickListener{
    EditText e1;
    EditText e2;
    Button add,sub,mul,div;
    TextView t1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        e1=(EditText)findViewById(R.id.et1);
        e2=(EditText)findViewById(R.id.et2);
        add=(Button)findViewById(R.id.btn_add);
        sub=(Button)findViewById(R.id.btn_sub);
        mul=(Button)findViewById(R.id.btn_mul);
        div=(Button)findViewById(R.id.btn_div);
        t1=(TextView)findViewById(R.id.result1);
        add.setOnClickListener(this);
        sub.setOnClickListener(this);
        mul.setOnClickListener(this);
        div.setOnClickListener(this);}
        public void onClick(View v){
        float num1=0;
        float num2=0;
        float result=0;
            String oper="";
        num1=Float.parseFloat(e1.getText().toString());
            num2=Float.parseFloat(e2.getText().toString());
            switch (v.getId()){
                case R.id.btn_add:
                    oper="+";
                    result=num1+num2;
                    break;
                case R.id.btn_sub:
                    oper="-";
                    result=num1-num2;
                    break;
                case R.id.btn_mul:
                    oper="*";
                    result=num1*num2;
                    break;
                case R.id.btn_div:
                    oper="/";
                    result=num1/num2;
                    break;}
                    t1.setText(num1+""+oper+""+num2+"="+result);
            }







    }

