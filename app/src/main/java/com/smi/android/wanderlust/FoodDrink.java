package com.smi.android.wanderlust;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class FoodDrink extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_view);


        ArrayList<Tour> tourItems = new ArrayList<Tour>();
        tourItems.add(new Tour(R.drawable.girlincafe, "Girl in The Cafe!", "Sector 17"));
        tourItems.add(new Tour(R.drawable.fcafe, "F Cafe", "Sector 26"));
        tourItems.add(new Tour(R.drawable.backroom, "The Back Room", "Sector 34"));
        tourItems.add(new Tour(R.drawable.unclejacks, "Uncle Jack's", "Sector 8"));
        tourItems.add(new Tour(R.drawable.caked, "Caked", "Manimajra"));

        TourAdapter adapter = new TourAdapter (this, tourItems);
        ListView listView = (ListView)findViewById(R.id.list_id);
        listView.setAdapter(adapter);
    }
}
