package com.eva.me.tongxinborrow.adapter;

import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.eva.me.tongxinborrow.R;
import com.eva.me.tongxinborrow.module.FenQiListItem;
import com.eva.me.tongxinborrow.util.Logger;
import com.eva.me.tongxinborrow.view.CircleImageView;

import java.util.List;



/**
 * Created by Ken on 2015/2/26.
 */
public class ContactsListAdapter extends BaseAdapter {

    private static final String TAG = ContactsListAdapter.class.getSimpleName();

//    private List<String> mList;
    private List<FenQiListItem> mData;
    private Context mContext;
    private LayoutInflater mInflater;
//    private int mDensityDpi;

    public ContactsListAdapter(Context context, List<FenQiListItem> mData){
        this.mContext = context;
//        this.mList = list;
        this.mInflater = LayoutInflater.from(context);
        this.mData = mData;
//        this.mDensityDpi = densityDpi;
    }


    @Override
    public int getCount() {
        if (mData == null) {
            return 0;
        }
        return mData.size();
    }

    @Override
    public FenQiListItem getItem(int i) {
        return mData.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Logger.d(TAG, "get view at : "+position);

        final ViewHolder viewHolder;

        if (convertView == null) {
            Logger.d(TAG, "convertView is null");
            convertView = mInflater.inflate(R.layout.list_view_contact_item, null);

            viewHolder = new ViewHolder();
            viewHolder.alpha = (TextView) convertView.findViewById(R.id.alpha);
            viewHolder.title = (TextView) convertView.findViewById(R.id.name);
            viewHolder.descripton = (TextView) convertView.findViewById(R.id.description);
            viewHolder.headIcon = (CircleImageView) convertView.findViewById(R.id.contact_avatar);

//            if (mDensityDpi <= 160) {
//                viewHolder.title.setEms(6);
//            }else if (mDensityDpi <= 240) {
//                viewHolder.title.setEms(8);
//            }else {
//                viewHolder.title.setEms(10);
//            }

            convertView.setTag(viewHolder);
        } else {
            Logger.d(TAG, "convertView is not null");
            viewHolder = (ViewHolder) convertView.getTag();
        }

        //init current item view
        FenQiListItem item = mData.get(position);
//        Logger.d(TAG, "[userinfo] current user info is "+userInfo);

        viewHolder.title.setText(item.txtTitle);
        viewHolder.descripton.setText(item.txtContent);
        viewHolder.headIcon.setImageResource(item.imgResID==0?R.drawable.head_icon:item.imgResID);

        return convertView;
    }

    private static class ViewHolder {
        TextView alpha;
        CircleImageView headIcon;
        TextView title;
        TextView descripton;
    }
}
