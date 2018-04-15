package com.example.leeje.androidpresentsystem;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

/**
 * Created by leeje on 2018-03-24.
 */

public class ListOnlineViewHolder extends RecyclerView.ViewHolder {
    public TextView txtEmail;
    public ListOnlineViewHolder(View itemView){
        super(itemView);
        txtEmail = (TextView)itemView.findViewById(R.id.txt_email);
    }
}
