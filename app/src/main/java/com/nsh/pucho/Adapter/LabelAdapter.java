package com.nsh.pucho.Adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.nsh.pucho.Extra.Label;
import com.nsh.pucho.R;

import java.util.List;

/**
 * Created by ThisIsNSH on 5/24/2018.
 */

public class LabelAdapter extends RecyclerView.Adapter<LabelAdapter.MyViewHolder> {

    public Context mContext;
    private List<Label> labelList;

    public LabelAdapter(List<Label> labelList, Context mContext) {
        this.labelList = labelList;
        this.mContext = mContext;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View viewItem = LayoutInflater.from(parent.getContext()).inflate(R.layout.label_layout, parent, false);
        return new MyViewHolder(viewItem);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        Label label = labelList.get(position);
        holder.tv.setText(label.getLabel());
    }

    @Override
    public int getItemCount() {
        return labelList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView tv;

        public MyViewHolder(View view) {
            super(view);
            tv = view.findViewById(R.id.label);
        }
    }


}
