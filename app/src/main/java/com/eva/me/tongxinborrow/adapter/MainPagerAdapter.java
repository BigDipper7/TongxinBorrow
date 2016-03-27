package com.eva.me.tongxinborrow.adapter;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.eva.me.tongxinborrow.R;

import java.util.List;

/**
 * Created by eva on 16-3-27.
 */
public class MainPagerAdapter extends FragmentPagerAdapter {
    private List<Fragment> mData = null;
    private Context mConext = null;

    public MainPagerAdapter(FragmentManager fm, List<Fragment> mData, Context context) {
        super(fm);
        this.mData = mData;
        this.mConext = context;
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
        switch (position) {
            case 0:
                return mConext.getString(R.string.page_0);
//                break;
            case 1:
                return mConext.getString(R.string.page_1);
//                break;
            case 2:
                return mConext.getString(R.string.page_2);
//                break;
            case 3:
                return mConext.getString(R.string.page_3);
//                break;
            default:
                return null;
//                break;
        }
//        return null;
    }
}
