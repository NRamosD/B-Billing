package com.example.b_billing.adapter;

import android.content.Context;
import android.content.Intent;
import android.text.format.DateFormat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.b_billing.R;
import com.example.b_billing.activities.MainActivity;
import com.example.b_billing.activities.ShowSellActivity;
import com.example.b_billing.models.ultimasVentas;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;

public class lastSellAdapter extends RecyclerView.Adapter<lastSellAdapter.ViewHolder>{
    /*Constructor: aqui se crea la lista*/
    private List<ultimasVentas> list;
    private Context ctx;
    public lastSellAdapter(Context ctx, List<ultimasVentas> list) {
        this.list = list;
        this.ctx=ctx;
    }


    @NonNull
    @Override
    /*inflate del item.xml*/
    public lastSellAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_last_sell, parent, false);
        ViewHolder viewHolder = new ViewHolder(v);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull lastSellAdapter.ViewHolder holder, final int position) {
        //holder.itemCliente.setText("Friend: " + position);
        holder.itemHorafecha.setText(fechayhora());
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
        public TextView itemCliente;
        public TextView itemHorafecha;
        public TextView itemTotal;
        public ViewHolder(@NonNull View v) {
            super(v);
            itemCliente = v.findViewById(R.id.nombreCliente);
            itemHorafecha = v.findViewById(R.id.fechahora);
            itemTotal = v.findViewById(R.id.total);
        }
    }

    public String fechayhora(){
        String date = (DateFormat.format("dd-MM-yyyy hh:mm", new java.util.Date()).toString());
        return  date;
    }


}


