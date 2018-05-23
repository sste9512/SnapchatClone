package com.sste9512.sste9512.snapchatclone.MainActivity.MainActivity;

import android.animation.ArgbEvaluator;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.view.animation.AlphaAnimation;

public class MainScrollListener implements ViewPager.OnPageChangeListener  {

    MainPagerAdapter adapter; // Recycler view adapter for
    Integer[] colors; // array of colors to be used
    ArgbEvaluator argbEvaluator; //android interpolator for colors
    View view; // Generic view passed in for easier casting of views passed into the constructor


    public MainScrollListener(MainPagerAdapter adapter, Integer[] colors, View view) {
        this.adapter = adapter;
        this.colors = colors;
        this.view = view;
        argbEvaluator = new ArgbEvaluator();
    }

    /*
      Here is where the color interpolation begins,
      using the position offset parameter of the listener
     */
    @Override
    public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

        if (position < (adapter.getCount() - 1) && position < (colors.length - 1)) {
            view.setBackgroundColor((Integer) argbEvaluator.evaluate(positionOffset, colors[position], colors[position + 1]));


        } else {
            view.setBackgroundColor(colors[colors.length - 1]);
        }

    }

    @Override
    public void onPageSelected(int position) {


    }

    @Override
    public void onPageScrollStateChanged(int i) {


    }

}