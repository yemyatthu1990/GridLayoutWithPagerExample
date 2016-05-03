package com.yemyatthu.gridlayoutwithpager;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private ViewPager pager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        List<Fragment> fragmentList = new ArrayList<>();
        for(int i = 0; i<6;i++){
            GridFragment gridFragment = GridFragment.newInstance("Fragment "+i);
            fragmentList.add(gridFragment);
        }
        pager = (ViewPager) findViewById(R.id.pager);
        GridPagerAdapter gridPagerAdapter = new GridPagerAdapter(getSupportFragmentManager(),fragmentList);
        pager.setAdapter(gridPagerAdapter);
    }
}
