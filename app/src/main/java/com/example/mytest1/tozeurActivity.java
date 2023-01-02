package com.example.mytest1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;

public class tozeurActivity extends AppCompatActivity {
    TabLayout tabLayout;
    ViewPager2 viewPagerTozeur;
    Tozeur_ViewPagerAdapter TozeurViewPagerAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tozeur);


        tabLayout=findViewById(R.id.tab_layout_Tozeur);
        viewPagerTozeur=findViewById(R.id.view_pager_Tozeur);
        TozeurViewPagerAdapter= new Tozeur_ViewPagerAdapter(this);
        viewPagerTozeur.setAdapter(TozeurViewPagerAdapter);

        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPagerTozeur.setCurrentItem(tab.getPosition());
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