package com.example.test_nat;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class SignInActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);
    }

    public void signIn(View view) {
        Intent intent = new Intent(this, Main2Activity.class);
        SignInActivity.this.startActivity(intent);
        SignInActivity.this.finish();
    }

    public void signUp(View view) {
        Intent intent = new Intent(this, SignUpActivity.class);
        SignInActivity.this.startActivity(intent);
    }
}