package com.example.b_billing.fragments;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.NumberPicker;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatDialogFragment;
import androidx.fragment.app.DialogFragment;

import com.example.b_billing.R;
import com.example.b_billing.activities.OrderActivity;
import com.google.android.material.button.MaterialButton;

public class QuantityFragment extends AppCompatDialogFragment {
    NumberPicker numberPicker;
    @NonNull
    @Override
    public Dialog onCreateDialog(@Nullable Bundle savedInstanceState) {

        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());

        LayoutInflater inflater = getActivity().getLayoutInflater();
        View v = inflater.inflate(R.layout.custom_alert_numberpicker, null);
        builder.setView(v)
                .setTitle("Cantidad")
                .setNegativeButton("Cancelar", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(getContext(),"Canceloooo",Toast.LENGTH_SHORT).show();
                    }
                }).setPositiveButton("Continuar", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(getContext(),"Continuooo",Toast.LENGTH_SHORT).show();
            }
        });

        numberPicker = v.findViewById(R.id.alertNumberP);
        numberPicker.setMinValue(1);
        numberPicker.setMaxValue(999);
        numberPicker.setOnValueChangedListener(new NumberPicker.OnValueChangeListener() {
            @Override
            public void onValueChange(NumberPicker picker, int oldVal, int newVal) {
                Toast.makeText(getContext(),"Cantidad"+newVal, Toast.LENGTH_SHORT).show();
            }
        });

        return builder.create();
    }
}
