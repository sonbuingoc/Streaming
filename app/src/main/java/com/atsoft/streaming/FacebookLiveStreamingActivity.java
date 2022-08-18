package com.atsoft.streaming;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.CompositePageTransformer;
import androidx.viewpager2.widget.MarginPageTransformer;
import androidx.viewpager2.widget.ViewPager2;

import java.util.ArrayList;
import java.util.List;

import me.relex.circleindicator.CircleIndicator3;

public class FacebookLiveStreamingActivity extends AppCompatActivity {
    ViewPager2 viewPager2;
    CircleIndicator3 circleIndicator3;
    PhotoAdapter photoAdapter;
    TextView btnContinue;
    ImageView imgBack;
    int i = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_facebook_live_streaming);

        viewPager2 = findViewById(R.id.view_pager_img_facebook);
        circleIndicator3 = findViewById(R.id.circle_indicator_facebook);
        btnContinue = findViewById(R.id.btn_continue_facebook_livestreaming);
        imgBack = findViewById(R.id.img_back_fb_slider);

        photoAdapter = new PhotoAdapter(this, getListPhoto());
        viewPager2.setAdapter(photoAdapter);
        circleIndicator3.setViewPager(viewPager2);

        viewPager2.setClipToPadding(false);
        viewPager2.setClipChildren(false);
        viewPager2.setOffscreenPageLimit(3);
        viewPager2.getChildAt(0).setOverScrollMode(RecyclerView.OVER_SCROLL_NEVER);

        CompositePageTransformer compositePageTransformer = new CompositePageTransformer();
        compositePageTransformer.addTransformer(new MarginPageTransformer(40));
        compositePageTransformer.addTransformer(new ViewPager2.PageTransformer() {
            @Override
            public void transformPage(@NonNull View page, float position) {
                float r = 1 - Math.abs(position);
                page.setScaleY(0.85f + r*0.15f);
            }
        });

        viewPager2.setPageTransformer(compositePageTransformer);
        viewPager2.registerOnPageChangeCallback(new ViewPager2.OnPageChangeCallback() {
            @Override
            public void onPageSelected(int position) {
                super.onPageSelected(position);
                i = position;
            }
        });
        btnContinue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i = i +1;
                if (i>=getListPhoto().size()){
                    startActivity(new Intent(FacebookLiveStreamingActivity.this, RTMPLiveAddressActivity.class));
                    finish();
                    return;
                }
                viewPager2.setCurrentItem(i);
            }
        });
        imgBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }

    public List<PhotoModel> getListPhoto(){
        List<PhotoModel> mListPhoto;
        mListPhoto = new ArrayList<>();
        mListPhoto.add(new PhotoModel(R.drawable.facebook_slider1));
        mListPhoto.add(new PhotoModel(R.drawable.facebook_slider2));
        mListPhoto.add(new PhotoModel(R.drawable.facebook_slider3));
        return mListPhoto;
    }
}