package com.github.davityle.loginapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.ngandroid.lib.NgOptions;

import ng.layout.ActivityLoginController;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        LoginScope scope = new LoginScope();
        ActivityLoginController controller = new ActivityLoginController(new NgOptions.Builder().build(), scope);
        controller.attach(findViewById(android.R.id.content));
    }

}
