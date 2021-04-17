package com.example.b_billing.fragments;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.b_billing.R;
import com.example.b_billing.adapter.lastSellAdapter;

import java.util.ArrayList;

public class EditEraseProductFragment extends DialogFragment {


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        /*// create ContextThemeWrapper from the original Activity Context with the custom theme
        final Context contextThemeWrapper = new ContextThemeWrapper(getActivity(), R.style.Theme_Dialog);

        // clone the inflater using the ContextThemeWrapper
        LayoutInflater localInflater = inflater.cloneInContext(contextThemeWrapper);

        // inflate the layout using the cloned inflater, not default inflater
        return localInflater.inflate(R.layout.fragment_edit_erase_product, container, false);
*/

        View v = inflater.inflate(R.layout.fragment_edit_erase_product,container,false);
        return v;
    }

    @NonNull
    @Override
    public Dialog onCreateDialog(@Nullable Bundle savedInstanceState) {
        Dialog dialog = super.onCreateDialog(savedInstanceState);
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        return dialog;
    }
}
