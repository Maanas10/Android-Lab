package com.example.registration;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {


    TextView tv1,tv2,tv3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        initUI();
        SharedPreferences sharedPref=getSharedPreferences("My_Pref",MODE_PRIVATE);
        tv1.setText("First Name : "+sharedPref.getString("FName",""));
        tv2.setText("Last Name : "+sharedPref.getString("LName",""));
        tv3.setText("Gender: "+sharedPref.getString("Gender",""));


    }



    private void initUI() {

        tv1=findViewById(R.id.textView);
        tv2=findViewById(R.id.textView3);
        tv3=findViewById(R.id.textView5);
    }
}
