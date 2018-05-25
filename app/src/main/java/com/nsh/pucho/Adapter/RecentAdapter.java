package com.nsh.pucho.Adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RatingBar;
import android.widget.TextView;

import com.nsh.pucho.Database.Recent;
import com.nsh.pucho.R;

import java.util.List;

public class RecentAdapter extends RecyclerView.Adapter<RecentAdapter.MyViewHolder> {

    private Context context;
    private List<Recent> notesList;

    public RecentAdapter(Context context, List<Recent> notesList) {
        this.context = context;
        this.notesList = notesList;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.card_layout1, parent, false);

        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        Recent note = notesList.get(position);
        holder.name.setText(note.getName());
        holder.ratingBar.setRating(Float.parseFloat(note.getUrl()));
        holder.function.setText(note.getFunction());
    }

    @Override
    public int getItemCount() {
        return notesList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView name, function;
        public RatingBar ratingBar;


        public MyViewHolder(View view) {
            super(view);
            name = view.findViewById(R.id.reco_name);
            function = view.findViewById(R.id.reco_function);
            ratingBar = view.findViewById(R.id.ratingBar1);
        }
    }

}