package com.example.b_billing.fragments;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.NumberPicker;
import android.widget.Toast;

import androidx.fragment.app.DialogFragment;

import com.example.b_billing.R;
import com.example.b_billing.activities.OrderActivity;
import com.google.android.material.button.MaterialButton;


public class dialogFragment extends DialogFragment {

    private NumberPicker.OnValueChangeListener valueChangeListener;



    int cantidadProductos=0;
    int cantidad=1;

    public int getCantidadProductos() {
        return cantidadProductos;
    }

    public void setCantidadProductos(int cantidadProductos) {
        this.cantidadProductos = cantidadProductos;
    }


    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {

        final NumberPicker numberPicker = new NumberPicker(getActivity());

        numberPicker.setMinValue(1);
        numberPicker.setMaxValue(99);
        numberPicker.setOnValueChangedListener(new NumberPicker.OnValueChangeListener() {
            @Override
            public void onValueChange(NumberPicker picker, int oldVal, int newVal) {
                cantidad = newVal;
            }
        });


        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity(),R.style.AlertDialogCustom);
        builder.setTitle("CANTIDAD");
        builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                /*valueChangeListener.onValueChange(numberPicker,
                        numberPicker.getValue(), numberPicker.getValue());*/
                //setCantidadProductos(cantidadProductos++);
                ((OrderActivity)getActivity()).changeStatus(getCantidadProductos());
                //setCantidadProductos(cantidadProductos);
                setCantidad(cantidad);
                Toast.makeText(getContext(), "Seleccionó "+getCantidad()+" prod "+getCantidadProductos(),
                        Toast.LENGTH_SHORT).show();
            }
        });

        builder.setNegativeButton("CANCEL", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                /*valueChangeListener.onValueChange(numberPicker,
                        numberPicker.getValue(), numberPicker.getValue());*/
                Toast.makeText(getContext(), "Acción cancelada",
                        Toast.LENGTH_SHORT).show();
            }
        });



        builder.setView(numberPicker);
        cantidadProductos++;
        setCantidadProductos(cantidadProductos);
        return builder.create();
    }


}


/*public class dialogFragment extends DialogFragment {

    Context ctx;
    MaterialButton ok, cancel;


    public dialogFragment(Context ctxEntrante){
        this.ctx = ctxEntrante;
    }

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());

        // Get the layout inflater
        LayoutInflater inflater = requireActivity().getLayoutInflater();

        // Inflate and set the layout for the dialog
        // Pass null as the parent view because its going in the dialog layout
        builder.setView(inflater.inflate(R.layout.custom_alert_numberpicker, null))
                // Add action buttons
                .setPositiveButton("Continuar", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int id) {
                        Toast.makeText(ctx, "Listo", Toast.LENGTH_SHORT).show();
                    }
                })
                .setNegativeButton("Cancelar", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        dialogFragment.this.getDialog().cancel();
                    }
                });
        return builder.create();
    }


}*/
