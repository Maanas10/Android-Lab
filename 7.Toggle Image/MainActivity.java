package com.example.imagetoggle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    ImageView image;
    Button imgBtn;
    int [] img = {R.drawable.img,R.drawable.img2};
    int index = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initUi();


    }
    public void initUi(){
        image = findViewById(R.id.imageView2);
        imgBtn= findViewById(R.id.imgButton);
    }

    public void toggle(View view) {
        switch (index){
            case 0:image.setImageResource(img[1]);
                index = 1;
                break;
            case 1:image.setImageResource(img[0]);
                index = 0;
                break;
        }
    }
}