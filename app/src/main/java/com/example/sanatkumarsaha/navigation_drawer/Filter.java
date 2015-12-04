package com.example.sanatkumarsaha.navigation_drawer;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.hardware.display.DisplayManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Display;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.SeekBar;
import android.widget.Switch;
import android.widget.TextView;
import android.graphics.Color;

public class Filter extends AppCompatActivity {

    private static SeekBar distancebar;
    private static SeekBar ratingbar;
    private static TextView distance,rating;
    Button b1,b2;
    int valf=-1,vala=-1,vale=-1,valo=-1,vald=-1,valr=-1;

    Switch aSwitch;
    boolean open=false,music_all = false,music_bollywood = false,music_hiphop=false,music_edm=false,music_pop=false,music_drum=false,music_jazz=false,music_rock=false,music_metal=false,music_live=false;
    CheckBox all,bollywood,hiphop,edm,pop,drum,jazz,rock,metal,live,ffirst,fsecond,fthird,ffourth,ofirst,osecond,othird,ofourth,afirst,asecond,athird,afourth,efirst,esecond,ethird,efourth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_filter);

        b1 = (Button)findViewById(R.id.applydefault);
        b2 = (Button)findViewById(R.id.apply);

        aSwitch = (Switch) findViewById(R.id.switch_open);

        Display display = getWindowManager().getDefaultDisplay();
        Point size = new Point();
        display.getSize(size);
        int width = size.x;

        b1.setWidth((int) (0.45 * width));
        b2.setWidth((int) (0.45 * width));

        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        all = (CheckBox)findViewById(R.id.all);
        bollywood = (CheckBox)findViewById(R.id.bollywood);
        hiphop = (CheckBox)findViewById(R.id.hiphop);
        edm = (CheckBox)findViewById(R.id.edm);
        pop = (CheckBox)findViewById(R.id.pop);
        drum = (CheckBox )findViewById(R.id.drum);
        jazz = (CheckBox)findViewById(R.id.jazz);
        rock = (CheckBox)findViewById(R.id.rock);
        metal = (CheckBox)findViewById(R.id.metal);
        live = (CheckBox)findViewById(R.id.live);
        ffirst = (CheckBox) findViewById(R.id.ffirst);
        fsecond = (CheckBox) findViewById(R.id.fsecond);
        fthird = (CheckBox) findViewById(R.id.fthird);
        ffourth = (CheckBox) findViewById(R.id.ffourth);
        ofirst = (CheckBox) findViewById(R.id.ofirst);
        osecond = (CheckBox) findViewById(R.id.osecond);
        othird = (CheckBox) findViewById(R.id.othird);
        ofourth = (CheckBox) findViewById(R.id.ofourth);
        afirst = (CheckBox) findViewById(R.id.afirst);
        asecond = (CheckBox) findViewById(R.id.asecond);
        athird = (CheckBox) findViewById(R.id.athird);
        afourth = (CheckBox) findViewById(R.id.afourth);
        efirst = (CheckBox) findViewById(R.id.efirst);
        esecond = (CheckBox) findViewById(R.id.esecond);
        ethird = (CheckBox) findViewById(R.id.ethird);
        efourth = (CheckBox) findViewById(R.id.efourth);

        distancebar = (SeekBar) findViewById(R.id.distancebar);
        ratingbar = (SeekBar) findViewById(R.id.ratingbar);
        ratingbar.setRotation(180);

        distance = (TextView) findViewById(R.id.distance);
        rating = (TextView) findViewById(R.id.rating);


        distancebar.setProgress(50);
        ratingbar.setProgress(2);

        distance.setText( distancebar.getProgress() + "km");
        rating.setText("Rating >= " + Integer.toString(ratingbar.getMax() - ratingbar.getProgress()));
        distancebar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            int progressval;

            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                progressval = progress;
                distance.setText( progressval + "km");
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                distance.setText( progressval + "km");
            }
        });

        ratingbar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            int progressval;

            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                progressval = progress;
                rating.setText("Rating >= " +Integer.toString(ratingbar.getMax() - progressval));
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                rating.setText("Rating >= " +Integer.toString(ratingbar.getMax() - progressval) );
            }
        });








    }




    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_ziglr, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }
        if (id==android.R.id.home){
            onBackPressed();
            return true;
        }

        return super.onOptionsItemSelected(item);
    }


    public void defaultClicked(View v){

        distancebar.setProgress(50);
        ratingbar.setProgress(2);

        fthird.setChecked(true);
        valf = 3;
        fsecond.setChecked(false);
        ffirst.setChecked(false);
        ffourth.setChecked(false);

        asecond.setChecked(true);
        vala = 2;
        afirst.setChecked(false);
        athird.setChecked(false);
        afourth.setChecked(false);

        osecond.setChecked(true);
        valo = 2;
        ofirst.setChecked(false);
        othird.setChecked(false);
        ofourth.setChecked(false);

        ethird.setChecked(true);
        vale = 3;
        esecond.setChecked(false);
        efirst.setChecked(false);
        efourth.setChecked(false);

        distance.setText(distancebar.getProgress() + "km");
        rating.setText("Rating >= " + Integer.toString(ratingbar.getMax() - ratingbar.getProgress()));

        aSwitch.setChecked(false);
        aSwitch.setText("All");

    }
    public void applyClicked(View v){

        Intent i = new Intent(this,MainActivity.class);
        vald = distancebar.getProgress();
        valr = 5-ratingbar.getProgress();
        i.putExtra("open",aSwitch.isChecked());
        i.putExtra("female",valf);
        i.putExtra("occupancy",valo);
        i.putExtra("fee",vale);
        i.putExtra("age",vala);
        i.putExtra("distance",vald);
        i.putExtra("rating",valr);
        if (music_all == true)
            i.putExtra("music_all",true);
        else {
            i.putExtra("music_all",false);
            i.putExtra("bollywood",bollywood.isChecked());
            i.putExtra("hiphop",hiphop.isChecked());
            i.putExtra("edm",edm.isChecked());
            i.putExtra("pop",pop.isChecked());
            i.putExtra("drum",drum.isChecked());
            i.putExtra("jazz",jazz.isChecked());
            i.putExtra("rock",rock.isChecked());
            i.putExtra("metal",metal.isChecked());
            i.putExtra("live",live.isChecked());
        }

    }



    public void ratioClicked(View v){
        CheckBox t = (CheckBox) findViewById(v.getId());
        switch (v.getId()){
            case R.id.ffirst:
                if (!t.isChecked()){
                    t.setChecked(false);
                    valf = -1;
                } else {
                    t.setChecked(true);
                    valf = 1;
                    fsecond.setChecked(false);
                    fthird.setChecked(false);
                    ffourth.setChecked(false);


                } break;
            case R.id.fsecond:
                if (!t.isChecked()){
                    t.setChecked(false);
                    valf = -1;
                } else {
                    t.setChecked(true);
                    valf = 2;
                    ffirst.setChecked(false);
                    fthird.setChecked(false);
                    ffourth.setChecked(false);


                } break;
            case R.id.fthird:
                if (!t.isChecked()){
                    t.setChecked(false);
                    valf = -1;
                } else {
                    t.setChecked(true);
                    valf = 3;
                    fsecond.setChecked(false);
                    ffirst.setChecked(false);
                    ffourth.setChecked(false);


                } break;
            case R.id.ffourth:
                if (!t.isChecked()){
                    t.setChecked(false);
                    valf = -1;
                } else {
                    t.setChecked(true);
                    valf = 4;
                    fsecond.setChecked(false);
                    fthird.setChecked(false);
                    ffirst.setChecked(false);


                } break;
            default:
                return;

        }

    }

    public void occupancyClicked(View v) {
        CheckBox t = (CheckBox) findViewById(v.getId());
        switch (v.getId()) {
            case R.id.ofirst:
                if (!t.isChecked()) {
                    t.setChecked(false);
                    valo = -1;
                } else {
                    t.setChecked(true);
                    valo = 1;
                    osecond.setChecked(false);
                    othird.setChecked(false);
                    ofourth.setChecked(false);


                }
                break;
            case R.id.osecond:
                if (!t.isChecked()) {
                    t.setChecked(false);
                    valo = -1;
                } else {
                    t.setChecked(true);
                    valo = 2;
                    ofirst.setChecked(false);
                    othird.setChecked(false);
                    ofourth.setChecked(false);


                }
                break;
            case R.id.othird:
                if (!t.isChecked()) {
                    t.setChecked(false);
                    valo = -1;
                } else {
                    t.setChecked(true);
                    valo = 3;
                    osecond.setChecked(false);
                    ofirst.setChecked(false);
                    ofourth.setChecked(false);


                }
                break;
            case R.id.ofourth:
                if (!t.isChecked()) {
                    t.setChecked(false);
                    valo = -1;
                } else {
                    t.setChecked(true);
                    valo = 4;
                    osecond.setChecked(false);
                    othird.setChecked(false);
                    ofirst.setChecked(false);


                }
                break;
            default:
                return;

        }
    }
    public void feeClicked(View v){
        CheckBox t = (CheckBox) findViewById(v.getId());
        switch (v.getId()){
            case R.id.efirst:
                if (!t.isChecked()){
                    t.setChecked(false);
                    vale = -1;
                } else {
                    t.setChecked(true);
                    vale = 1;
                    esecond.setChecked(false);
                    ethird.setChecked(false);
                    efourth.setChecked(false);


                } break;
            case R.id.esecond:
                if (!t.isChecked()){
                    t.setChecked(false);
                    vale = -1;
                } else {
                    t.setChecked(true);
                    vale = 2;
                    efirst.setChecked(false);
                    ethird.setChecked(false);
                    efourth.setChecked(false);


                } break;
            case R.id.ethird:
                if (!t.isChecked()){
                    t.setChecked(false);
                    vale = -1;
                } else {
                    t.setChecked(true);
                    vale = 3;
                    esecond.setChecked(false);
                    efirst.setChecked(false);
                    efourth.setChecked(false);


                } break;
            case R.id.efourth:
                if (!t.isChecked()){
                    t.setChecked(false);
                    vale = -1;
                } else {
                    t.setChecked(true);
                    vale = 4;
                    esecond.setChecked(false);
                    ethird.setChecked(false);
                    efirst.setChecked(false);


                } break;
            default:
                return;

        }

    }

    public void ageClicked(View v) {
        CheckBox t = (CheckBox) findViewById(v.getId());
        switch (v.getId()) {
            case R.id.afirst:
                if (!t.isChecked()) {
                    t.setChecked(false);
                    vala = -1;
                } else {
                    t.setChecked(true);
                    vala = 1;
                    asecond.setChecked(false);
                    athird.setChecked(false);
                    afourth.setChecked(false);


                }
                break;
            case R.id.asecond:
                if (!t.isChecked()) {
                    t.setChecked(false);
                    vala = -1;
                } else {
                    t.setChecked(true);
                    vala = 2;
                    afirst.setChecked(false);
                    athird.setChecked(false);
                    afourth.setChecked(false);


                }
                break;
            case R.id.athird:
                if (!t.isChecked()) {
                    t.setChecked(false);
                    vala = -1;
                } else {
                    t.setChecked(true);
                    vala = 3;
                    asecond.setChecked(false);
                    afirst.setChecked(false);
                    afourth.setChecked(false);


                }
                break;
            case R.id.afourth:
                if (!t.isChecked()) {
                    t.setChecked(false);
                    vala = -1;
                } else {
                    t.setChecked(true);
                    vala = 4;
                    asecond.setChecked(false);
                    athird.setChecked(false);
                    afirst.setChecked(false);


                }
                break;
            default:
                return;

        }
    }

    public void allClicked(View v){

        CheckBox t = (CheckBox) findViewById(v.getId());

        if (t.isChecked()) {
//            t.setChecked(false);
            music_all = true;
            bollywood.setChecked(true);hiphop.setChecked(true);edm.setChecked(true);pop.setChecked(true);drum.setChecked(true);
            jazz.setChecked(true);rock.setChecked(true);metal.setChecked(true);live.setChecked(true);
        } else {
//            t.setChecked(true);
            music_all = false;

            bollywood.setChecked(false);hiphop.setChecked(false);edm.setChecked(false);pop.setChecked(false);drum.setChecked(false);
            jazz.setChecked(false);rock.setChecked(false);metal.setChecked(false);live.setChecked(false);

        }

    }

    public  void  switch_click(View v){
        Switch s = (Switch)v.findViewById(R.id.switch_open);
        if(s.isChecked())
        s.setText("Only Open");
        else s.setText("All");
    }

    public void music_clicked(View v) {
        CheckBox t = (CheckBox) findViewById(v.getId());
        if (!t.isChecked()) {
            all.setChecked(false);
            music_all = false;
        }
        /*switch (v.getId()) {
            case R.id.bollywood:
                if (!t.isChecked()) {
                    t.setChecked(false);
                    music_bollywood = false;
                } else {
                    t.setChecked(true);
                    music_bollywood = true;
                    }
                break;
            case R.id.hiphop:
                if (!t.isChecked()) {
                    t.setChecked(false);
                    music_hiphop = false;
                } else {
                    t.setChecked(true);
                    music_hiphop = true;


                }
                break;
            case R.id.edm:
                if (!t.isChecked()) {
                    t.setChecked(false);
                    music_edm = false;
                } else {
                    t.setChecked(true);
                    music_edm = true;


                }
                break;
            case R.id.pop:
                if (!t.isChecked()) {
                    t.setChecked(false);
                    music_pop = false;
                } else {
                    t.setChecked(true);
                    music_pop = true;


                }
                break;
            case R.id.drum:
                if (!t.isChecked()) {
                    t.setChecked(false);
                    music_drum = false;
                } else {
                    t.setChecked(true);
                    music_drum = true;


                }
                break;
            case R.id.jazz:
                if (!t.isChecked()) {
                    t.setChecked(false);
                    music_jazz = false;
                } else {
                    t.setChecked(true);
                    music_jazz = true;


                }
                break;
            case R.id.rock:
                if (!t.isChecked()) {
                    t.setChecked(false);
                    music_rock = false;
                } else {
                    t.setChecked(true);
                    music_rock = true;


                }
                break;
            case R.id.metal:
                if (!t.isChecked()) {
                    t.setChecked(false);
                    music_metal = false;
                } else {
                    t.setChecked(true);
                    music_metal = true;


                }
                break;
            case R.id.live:
                if (!t.isChecked()) {
                    t.setChecked(false);
                    music_live = false;
                } else {
                    t.setChecked(true);
                    music_live = true;


                }
                break;
            default:
                return;

        }*/
    }

    public void Switch_Click(View v){



    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }
}
