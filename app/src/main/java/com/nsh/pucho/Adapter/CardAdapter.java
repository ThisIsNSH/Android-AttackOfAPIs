package com.nsh.pucho.Adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.nsh.pucho.R;
import com.nsh.pucho.Card;
import com.squareup.picasso.Picasso;

import java.util.List;

/**
 * Created by ThisIsNSH on 5/24/2018.
 */

public class CardAdapter extends RecyclerView.Adapter<CardAdapter.MyViewHolder> {

    private List<Card> cardList;
    public Context mContext;

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


    public CardAdapter(Context mContext, List<Card> cardList) {
        this.cardList = cardList;
        this.mContext = mContext;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.card_layout, parent, false);

        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        Card card = cardList.get(position);

        holder.name.setText(card.getName());
        Picasso.with(mContext).load(card.getImg()).into(holder.img);
        holder.function.setText(card.getFunction());
    }

    @Override
    public int getItemCount() {
        return cardList.size();
    }
}