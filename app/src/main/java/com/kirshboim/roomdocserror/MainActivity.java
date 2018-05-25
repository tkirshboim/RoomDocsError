package com.kirshboim.roomdocserror;

import android.arch.persistence.room.Room;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Room.databaseBuilder(getApplicationContext(), AppDatabase.class, "database-name").build();
    }
}
