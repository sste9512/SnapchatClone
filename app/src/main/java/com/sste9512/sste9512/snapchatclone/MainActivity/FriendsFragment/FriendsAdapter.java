package com.sste9512.sste9512.snapchatclone.MainActivity.FriendsFragment;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.sste9512.sste9512.snapchatclone.MainActivity.Models.User;
import com.sste9512.sste9512.snapchatclone.R;

import java.util.ArrayList;

import butterknife.BindView;

public class FriendsAdapter extends RecyclerView.Adapter<FriendsAdapter.MyViewHolder> {


    public ArrayList<User> friends;
    public Context context;


    public class MyViewHolder extends RecyclerView.ViewHolder {

      //  @BindView(R.id.firstNameLabel)
       // TextView firstNameLabel;
        @BindView(R.id.friendName)
        TextView friendName;

        private MyViewHolder(View view) {
            super(view);
//            firstNameLabel = view.findViewById(R.id.firstNameLabel);
            friendName = view.findViewById(R.id.friendName);

        }
    }


    public FriendsAdapter(ArrayList<User> friends, Context context) {
        this.friends = friends;
        this.context = context;
    }


    @Override
    public void onBindViewHolder(final FriendsAdapter.MyViewHolder holder, final int position)
    {

       // holder.firstNameLabel.setText(friends.get(position).name);
        holder.friendName.setText(String.valueOf(friends.get(position).username));

    }


    @Override
    public int getItemCount()
    {
        return friends.size();
    }


    @Override
    public FriendsAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType)
    {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.friends_viewmodel,
                parent,
                false);
        return new FriendsAdapter.MyViewHolder(v);
    }


    @Override
    public void onViewDetachedFromWindow(FriendsAdapter.MyViewHolder holder) {

    }


}
