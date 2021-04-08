package com.example.b_billing.adapter;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.b_billing.R;
import com.example.b_billing.activities.OrderActivity;
import com.example.b_billing.activities.ShowSellActivity;
import com.example.b_billing.models.productos;
import com.example.b_billing.models.ultimasVentas;

import java.util.List;

public class orderProductsAdapter extends RecyclerView.Adapter<orderProductsAdapter.ViewHolder> {
    private List<productos> list;
    private Context ctx;
    Dialog dialog;
    public orderProductsAdapter(Context ctx, List<productos> list) {
        this.list = list;
        this.ctx=ctx;
    }


    @NonNull
    @Override
    /*inflate del item.xml*/
    public orderProductsAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_order_product, parent, false);
        orderProductsAdapter.ViewHolder viewHolder = new orderProductsAdapter.ViewHolder(v);











        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull orderProductsAdapter.ViewHolder holder, final int position) {
        holder.nombre.setText("Friend: " + position);
        holder.precio.setText("$" + position);
        //holder.itemHorafecha.setText(fechayhora());
        //holder.itemTotal.setText("$" + position);
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent i = new Intent(ctx, ShowSellActivity.class);
                ctx.startActivity(i);
            }
        });
    }

    @Override
    public int getItemCount() {
        return this.list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
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
