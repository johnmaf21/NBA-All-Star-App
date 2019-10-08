package com.example.nbaallstar;

import android.content.Intent;
import android.net.Uri;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.MediaController;
import android.widget.VideoView;

import com.bumptech.glide.Glide;

public class AboutUsActivity extends AppCompatActivity {
    ConstraintLayout constraintLayout;
    ConstraintLayout constraintLayout1;
    MediaController mediaController;
    MediaController mediaController1;
    VideoView videoView;
    VideoView videoView1;
    ImageButton clk;
    ImageButton clk1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_us);
        ImageView imageView = findViewById(R.id.imageView6);
        Glide.with(this).load(R.raw.chicago).into(imageView);
/*      clk = (ImageButton) findViewById(R.id.imageButton3);
        videoView = (VideoView) findViewById(R.id.videoView2);
        String videoPath = "android.resource://com.example.nbaallstar/"+R.raw.tour_guide;
        Uri uri = Uri.parse(videoPath);
        videoView.setVideoURI(uri);
        videoView.seekTo( 2100 );

        mediaController = new MediaController(this);
        mediaController1 = new MediaController(this);
        clk1 = (ImageButton) findViewById(R.id.imageButton5);
        videoView1 = (VideoView) findViewById(R.id.videoView3);
        String videoPath1 = "android.resource://com.example.nbaallstar/"+R.raw.promo;
        Uri uri1 = Uri.parse(videoPath1);
        videoView1.setVideoURI(uri1);
        videoView1.seekTo( 2100 );*/
        constraintLayout = (ConstraintLayout) findViewById(R.id.aboutLayout);
        constraintLayout1 = (ConstraintLayout) findViewById(R.id.menuLayout);
        constraintLayout1.setVisibility(View.INVISIBLE);
    }

    public void openTwitter(View view) {
        String url = "https://twitter.com/nba";
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse(url));
        startActivity(intent);
    }

    public void openFacebook(View view) {
        String url = "https://www.facebook.com/nba";
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse(url));
        startActivity(intent);
    }

    public void openInsta(View view) {
        String url = "https://www.instagram.com/nba/";
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse(url));
        startActivity(intent);
    }

    public void openYoutube(View view) {
        String url = "https://www.youtube.com/nba/";
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse(url));
        startActivity(intent);
    }
    public void openSchedule(View view) {
        Intent homeIntent = new Intent(AboutUsActivity.this, schedule.class);
        startActivity(homeIntent);
        finish();
    }

    public void openDirections(View view) {
        Intent homeIntent = new Intent(AboutUsActivity.this, GettingThereActivity.class);
        startActivity(homeIntent);
        finish();
    }

    public void openBooking(View view) {
        Intent homeIntent = new Intent(AboutUsActivity.this, BookingActivity.class);
        startActivity(homeIntent);
        finish();
    }

    public void openAboutUs(View view) {
        Intent homeIntent = new Intent(AboutUsActivity.this, AboutUsActivity.class);
        startActivity(homeIntent);
        finish();
    }

    public void closeMenu(View view) {
        constraintLayout.setVisibility(View.VISIBLE);
        constraintLayout1.setVisibility(View.INVISIBLE);

    }

    public void openMenu(View view) {
        constraintLayout1.setVisibility(View.VISIBLE);
    }

    public void openHome(View view) {
        Intent homeIntent = new Intent(AboutUsActivity.this, HomeActivity.class);
        startActivity(homeIntent);
        finish();
    }

    public void playVideo1(View view) {

        videoView.setMediaController(mediaController);
        mediaController.setAnchorView(videoView);
        clk.setVisibility(View.GONE);
        videoView1.pause();
        videoView.start();
    }

    public void playVideo2(View view) {

        videoView1.setMediaController(mediaController1);
        mediaController1.setAnchorView(videoView1);
        clk1.setVisibility(View.GONE);
        videoView.pause();
        videoView1.start();
    }
}
