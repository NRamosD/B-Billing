package com.example.b_billing.activities;

import android.content.Intent;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.b_billing.R;
import com.google.android.material.button.MaterialButton;

public class LoginActivity extends AppCompatActivity {
    TextView linkTextView;
    TextView register;
    MaterialButton btnIniciar;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        //link de contacto
        linkTextView = findViewById(R.id.terms);
        linkTextView.setMovementMethod(LinkMovementMethod.getInstance());

        //botones
        btnIniciar = findViewById(R.id.start);
        register = findViewById(R.id.register);

        btnIniciar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(LoginActivity.this, MainActivity.class );
                startActivity(i);
                finish();
            }
        });
        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(LoginActivity.this, RegisterActivity.class);
                startActivity(i);
            }
        });


    }


    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }



}
