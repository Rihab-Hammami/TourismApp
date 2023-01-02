package com.example.mytest1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;

public class MonastirActivity extends AppCompatActivity {
    TabLayout tabLayout;
    ViewPager2 viewPagerMonastir;
    MonastirViewPagerAdapter monastirViewPagerAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_monastir);

        tabLayout=findViewById(R.id.tab_layout_Monastir);
        viewPagerMonastir=findViewById(R.id.view_pager_Monastir);
        monastirViewPagerAdapter= new MonastirViewPagerAdapter(this);
        viewPagerMonastir.setAdapter(monastirViewPagerAdapter);

        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPagerMonastir.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
    }
}