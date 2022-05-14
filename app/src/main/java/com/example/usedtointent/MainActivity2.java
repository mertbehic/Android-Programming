package com.example.usedtointent;


import androidx.appcompat.app.AppCompatActivity;

import android.widget.TextView;
import android.content.Intent;
import org.w3c.dom.Text;

import android.os.Bundle;

public class MainActivity2 extends AppCompatActivity {
    TextView txt_yazimiz;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Intent intent = getIntent();
        String gelenveri = intent.getStringExtra("gonderilenverianahtari");
        int gelenveri2 = intent.getIntExtra("gonderilenikinciveri",0);
        txt_yazimiz.setText(""+gelenveri+gelenveri2);
    }
}