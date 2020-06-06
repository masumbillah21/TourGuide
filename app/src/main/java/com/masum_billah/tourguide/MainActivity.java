package com.masum_billah.tourguide;

import android.os.Build;
import android.os.Bundle;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {



    @RequiresApi(api = Build.VERSION_CODES.KITKAT)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ViewPager viewPager = findViewById(R.id.view_page);

        CategoryAdapter categoryAdapter = new CategoryAdapter(getSupportFragmentManager(), 0, this);
        viewPager.setAdapter(categoryAdapter);

        TabLayout categoryTabs = findViewById(R.id.category_tabs);
        categoryTabs.setupWithViewPager(viewPager);
        categoryAdapter.setupTabIcons(categoryTabs);
    }


}