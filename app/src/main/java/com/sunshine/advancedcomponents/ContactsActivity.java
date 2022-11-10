package com.sunshine.advancedcomponents;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class ContactsActivity extends AppCompatActivity {
    public ArrayList<Contacts> contactsList;
    public ListView contactsLv;
    public ArrayAdapter<Contacts> arrayAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contacts);
        getSupportActionBar().setTitle("Contacts");
        setupData();
        setupContactsListView();
    }

    private void setupContactsListView() {
        contactsLv = findViewById(R.id.contacts_lv);
        arrayAdapter = new ArrayAdapter<Contacts>(
                this, R.layout.contact_items, contactsList);
    }

    private void setupData() {
        contactsList = new ArrayList<>();
        Contacts contactsOne = new Contacts();
        contactsOne.name = "Viswanath";
        contactsOne.phoneNumber = "+91 9000540052";
        contactsList.add(contactsOne);
        Contacts contactsTwo = new Contacts();
        contactsTwo.name = "Renuka";
        contactsTwo.phoneNumber = "+91 9886655979";
        contactsList.add(contactsTwo);
    }
}