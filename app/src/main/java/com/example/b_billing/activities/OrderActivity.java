package com.example.b_billing.activities;

import android.app.Dialog;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.NumberPicker;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.b_billing.R;
import com.example.b_billing.adapter.orderProductsAdapter;
import com.example.b_billing.fragments.QuantityFragment;
import com.example.b_billing.models.productos;
import com.example.b_billing.models.ultimasVentas;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;

public class OrderActivity extends AppCompatActivity{
    private RecyclerView rv;
    private ArrayList<productos> listProducts;

    RecyclerView.LayoutManager rvLayoutManager;
    orderProductsAdapter orderProductsAdapter;
    FragmentManager fragmentManager;
    FloatingActionButton listo, vistaPrevia;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order);
        rv = findViewById(R.id.rvOrderProdcuts);
        listo = findViewById(R.id.fabContinuar);
        vistaPrevia = findViewById(R.id.fabVistaPrevia);


        //Eventos fabs
        listo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(OrderActivity.this, EndOrderActivity.class);
                startActivity(i);
            }
        });


        //Productos presentados en la orden
        rvLayoutManager = new GridLayoutManager(this,2);
        rv.setLayoutManager(rvLayoutManager);
        listProducts = new ArrayList<>();
        fillList();
        fragmentManager = getSupportFragmentManager();
        orderProductsAdapter = new orderProductsAdapter(this, listProducts, fragmentManager);
        rv.setAdapter(orderProductsAdapter);
        rv.setHasFixedSize(true);


    }


    public void openDialog(){
        QuantityFragment alertCantidad = new QuantityFragment();
        alertCantidad.show(getSupportFragmentManager(),"dialog");
    }


    private void fillList() {
        listProducts.add(new productos("pelota","$99","",1,"","","","",""));
        listProducts.add(new productos("pelota","$99","",1,"","","","",""));
        listProducts.add(new productos("pelota","$99","",1,"","","","",""));
        listProducts.add(new productos("pelota","$99","",1,"","","","",""));
        listProducts.add(new productos("pelota","$99","",1,"","","","",""));
        listProducts.add(new productos("pelota","$99","",1,"","","","",""));
    }

}
