package com.atsoft.streaming;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class LiveStreamingActivity extends AppCompatActivity {

    ImageView imgBack, imgFacebook, imgYoutube, imgTwitch;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_live_streaming);

        initUi();
        initListener();

    }
    public void initUi(){
        imgBack = findViewById(R.id.img_back_livestreaming);
        imgFacebook = findViewById(R.id.img_facebook_livestreaming);
        imgTwitch = findViewById(R.id.img_twitch_livestreaming);
        imgYoutube = findViewById(R.id.img_youtube_livestreaming);
    }
    public void initListener(){
        imgBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        imgYoutube.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(LiveStreamingActivity.this, YoutubeLiveStreamingActivity.class));
            }
        });
        imgFacebook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(LiveStreamingActivity.this, FacebookLiveStreamingActivity.class));
            }
        });
        imgTwitch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(LiveStreamingActivity.this, TwitchLiveStreamingActivity.class));
            }
        });
    }
}