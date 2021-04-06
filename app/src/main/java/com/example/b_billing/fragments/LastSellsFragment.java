package com.example.b_billing.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.b_billing.R;
import com.example.b_billing.adapter.lastSellAdapter;
import com.example.b_billing.models.ultimasVentas;
import com.google.android.material.button.MaterialButton;

import java.util.ArrayList;

public class LastSellsFragment extends Fragment {

    private RecyclerView rvLastSell;
    private ArrayList<ultimasVentas> listUV ;
    lastSellAdapter lastSellAdapter;


    //Para comunicarme con el activity
    OnHeadlineSelectedListener callback;
    public void setOnHeadlineSelectedListener(OnHeadlineSelectedListener callback) {
        this.callback = callback;
    }
    public interface OnHeadlineSelectedListener {
        public void onArticleSelected(int position);
    }


    public LastSellsFragment() {
    }

    public static Fragment newInstance() {
        return new LastSellsFragment();
    }







    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View vist= inflater.inflate(R.layout.fragment_lastsells,container,false);
        listUV = new ArrayList<>();
        rvLastSell = vist.findViewById(R.id.rvItemLastSell);
        rvLastSell.setLayoutManager(new LinearLayoutManager(getContext(), RecyclerView.VERTICAL,false));
        fillList();

        lastSellAdapter = new lastSellAdapter(getContext(),listUV);
        rvLastSell.setAdapter(lastSellAdapter);
        return vist;


        /*
        add = (MaterialButton) vist.findViewById(R.id.ADD);
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                HomeAddFragment fr=new HomeAddFragment();
                //fr.setArguments(bn);
                //mando lo que necesito al activity
                callback.onArticleSelected(touch);

                getActivity().getSupportFragmentManager().beginTransaction()
                        .replace(R.id.contenedor,fr)
                        .addToBackStack(null)
                        .commit();

            }
        });*/

        // Inflate the layout for this fragment
        //return inflater.inflate(R.layout.fragment_lastsells, container, false);
    }
    private void fillList() {
        listUV.add(new ultimasVentas("Consumidor final","","25"));
        listUV.add(new ultimasVentas("Consumidor final","","25"));
        listUV.add(new ultimasVentas("Consumidor final","","25"));
    }
}
