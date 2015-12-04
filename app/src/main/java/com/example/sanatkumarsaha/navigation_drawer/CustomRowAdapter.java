package com.example.sanatkumarsaha.navigation_drawer;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Sanat on 02-10-2015.
 */
public class CustomRowAdapter extends ArrayAdapter<CustomRow> {
    Context mContext;
    int layoutResourceId;
    CustomRow data[]=null;

    public CustomRowAdapter(Context mContext, int layoutResourceId, CustomRow[] data){
        super(mContext,layoutResourceId,data);
        this.layoutResourceId = layoutResourceId;
        this.mContext = mContext;
        this.data = data;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItem = convertView;
        LayoutInflater inflater = ((Activity)mContext).getLayoutInflater();
        listItem = inflater.inflate(layoutResourceId,parent,false);
        ImageView imageViewIcon = (ImageView) listItem.findViewById(R.id.imageView);
        TextView textViewName = (TextView) listItem.findViewById(R.id.textView);
        CustomRow folder = data[position];
        imageViewIcon.setImageResource(folder.icon);
        textViewName.setText(folder.name);

        return listItem;
    }
}
