package com.sste9512.sste9512.snapchatclone.MainActivity.MainActivity;

import android.animation.ArgbEvaluator;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;

import com.sste9512.sste9512.snapchatclone.R;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.toolbar)
    LinearLayout toolbar;
    @BindView(R.id.view_pager)
    ViewPager viewPager;
    @BindView(R.id.mask)
    View mask;
    @BindView(R.id.drawer_layout)
    DrawerLayout drawerLayout;
    @BindView(R.id.coordinator)
    FrameLayout coordinator;


    private MainPagerAdapter adapter;
    Integer[] colors = null;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        adapter = new MainPagerAdapter(getSupportFragmentManager(), MainActivity.this);
        viewPager.setAdapter(adapter);
        setUpColors();
        viewPager.addOnPageChangeListener(new MainScrollListener(adapter, colors, drawerLayout));
        viewPager.setOffscreenPageLimit(3);
    }

    private void setUpColors() {

        Integer color1 = getResources().getColor(R.color.snapBlue);
        Integer color2 = Color.TRANSPARENT;
        Integer color3 = getResources().getColor(R.color.snapPurple);
        Integer color4 = getResources().getColor(R.color.snapRed);

        Integer[] colors_temp = {color1, color2, color3, color4};
        colors = colors_temp;

    }
}
