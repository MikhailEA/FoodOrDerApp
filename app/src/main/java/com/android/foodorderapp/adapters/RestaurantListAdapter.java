package com.android.foodorderapp.adapters;

import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.android.foodorderapp.model.RestaurantModel;

import java.util.List;

public class RestaurantListAdapter extends RecyclerView.Adapter<RestaurantListAdapter.MyViewHolder> {

    private List<RestaurantModel> restaurantModelList;

    public RestaurantListAdapter(List<RestaurantModel> restaurantModelList) {
        this.restaurantModelList = restaurantModelList;
    }

    public void updateData(List<RestaurantModel> restaurantModelList) {
        this.restaurantModelList = restaurantModelList;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public RestaurantListAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull RestaurantListAdapter.MyViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    static class MyViewHolder extends RecyclerView.ViewHolder {

        public MyViewHolder(View view) {
            super(view);

        }
    }
}
