package com.simant.useractivity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);

        /* have to create a interface to fetch data from Database */

        // Data listing through Arraylist
        List<Contacts> contactsList = new ArrayList<>();
        contactsList.add(new Contacts("Tom Cruise", "30", "Lalitpur", "male", R.drawable.male, R.drawable.delete));

        ContactsAdapter contactsAdapter = new ContactsAdapter(this, contactsList);
        recyclerView.setAdapter(contactsAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}
