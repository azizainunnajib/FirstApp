package com.example.azizainun.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class sukses extends AppCompatActivity {
    Button btn_back;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sukses);
        btn_back = (Button) findViewById(R.id.kembali);
    }

    public void kembali(View v) {
        Intent i = new Intent(this,login_java.class);
        startActivity(i);
    }
}
