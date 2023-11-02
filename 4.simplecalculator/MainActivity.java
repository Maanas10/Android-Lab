package com.example.simplecalculator1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.view.View;


public class MainActivity extends AppCompatActivity {
    Button Plus,Sub,Div,Mul;
    EditText Text1,Text2;
    TextView Result1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Text1=findViewById(R.id.Text1);
        Text2=findViewById(R.id.Text2);
        Result1=findViewById(R.id.R1);
        Plus=findViewById(R.id.PlusButton);
        Sub=findViewById(R.id.SubButton);
        Div=findViewById(R.id.DivButton);
        Mul=findViewById(R.id.MulButton);




    }

    public void sum(View view) {

        float a= Float.parseFloat(Text1.getText().toString());
        float b= Float.parseFloat(Text2.getText().toString());
        float c=a+b;
        Result1.setText("Result: "+c);
    }


    public void Sub(View view) {
        float a= Float.parseFloat(Text1.getText().toString());
        float b= Float.parseFloat(Text2.getText().toString());
        float c=a-b;
        Result1.setText("Result: "+c);

    }

    public void Div(View view) {
        float a= Float.parseFloat(Text1.getText().toString());
        float b= Float.parseFloat(Text2.getText().toString());
        float c=a/b;
        Result1.setText("Result: "+c);

    }

    public void Mul(View view) {
        float a= Float.parseFloat(Text1.getText().toString());
        float b= Float.parseFloat(Text2.getText().toString());
        float c=a*b;
        Result1.setText("Result: "+c);

    }
}
