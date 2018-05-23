package com.sste9512.sste9512.snapchatclone.MainActivity.FriendsFragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.sste9512.sste9512.snapchatclone.MainActivity.Models.User;
import com.sste9512.sste9512.snapchatclone.R;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;

public class FriendsFragment extends Fragment {

    @BindView(R.id.friends_list)
    RecyclerView friendsList;
    Unbinder unbinder;
    ArrayList<User> friends = new ArrayList<>();
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.friends_view, container, false);
        unbinder = ButterKnife.bind(this, rootView);
        for(int i = 0; i < 20; i++){
            friends.add(new User("Brad", "Brad 3000"));
        }
        LinearLayoutManager llm = new LinearLayoutManager(getContext());
        llm.setOrientation(LinearLayoutManager.VERTICAL);
        friendsList.setLayoutManager(llm);
        friendsList.setAdapter(new FriendsAdapter(friends, getActivity()));


        return rootView;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        unbinder.unbind();
    }
}
