package com.example.nbaallstar;

import android.content.Intent;
import android.net.Uri;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class BookingActivity extends AppCompatActivity {
    ConstraintLayout constraintLayout;
    ConstraintLayout constraintLayout1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_booking);
        constraintLayout = (ConstraintLayout) findViewById(R.id.bookingLayout);
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

    public void openTickets(View view) {
        String url = "https://nbapremium.com/ticket-packages";
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse(url));
        startActivity(intent);
    }

    public void openStore(View view) {
        String url = "https://www.nbastore.eu/stores/nba/en?portal=IGV6HHF6&CMP=PSC-IGV6HHF6";
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse(url));
        startActivity(intent);
    }

    public void openflights(View view) {
        String url = "https://www.expedia.co.uk/Destinations-In-Illinois.d215.Flight-Destinations";
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse(url));
        startActivity(intent);
    }

    public void openHotels(View view) {
        String url = "https://www.tripadvisor.co.uk/HotelsNear-g35805-d104005-United_Center-Chicago_Illinois.html";
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse(url));
        startActivity(intent);
    }

    public void openSchedule(View view) {
        Intent homeIntent = new Intent(BookingActivity.this, schedule.class);
        startActivity(homeIntent);
        finish();
    }

    public void openDirections(View view) {
        Intent homeIntent = new Intent(BookingActivity.this, GettingThereActivity.class);
        startActivity(homeIntent);
        finish();
    }

    public void openBooking(View view) {
        Intent homeIntent = new Intent(BookingActivity.this, BookingActivity.class);
        startActivity(homeIntent);
        finish();
    }

    public void openAboutUs(View view) {
        Intent homeIntent = new Intent(BookingActivity.this, AboutUsActivity.class);
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
        Intent homeIntent = new Intent(BookingActivity.this, HomeActivity.class);
        startActivity(homeIntent);
        finish();
    }
}
