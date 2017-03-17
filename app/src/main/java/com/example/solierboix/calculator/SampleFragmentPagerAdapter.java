package com.example.solierboix.calculator;


import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by Solierboix on 14.03.2017.
 */

public class SampleFragmentPagerAdapter extends FragmentPagerAdapter {
    int nNumofTabs;


    public SampleFragmentPagerAdapter(FragmentManager fm, int NumOfTabs) {
        super(fm);
        this.nNumofTabs = NumOfTabs;


    }


    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                TabFragment1 tab1 = new TabFragment1();
                return tab1;
            case 1:
                TabFragment2 tab2 = new TabFragment2();
                return tab2;
            case 2:
                TabFragment3 tab3 = new TabFragment3();
                return tab3;
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return nNumofTabs;
    }
}
