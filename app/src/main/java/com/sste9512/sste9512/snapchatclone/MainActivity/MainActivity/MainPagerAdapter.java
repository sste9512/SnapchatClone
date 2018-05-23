package com.sste9512.sste9512.snapchatclone.MainActivity.MainActivity;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.sste9512.sste9512.snapchatclone.MainActivity.CameraFragment.CameraFragment;
import com.sste9512.sste9512.snapchatclone.MainActivity.FriendsFragment.FriendsFragment;

public class MainPagerAdapter extends FragmentStatePagerAdapter {

    final int PAGE_COUNT = 3 ;


    private Context mContext;



    public MainPagerAdapter(FragmentManager fm, Context context) {
        super(fm);
        mContext = context;

    }

    @Override
    public Fragment getItem(int position)
    {
        switch (position) {

            case 0:
                return new FriendsFragment();

            case 1:
                return new CameraFragment();

            case 2:
                return new FriendsFragment();


        }
        return null;
    }

    @Override
    public CharSequence getPageTitle(int position)
    {
        switch (position){
            case 0:
                return "Friends";
            case 1:
                return "Camera";
            case 2:
                return "Advertisements";

            default:
                return "Friend Invites";
        }
    }



    @Override
    public int getCount() {
        return PAGE_COUNT;
    }

}
