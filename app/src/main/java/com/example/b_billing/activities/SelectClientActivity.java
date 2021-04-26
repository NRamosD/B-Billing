package com.example.b_billing.activities;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.b_billing.R;

public class SelectClientActivity extends AppCompatActivity {


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_show_client);

    }


    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }
}
