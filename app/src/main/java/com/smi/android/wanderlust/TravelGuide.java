package com.smi.android.wanderlust;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class TravelGuide extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_view);

        ArrayList<Tour> tourItems = new ArrayList<Tour>();
        tourItems.add(new Tour(R.drawable.lake, getString(R.string.tg_one), getString(R.string.one_loc_tg)));
        tourItems.add(new Tour(R.drawable.rock_garden, getString(R.string.tg_two), getString(R.string.two_loc_tg)));
        tourItems.add(new Tour(R.drawable.rosegarden, getString(R.string.tg_three), getString(R.string.three_loc_tg)));
        tourItems.add(new Tour(R.drawable.zoo, getString(R.string.tg_four), getString(R.string.four_loc_tg)));
        tourItems.add(new Tour(R.drawable.japanesegarden, getString(R.string.tg_five), getString(R.string.five_loc_tg)));

        TourAdapter adapter = new TourAdapter (this, tourItems);
        ListView listView = (ListView)findViewById(R.id.list_id);
        listView.setAdapter(adapter);
    }
}
