package com.think.contactos.adaptador;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;

/**
 * Created by xentinel on 04-Aug-16.
 */
public class pageAdapter extends FragmentPagerAdapter {
    private ArrayList<Fragment> arregloFragments;

    public pageAdapter(FragmentManager fm, ArrayList<Fragment> fragments) {
        super(fm);
        this.arregloFragments=fragments;
    }

    @Override
    public Fragment getItem(int position) {
        return arregloFragments.get(position);
    }

    @Override
    public int getCount() {
        return arregloFragments.size();
    }
}
