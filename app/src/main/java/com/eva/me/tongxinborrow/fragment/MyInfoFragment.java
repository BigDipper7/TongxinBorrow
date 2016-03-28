package com.eva.me.tongxinborrow.fragment;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;

import com.eva.me.tongxinborrow.R;
import com.eva.me.tongxinborrow.activity.PersonalInfoActivity;

/**
 * Created by eva on 16-3-27.
 */
public class MyInfoFragment extends BaseFragment implements View.OnClickListener{
    private View mRootView;
    private Context mContext;

    private RelativeLayout personInfoRL;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //init context
        mContext = getContext();

        //init views
        mRootView = LayoutInflater.from(mContext).inflate(R.layout.fragment_myinfo,
                (ViewGroup) getActivity().findViewById(R.id.main_content), false);

        personInfoRL = (RelativeLayout) mRootView.findViewById(R.id.user_info_rl);


        //bind events and listeners
        personInfoRL.setOnClickListener(this);
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

    /**
     * Called when a view has been clicked.
     *
     * @param v The view that was clicked.
     */
    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.user_info_rl:
                Intent i = new Intent();
                i.setClass(mContext, PersonalInfoActivity.class);
                i.setFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP);
                startActivity(i);
                break;
            default:
                break;
        }
    }
}
