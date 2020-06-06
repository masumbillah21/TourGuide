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


public class ShopsFragment extends Fragment {

    @RequiresApi(api = Build.VERSION_CODES.KITKAT)
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.tour_lists, container, false);

        final ArrayList<Tours> tours = new ArrayList<>();
        tours.add(new Tours(getString(R.string.gitanjoli_shopping_complex),
                getString(R.string.gitanjoli_shopping_complex_address),
                getString(R.string.gitanjoli_shopping_complex_open_hour),
                getString(R.string.gitanjoli_shopping_complex_desc),
                getString(R.string.rate_5_out_5),
                R.drawable.gitanjoli_shopping_complex));

        tours.add(new Tours(getString(R.string.bay_land_shopping_center),
                getString(R.string.bay_land_shopping_center_address),
                getString(R.string.bay_land_shopping_center_open_hour),
                getString(R.string.bay_land_shopping_center_desc),
                getString(R.string.rate_4_8_out_of_5),
                R.drawable.bay_land_shopping_center));

        tours.add(new Tours(getString(R.string.najir_shopping_mall),
                getString(R.string.najir_shopping_mall_address),
                getString(R.string.open_hour_sun_sat_10am_10pm),
                getString(R.string.najir_shopping_mall_desc),
                getString(R.string.rate_4_7_out_of_5),
                R.drawable.najir_shopping_mall));

        tours.add(new Tours(getString(R.string.eastern_yakub_plaza),
                getString(R.string.eastern_yakub_plaza_address),
                getString(R.string.eastern_yakub_plaza_open_hour),
                getString(R.string.eastern_yakub_plaza_desc),
                getString(R.string.rate_4_7_out_of_5),
                R.drawable.eastern_yakub_plaza));

        tours.add(new Tours(getString(R.string.bashundhara_city_shopping_complex),
                getString(R.string.bashundhara_city_shopping_complex_address),
                getString(R.string.bashundhara_city_shopping_complex_open_hour),
                getString(R.string.bashundhara_city_shopping_complex_desc),
                getString(R.string.rate_5_out_5),
                R.drawable.bashundhara_city_shopping_complex));

        tours.add(new Tours(getString(R.string.dil_shopping_house),
                getString(R.string.dil_shopping_house_address),
                getString(R.string.dil_shopping_house_open_hour),
                getString(R.string.dil_shopping_house_desc),
                getString(R.string.rate_4_7_out_of_5),
                R.drawable.dil_shopping_house));

        tours.add(new Tours(getString(R.string.seyam_garments),
                getString(R.string.seyam_garments_address),
                getString(R.string.seyam_garments_open_hour),
                getString(R.string.seyam_garments_desc),
                getString(R.string.rate_4_7_out_of_5),
                R.drawable.seyam_garments));

        TourAdapter tourAdapter = new TourAdapter(Objects.requireNonNull(getContext()), tours);
        RecyclerView tourLists = rootView.findViewById(R.id.tour_lists);
        tourLists.setAdapter(tourAdapter);
        tourLists.setLayoutManager(new LinearLayoutManager(getContext()));



        return rootView;
    }
}