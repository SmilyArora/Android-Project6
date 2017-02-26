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
        tourItems.add(new Tour(R.drawable.girlincafe, getString(R.string.food_one), getString(R.string.one_loc_food)));
        tourItems.add(new Tour(R.drawable.fcafe, getString(R.string.food_two), getString(R.string.two_loc_food)));
        tourItems.add(new Tour(R.drawable.backroom, getString(R.string.food_three), getString(R.string.three_loc_food)));
        tourItems.add(new Tour(R.drawable.unclejacks, getString(R.string.food_four), getString(R.string.four_loc_food)));
        tourItems.add(new Tour(R.drawable.caked, getString(R.string.food_five), getString(R.string.five_loc_food)));

        TourAdapter adapter = new TourAdapter (this, tourItems);
        ListView listView = (ListView)findViewById(R.id.list_id);
        listView.setAdapter(adapter);
    }
}
