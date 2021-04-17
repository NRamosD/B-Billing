package com.example.b_billing.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.b_billing.R;
import com.example.b_billing.adapter.lastSellAdapter;
import com.example.b_billing.adapter.orderProductsAdapter;
import com.example.b_billing.adapter.showProductsAdapter;
import com.example.b_billing.models.ultimasVentas;

import java.util.ArrayList;
import java.util.zip.Inflater;

public class ShowProductFragment extends Fragment {

    private RecyclerView rvShowProducts;
    private ArrayList<ultimasVentas> listUV;
    private FragmentManager fragmentManager;
    showProductsAdapter showProductsAdapter;
    RecyclerView.LayoutManager rvLayoutManager;



    //Para comunicarme con el activity
    ShowProductFragment.OnHeadlineSelectedListener callback;
    public void setOnHeadlineSelectedListener(ShowProductFragment.OnHeadlineSelectedListener callback) {
        this.callback = callback;
    }
    public interface OnHeadlineSelectedListener {
        public void onArticleSelected(int position);
    }

    public ShowProductFragment(FragmentManager f) {
        // Required empty public constructor
        this.fragmentManager = f;
    }

    /*public static Fragment newInstance() {
        return new ShowProductFragment();
    }*/



    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_show_product,container,false);

        //ojo que esa lista no va aqui
        listUV = new ArrayList<>();
        rvShowProducts = v.findViewById(R.id.rvShowProducts);
        rvShowProducts.setLayoutManager(new GridLayoutManager(getContext(),2));
        fillList();

        showProductsAdapter = new showProductsAdapter(getContext(),listUV,fragmentManager);
        rvShowProducts.setAdapter(showProductsAdapter);
        // -------
/*
        rvLayoutManager = new GridLayoutManager(getContext(),2);
        rvShowProducts.setLayoutManager(rvLayoutManager);
        listUV = new ArrayList<>();
        fillList();
        showProductsAdapter = new showProductsAdapter(getContext(), listUV);
        rvShowProducts.setAdapter(showProductsAdapter);
        rvShowProducts.setHasFixedSize(true);
*/






        return v;
    }

    private void fillList() {
        listUV.add(new ultimasVentas("Consumidor final","","25"));
        listUV.add(new ultimasVentas("Consumidor final","","25"));
        listUV.add(new ultimasVentas("Consumidor final","","25"));
        listUV.add(new ultimasVentas("Consumidor final","","25"));
        listUV.add(new ultimasVentas("Consumidor final","","25"));
        listUV.add(new ultimasVentas("Consumidor final","","25"));
    }


}
