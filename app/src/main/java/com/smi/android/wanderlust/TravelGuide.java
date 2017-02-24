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
        tourItems.add(new Tour(R.drawable.lake, "Sukhna Lake", "Sector 1"));
        tourItems.add(new Tour(R.drawable.rock_garden, "Rock Garden", "Sector 1"));
        tourItems.add(new Tour(R.drawable.rosegarden, "Rose Garden", "Phase 3B-1, Sector 60"));
        tourItems.add(new Tour(R.drawable.zoo, "ChattBir Zoo", "ChattBir Zoo road, Ajit Singh Nagar"));
        tourItems.add(new Tour(R.drawable.japanesegarden, "Japanese Garden", "Sector 31-A"));

        TourAdapter adapter = new TourAdapter (this, tourItems);
        ListView listView = (ListView)findViewById(R.id.list_id);
        listView.setAdapter(adapter);
    }
}
