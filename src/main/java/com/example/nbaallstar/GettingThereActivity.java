package com.example.nbaallstar;

import android.content.Intent;
import android.net.Uri;
import android.support.constraint.ConstraintLayout;
import android.support.v4.app.FragmentActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapView;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

import static android.os.Build.VERSION_CODES.N;

public class GettingThereActivity extends AppCompatActivity implements OnMapReadyCallback  {
    MapView mapView;
    private GoogleMap googleMap;
    ConstraintLayout constraintLayout;
    ConstraintLayout constraintLayout1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_getting_there);
        mapView = (MapView) findViewById(R.id.mapView);
        initGoogleMaps(savedInstanceState);
        constraintLayout = (ConstraintLayout) findViewById(R.id.directionLayout);
        constraintLayout1 = (ConstraintLayout) findViewById(R.id.menuLayout);
        constraintLayout1.setVisibility(View.INVISIBLE);

    }

    private void initGoogleMaps(Bundle savedInstanceState){
        mapView.onCreate(savedInstanceState);
        mapView.getMapAsync(this);

    }

    @Override
    public void onMapReady(GoogleMap gMap) {
        googleMap = gMap;
        LatLng chicago = new LatLng(41.8807, -87.6742);
        googleMap.addMarker(new MarkerOptions().position(chicago).title("United Center"));
        googleMap.moveCamera(CameraUpdateFactory.newLatLng(chicago));
        googleMap.moveCamera(CameraUpdateFactory.newLatLngZoom(chicago,14));
        googleMap.getUiSettings().setZoomControlsEnabled(true);

    }


    @Override
    public void onResume() {
        mapView.onResume();
        super.onResume();
    }
    @Override
    public void onPause() {
        super.onPause();
        mapView.onPause();
    }
    @Override
    public void onDestroy() {
        super.onDestroy();
        mapView.onDestroy();
    }
    @Override
    public void onLowMemory() {
        super.onLowMemory();
        mapView.onLowMemory();
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
        Intent homeIntent = new Intent(GettingThereActivity.this, schedule.class);
        startActivity(homeIntent);
        finish();
    }

    public void openDirections(View view) {
        Intent homeIntent = new Intent(GettingThereActivity.this, GettingThereActivity.class);
        startActivity(homeIntent);
        finish();
    }

    public void openBooking(View view) {
        Intent homeIntent = new Intent(GettingThereActivity.this, BookingActivity.class);
        startActivity(homeIntent);
        finish();
    }

    public void openAboutUs(View view) {
        Intent homeIntent = new Intent(GettingThereActivity.this, AboutUsActivity.class);
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
        Intent homeIntent = new Intent(GettingThereActivity.this, HomeActivity.class);
        startActivity(homeIntent);
        finish();
    }
}
