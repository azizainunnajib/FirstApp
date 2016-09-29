package com.example.azizainun.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class login_java extends AppCompatActivity {
    private Button tbl_login, tbl_forpass, tbl_reg;
    private EditText input_user, input_pass;
    private String user, pass;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_java);
//        tbl_login= (Button) findViewById(R.id.login);
//        tbl_forpass= (Button) findViewById(R.id.forpass);
//        tbl_reg = (Button) findViewById(R.id.register);
        input_user = (EditText) findViewById(R.id.inputuser);
        input_pass = (EditText) findViewById(R.id.inputpass);
    }

    public void onLogin(View v) {
        Toast.makeText(this, "pressed Login", Toast.LENGTH_SHORT).show();
        user = input_user.getText().toString();
        pass = input_pass.getText().toString();
        if (user.equals("aziz") && pass.equals("najib")) {
            Toast.makeText(this, pass + user, Toast.LENGTH_SHORT).show();
            Intent i = new Intent(this, sukses.class);
            startActivity(i);
        } else {
            Toast.makeText(this, "login salah", Toast.LENGTH_SHORT).show();
        }
    }

    public void onRegister(View v) {
        Toast.makeText(this, "pressed Register", Toast.LENGTH_SHORT).show();
    }

    public void onForpass(View v) {
        Toast.makeText(this, "pressed Forpass", Toast.LENGTH_SHORT).show();
    }
}
