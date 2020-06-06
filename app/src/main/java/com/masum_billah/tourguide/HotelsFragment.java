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

public class HotelsFragment extends Fragment {

    @RequiresApi(api = Build.VERSION_CODES.KITKAT)
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.tour_lists, container, false);

        final ArrayList<Tours> tours = new ArrayList<>();
        tours.add(new Tours(getString(R.string.hotel_boishakhi),
                getString(R.string.hotel_boishakhi_address),
                getString(R.string.open_hour_sun_sat_10am_10pm),
                getString(R.string.hotel_boishakhi_desc),
                getString(R.string.rate_4_9_out_of_5),
                R.drawable.hotel_boishakhi_residential));

        tours.add(new Tours(getString(R.string.hotel_green_palace),
                getString(R.string.hotel_green_palace_address),
                getString(R.string.open_hour_sun_sat_10am_10pm),
                getString(R.string.hotel_green_palace_desc),
                getString(R.string.rate_5_out_5),
                R.drawable.hotel_green_palace_residential));

        tours.add(new Tours(getString(R.string.hotel_shalimar),
                getString(R.string.hotel_shalimar_address),
                getString(R.string.open_hour_sun_sat_10am_10pm),
                getString(R.string.hotel_shalimar_desc),
                getString(R.string.rate_4_9_out_of_5),
                R.drawable.hotel_shalimar_int_residential));

        tours.add(new Tours(getString(R.string.three_star_hotel),
                getString(R.string.three_star_hotel_address),
                getString(R.string.open_hour_sun_sat_10am_10pm),
                getString(R.string.three_star_hotel_desc),
                getString(R.string.rate_4_7_out_of_5),
                R.drawable.three_star_hotel));

        tours.add(new Tours(getString(R.string.inter_continental),
                getString(R.string.inter_continental_address),
                getString(R.string.open_hour_sun_sat_10am_10pm),
                getString(R.string.inter_continental_desc),
                getString(R.string.rate_5_out_5),
                R.drawable.inter_continental));

        tours.add(new Tours(getString(R.string.azmiry_residentail_hotel),
                getString(R.string.azmiry_residentail_hotel_address),
                getString(R.string.open_hour_sun_sat_10am_10pm),
                getString(R.string.azmiry_residentail_hotel_desc),
                getString(R.string.rate_4_7_out_of_5),
                R.drawable.azmiry_residential_hotel));

        tours.add(new Tours(getString(R.string.mohasthangarh_guest_house),
                getString(R.string.mohasthangarh_guest_house_address),
                getString(R.string.open_hour_sun_sat_10am_10pm),
                getString(R.string.mohasthangarh_guest_house_desc),
                getString(R.string.rate_4_8_out_of_5),
                R.drawable.mohasthangarh_guest_house));


        TourAdapter tourAdapter = new TourAdapter(Objects.requireNonNull(getContext()), tours);
        RecyclerView tourLists = rootView.findViewById(R.id.tour_lists);
        tourLists.setAdapter(tourAdapter);
        tourLists.setLayoutManager(new LinearLayoutManager(getContext()));

        return rootView;
    }
}