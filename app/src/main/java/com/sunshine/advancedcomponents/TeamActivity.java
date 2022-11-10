package com.sunshine.advancedcomponents;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

import java.util.ArrayList;

public class TeamActivity extends AppCompatActivity {
    public ArrayList<String> nameList;
    public Spinner namesSp;
    public ArrayAdapter<String> arrayAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_team);
        getSupportActionBar().setTitle("Team");
        setupData();
        setupSpinner();
        handleAddButton();
    }

    public void handleAddButton() {
        Button addBtn = findViewById(R.id.add_btn);
        addBtn.setOnClickListener(view -> {
            EditText nameTxt = findViewById(R.id.name_txt);
            String name = nameTxt.getText().toString();
            if(name.equals("") == false){
                arrayAdapter.add(name);
                arrayAdapter.notifyDataSetChanged();
            }
            nameTxt.setText("");
        });
    }

    public void setupData() {
        nameList = new ArrayList<>();
        nameList.add("Viswanath");
        nameList.add("Renuka");
    }

    public void setupSpinner() {
         namesSp = findViewById(R.id.names_sp);
         arrayAdapter = new ArrayAdapter<String >(
                 this, android.R.layout.simple_list_item_1, nameList);
        namesSp.setAdapter(arrayAdapter);
    }
}