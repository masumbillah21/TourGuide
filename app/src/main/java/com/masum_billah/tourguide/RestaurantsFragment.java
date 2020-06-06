package com.masum_billah.tourguide;

import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.RequiresApi;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.Objects;

public class RestaurantsFragment extends Fragment {
    @RequiresApi(api = Build.VERSION_CODES.KITKAT)
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.tour_lists, container, false);

        final ArrayList<Tours> tours = new ArrayList<>();
        tours.add(new Tours(getString(R.string.ruchita_restaurant),
                getString(R.string.ruchita_restaurant_address),
                getString(R.string.ruchita_restaurant_open_hour),
                getString(R.string.restaurant_desc),
                getString(R.string.rate_4_9_out_of_5),
                R.drawable.ruchita_restaurant));

        tours.add(new Tours(getString(R.string.cafe_roopsagor),
                getString(R.string.cafe_roopsagor_address),
                getString(R.string.open_hour_sun_sat_10am_10pm),
                getString(R.string.restaurant_desc),
                getString(R.string.rate_4_7_out_of_5),
                R.drawable.cafe_roopsagor));

        tours.add(new Tours(getString(R.string.royal_castle_restaurant),
                getString(R.string.royal_castle_restaurant_address),
                getString(R.string.royal_castle_restaurant_open_hour),
                getString(R.string.restaurant_desc),
                getString(R.string.rate_4_7_out_of_5),
                R.drawable.royal_castle_restaurant));

        tours.add(new Tours(getString(R.string.mosdalifa_fast_food_corner),
                getString(R.string.mosdalifa_fast_food_corner_address),
                getString(R.string.mosdalifa_fast_food_corner_open_hour),
                getString(R.string.restaurant_desc),
                getString(R.string.rate_4_9_out_of_5),
                R.drawable.mosdalifa_fast_food_corner));

        tours.add(new Tours(getString(R.string.suleman_restaurant_and_kabab),
                getString(R.string.suleman_restaurant_and_kabab_address),
                getString(R.string.suleman_restaurant_and_kabab_open_hour),
                getString(R.string.restaurant_desc),
                getString(R.string.rate_5_out_5),
                R.drawable.suleman_restaurant_and_kabab));

        tours.add(new Tours(getString(R.string.kheya_restaurant),
                getString(R.string.kheya_restaurant_address),
                getString(R.string.kheya_restaurant_open_hour),
                getString(R.string.restaurant_desc),
                getString(R.string.rate_4_7_out_of_5),
                R.drawable.kheya_restaurant));

        tours.add(new Tours(getString(R.string.shohag_hotel_and_restaurant),
                getString(R.string.shohag_hotel_and_restaurant_address),
                getString(R.string.shohag_hotel_and_restaurant_open_hour),
                getString(R.string.restaurant_desc),
                getString(R.string.rate_4_7_out_of_5),
                R.drawable.shohag_hotel_and_restaurant));

        TourAdapter tourAdapter = new TourAdapter(Objects.requireNonNull(getContext()), tours);
        RecyclerView tourLists = rootView.findViewById(R.id.tour_lists);
        tourLists.setAdapter(tourAdapter);
        tourLists.setLayoutManager(new LinearLayoutManager(getContext()));



        return rootView;
    }
}