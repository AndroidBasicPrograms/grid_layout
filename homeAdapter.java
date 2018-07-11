package com.example.jayhind.gridviewdemoapp;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

/**
 * Created by Jay Hind on 7/11/2018.
 */
public class homeAdapter extends RecyclerView.Adapter<homeAdapter.homeHolder> {
    ArrayList<Integer> hModel;
    homeListener listener;

    public homeAdapter(ArrayList<Integer> hModel, homeListener listener) {
        this.hModel = hModel;
        this.listener = listener;
    }

    @Override
    public homeHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.row_item,parent,false);
        homeHolder h=new homeHolder(view);
        return h;
    }

    @Override
    public void onBindViewHolder(homeHolder holder, final int position) {
        Picasso.get().load(hModel.get(position)).into(holder.img);

        holder.view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                listener.onUserClick(position);
            }
        });
    }

    @Override
    public int getItemCount() {
        return hModel.size();
    }

    public class homeHolder extends RecyclerView.ViewHolder
    {
        ImageView img;
        View view;
        public homeHolder(View itemView) {
            super(itemView);
            view=itemView;
            img=itemView.findViewById(R.id.card_view_image);
        }
    }

    public interface homeListener
    {
        public void onUserClick(int position);
    }
}