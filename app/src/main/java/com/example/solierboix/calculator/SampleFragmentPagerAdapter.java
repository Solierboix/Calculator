package com.example.solierboix.calculator;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by Solierboix on 14.03.2017.
 */

public class SampleFragmentPagerAdapter extends FragmentPagerAdapter {
    final int PAGE_COUNT =3;
    private String tabTitles[] = new String[] { "Tab1", "Tab2", "Tab3" };
    private Context context;

    public SampleFragmentPagerAdapter(FragmentManager fm, MainActivity mainActivity) {
        super(fm);
        this.context = context;
    }

    @Override
    public Fragment getItem(int position) {
        return PageFragment.newIstance(position + 1);
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return tabTitles[position];
    }

    @Override
    public int getCount() {
        return PAGE_COUNT;
    }

}
