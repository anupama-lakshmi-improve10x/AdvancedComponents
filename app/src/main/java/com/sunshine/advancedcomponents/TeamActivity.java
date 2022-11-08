package com.sunshine.advancedcomponents;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class TeamActivity extends AppCompatActivity {
    public String[] team = {"Viswanath", "Renuka"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_team);
        getSupportActionBar().setTitle("Team");
        setupTeam();
    }

    public void setupTeam() {
        Spinner teamMemberSp = findViewById(R.id.team_members_sp);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String >(this,android.R.layout.simple_list_item_1, team);
        teamMemberSp.setAdapter(arrayAdapter);
        teamMemberSp.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
    }
}