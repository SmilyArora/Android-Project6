package com.smi.android.wanderlust;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class Hotels extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_view);
        ArrayList<Tour> tourItems = new ArrayList<Tour>();

        tourItems.add(new Tour(R.drawable.jwmar, getString(R.string.hotel_one), getString(R.string.one_loc_hotel)));
        tourItems.add(new Tour(R.drawable.lalit, getString(R.string.hotel_two), getString(R.string.two_loc_hotel)));
        tourItems.add(new Tour(R.drawable.hayatt, getString(R.string.hotel_three), getString(R.string.three_loc_hotel)));
        tourItems.add(new Tour(R.drawable.toy, getString(R.string.hotel_four), getString(R.string.four_loc_hotel)));
        tourItems.add(new Tour(R.drawable.turquoise, getString(R.string.hotel_five), getString(R.string.five_loc_hotel)));

        TourAdapter adapter = new TourAdapter (this, tourItems);
        ListView listView = (ListView)findViewById(R.id.list_id);
        listView.setAdapter(adapter);
    }
}
