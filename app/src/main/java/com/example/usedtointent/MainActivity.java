package com.example.usedtointent;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.view.View;
import android.widget.EditText;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    EditText edt_veri_gir;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void gec(View view)
    {
        Intent intent = new Intent(MainActivity.this,MainActivity2.class);
        intent.putExtra("gonderilenverianahtarı",edt_veri_gir.getText().toString());
        intent.putExtra("gonderilenikinciveri",12);
        startActivity(intent);
    }
}