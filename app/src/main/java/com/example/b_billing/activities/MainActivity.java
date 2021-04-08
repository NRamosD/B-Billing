package com.example.b_billing.activities;

import android.app.Activity;
import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.KeyEvent;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.b_billing.R;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class MainActivity extends AppCompatActivity {
    FloatingActionButton newOrder;
    MaterialButton btnProductos, btnClientes, btnVentas;
    Activity activity;

    public MainActivity() {

    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        activity = this;
        btnClientes = findViewById(R.id.btnClientesMain);
        btnProductos = findViewById(R.id.btnProductosMain);
        btnVentas = findViewById(R.id.btnVentasMain);
        newOrder = findViewById(R.id.fabNewOrder);

        btnClientes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), ClientActivity.class);
                startActivity(i, ActivityOptions.makeSceneTransitionAnimation(activity).toBundle());
            }
        });
        btnProductos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), ProductActivity.class);
                startActivity(i, ActivityOptions.makeSceneTransitionAnimation(activity).toBundle());
            }
        });
        btnVentas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), ReportActivity.class);
                startActivity(i, ActivityOptions.makeSceneTransitionAnimation(activity).toBundle());
            }
        });

        newOrder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), OrderActivity.class);
                startActivity(i, ActivityOptions.makeSceneTransitionAnimation(activity).toBundle());
            }
        });

    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }
}
