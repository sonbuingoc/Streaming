package com.atsoft.streaming;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class ShareAndSaveActivity extends AppCompatActivity {

    TextView tvNew;
    ImageView imgShareFb, imgShareYt, imgShareTw;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_share_and_save);

        tvNew = findViewById(R.id.tv_new_share_save);
        imgShareFb = findViewById(R.id.img_share_fb);
        imgShareYt = findViewById(R.id.img_share_yt);
        imgShareTw = findViewById(R.id.img_share_tw);


    }
}