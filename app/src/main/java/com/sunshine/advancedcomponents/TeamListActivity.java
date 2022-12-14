package com.sunshine.advancedcomponents;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class TeamListActivity extends AppCompatActivity {
    public ArrayList<String> namesList;
    public ListView namesLv;
    ArrayAdapter<String> arrayAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_team_list);
        getSupportActionBar().setTitle("Team List");
        setupData();
        setupListView();
        handleAddButton();
        handleDeleteButton();
    }

    private void handleDeleteButton() {
        Button deleteBtn = findViewById(R.id.delete_btn);
        deleteBtn.setOnClickListener(view -> {
            EditText membersNameTxt = findViewById(R.id.members_name_txt);
            String memberName = membersNameTxt.getText().toString();
            arrayAdapter.remove(memberName);
            arrayAdapter.notifyDataSetChanged();
            membersNameTxt.setText("");
        });
    }

    private void handleAddButton() {
        Button addBtn = findViewById(R.id.add_btn);
        addBtn.setOnClickListener(view -> {
            EditText membersNameTxt = findViewById(R.id.members_name_txt);
            String membersName = membersNameTxt.getText().toString();
            if(membersName.equals("") == false){
                arrayAdapter.add(membersName);
                arrayAdapter.notifyDataSetChanged();
            }
            membersNameTxt.setText("");
        });
    }

    public void setupData() {
        namesList = new ArrayList<>();
        namesList.add("Viswanath");
        namesList.add("Renuka");
    }

    public void setupListView(){
        namesLv = findViewById(R.id.names_lv);
        arrayAdapter = new ArrayAdapter<String>(
                this, android.R.layout.simple_list_item_1, namesList);
        namesLv.setAdapter(arrayAdapter);
        namesLv.setOnItemClickListener((adapterView, view, position, l) -> {
            Toast.makeText(this, "WhenClicked : " + namesList,
                    Toast.LENGTH_SHORT).show();
            String memberName = namesList.get(position);
            EditText memberNameTxt = findViewById(R.id.members_name_txt);
            memberNameTxt.setText(memberName);
        } );
    }
}