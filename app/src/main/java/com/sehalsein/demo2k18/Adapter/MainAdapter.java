package com.sehalsein.demo2k18.Adapter;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.sehalsein.demo2k18.Activity.DetailActivity;
import com.sehalsein.demo2k18.Model.UserDetail;
import com.sehalsein.demo2k18.R;
import com.sehalsein.demo2k18.ViewHolder.UserViewHolder;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by sehalsein on 22/03/18.
 */

public class MainAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {


    private Context context;
    private List<UserDetail> list = new ArrayList<>();

    public MainAdapter() {
    }

    public MainAdapter(Context context, List<UserDetail> list) {
        this.context = context;
        this.list = list;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_user_detail, parent, false);
        return new UserViewHolder(view);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, final int position) {
        UserViewHolder viewHolder = (UserViewHolder) holder;
        viewHolder.setRow(list.get(position));

        viewHolder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, DetailActivity.class);
                intent.putExtra("NAME",list.get(position).getId());
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return list.size();
    }
}
