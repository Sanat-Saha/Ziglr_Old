package com.example.sanatkumarsaha.navigation_drawer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class Feeds extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feeds);

        Bundle bundle = getIntent().getExtras();

        getSupportActionBar().setTitle(bundle.getString("name"));
    }

}
