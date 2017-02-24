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
        tourItems.add(new Tour(R.drawable.jwmar, "JW Marriott Hotel", "Dakshin Marg"));
        tourItems.add(new Tour(R.drawable.lalit, "The Lalit", "Rajiv Gandhi Technology Park"));
        tourItems.add(new Tour(R.drawable.hayatt, "Hyatt Regency", "178 Industrial And Business Park"));
        tourItems.add(new Tour(R.drawable.toy, "The Toy Hotel", "Sco 165 - 167"));
        tourItems.add(new Tour(R.drawable.turquoise, "Hotel Turquoise", "29/7 Industrial & Business Park"));

        TourAdapter adapter = new TourAdapter (this, tourItems);
        ListView listView = (ListView)findViewById(R.id.list_id);
        listView.setAdapter(adapter);
    }
}
