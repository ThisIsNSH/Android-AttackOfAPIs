package com.nsh.pucho.Adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.nsh.pucho.Extra.Recent;
import com.nsh.pucho.R;
import com.squareup.picasso.Picasso;

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
                .inflate(R.layout.card_layout, parent, false);

        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        Recent note = notesList.get(position);
        holder.name.setText(note.getName());
        Picasso.with(context).load(note.getUrl()).into(holder.img);
        holder.function.setText(note.getFunction());
    }

    @Override
    public int getItemCount() {
        return notesList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView name, function;
        public ImageView img;


        public MyViewHolder(View view) {
            super(view);
            img = view.findViewById(R.id.reco_img);
            name = view.findViewById(R.id.reco_name);
            function = view.findViewById(R.id.reco_function);

        }
    }

}