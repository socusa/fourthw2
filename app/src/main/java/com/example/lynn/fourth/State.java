package com.example.lynn.fourth;

import android.content.Context;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.view.View;

import java.util.HashMap;
import java.util.Map;

import static com.example.lynn.fourth.MainActivity.*;

/**
 * Created by lynn on 6/25/2015.
 */
public class State {


    public static Map<String,Double> getAreas() {
        Map<String,Double> areas = new HashMap<>();

        Cursor cursor = database.rawQuery("SELECT * FROM stateinfo;",new String[]{});

        cursor.moveToFirst();

        do {
            int stateIndex = cursor.getColumnIndex("state");
            int areaIndex = cursor.getColumnIndex("area");

            String state = cursor.getString(stateIndex);
            double area = cursor.getDouble(areaIndex);

            areas.put(state.toUpperCase(),area);
        } while (cursor.moveToNext());

        return(areas);
    }

    public static Map<String,String> getAdmissionDates() {
        Map<String,String> datesOfAdmission = new HashMap<>();

        Cursor cursor = database.rawQuery("SELECT * FROM stateinfo;",new String[]{});

        cursor.moveToFirst();

        do {
            int stateIndex = cursor.getColumnIndex("state");
            int dateOfAdmissionIndex = cursor.getColumnIndex("dateofadmission");

            String state = cursor.getString(stateIndex);
            String dateOfAdmission = cursor.getString(dateOfAdmissionIndex);

            datesOfAdmission.put(state.toUpperCase(), dateOfAdmission);
        } while (cursor.moveToNext());

        return(datesOfAdmission);
    }

    public static Map<String,String> getCapitals() {
        Map<String,String> capitals = new HashMap<>();

        Cursor cursor = database.rawQuery("SELECT * FROM stateinfo;",new String[]{});

        cursor.moveToFirst();

        do {
            int stateIndex = cursor.getColumnIndex("state");
            int capitalIndex = cursor.getColumnIndex("capital");

            String state = cursor.getString(stateIndex);
            String capital = cursor.getString(capitalIndex);

            capitals.put(state.toUpperCase(), capital);
        } while (cursor.moveToNext());

        return(capitals);
    }

    /*

    public static Map<String,Drawable> getImages(View view) {
        Map<String,Drawable> images = new HashMap<String,Drawable>();

        images.put("Alabama", view.getResources().getDrawable(R.drawable.alabama));
        images.put("Alaska",view.getResources().getDrawable(R.drawable.alaska));
        images.put("Arizona",view.getResources().getDrawable(R.drawable.arizona));
        images.put("Arkansas",view.getResources().getDrawable(R.drawable.arkansas));
        images.put("California",view.getResources().getDrawable(R.drawable.california));
        images.put("Colorado",view.getResources().getDrawable(R.drawable.colorado));
        images.put("Connecticut",view.getResources().getDrawable(R.drawable.connecticut));
        images.put("Delaware",view.getResources().getDrawable(R.drawable.delaware));
        images.put("Florida",view.getResources().getDrawable(R.drawable.florida));
        images.put("Georgia",view.getResources().getDrawable(R.drawable.georgia));
        images.put("Hawaii",view.getResources().getDrawable(R.drawable.hawaii));
        images.put("Idaho",view.getResources().getDrawable(R.drawable.idaho));
        images.put("Illinois",view.getResources().getDrawable(R.drawable.illinois));
        images.put("Indiana",view.getResources().getDrawable(R.drawable.indiana));
        images.put("Iowa",view.getResources().getDrawable(R.drawable.iowa));
        images.put("Kansas",view.getResources().getDrawable(R.drawable.kansas));
        images.put("Kentucky",view.getResources().getDrawable(R.drawable.kentucky));
        images.put("Louisiana",view.getResources().getDrawable(R.drawable.louisiana));
        images.put("Maine",view.getResources().getDrawable(R.drawable.maine));
        images.put("Maryland",view.getResources().getDrawable(R.drawable.maryland));
        images.put("Massachusetts",view.getResources().getDrawable(R.drawable.massachusetts));
        images.put("Michigan",view.getResources().getDrawable(R.drawable.michigan));
        images.put("Minnesota",view.getResources().getDrawable(R.drawable.minnesota));
        images.put("Mississippi",view.getResources().getDrawable(R.drawable.mississippi));
        images.put("Missouri",view.getResources().getDrawable(R.drawable.missouri));
        images.put("Montana",view.getResources().getDrawable(R.drawable.montana));
        images.put("Nebraska",view.getResources().getDrawable(R.drawable.nebraska));
        images.put("Nevada",view.getResources().getDrawable(R.drawable.nevada));
        images.put("New Hampshire",view.getResources().getDrawable(R.drawable.new_hampshire));
        images.put("New Jersey",view.getResources().getDrawable(R.drawable.new_jersey));
        images.put("New Mexico",view.getResources().getDrawable(R.drawable.new_mexico));
        images.put("New York",view.getResources().getDrawable(R.drawable.new_york));
        images.put("North Carolina",view.getResources().getDrawable(R.drawable.north_carolina));
        images.put("North Dakota",view.getResources().getDrawable(R.drawable.north_dakota));
        images.put("Ohio",view.getResources().getDrawable(R.drawable.ohio));
        images.put("Oklahoma",view.getResources().getDrawable(R.drawable.oklahoma));
        images.put("Oregon",view.getResources().getDrawable(R.drawable.oregon));
        images.put("Pennsylvania",view.getResources().getDrawable(R.drawable.pennsylvania));
        images.put("Rhode Island",view.getResources().getDrawable(R.drawable.rhode_island));
        images.put("South Carolina",view.getResources().getDrawable(R.drawable.south_carolina));
        images.put("South Dakota",view.getResources().getDrawable(R.drawable.south_dakota));
        images.put("Tennessee",view.getResources().getDrawable(R.drawable.tennessee));
        images.put("Texas",view.getResources().getDrawable(R.drawable.texas));
        images.put("Utah",view.getResources().getDrawable(R.drawable.utah));
        images.put("Vermont",view.getResources().getDrawable(R.drawable.vermont));
        images.put("Virginia",view.getResources().getDrawable(R.drawable.virginia));
        images.put("Washington",view.getResources().getDrawable(R.drawable.washington));
        images.put("West Virginia",view.getResources().getDrawable(R.drawable.west_virginia));
        images.put("Wisconsin",view.getResources().getDrawable(R.drawable.wisconsin));
        images.put("Wyoming",view.getResources().getDrawable(R.drawable.wyoming));

        return(images);
    }

    */

