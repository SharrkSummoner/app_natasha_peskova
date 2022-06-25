package com.example.test_nat;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class SignUpActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
    }

    public void signUp(View view) {
        Intent intent = new Intent(this, Main2Activity.class);
        SignUpActivity.this.startActivity(intent);
        SignUpActivity.this.finish();
    }

    public void back(View view) {
        Intent intent = new Intent(this, SignInActivity.class);
        SignUpActivity.this.startActivity(intent);
    }
}