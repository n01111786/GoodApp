package com.example.bradey.goodapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Second extends AppCompatActivity {

    private EditText Name;
    private EditText Password;
    private Button Login;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Name = (EditText)findViewById(R.id.user1);
        Password = (EditText)findViewById(R.id.pass1);
        Login = (Button)findViewById(R.id.butt1);

        Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                validate(Name.getText().toString(), Password.getText().toString());
            }
        });

    }

    private void validate(String userName, String userPassword){
        if ((userName.equals("Good")) && (userPassword.equals("1400"))){
            Intent intent = new Intent (Second.this, Account.class);
            startActivity(intent);
        }else {
            Toast.makeText(Second.this, "Invalid Combo", Toast.LENGTH_LONG).show();

        }
    }
}
