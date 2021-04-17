package com.example.b_billing.adapter;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.NumberPicker;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.b_billing.R;
import com.example.b_billing.activities.OrderActivity;
import com.example.b_billing.activities.ShowSellActivity;
import com.example.b_billing.fragments.QuantityFragment;
import com.example.b_billing.fragments.dialogFragment;
import com.example.b_billing.models.productos;
import com.example.b_billing.models.ultimasVentas;
import com.google.android.material.button.MaterialButton;

import java.util.List;

public class orderProductsAdapter extends RecyclerView.Adapter<orderProductsAdapter.ViewHolder>{
    private List<productos> list;
    private Context ctx;
    public MaterialButton ok, cancel;
    public NumberPicker numberPicker;
    public FragmentManager frM;

    private NumberPicker.OnValueChangeListener valueChangeListener;

    public orderProductsAdapter(Context ctx, List<productos> list, FragmentManager f) {
        this.list = list;
        this.ctx=ctx;
        this.frM = f;
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
/*
        ok = v.findViewById(R.id.alertContinuar);
        cancel = v.findViewById(R.id.alertCancelar);
        numberPicker = v.findViewById(R.id.alertNumberP);
*/
        /*dialog = new Dialog(ctx);
        dialog.setContentView(R.layout.custom_alert_numberpicker);
        if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP){
            dialog.getWindow().setBackgroundDrawable(ctx.getDrawable(R.drawable.back_edit_text));
        }
        dialog.getWindow().setLayout(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        dialog.setCancelable(false);*/
/*
        ok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(ctx, "Okey",Toast.LENGTH_SHORT).show();
                dialog.dismiss();
            }
        });
        cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(ctx, "Cancelao :c",Toast.LENGTH_SHORT).show();
                dialog.dismiss();
            }
        });
        //number picker
        numberPicker.setMinValue(1);
        numberPicker.setMaxValue(999);
        numberPicker.setOnValueChangedListener(new NumberPicker.OnValueChangeListener() {
            @Override
            public void onValueChange(NumberPicker picker, int oldVal, int newVal) {
                Toast.makeText(ctx,"Cantidad"+newVal, Toast.LENGTH_SHORT).show();
            }
        });
        */
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialogFragment dialogFragment = new dialogFragment();
                //dialogFragment.setValueChangeListener(valueChangeListener);
                dialogFragment.show(frM,"esa es");

                //alertMessage(v);

                /*    holder.dialog.setContentView(R.layout.custom_alert_numberpicker);
            if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP){
                holder.dialog.getWindow().setBackgroundDrawable(ctx.getDrawable(R.drawable.back_edit_text));
            }
            holder.dialog.getWindow().setLayout(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
            holder.dialog.setCancelable(true);


            ok = v.findViewById(R.id.dialogContinuar);
            cancel = v.findViewById(R.id.dialogCancelar);

            ok.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(ctx,"a ver",Toast.LENGTH_SHORT).show();
                }
            });

                holder.dialog.show();*/
            }
        });

    }






    /*public void alertMessage(View v) {
        DialogInterface.OnClickListener dialogClickListener = new  DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {
                switch (which) {
                    case DialogInterface.BUTTON_POSITIVE: // Yes button clicked
                        Toast.makeText(ctx, "Yes Clicked",
                                Toast.LENGTH_LONG).show();
                        // set your own logic for removal item from listview
                        break;

                    case DialogInterface.BUTTON_NEGATIVE: // No button clicked // do nothing
                        Toast.makeText(ctx, "No Clicked",
                                Toast.LENGTH_LONG).show();
                        break;
                }
            }
        };

        numberPicker = v.findViewById(R.id.alertNumberP);
        numberPicker.setMinValue(1);
        numberPicker.setMaxValue(99);
        numberPicker.setOnValueChangedListener(new NumberPicker.OnValueChangeListener() {
            @Override
            public void onValueChange(NumberPicker picker, int oldVal, int newVal) {
                Toast.makeText(ctx,"Cantidad"+newVal, Toast.LENGTH_SHORT).show();
            }
        });


        AlertDialog.Builder builder = new AlertDialog.Builder(ctx);
        builder.setView(numberPicker);
        builder.setView(R.layout.custom_alert_numberpicker);


        builder.setCancelable(true);
        builder.setMessage("Are you sure?")
                .setPositiveButton("Yes", dialogClickListener)
                .setNegativeButton("No", dialogClickListener).show();
    }*/

    /*public void selectQuantity() {


        Dialog s = new Dialog(ctx);
        s.show();
        dialogFragment newFragment = new dialogFragment();
        newFragment.show();
    }*/



    @Override
    public int getItemCount() {
        return this.list.size();
    }


    public class ViewHolder extends RecyclerView.ViewHolder{
        Context ctx = itemView.getContext();
        public TextView nombre;
        public TextView precio;
        public ImageView img;
        public Dialog dialog;


        public ViewHolder(@NonNull View v) {
            super(v);
            nombre = v.findViewById(R.id.itemNombreOrder);
            precio = v.findViewById(R.id.itemPrecioOrder);
            img = v.findViewById(R.id.itemImgOrder);
            dialog = new Dialog(ctx);
            //numberPicker = v.findViewById(R.id.alertNumberP);
        }

    }

}
