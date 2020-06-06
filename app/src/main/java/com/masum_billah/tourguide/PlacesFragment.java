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


public class PlacesFragment extends Fragment {

    @RequiresApi(api = Build.VERSION_CODES.KITKAT)
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView =  inflater.inflate(R.layout.tour_lists, container, false);

        final ArrayList<Tours> tours = new ArrayList<>();
        tours.add(new Tours(getString(R.string.somapura_mahavira),
                getString(R.string.somapura_mahavira_address),
                getString(R.string.somapura_mahavira_open_hour),
                getString(R.string.somapura_mahavira_desc),
                getString(R.string.rate_5_out_5),
                R.drawable.somapura_mahavihara));

        tours.add(new Tours(getString(R.string.kotila_mura),
                getString(R.string.kotila_mura_address),
                getString(R.string.open_hour_24_hours),
                getString(R.string.kotila_mura_desc),
                getString(R.string.rate_5_out_5),
                R.drawable.kotila_mura));

        tours.add(new Tours(getString(R.string.dhaka_lalbagh_fort),
                getString(R.string.dhaka_lalbagh_fort_address),
                getString(R.string.dhaka_lalbagh_fort_open_hour),
                getString(R.string.dhaka_lalbagh_fort_desc),
                getString(R.string.rate_5_out_5),
                R.drawable.dhaka_lalbagh_fort));

        tours.add(new Tours(getString(R.string.shalban_bihar_temple_ruins),
                getString(R.string.shalban_bihar_temple_ruins_address),
                getString(R.string.shalban_bihar_temple_ruins_open_hour),
                getString(R.string.shalban_bihar_temple_ruins_desc)
                ,getString(R.string.rate_5_out_5),
                R.drawable.shalban_bihar_temple_ruins));

        tours.add(new Tours(getString(R.string.liberation_war_museum),
                getString(R.string.liberation_war_museum_address),
                getString(R.string.liberation_war_museum_open_hour),
                getString(R.string.liberation_war_museum_desc)
                ,getString(R.string.rate_5_out_5),
                R.drawable.liberation_war_museum));

        tours.add(new Tours(getString(R.string.rabindranath_tagor_kurhibari),
                getString(R.string.rabindranath_tagor_kurhibari_address),
                getString(R.string.rabindranath_tagor_kurhibari_open_hour),
                getString(R.string.rabindranath_tagor_kurhibari_desc),
                getString(R.string.rate_5_out_5),
                R.drawable.rabindranath_tagores_shilaidaha_kuthibari));

        tours.add(new Tours(getString(R.string.mahasthangarh),
                getString(R.string.mahasthangarh_address),
                getString(R.string.open_hour_24_hours),
                getString(R.string.mahasthangarh_desc)
                ,getString(R.string.rate_5_out_5),
                R.drawable.mahasthangarh));

        TourAdapter tourAdapter = new TourAdapter(Objects.requireNonNull(getContext()), tours);
        RecyclerView tourLists = rootView.findViewById(R.id.tour_lists);
        tourLists.setAdapter(tourAdapter);
        tourLists.setLayoutManager(new LinearLayoutManager(getContext()));


        return rootView;
    }
}