package com.example.constraintlayout;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText txt1;
    EditText txt2;
    Button btn;
    String str;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txt1 = (EditText) findViewById(R.id.editTextTextPersonName);
        txt2 = (EditText) findViewById(R.id.editTextTextPersonName2);
        btn = (Button) findViewById(R.id.button);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // textobj.setText("Andriod version");
                openMainActivity2();
            }
        });

    }

    public void openMainActivity2() {
        Intent intent = new Intent(this, MainActivity2.class);
        str = txt1.getText().toString();
        intent.putExtra("Value" ,str);
        startActivity(intent);
        finish();
    }

}

