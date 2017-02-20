package com.vkclient.askar.vkclient.auth;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.vkclient.askar.vkclient.R;

/**
 * Created by Адель on 20.02.2017.
 */

public class LoginSuccess extends AppCompatActivity {
    private Button login;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_success);
    }
}
