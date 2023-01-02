package com.example.mytest1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;

import com.google.android.material.tabs.TabLayout;

public class DetailsActivity extends AppCompatActivity {
    HorizontalScrollView horizontalScrollView;
    TabLayout tabLayout;
    ViewPager2 viewPager2;
    MyViewPagerAdapter myViewPagerAdapter;
    ImageView iconfleche;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);
           horizontalScrollView=findViewById(R.id.scrollImages);
           iconfleche=(ImageView)findViewById(R.id.iconflech);
           tabLayout=findViewById(R.id.tab_layout);
           viewPager2=findViewById(R.id.view_pager);
           myViewPagerAdapter= new MyViewPagerAdapter(this);
           viewPager2.setAdapter(myViewPagerAdapter);

       tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
           @Override
           public void onTabSelected(TabLayout.Tab tab) {
               viewPager2.setCurrentItem(tab.getPosition());
           }

           @Override
           public void onTabUnselected(TabLayout.Tab tab) {

           }

           @Override
           public void onTabReselected(TabLayout.Tab tab) {

           }
       });



       iconfleche.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Intent i=new Intent(DetailsActivity.this,homeActivity.class);
               startActivity(i);
           }
       });
    }

}