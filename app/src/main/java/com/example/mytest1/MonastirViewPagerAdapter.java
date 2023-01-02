package com.example.mytest1;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.example.mytest1.fragment.CoffeFragment;
import com.example.mytest1.fragment.HotelsFragment;
import com.example.mytest1.fragment.MonastirCoffeFragment;
import com.example.mytest1.fragment.MonastirHotelsFragment;

public class MonastirViewPagerAdapter extends FragmentStateAdapter {
    public MonastirViewPagerAdapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position){
            case 0:
                return new MonastirHotelsFragment();
            case 1:
                return new MonastirCoffeFragment();
            default:
                return new MonastirHotelsFragment();
        }
    }

    @Override
    public int getItemCount() {
        return 2;
    }
}
