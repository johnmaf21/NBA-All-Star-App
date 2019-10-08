package com.example.nbaallstar;

import android.content.Intent;
import android.net.Uri;
import android.os.Handler;
import android.support.constraint.ConstraintLayout;
import android.support.design.widget.TabLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.text.SimpleDateFormat;
import java.util.Date;

public class schedule extends AppCompatActivity {
    private TextView txtTimerDay, txtTimerHours, txtTimerMinutes, txtTimerSeconds;
    private TextView txtSchedule;
    private Handler handler;
    private Runnable runnable;
    private TabLayout tabLayout;
    ConstraintLayout constraintLayout;
    ConstraintLayout constraintLayout1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_schedule);
        txtTimerDay = (TextView) findViewById(R.id.textView18);
        txtTimerHours = (TextView) findViewById(R.id.textView17);
        txtTimerMinutes = (TextView) findViewById(R.id.textView19);
        txtTimerSeconds = (TextView) findViewById(R.id.textView20);
        txtSchedule = (TextView) findViewById(R.id.textView26);
        tabLayout = (TabLayout) findViewById(R.id.tabLayout);
        ImageView imageView = findViewById(R.id.imageView6);
        Glide.with(this).load(R.raw.chicago).into(imageView);
        constraintLayout = (ConstraintLayout) findViewById(R.id.scheduleLayout);
        constraintLayout1 = (ConstraintLayout) findViewById(R.id.menuLayout);
        constraintLayout1.setVisibility(View.INVISIBLE);

        countDownStart();
        showFriday();
        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                if (tab.getPosition()==0){
                    showFriday();

                }else if(tab.getPosition()==1){
                    showSaturday();
                }else if(tab.getPosition()==2){
                    System.out.println(tab.getText());
                    showSunday();
                }
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {
               onTabSelected(tab);

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {
                if (tab.getPosition()==1){
                    showFriday();

                }else if(tab.getPosition()==2){
                    showSaturday();
                }else if(tab.getPosition()==3){
                    System.out.println(tab.getText());
                    showSunday();
                }

            }
        });


    }

    public void countDownStart() {
        handler = new Handler();
        runnable = new Runnable() {
            @Override
            public void run() {
                handler.postDelayed(this, 1000);
                try {
                    SimpleDateFormat dateFormat = new SimpleDateFormat(
                            "yyyy-MM-dd");
                    // Please here set your event date//YYYY-MM-DD
                    Date futureDate = dateFormat.parse("2020-02-14");
                    Date currentDate = new Date();
                    if (!currentDate.after(futureDate)) {
                        long diff = futureDate.getTime()
                                - currentDate.getTime();
                        long days = diff / (24 * 60 * 60 * 1000);
                        diff -= days * (24 * 60 * 60 * 1000);
                        long hours = diff / (60 * 60 * 1000);
                        diff -= hours * (60 * 60 * 1000);
                        long minutes = diff / (60 * 1000);
                        diff -= minutes * (60 * 1000);
                        long seconds = diff / 1000;
                        txtTimerDay.setText(String.format("%02d", days));
                        txtTimerHours.setText(String. format("%02d",hours));
                        txtTimerMinutes.setText(String.format("%02d", minutes));
                        txtTimerSeconds.setText(String.format("%02d", seconds));
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        };
        handler.postDelayed(runnable, 1 * 1000);
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

    public void showFriday() {
        String fridaySchedule = "All times Eastern (ET)\n" +
                "\n" +
                "9:30 a.m. | MTN DEW ICE Rising Stars Media Day presented by AT&T\n" +
                "11:00 a.m. | MTN DEW ICE Rising Stars Practice | NBA TV\n" +
                "5 p.m. | Hall of Fame Announcement | NBA TV\n" +
                "7 p.m. | NBA All-Star Celebrity Game presented by Ruffles | ESPN\n" +
                "9 p.m. | MTN DEW ICE Rising Stars | TNT";
        txtSchedule.setText(fridaySchedule);
        txtSchedule.setTextSize(14);

    }

    public void showSaturday() {
        String saturdaySchedule ="All times Eastern (ET)\n" +
                "\n" +
                "9:30 a.m. | NBA All-Star Practice & Media Day presented by AT&T | NBA TV\n" +
                "\n" +
                "  9:30 a.m. – 10:00 a.m. All-Star Saturday Night Participant Media Availability\n" +
                "  10:00 a.m. – 10:45 a.m. Team Giannis Media Availability\n" +
                "  10:45 a.m. – 11:30 a.m. Team LeBron Media Availability\n" +
                "  12:05 p.m. – 12:55 p.m. Team Giannis Practice\n" +
                "  1:05 p.m. – 1:55 p.m. Team LeBron Practice\n" +
                "7 p.m. | Commissioner Adam Silver media availability | NBA TV\n" +
                "8 p.m. | State Farm All-Star Saturday Night | TNT\n" +
                "\n" +
                "Taco Bell Skills Challenge (first event)\n" +
                "Three-Point Contest (second event)\n" +
                "AT&T Slam Dunk (third event)" ;
        txtSchedule.setText(saturdaySchedule);
        txtSchedule.setTextSize(11);
    }

    public void showSunday() {
        String sundaySchedule = "All times Eastern (ET)\n" +
                "\n" +
                "3 p.m. | NBA Legends Brunch | NBA TV coverage begins at 3 ET\n" +
                "8 p.m. | 68th NBA All-Star Game | TNT coverage begins at 7 ET (also available on TBS)";
        txtSchedule.setText(sundaySchedule);
        txtSchedule.setTextSize(14);
    }

    public void openSchedule(View view) {
        Intent homeIntent = new Intent(schedule.this, schedule.class);
        startActivity(homeIntent);
        finish();
    }

    public void openDirections(View view) {
        Intent homeIntent = new Intent(schedule.this, GettingThereActivity.class);
        startActivity(homeIntent);
        finish();
    }

    public void openBooking(View view) {
        Intent homeIntent = new Intent(schedule.this, BookingActivity.class);
        startActivity(homeIntent);
        finish();
    }

    public void openAboutUs(View view) {
        Intent homeIntent = new Intent(schedule.this, AboutUsActivity.class);
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
        Intent homeIntent = new Intent(schedule.this, HomeActivity.class);
        startActivity(homeIntent);
        finish();
}
}
