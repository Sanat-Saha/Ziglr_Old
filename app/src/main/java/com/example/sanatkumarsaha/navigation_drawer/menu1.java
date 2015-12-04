package com.example.sanatkumarsaha.navigation_drawer;

import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

public class menu1 extends Fragment {
    View rootview;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        rootview = inflater.inflate(R.layout.menu1, container, false);
        CustomRow2[] customRow2 = new CustomRow2[5];
        customRow2[0] = new CustomRow2(R.drawable.night,android.R.drawable.radiobutton_on_background,"Night Club 1","Location 1","48","253"+"/"+"300","27");
        customRow2[1] = new CustomRow2(R.drawable.night,android.R.drawable.radiobutton_on_background,"Night Club 2","Location 2","40","207"+"/"+"400","21");
        customRow2[2] = new CustomRow2(R.drawable.night,android.R.drawable.radiobutton_off_background,"Night Club 3","Location 3","52","133"+"/"+"280","25");
        customRow2[3] = new CustomRow2(R.drawable.night,android.R.drawable.radiobutton_on_background,"Night Club 4","Location 4","60","23"+"/"+"100","28");
        customRow2[4] = new CustomRow2(R.drawable.night,android.R.drawable.radiobutton_off_background,"Night Club 5","Location 5","30","111"+"/"+"150","30");

        CustomRowAdapter2 adapter2 = new CustomRowAdapter2(getActivity(),R.layout.custom_row2,customRow2);
        ListView listView;
        listView = (ListView) rootview.findViewById(R.id.listView);
        listView.setAdapter(adapter2);
        /*listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent i = new Intent(getActivity(), AndroidTabLayoutActivity.class);
                startActivity(i);
            }
        });*/
        return rootview;
    }

}
