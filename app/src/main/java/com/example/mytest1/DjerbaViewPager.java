package com.example.mytest1;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;


import com.example.mytest1.fragment.DjerbaCoffeFragment;
import com.example.mytest1.fragment.DjerbaHotelsFragment;


public class DjerbaViewPager extends FragmentStateAdapter {
    public DjerbaViewPager(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position){
            case 0:
                return new DjerbaHotelsFragment();
            case 1:
                return new DjerbaCoffeFragment();
            default:
                return new DjerbaHotelsFragment();
        }
    }

    @Override
    public int getItemCount() {
        return 2;
    }
}
