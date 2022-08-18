package com.atsoft.streaming;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class RTMPLiveAddressActivity extends AppCompatActivity {

    ImageView imgBack;
    TextView tvStartLiveStream;
    EditText edtRTMPAddress, edtStreamKey;
    TextView tvPasteRTMPAddress, tvPasteStreamKey;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rtmplive_address);

        imgBack = findViewById(R.id.img_back_rtmp);
        tvStartLiveStream = findViewById(R.id.tv_start_livestreaming);
        edtRTMPAddress = findViewById(R.id.edt_rtmp_address);
        edtStreamKey = findViewById(R.id.edt_stream_key);
        tvPasteRTMPAddress = findViewById(R.id.tv_paste_rtmp_address);
        tvPasteStreamKey = findViewById(R.id.tv_paste_stream_key);

        imgBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        tvStartLiveStream.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        tvPasteStreamKey.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        tvPasteRTMPAddress.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }
}