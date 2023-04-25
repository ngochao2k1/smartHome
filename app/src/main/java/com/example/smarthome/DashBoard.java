package com.example.smarthome;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import com.example.smarthome.room.FragmentAdapter;
import com.google.android.material.tabs.TabLayout;

public class DashBoard extends AppCompatActivity {

    private TextView TvCity, TvNation, TvWeather, TvTemperature,
            TvHumidityAndWind;
    private TabLayout tabLayout;
    private ViewPager2 viewPager2;
    private FragmentAdapter fragmentAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dash_board);
        //
        InitWidget();
        getTabLayOut();

    }

    private void getTabLayOut() {
        tabLayout.addTab(tabLayout.newTab().setText("All Room"));
        tabLayout.addTab(tabLayout.newTab().setText("Bed Room"));
        tabLayout.addTab(tabLayout.newTab().setText("Living Room"));
        tabLayout.addTab(tabLayout.newTab().setText("Dinning Room"));
        tabLayout.addTab(tabLayout.newTab().setText("Bathroom"));

        fragmentAdapter = new FragmentAdapter(getSupportFragmentManager(),getLifecycle());
       // fragmentAdapter = new FragmentAdapter(this);
        viewPager2.setAdapter(fragmentAdapter);

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
        viewPager2.registerOnPageChangeCallback(new ViewPager2.OnPageChangeCallback() {
            @Override
            public void onPageSelected(int position) {
                tabLayout.selectTab(tabLayout.getTabAt(position));
            }
        });
    }


    private void InitWidget() {
        TvCity = findViewById(R.id.TvCity);
        TvNation = findViewById(R.id.TvNation);
        TvWeather = findViewById(R.id.TvWeather);
        TvTemperature = findViewById(R.id.TvTemperature);
        TvNation = findViewById(R.id.TvNation);
        TvHumidityAndWind = findViewById(R.id.TvHumidityAndWind);
        tabLayout = findViewById(R.id.tablayout);
        viewPager2 = findViewById(R.id.viewPage2);
    }
}