package com.example.azizainun.myapplication;

/**
 * Created by AzizAinun on 9/22/2016.
 */

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.example.azizainun.myapplication.Tab1Fragment;
import com.example.azizainun.myapplication.Tab2Fragment;

public class TabFragmentPagerAdapter extends FragmentPagerAdapter {
    String [] title = new String[] {"tab 1, tab 2"};
    public TabFragmentPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    public Fragment getItem(int position) {
        Fragment fragment = null;
        switch (position){
            case 0:
                fragment = new Tab1Fragment();
                break;
            case 1:
                fragment = new Tab2Fragment();
                break;
            default:
                fragment = null;
                break;
        }
        return fragment;
    }

    public CharSequence getPageTitle (int position) {
        return title[position];
    }

    public int getCount() {
        return title.length;
    }
}
