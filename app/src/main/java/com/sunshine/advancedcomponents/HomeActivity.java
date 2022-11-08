package com.sunshine.advancedcomponents;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        getSupportActionBar().setTitle("Home");
        handleLuckyNumberBtn();
        handleLocationBtn();
        handleDateOfBirthBtn();
        handleTeamBtn();
    }

     public void handleLuckyNumberBtn() {
         Button luckyNumberBtn = findViewById(R.id.lucky_number_btn);
         luckyNumberBtn.setOnClickListener(view -> {
             Intent luckyNumberIntent = new Intent(this, LuckyNumberActivity.class);
             startActivity(luckyNumberIntent);
         });
     }

     public void handleLocationBtn() {
         Button locationBtn = findViewById(R.id.location_btn);
         locationBtn.setOnClickListener(view -> {
             Intent locationIntent = new Intent(this, LocationActivity.class);
             startActivity(locationIntent);
         });
     }

     public void handleDateOfBirthBtn() {
         Button dateOfBirthBtn = findViewById(R.id.dob_btn);
         dateOfBirthBtn.setOnClickListener(view -> {
             Intent dateOfBirthIntent = new Intent(this, DateOfBirthActivity.class);
             startActivity(dateOfBirthIntent);
         });
     }

     public void handleTeamBtn() {
         Button teamBtn = findViewById(R.id.team_btn);
         teamBtn.setOnClickListener(view -> {
             Intent teamIntent = new Intent(this, TeamActivity.class);
             startActivity(teamIntent);
         });
     }
}