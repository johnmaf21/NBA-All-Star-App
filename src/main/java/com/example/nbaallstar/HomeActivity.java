package com.example.nbaallstar;

import android.content.Intent;
import android.net.Uri;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.MediaController;
import android.widget.VideoView;
import com.bumptech.glide.Glide;


public class HomeActivity extends AppCompatActivity {
    ImageButton clk;
    VideoView videoView;
    MediaController mediaController;
    ConstraintLayout constraintLayout;
    ConstraintLayout constraintLayout1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        clk = (ImageButton) findViewById(R.id.imageButton);
        videoView = (VideoView) findViewById(R.id.videoView);
        String videoPath = "android.resource://com.example.nbaallstar/"+R.raw.videoplayback;
        Uri uri = Uri.parse(videoPath);
        videoView.setVideoURI(uri);
        videoView.seekTo( 2050 );
        mediaController = new MediaController(this);
        ImageView imageView = findViewById(R.id.imageView6);
        Glide.with(this).load(R.raw.chicago).into(imageView);
        constraintLayout = (ConstraintLayout) findViewById(R.id.homeLayout);
        constraintLayout1 = (ConstraintLayout) findViewById(R.id.menuLayout);
        constraintLayout1.setVisibility(View.INVISIBLE);


    }

    public void videoplay(View view) {

        videoView.setMediaController(mediaController);
        mediaController.setAnchorView(videoView);
        clk.setVisibility(View.GONE);
        videoView.start();
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
        Intent homeIntent = new Intent(HomeActivity.this, schedule.class);
        startActivity(homeIntent);
        finish();
    }

    public void openDirections(View view) {
        Intent homeIntent = new Intent(HomeActivity.this, GettingThereActivity.class);
        startActivity(homeIntent);
        System.out.println("working ish");
        finish();
    }

    public void openBooking(View view) {
        Intent homeIntent = new Intent(HomeActivity.this, BookingActivity.class);
        startActivity(homeIntent);
        finish();
    }

    public void openAboutUs(View view) {
        Intent homeIntent = new Intent(HomeActivity.this, AboutUsActivity.class);
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
        Intent homeIntent = new Intent(HomeActivity.this, HomeActivity.class);
        startActivity(homeIntent);
        finish();
    }
}
