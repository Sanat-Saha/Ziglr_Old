package com.example.sanatkumarsaha.navigation_drawer;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;

/**
 * Created by Sanat on 25-10-2015.
 */
public class CustomSwipeAdapter extends PagerAdapter {

    private int[] imgres = {R.drawable.night,R.drawable.temp};
    private Context ctx;
    private LayoutInflater inflater;
    public CustomSwipeAdapter(Context ctx){
        this.ctx = ctx;
    }

    @Override
    public int getCount() {
        return imgres.length;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return (view==(LinearLayout)object);
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        inflater = (LayoutInflater) ctx.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view = inflater.inflate(R.layout.swipe_layout,container,false);
        ImageView imageView =(ImageView) view.findViewById(R.id.imageView3);
        imageView.setImageResource(imgres[position]);
        container.addView(view);
        return view;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView((LinearLayout)object);
    }
}
