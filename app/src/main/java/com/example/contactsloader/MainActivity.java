package com.example.contactsloader;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ListView lvContacts;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lvContacts = findViewById(R.id.lvContacts);
        List<Contact> contacts = new ArrayList<>();

        lvContacts.setAdapter(new ContactAdapter(this, R.layout.list_item_contact, contacts));
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.option_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.optionASC:
            {
                break;
            }
            case R.id.optionDESC:
            {
                break;
            }
            case R.id.optionNew:
            {
                break;
            }
        }
        return super.onOptionsItemSelected(item);
    }
}