package com.example.constraintlayout;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    TextView t1;
    String str;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        t1=(TextView) findViewById(R.id.txt);
        Intent intent2=getIntent();
        /*str.intent2.getExtras().getString("Value");*/
        Bundle extras = intent2.getExtras();
        String result = extras.getString("Value");
        t1.setText(str);
    }
}