package com.example.mytest1;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.example.mytest1.fragment.CoffeFragment;
import com.example.mytest1.fragment.HotelsFragment;

public class MyViewPagerAdapter extends FragmentStateAdapter {
    public MyViewPagerAdapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position){
            case 0:
           return new HotelsFragment();
            case 1:
                return new CoffeFragment();
            default:
                return new HotelsFragment();
        }
    }

    @Override
    public int getItemCount() {
        return 2;
    }
}
