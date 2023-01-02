package com.example.mytest1;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.example.mytest1.fragment.DjerbaCoffeFragment;
import com.example.mytest1.fragment.DjerbaHotelsFragment;
import com.example.mytest1.fragment.SousseCoffeFragment;
import com.example.mytest1.fragment.SousseHotelsFragment;

public class SoussaViewPagerAdapter extends FragmentStateAdapter {
    public SoussaViewPagerAdapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position){
            case 0:
                return new SousseHotelsFragment();
            case 1:
                return new SousseCoffeFragment();
            default:
                return new SousseHotelsFragment();
        }
    }

    @Override
    public int getItemCount() {
        return 2;
    }
}
