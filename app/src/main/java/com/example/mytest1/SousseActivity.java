package com.example.mytest1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.viewpager2.widget.ViewPager2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.google.android.material.tabs.TabLayout;

public class SousseActivity extends AppCompatActivity {
    TabLayout tabLayout;
    ViewPager2 viewPagerSousse;
    SoussaViewPagerAdapter soussaViewPagerAdapter;
    View mapFragment;
    ImageView locationSousse;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sousse);

        mapFragment=findViewById(R.id.map);
        locationSousse=findViewById(R.id.Location_Sousse);
        locationSousse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(SousseActivity.this,MapActivity.class);
                startActivity(i);
            }
        });

        tabLayout=findViewById(R.id.tab_layout_Sousse);
        viewPagerSousse=findViewById(R.id.view_pager_Sousse);
        soussaViewPagerAdapter= new SoussaViewPagerAdapter(this);
        viewPagerSousse.setAdapter(soussaViewPagerAdapter);

        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPagerSousse.setCurrentItem(tab.getPosition());
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