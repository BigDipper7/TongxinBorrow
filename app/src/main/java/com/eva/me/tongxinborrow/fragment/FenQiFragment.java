package com.eva.me.tongxinborrow.fragment;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.eva.me.tongxinborrow.R;
import com.eva.me.tongxinborrow.adapter.ContactsListAdapter;
import com.eva.me.tongxinborrow.module.FenQiListItem;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by eva on 16-3-27.
 */
public class FenQiFragment extends BaseFragment {
    private View mRootView;
    private Context mContext;
    private ContactsListAdapter contactsListAdapter;
    private List<FenQiListItem> mData;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mContext = getContext();
        mRootView = LayoutInflater.from(mContext).inflate(R.layout.fragment_fenqi,
                (ViewGroup) getActivity().findViewById(R.id.main_content), false);

        mData = new ArrayList<>();
        FenQiListItem item0=new FenQiListItem(0,"GRE 冲刺班", "￥2380.00 (￥199.00 * 12期)");
        mData.add(item0);

        contactsListAdapter = new ContactsListAdapter(mContext, mData);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        ViewGroup p = (ViewGroup) mRootView.getParent();

        if (p != null) {
            p.removeAllViewsInLayout();
        }
        return mRootView;
    }
}
