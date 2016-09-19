package com.rlam.cushmanshowcaseapp;

import android.annotation.TargetApi;
import android.media.AudioManager;
import android.net.Uri;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;


public class VideoTestActivity extends AppCompatActivity {

    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.video_main);

        VideoView vid = (VideoView) findViewById(R.id.videoView);
        Uri path = Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.hauler4x4);


            path = Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.hauler4x4);


        vid.setVideoURI(path);

        MediaController mediaController = new MediaController(this);
        mediaController.setAnchorView(vid);
        this.setVolumeControlStream(AudioManager.STREAM_MUSIC);
        vid.setMediaController(mediaController);

        vid.start();

    }



}
