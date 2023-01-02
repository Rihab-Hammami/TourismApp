package com.example.mytest1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;

public class djerbaActivity extends AppCompatActivity {
    TabLayout tabLayout;
    ViewPager2 viewPagerDjerba;
    DjerbaViewPager djerbaViewPagerAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_djerba);

        tabLayout=findViewById(R.id.tab_layout_Djerba);
        viewPagerDjerba=findViewById(R.id.view_pager_Djerba);
        djerbaViewPagerAdapter= new DjerbaViewPager(this);
        viewPagerDjerba.setAdapter(djerbaViewPagerAdapter);

        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPagerDjerba.setCurrentItem(tab.getPosition());
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