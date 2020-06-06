package com.masum_billah.tourguide;


import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class TourAdapter extends RecyclerView.Adapter<TourAdapter.ViewHolder> {
    private Context mContext;
    private ArrayList<Tours> mTours;

    public TourAdapter(Context context, ArrayList<Tours> tours) {
        this.mContext = context;
        this.mTours = tours;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater =  LayoutInflater.from(mContext);
        View currentListItem = layoutInflater.inflate(R.layout.tour_list_item, parent, false);


        return new ViewHolder(currentListItem);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, final int position) {

        holder.tourTitle.setText(mTours.get(position).getTitle());
        holder.tourAddress.setText(mTours.get(position).getAddress());
        holder.tourOpenHour.setText(mTours.get(position).getOpenHour());
        holder.tourImage.setImageResource(mTours.get(position).getImageResourceId());

        holder.listItemLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(mContext, TourGuideDetailsActivity.class);
                intent.putExtra(mContext.getString(R.string.tour_list_parcel), mTours.get(position));
                mContext.startActivity(intent);

            }
        });
    }

    @Override
    public int getItemCount() {
        return mTours.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        ImageView tourImage;
        TextView tourTitle;
        TextView tourAddress;
        TextView tourOpenHour;
        LinearLayout listItemLayout;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            tourImage = itemView.findViewById(R.id.iv_list_image);
            tourTitle = itemView.findViewById(R.id.tv_list_title);
            tourAddress = itemView.findViewById(R.id.tv_list_address);
            tourOpenHour = itemView.findViewById(R.id.tv_list_open_hour);
            listItemLayout = itemView.findViewById(R.id.list_item_layout);

        }
    }
}


