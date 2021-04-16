package com.example.b_billing.activities;

import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.MenuItem;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import com.example.b_billing.R;
import com.example.b_billing.adapter.TabsPagesAdapter;
import com.example.b_billing.fragments.NewProductFragment;
import com.example.b_billing.fragments.ShowProductFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.tabs.TabLayout;

public class ProductActivity extends AppCompatActivity {

    BottomNavigationView bottomNavigationView;
    //TabLayout tabLayout;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product);
        bottomNavigationView = findViewById(R.id.bnvProduct);
        bottomNavigationView.setOnNavigationItemSelectedListener(navListener);

        getSupportFragmentManager().beginTransaction().replace(R.id.container_products,new NewProductFragment()).commit();


        /*tabLayout = findViewById(R.id.tabs);

        TabsPagesAdapter tabsPagerAdapter = new TabsPagesAdapter(getSupportFragmentManager(), FragmentPagerAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
        ViewPager vistaP = findViewById(R.id.contentProduct);
        vistaP.setAdapter(tabsPagerAdapter);
        bottomNavigationView.setupWithViewPager(vistaP);*/


    }

    private BottomNavigationView.OnNavigationItemSelectedListener navListener =
        new BottomNavigationView.OnNavigationItemSelectedListener() {
        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            Fragment currentF = null;
            switch (item.getItemId()) {
                case R.id.item_new_product:
                    currentF = new NewProductFragment();
                    break;
                case R.id.item_show_product:
                    currentF = new ShowProductFragment();
                    break;
            }
            getSupportFragmentManager().beginTransaction().replace(R.id.container_products,currentF).commit();
            return true;
        }
    };

}
