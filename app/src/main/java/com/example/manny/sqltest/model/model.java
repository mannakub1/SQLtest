package com.example.manny.sqltest.model;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by manny on 12/5/2015 AD.
 */
public class model extends SQLiteOpenHelper {

    public static final String DATABASE_NAME = "Contact.db";
    public static final int DATABASE_VERSION = 1;
    public static final String TABLE_NAME  = "Contacts";
    public static final String COL_NAME = "name";
    public static final String COL_NUMBER = "number";

    public model(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    public void onCreate(SQLiteDatabase db) {

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