    public static Map<String,Integer> getImageIds(View view) {
        Map<String,Integer> imageIds = new HashMap<>();

        imageIds.put("ALABAMA",R.drawable.alabama);
        imageIds.put("ALASKA",R.drawable.alaska);
        imageIds.put("ARIZONA",R.drawable.arizona);
        imageIds.put("ARKANSAS",R.drawable.arkansas);
        imageIds.put("CALIFORNIA",R.drawable.california);
        imageIds.put("COLORADO",R.drawable.colorado);
        imageIds.put("CONNECTICUT",R.drawable.connecticut);
        imageIds.put("DELAWARE",R.drawable.delaware);
        imageIds.put("FLORIDA",R.drawable.florida);
        imageIds.put("GEORGIA",R.drawable.georgia);
        imageIds.put("HAWAII",R.drawable.hawaii);
        imageIds.put("IDAHO",R.drawable.idaho);
        imageIds.put("ILLINOIS",R.drawable.illinois);
        imageIds.put("INDIANA",R.drawable.indiana);
        imageIds.put("IOWA",R.drawable.iowa);
        imageIds.put("KANSAS",R.drawable.kansas);
        imageIds.put("KENTUCKY",R.drawable.kentucky);
        imageIds.put("LOUISIANA",R.drawable.louisiana);
        imageIds.put("MAINE",R.drawable.maine);
        imageIds.put("MARYLAND",R.drawable.maryland);
        imageIds.put("MASSACHUSETTS",R.drawable.massachusetts);
        imageIds.put("MICHIGAN",R.drawable.michigan);
        imageIds.put("MINNESOTA",R.drawable.minnesota);
        imageIds.put("MISSISSIPPI",R.drawable.mississippi);
        imageIds.put("MISSOURI",R.drawable.missouri);
        imageIds.put("MONTANA",R.drawable.montana);
        imageIds.put("NEBRASKA",R.drawable.nebraska);
        imageIds.put("NEVADA",R.drawable.nevada);
        imageIds.put("NEW HAMPSHIRE",R.drawable.new_hampshire);
        imageIds.put("NEW JERSEY",R.drawable.new_jersey);
        imageIds.put("NEW MEXICO",R.drawable.new_mexico);
        imageIds.put("NEW YORK",R.drawable.new_york);
        imageIds.put("NORTH CAROLINA",R.drawable.north_carolina);
        imageIds.put("NORTH DAKOTA",R.drawable.north_dakota);
        imageIds.put("OHIO",R.drawable.ohio);
        imageIds.put("OKLAHOMA",R.drawable.oklahoma);
        imageIds.put("OREGON",R.drawable.oregon);
        imageIds.put("PENNSYLVANIA",R.drawable.pennsylvania);
        imageIds.put("RHODE ISLAND",R.drawable.rhode_island);
        imageIds.put("SOUTH CAROLINA",R.drawable.south_carolina);
        imageIds.put("SOUTH DAKOTA",R.drawable.south_dakota);
        imageIds.put("TENNESSEE",R.drawable.tennessee);
        imageIds.put("TEXAS",R.drawable.texas);
        imageIds.put("UTAH",R.drawable.utah);
        imageIds.put("VERMONT",R.drawable.vermont);
        imageIds.put("VIRGINIA",R.drawable.virginia);
        imageIds.put("WASHINGTON",R.drawable.washington);
        imageIds.put("WEST VIRGINIA",R.drawable.west_virginia);
        imageIds.put("WISCONSIN",R.drawable.wisconsin);
        imageIds.put("WYOMING",R.drawable.wyoming);

        return(imageIds);
    }

