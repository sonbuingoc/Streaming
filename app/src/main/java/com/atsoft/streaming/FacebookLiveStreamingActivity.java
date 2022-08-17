package com.atsoft.streaming;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

import me.relex.circleindicator.CircleIndicator;

public class FacebookLiveStreamingActivity extends AppCompatActivity {
    ViewPager viewPager;
    CircleIndicator circleIndicator;
    PhotoAdapter photoAdapter;
    List<PhotoModel> mListPhoto;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_facebook_live_streaming);

        getListPhoto();

        viewPager = findViewById(R.id.view_pager_img);
        circleIndicator = findViewById(R.id.circle_indicator);

        photoAdapter = new PhotoAdapter(this, mListPhoto);
        viewPager.setAdapter(photoAdapter);
        circleIndicator.setViewPager(viewPager);
        photoAdapter.registerDataSetObserver(circleIndicator.getDataSetObserver());
    }

    public void getListPhoto(){
        mListPhoto = new ArrayList<>();
        mListPhoto.add(new PhotoModel(R.drawable.facebook_slider1));
        mListPhoto.add(new PhotoModel(R.drawable.facebook_slider1));
        mListPhoto.add(new PhotoModel(R.drawable.facebook_slider1));
    }
}