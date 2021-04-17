package com.example.b_billing.adapter;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.NumberPicker;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.RecyclerView;

import com.example.b_billing.R;
import com.example.b_billing.activities.ProductActivity;
import com.example.b_billing.fragments.EditEraseProductFragment;
import com.example.b_billing.fragments.ShowProductFragment;
import com.example.b_billing.fragments.dialogFragment;
import com.example.b_billing.models.productos;
import com.example.b_billing.models.ultimasVentas;
import com.google.android.material.button.MaterialButton;

import java.util.ArrayList;
import java.util.List;

public class showProductsAdapter extends RecyclerView.Adapter<showProductsAdapter.ViewHolder>{
    private List<ultimasVentas> list;
    private Context ctx;
    private FragmentManager frM;


    public showProductsAdapter(Context ctx, List<ultimasVentas> list, FragmentManager f) {
        this.list = list;
        this.ctx=ctx;
        this.frM = f;
    }


    @NonNull
    @Override
    /*inflate del item.xml*/
    public showProductsAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_order_product, parent, false);
        showProductsAdapter.ViewHolder viewHolder = new showProductsAdapter.ViewHolder(v);


        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull showProductsAdapter.ViewHolder holder, final int position) {
        //es un producto mas en determinada posicion
        holder.nombre.setText("Este " + position);
        holder.precio.setText("$" + position);

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //AppCompatActivity activity = (AppCompatActivity) v.getContext();
                EditEraseProductFragment eeProduct = new EditEraseProductFragment();
                /*FragmentTransaction transaction = frM.beginTransaction();
                transaction.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
                transaction.add(R.id.content, eeProduct ).addToBackStack(null).commit();*/
                eeProduct.show(frM,"dialog showing");
                //activity.getSupportFragmentManager().beginTransaction().replace(R.id.activity_product,eeProduct).addToBackStack(null).commit();
            }
        });

    }


    @Override
    public int getItemCount() {
        return this.list.size();
    }


    public class ViewHolder extends RecyclerView.ViewHolder{
        public TextView nombre;
        public TextView precio;
        public ImageView img;


        public ViewHolder(@NonNull View v) {
            super(v);
            nombre = v.findViewById(R.id.itemNombreOrder);
            precio = v.findViewById(R.id.itemPrecioOrder);
            img = v.findViewById(R.id.itemImgOrder);
        }

    }
}
