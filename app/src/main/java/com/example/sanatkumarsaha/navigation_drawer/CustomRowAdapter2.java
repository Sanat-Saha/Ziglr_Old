package com.example.sanatkumarsaha.navigation_drawer;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by Sanat on 04-10-2015.
 */
public class CustomRowAdapter2 extends ArrayAdapter<CustomRow2> {

    Context mContext;
    int layoutResourceId;
    CustomRow2 data[]=null;

    public CustomRowAdapter2(Context mContext, int layoutResourceId, CustomRow2[] data){
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
        ImageButton imageButton = (ImageButton) listItem.findViewById(R.id.imageButton);
        TextView name = (TextView) listItem.findViewById(R.id.name);
        TextView location = (TextView) listItem.findViewById(R.id.location);
        TextView female = (TextView) listItem.findViewById(R.id.female);
        TextView age = (TextView) listItem.findViewById(R.id.age);
        TextView occupancy = (TextView) listItem.findViewById(R.id.occupancy);
        Typeface face= Typeface.createFromAsset(getContext().getAssets(), "fonts/Aaargh.ttf");
        name.setTypeface(face);
        location.setTypeface(face);
        female.setTypeface(face);
        age.setTypeface(face);
        occupancy.setTypeface(face);
        final CustomRow2 folder = data[position];
        imageViewIcon.setImageResource(folder.availabilityIcon);
        name.setText(folder.NightName + ",");
        location.setText(folder.NightLocation);
        female.setText("Female"+"\n"+folder.NightFemale+"%");
        age.setText("Age"+"\n"+folder.NightAge);
        occupancy.setText("Occupancy"+"\n"+folder.NightOccupancy);
        listItem.setBackgroundResource(folder.backgroundImage);
        listItem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getContext(), Ziglr.class);
                i.putExtra("name", folder.NightName);
                i.putExtra("location", folder.NightLocation);
                i.putExtra("female", folder.NightFemale);
                i.putExtra("age", folder.NightAge);
                i.putExtra("occupancy", folder.NightOccupancy);
                mContext.startActivity(i);

            }
        });
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                    Intent i = new Intent(getContext(),MapsActivity.class);
                i.putExtra("location",folder.NightName);
                    mContext.startActivity(i);
                }

        });
        return listItem;
    }


}
