package com.example.b_billing.activities;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.b_billing.R;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class EndOrderActivity extends AppCompatActivity {
    MaterialButton end;
    FloatingActionButton back, cancel;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_end_order);
        end = findViewById(R.id.terminarCompra);
        back = findViewById(R.id.regresarOrden);
        cancel = findViewById(R.id.cancelarCompra);


        end.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Compra Realizada Exitosamente", Toast.LENGTH_SHORT).show();
                Intent i = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(i);
                finishAffinity();
                //finish();
            }
        });
        cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                final AlertDialog.Builder dialogCancel = new AlertDialog.Builder(EndOrderActivity.this,R.style.AlertDialogCustom);
                dialogCancel.setTitle("Cancelar Compra");
                dialogCancel.setMessage("¿Esta seguro que desea cancelar la compra?");
                dialogCancel.setCancelable(false).
                        setPositiveButton("SI", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialogCancel, int id) {
                        aceptar();
                    }
                }).setNegativeButton("NO", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialogCancel, int id) {
                        dialogCancel.dismiss();
                    }
                });
                dialogCancel.show();
            }


        });
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });







    }

    public void aceptar() {
        Toast.makeText(getApplicationContext(), "Compra Cancelada", Toast.LENGTH_SHORT).show();
        Intent i = new Intent(getApplicationContext(), MainActivity.class);
        startActivity(i);
        finishAffinity();
    }

}
