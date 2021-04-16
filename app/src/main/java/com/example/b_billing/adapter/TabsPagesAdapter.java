package com.example.b_billing.adapter;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.b_billing.R;
import com.example.b_billing.fragments.NewProductFragment;
import com.example.b_billing.fragments.ShowProductFragment;

public class TabsPagesAdapter extends FragmentPagerAdapter {
    public TabsPagesAdapter(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
    }



    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return NewProductFragment.newInstance();
            case 1:
                return ShowProductFragment.newInstance();
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return 2;
    }
}
