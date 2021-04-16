package com.example.b_billing.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.b_billing.R;

public class NewProductFragment extends Fragment {

    public NewProductFragment() {
        // Required empty public constructor
    }

    public static Fragment newInstance() {
        return new NewProductFragment();
    }



    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_new_product, container, false);
        return v;
    }
}
