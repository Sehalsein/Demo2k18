package com.sehalsein.demo2k18.ViewHolder;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.sehalsein.demo2k18.Model.UserDetail;
import com.sehalsein.demo2k18.R;

/**
 * Created by sehalsein on 22/03/18.
 */

public class UserViewHolder extends RecyclerView.ViewHolder {


    private TextView name,age;

    public UserViewHolder(View itemView) {
        super(itemView);

        name = itemView.findViewById(R.id.name);
        age = itemView.findViewById(R.id.age);

    }


    public void setRow(UserDetail data){
        name.setText(data.getName());
        age.setText(data.getAge());
    }




}
