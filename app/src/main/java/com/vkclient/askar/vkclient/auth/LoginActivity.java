package com.vkclient.askar.vkclient.auth;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.vkclient.askar.vkclient.R;

public class LoginActivity extends AppCompatActivity {

    private Button login;
    private Intent i;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        login = (Button)findViewById(R.id.loginButton);
        i = new Intent(this, LoginSuccess.class);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(i);
            }
        });
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    private String auth(){
        return "0";
    }
}
