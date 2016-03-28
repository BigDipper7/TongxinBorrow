package com.eva.me.tongxinborrow.fragment;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

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

    private ListView mListView;

    private ContactsListAdapter contactsListAdapter;
    private List<FenQiListItem> mData;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //initial
        mContext = getContext();

        //init views
        mRootView = LayoutInflater.from(mContext).inflate(R.layout.fragment_fenqi,
                (ViewGroup) getActivity().findViewById(R.id.main_content), false);
        mListView = (ListView) mRootView.findViewById(R.id.fenqi_list_view);

        //init data
        mData = new ArrayList<>();
        FenQiListItem item0=new FenQiListItem(R.drawable.gre,"GRE 冲刺班", "￥2380.00 (￥199.00 * 12期)");
        mData.add(item0);
        FenQiListItem item1=new FenQiListItem(R.drawable.deyu,"德福写作强化班", "￥580.00 (￥194.00 * 3期)");
        mData.add(item1);
        FenQiListItem item2=new FenQiListItem(R.drawable.kaoyan,"2017考研冲刺班", "￥2380.00 (￥199.00 * 12期)");
        mData.add(item2);

        //init adapter
        contactsListAdapter = new ContactsListAdapter(mContext, mData);

        //init callbacks
        mListView.setAdapter(contactsListAdapter);
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
