package com.example.sanatkumarsaha.navigation_drawer;

import android.view.View;

/**
 * Created by Sanat on 04-10-2015.
 */
public class CustomRow2 {
    public int backgroundImage;
    public int availabilityIcon;
    public int locationIcon;
    public String NightName;
    public String NightLocation;
    public String NightOccupancy;
    public String NightAge;
    public String NightFemale;
    public CustomRow2(int backgroundImage,int availabilityIcon, String NightName, String NightLocation, String NightFemale,String NightOccupancy, String NightAge){
        this.backgroundImage = backgroundImage;
        this.availabilityIcon = availabilityIcon;
        this.NightAge = NightAge;
        this.NightName = NightName;
        this.NightLocation = NightLocation;
        this.NightFemale = NightFemale;
        this.NightOccupancy = NightOccupancy;
        this.locationIcon = locationIcon;
    }



}
