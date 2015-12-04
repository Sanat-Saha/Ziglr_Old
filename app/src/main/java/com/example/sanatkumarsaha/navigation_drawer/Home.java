package com.example.sanatkumarsaha.navigation_drawer;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ViewFlipper;

public class Home extends AppCompatActivity {

    ViewFlipper flipper;
    ViewPager pager;
    CustomSwipeAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        //flipper =(ViewFlipper) findViewById(R.id.viewFlipper);
        Bundle bundle = getIntent().getExtras();
        getSupportActionBar().setTitle(bundle.getString("name"));

        /*pager = (ViewPager)findViewById(R.id.pager);
        adapter = new CustomSwipeAdapter(this);
        pager.setAdapter(adapter);*/
    }

}
