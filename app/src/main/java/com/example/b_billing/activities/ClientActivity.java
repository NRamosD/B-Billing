package com.example.b_billing.activities;

import android.os.Bundle;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import com.example.b_billing.R;
import com.example.b_billing.fragments.NewClientFragment;
import com.example.b_billing.fragments.NewProductFragment;
import com.example.b_billing.fragments.ShowClientFragment;
import com.example.b_billing.fragments.ShowProductFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class ClientActivity extends AppCompatActivity {

    BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_client);

        bottomNavigationView = findViewById(R.id.bnvClient);
        bottomNavigationView.setOnNavigationItemSelectedListener(navListener);

        getSupportFragmentManager().beginTransaction().replace(R.id.container_clients,new NewClientFragment()).commit();

    }

    private BottomNavigationView.OnNavigationItemSelectedListener navListener =
            new BottomNavigationView.OnNavigationItemSelectedListener() {
                @Override
                public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                    Fragment currentF = null;
                    switch (item.getItemId()) {
                        case R.id.item_new_product:
                            currentF = new NewClientFragment();
                            break;
                        case R.id.item_show_product:
                            currentF = new ShowClientFragment();
                            break;
                    }
                    getSupportFragmentManager().beginTransaction().replace(R.id.container_clients,currentF).commit();
                    return true;
                }
            };
}
