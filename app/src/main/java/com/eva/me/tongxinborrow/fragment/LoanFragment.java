package com.eva.me.tongxinborrow.fragment;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.eva.me.tongxinborrow.R;
import com.eva.me.tongxinborrow.adapter.LoanListAdapter;
import com.eva.me.tongxinborrow.module.LoanInfoItem;

import java.util.ArrayList;
import java.util.List;

public class LoanFragment extends BaseFragment {
    private View mRootView;
    private Context mContext;
    private ListView listView;

    private List<LoanInfoItem> mData;
    private LoanListAdapter mLoanListAdapter;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //init context
        mContext = getContext();
        //init root view
        mRootView = LayoutInflater.from(mContext).inflate(R.layout.fragment_loan,
                (ViewGroup) getActivity().findViewById(R.id.main_content), false);
        listView = (ListView) mRootView.findViewById(R.id.loan_list_view);

        //init data
        mData = new ArrayList<>();

        LoanInfoItem item0 = new LoanInfoItem("[普通贷款]","￥220 元","2016-04-01 13：00");
        LoanInfoItem item1 = new LoanInfoItem("[快速贷款]","￥200 元","2016-04-04 12：00");
        LoanInfoItem item2 = new LoanInfoItem("[快速贷款]","￥100 元","2016-04-10 14：40");
        LoanInfoItem item3 = new LoanInfoItem("[普通贷款]","￥1000 元","2016-04-11 12：00");
        LoanInfoItem item4 = new LoanInfoItem("[普通贷款]","￥890 元","2016-04-13 1：00");

        mData.add(item0);
        mData.add(item1);
        mData.add(item2);
        mData.add(item3);
        mData.add(item4);


        mLoanListAdapter = new LoanListAdapter(mContext,mData);
        listView.setAdapter(mLoanListAdapter);
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
