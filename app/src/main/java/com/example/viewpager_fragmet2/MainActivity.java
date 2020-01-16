package com.example.viewpager_fragmet2;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    ViewPager mPager;
    SliderPagerAdapter mPagerAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mPager = (ViewPager)findViewById(R.id.pager);
        mPagerAdapter = new SliderPagerAdapter(getSupportFragmentManager());
        mPager.setAdapter(mPagerAdapter);
    }

    public class SliderPagerAdapter extends FragmentPagerAdapter
    {

        public SliderPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            if(position==0)
            {
                return new RootFragment();
                //return new FirstFragment();
            }
            /*else if(position==1)
            {
                return new SecondFragment();
            }*/
            else
            {
                //return new ThirdFragment();
                return new StaticFragment();
            }

        }

        @Override
        public int getCount() {
            return 3;
        }
    }
}
