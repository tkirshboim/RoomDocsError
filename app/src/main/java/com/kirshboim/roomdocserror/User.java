package com.kirshboim.roomdocserror;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.Ignore;
import android.arch.persistence.room.Index;
import android.arch.persistence.room.PrimaryKey;
import android.graphics.Bitmap;

// Taken from https://developer.android.com/training/data-storage/room/defining-data#indices-uniqueness
// See issue https://issuetracker.google.com/u/1/issues/79443867
@Entity(indices = {@Index("name"),
        @Index(value = {"last_name", "address"})})
public class User {

    @PrimaryKey
    public int id;

    public String firstName;
    public String address;

    @ColumnInfo(name = "last_name")
    public String lastName;

    @Ignore
    Bitmap picture;
}
