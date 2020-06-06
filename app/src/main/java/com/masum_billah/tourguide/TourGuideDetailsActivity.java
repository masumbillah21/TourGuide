package com.masum_billah.tourguide;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class TourGuideDetailsActivity extends AppCompatActivity {
    ImageView detailsImage;
    TextView detailsAddress;
    TextView detailsOpenHour;
    TextView detailsRating;
    TextView detailsDescription;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        /*Assigned all views into its variable */
        setContentView(R.layout.activity_tour_guide_details);
        detailsImage = findViewById(R.id.image_details);
        detailsAddress = findViewById(R.id.address_details);
        detailsOpenHour = findViewById(R.id.open_hour_details);
        detailsRating = findViewById(R.id.rating_details);
        detailsDescription = findViewById(R.id.description_details);

        /* Get data from master activity/fragment by intent */
        Intent intent = getIntent();
        Tours tour = intent.getParcelableExtra(getString(R.string.tour_list_parcel));


        /* Set intent data to views */
        assert tour != null;
        detailsImage.setImageResource(tour.getImageResourceId());
        detailsAddress.setText(tour.getAddress());
        detailsOpenHour.setText(tour.getOpenHour());
        detailsRating.setText(tour.getRating());
        detailsDescription.setText(tour.getDescription());

        this.setTitle(tour.getTitle());
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }
}