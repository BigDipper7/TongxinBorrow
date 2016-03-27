package com.eva.me.tongxinborrow.fragment;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.eva.me.tongxinborrow.R;

public class LoanFragment extends BaseFragment {
    private View mRootView;
    private Context mContext;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mContext = getContext();
        mRootView = LayoutInflater.from(mContext).inflate(R.layout.fragment_loan,
                (ViewGroup) getActivity().findViewById(R.id.main_content), false);

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
