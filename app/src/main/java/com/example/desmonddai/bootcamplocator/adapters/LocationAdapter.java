package com.example.desmonddai.bootcamplocator.adapters;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.desmonddai.bootcamplocator.R;
import com.example.desmonddai.bootcamplocator.holders.LocationsViewHolder;
import com.example.desmonddai.bootcamplocator.model.Devslopes;

import java.util.ArrayList;

/**
 * Created by desmonddai on 7/11/16.
 */
public class LocationAdapter extends RecyclerView.Adapter<LocationsViewHolder> {
    private ArrayList<Devslopes> locations;

    public LocationAdapter(ArrayList<Devslopes> locations) {
        this.locations = locations;
    }

    @Override
    public void onBindViewHolder(LocationsViewHolder holder, int position) {
        final Devslopes location = locations.get(position);
        holder.updateUI(location);

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Load details page
            }
        });
    }

    @Override
    public int getItemCount() {
        return locations.size();
    }

    @Override
    public LocationsViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View card = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_location, parent, false);
        return new LocationsViewHolder(card);
    }
}
