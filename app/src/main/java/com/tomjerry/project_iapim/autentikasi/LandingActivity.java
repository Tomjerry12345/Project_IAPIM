package com.tomjerry.project_iapim.autentikasi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.tomjerry.project_iapim.R;

import com.google.android.material.button.MaterialButton;

public class LandingActivity extends AppCompatActivity implements View.OnClickListener {

    MaterialButton signin;
    MaterialButton signup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_landing);

        signin = findViewById(R.id.btn_signin);
        signup = findViewById(R.id.btn_signup);

        signin.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_signin:
                Intent intentSignin = new Intent(LandingActivity.this , SignInActivity.class);
                startActivity(intentSignin);
                break;

            case R.id.btn_signup:
                Intent intentSignup = new Intent(LandingActivity.this , SignInActivity.class);
                startActivity(intentSignup);
                break;
        }
    }
}