    public static Map<Integer,String> getReverseMap(View view) {
        Map<Integer,String> map = new HashMap<>();

        map.put(R.drawable.alabama,"ALABAMA");
        map.put(R.drawable.alaska,"ALASKA");
        map.put(R.drawable.arizona,"ARIZONA");
        map.put(R.drawable.arkansas,"ARKANSAS");
        map.put(R.drawable.california,"CALIFORNIA");
        map.put(R.drawable.colorado,"COLORADO");
        map.put(R.drawable.connecticut,"CONNECTICUT");
        map.put(R.drawable.delaware,"DELAWARE");
        map.put(R.drawable.florida,"FLORIDA");
        map.put(R.drawable.georgia,"GEORGIA");
        map.put(R.drawable.hawaii,"HAWAII");
        map.put(R.drawable.idaho,"IDAHO");
        map.put(R.drawable.illinois,"ILLINOIS");
        map.put(R.drawable.indiana,"INDIANA");
        map.put(R.drawable.iowa,"IOWA");
        map.put(R.drawable.kansas,"KANSAS");
        map.put(R.drawable.kentucky,"KENTUCKY");
        map.put(R.drawable.louisiana,"LOUISIANA");
        map.put(R.drawable.maine,"MAINE");
        map.put(R.drawable.maryland,"MARYLAND");
        map.put(R.drawable.massachusetts,"MASSACHUSETTS");
        map.put(R.drawable.michigan,"MICHIGAN");
        map.put(R.drawable.minnesota,"MINNESOTA");
        map.put(R.drawable.mississippi,"MISSISSIPPI");
        map.put(R.drawable.missouri,"MISSOURI");
        map.put(R.drawable.montana,"MONTANA");
        map.put(R.drawable.nebraska,"NEBRASKA");
        map.put(R.drawable.nevada,"NEVADA");
        map.put(R.drawable.new_hampshire,"NEW HAMPSHIRE");
        map.put(R.drawable.new_jersey,"NEW JERSEY");
        map.put(R.drawable.new_mexico,"NEW MEXICO");
        map.put(R.drawable.new_york,"NEW YORK");
        map.put(R.drawable.north_carolina,"NORTH CAROLINA");
        map.put(R.drawable.north_dakota,"NORTH DAKOTA");
        map.put(R.drawable.ohio,"OHIO");
        map.put(R.drawable.oklahoma,"OKLAHOMA");
        map.put(R.drawable.oregon,"OREGON");
        map.put(R.drawable.pennsylvania,"PENNSYLVANIA");
        map.put(R.drawable.rhode_island,"RHODE ISLAND");
        map.put(R.drawable.south_carolina,"SOUTH CAROLINA");
        map.put(R.drawable.south_dakota,"SOUTH DAKOTA");
        map.put(R.drawable.tennessee,"TENNESSEE");
        map.put(R.drawable.texas,"TEXAS");
        map.put(R.drawable.utah,"UTAH");
        map.put(R.drawable.vermont,"VERMONT");
        map.put(R.drawable.virginia,"VIRGINIA");
        map.put(R.drawable.washington,"WASHINGTON");
        map.put(R.drawable.west_virginia,"WEST VIRGINIA");
        map.put(R.drawable.wisconsin,"WISCONSIN");
        map.put(R.drawable.wyoming,"WYOMING");

        return (map);
    }


}
