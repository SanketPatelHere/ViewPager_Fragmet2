package com.example.viewpager_fragmet2;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

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

        loadFragment(new FirstFragment(), "first");
        //loadFragment(new FirstFragment(), "first");
        Fragment ff = getSupportFragmentManager().findFragmentByTag("first");
        if(ff!=null)
        {
            Log.i("My ff = ","inside");
            loadFragment(ff, "first");  //no new thi object = only save
        } //call only one time = loadFragment = 1 j object
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
            else if(position==1)
            {
                return new SecondFragment();
            }
            else
            {
                return new ThirdFragment();
            }

        }

        @Override
        public int getCount() {
            return 3;
        }
    }
    public void loadFragment(Fragment f, String tag)
    {
        Log.i("My loadFragment = ","called");
        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        //object 2 var nahi bane = 1 j object hovathi
        //ft.replace(R.id.fm, f, tag); //1 two times //extra call = Destroyview1, destroy1, detach1 not call
        ft.add(R.id.fm, f, tag);  //1 two times
        //ft.commitNow();
        ft.commit();
        //ft.commitAllowingStateLoss();
    }
}
