package com.example.b_billing.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.b_billing.R;

public class NewClientFragment extends Fragment {
    public NewClientFragment() {
        // Required empty public constructor
    }

    public static Fragment newInstance() {
        return new NewClientFragment();
    }



    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_new_client, container, false);
        return v;
    }
}
