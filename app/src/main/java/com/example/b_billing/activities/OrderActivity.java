package com.example.b_billing.activities;

import android.app.Dialog;
import android.os.Build;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.view.ViewGroup;
import android.widget.NumberPicker;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.b_billing.R;
import com.example.b_billing.adapter.orderProductsAdapter;
import com.example.b_billing.models.productos;
import com.example.b_billing.models.ultimasVentas;
import com.google.android.material.button.MaterialButton;

import java.util.ArrayList;

public class OrderActivity extends AppCompatActivity {
    private RecyclerView rv;
    private ArrayList<productos> listProducts;

    RecyclerView.LayoutManager rvLayoutManager;
    orderProductsAdapter orderProductsAdapter;
    Dialog dialog;
    MaterialButton ok, cancel;
    NumberPicker numberPicker;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order);
        rv = findViewById(R.id.rvOrderProdcuts);
        ok = findViewById(R.id.alertContinuar);
        cancel = findViewById(R.id.alertCancelar);
        numberPicker = findViewById(R.id.alertNumberP);

/*
        //custom dialog
        dialog = new Dialog(this);
        dialog.setContentView(R.layout.custom_alert_numberpicker);
        if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP){
            dialog.getWindow().setBackgroundDrawable(getDrawable(R.drawable.back_edit_text));
        }
        dialog.getWindow().setLayout(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        dialog.setCancelable(false);

        ok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Okey",Toast.LENGTH_SHORT).show();
                dialog.dismiss();
            }
        });
        cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Cancelao :c",Toast.LENGTH_SHORT).show();
                dialog.dismiss();
            }
        });
            //number picker
        numberPicker.setMinValue(1);
        numberPicker.setMaxValue(999);
        numberPicker.setOnValueChangedListener(new NumberPicker.OnValueChangeListener() {
            @Override
            public void onValueChange(NumberPicker picker, int oldVal, int newVal) {
                Toast.makeText(getApplicationContext(),"Cantidad"+newVal, Toast.LENGTH_SHORT).show();
            }
        });
*/


        //Productos presentados en la orden
        rvLayoutManager = new GridLayoutManager(this,2);
        rv.setLayoutManager(rvLayoutManager);
        listProducts = new ArrayList<>();

        fillList();

        orderProductsAdapter = new orderProductsAdapter(this, listProducts);
        rv.setAdapter(orderProductsAdapter);
        rv.setHasFixedSize(true);

    }



    private void fillList() {
        listProducts.add(new productos("pelota","$99","",1,"","","","",""));
        listProducts.add(new productos("pelota","$99","",1,"","","","",""));
        listProducts.add(new productos("pelota","$99","",1,"","","","",""));
        listProducts.add(new productos("pelota","$99","",1,"","","","",""));
        listProducts.add(new productos("pelota","$99","",1,"","","","",""));
    }

}
