package com.example.android.fragmentexercise;

import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;


public class MainActivity extends AppCompatActivity implements FirstFragment.OnFragmentInteractionListener{
    ViewPager pager;
    TabLayout tabLayout;
    FirstFragment fragment1;
    SecondFragment fragment2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fragment1=new FirstFragment();
        fragment2=new SecondFragment();
        pager= (ViewPager) findViewById(R.id.pager);
        pager.setAdapter(new FragmentPagerAdapter(getSupportFragmentManager()) {
            @Override
            public Fragment getItem(int position) {
                switch (position){
                    case 0:return fragment1;
                    case 1:return fragment2;
                }
                return null;
            }

            @Override
            public int getCount() {
                return 2;
            }

            @Override
            public CharSequence getPageTitle(int position) {
                switch (position){
                    case 0:return "Calendar";
                    case 1:return "Events";
                }
                return "";
            }
        });
        tabLayout=findViewById(R.id.tabsLayout);
        tabLayout.setupWithViewPager(pager);

    }

    @Override
    public void onFirstFragmentInteraction(MyEvent event) {
        fragment2.addEvent(event);
        pager.setCurrentItem(pager.getChildCount()-1,true);
    }
}
