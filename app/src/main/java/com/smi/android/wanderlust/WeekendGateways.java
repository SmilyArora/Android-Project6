package com.smi.android.wanderlust;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class WeekendGateways extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_view);
        ArrayList<Tour> tourItems = new ArrayList<Tour>();
        tourItems.add(new Tour(R.drawable.morni, "Morni Hills", "45 Kms. from Chandigarh - Panchkula"));
        tourItems.add(new Tour(R.drawable.timbertrail, "Timber Trail", "Parwanoo"));
        tourItems.add(new Tour(R.drawable.barog, "Barog", "Shimla-Kalka Highway"));
        tourItems.add(new Tour(R.drawable.solan, "Solan", "Midway between Shimla and Kalka"));
        tourItems.add(new Tour(R.drawable.funcity, "Fun City Water Park", "NH - 72, Near Ramgarh"));
        TourAdapter adapter = new TourAdapter (this, tourItems);
        ListView listView = (ListView)findViewById(R.id.list_id);
        listView.setAdapter(adapter);
    }
}
