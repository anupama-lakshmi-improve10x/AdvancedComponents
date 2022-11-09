package com.sunshine.advancedcomponents;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import java.util.ArrayList;

public class AddMembersActivity extends AppCompatActivity {

    public ArrayList<String> teamNamesList;
    public ArrayList<String> allTeamMembersList;
    public ArrayList<String> teamANamesList;
    public ArrayList<String> teamBNamesList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_members);
        getSupportActionBar().setTitle("Add Members");
        setTeamNamesData();
        setupSpinnerTeamNames();;
        setAllTeamMembersData();
        setupSpinnerAllMembers();
        setupTeamAData();
        setupSpinnerTeamA();
        setupTeamBData();
        setupSpinnerTeamB();
    }

    private void setTeamNamesData() {
        teamNamesList = new ArrayList<>();
        teamNamesList.add("Team A");
        teamNamesList.add("Team B");
    }

    public void setupSpinnerTeamNames() {
        Spinner selectTeamSp = findViewById(R.id.team_sp);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(
                this, android.R.layout.simple_list_item_1, teamNamesList);
        selectTeamSp.setAdapter(arrayAdapter);
    }

    public void setAllTeamMembersData() {
        allTeamMembersList = new ArrayList<>();
        allTeamMembersList.add("Viswanath");
        allTeamMembersList.add("Renuka");

    }

    public void setupSpinnerAllMembers() {
        Spinner allMembersSp =findViewById(R.id.all_members_sp);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(
                this, android.R.layout.simple_list_item_1, allTeamMembersList);
        allMembersSp.setAdapter(arrayAdapter);
    }

    public void setupTeamAData() {
        teamANamesList = new ArrayList<>();
        teamANamesList.add("Viswanath");
        teamANamesList.add("Renuka");
    }

    public void setupSpinnerTeamA() {
        Spinner teamASp = findViewById(R.id.team_a_sp);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(
                this, android.R.layout.simple_list_item_1, teamANamesList);
        teamASp.setAdapter(arrayAdapter);
    }

    public void setupTeamBData() {
        teamBNamesList = new ArrayList<>();
        teamBNamesList.add("Viswanath");
        teamBNamesList.add("Renuka");
    }

    public void setupSpinnerTeamB(){
        Spinner teamBSp = findViewById(R.id.team_b_sp);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(
                this, android.R.layout.simple_list_item_1, teamBNamesList);
        teamBSp.setAdapter(arrayAdapter);
    }

}