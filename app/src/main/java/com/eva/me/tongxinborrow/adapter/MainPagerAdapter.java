package com.eva.me.tongxinborrow.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.List;

/**
 * Created by eva on 16-3-27.
 */
public class MainPagerAdapter extends FragmentPagerAdapter {
    private List<Fragment> mData = null;

    public MainPagerAdapter(FragmentManager fm, List<Fragment> mData) {
        super(fm);
        this.mData = mData;
    }

    /**
     * Return the Fragment associated with a specified position.
     *
     * @param position
     */
    @Override
    public Fragment getItem(int position) {
        return mData == null? null: mData.get(position);
    }

    /**
     * Return the number of views available.
     */
    @Override
    public int getCount() {
        return mData == null? 0: mData.size();
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return super.getPageTitle(position);
    }
}
