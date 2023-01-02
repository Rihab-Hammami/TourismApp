package com.example.mytest1;


import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.example.mytest1.fragment.CoffeFragment;
import com.example.mytest1.fragment.HotelsFragment;
import com.example.mytest1.fragment.TozeurCoffeFragment;
import com.example.mytest1.fragment.TozeurHotelsFragment;

public class Tozeur_ViewPagerAdapter extends FragmentStateAdapter {
    public Tozeur_ViewPagerAdapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position){
            case 0:
                return new TozeurHotelsFragment();
            case 1:
                return new TozeurCoffeFragment();
            default:
                return new TozeurHotelsFragment();
        }
    }

    @Override
    public int getItemCount() {
        return 2;
    }
}
