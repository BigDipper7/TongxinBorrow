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

public class LoanFragment extends BaseFragment {
    private View mRootView;
    private Context mContext;
    private ListView listView;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //init context
        mContext = getContext();
        //init root view
        mRootView = LayoutInflater.from(mContext).inflate(R.layout.fragment_loan,
                (ViewGroup) getActivity().findViewById(R.id.main_content), false);
        listView = (ListView) mRootView.findViewById(R.id.loan_list_view);

        //
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
