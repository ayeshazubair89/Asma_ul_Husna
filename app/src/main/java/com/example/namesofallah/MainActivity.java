package com.example.namesofallah;
import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.MediaController;
import android.widget.TextView;
import android.widget.VideoView;

import android.media.MediaPlayer;

import android.widget.Toast;
public class MainActivity extends Activity {
    Animation topAnim,bottomAnim;
    ImageView image;
    VideoView simpleVideoView;
    MediaController mediaControls;

    private static int SPLASH_SCREEN = 4000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);
        // Find your VideoView in your video_main.xml layout
        simpleVideoView = (VideoView) findViewById(R.id.VideoView);
        topAnim = AnimationUtils.loadAnimation(  this,R.anim.top);
        bottomAnim = AnimationUtils.loadAnimation(  this,R.anim.bottom);
        image=findViewById(R.id.imageView);
        image.setAnimation(topAnim);
        // set the media controller for video view
        // set the uri for the video view
        simpleVideoView.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.vid));
        // start a video
        simpleVideoView.start();
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                startActivity(intent);
                finish();
            }
        },SPLASH_SCREEN);

    }

}