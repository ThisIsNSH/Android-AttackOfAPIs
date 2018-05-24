package com.nsh.pucho.Database;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.util.ArrayList;
import java.util.List;

public class DatabaseHelper extends SQLiteOpenHelper {

    // Database Version
    private static final int DATABASE_VERSION = 1;

    // Database Name
    private static final String DATABASE_NAME = "Recents_db";


    public DatabaseHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    // Creating Tables
    @Override
    public void onCreate(SQLiteDatabase db) {

        // create Recents table
        db.execSQL(Recent.CREATE_TABLE);
    }

    // Upgrading database
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        // Drop older table if existed
        db.execSQL("DROP TABLE IF EXISTS " + Recent.TABLE_NAME);

        // Create tables again
        onCreate(db);
    }

    public long insertRecent(String name, String url, String function) {
        // get writable database as we want to write data
        SQLiteDatabase db = this.getWritableDatabase();

        ContentValues values = new ContentValues();
        // `id` and `timestamp` will be inserted automatically.
        // no need to add them
        values.put(Recent.COLUMN_NAME, name);
        values.put(Recent.COLUMN_URL, url);
        values.put(Recent.COLUMN_FUNCTION, function);
        // insert row

        long id = db.insert(Recent.TABLE_NAME, null, values);

        // close db connection
        db.close();

        // return newly inserted row id
        return id;
    }

    public Recent getRecent(long id) {
        // get readable database as we are not inserting anything
        SQLiteDatabase db = this.getReadableDatabase();

        Cursor cursor = db.query(Recent.TABLE_NAME,
                new String[]{Recent.COLUMN_ID, Recent.COLUMN_NAME, Recent.COLUMN_URL, Recent.COLUMN_FUNCTION},
                Recent.COLUMN_ID + "=?",
                new String[]{String.valueOf(id)}, null, null, null, null);

        if (cursor != null)
            cursor.moveToFirst();

        // prepare Recent object
        Recent recent = new Recent(
                cursor.getInt(cursor.getColumnIndex(Recent.COLUMN_ID)),
                cursor.getString(cursor.getColumnIndex(Recent.COLUMN_NAME)),
                cursor.getString(cursor.getColumnIndex(Recent.COLUMN_URL)),
                cursor.getString(cursor.getColumnIndex(Recent.COLUMN_FUNCTION)));

        // close the db connection
        cursor.close();

        return recent;
    }

    public List<Recent> getAllRecents() {
        List<Recent> recents = new ArrayList<>();

        // Select All Query
        String selectQuery = "SELECT  * FROM " + Recent.TABLE_NAME + " ORDER BY " +
                Recent.COLUMN_ID + " DESC";

        SQLiteDatabase db = this.getWritableDatabase();
        Cursor cursor = db.rawQuery(selectQuery, null);

        // looping through all rows and adding to list
        if (cursor.moveToFirst()) {
            do {
                Recent recent = new Recent();
                recent.setId(cursor.getInt(cursor.getColumnIndex(Recent.COLUMN_ID)));
                recent.setName(cursor.getString(cursor.getColumnIndex(Recent.COLUMN_NAME)));
                recent.setUrl(cursor.getString(cursor.getColumnIndex(Recent.COLUMN_URL)));
                recent.setFunction(cursor.getString(cursor.getColumnIndex(Recent.COLUMN_FUNCTION)));

                recents.add(recent);
            } while (cursor.moveToNext());
        }

        // close db connection
        db.close();

        // return Recents list
        return recents;
    }

    public int getRecentsCount() {
        String countQuery = "SELECT  * FROM " + Recent.TABLE_NAME;
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.rawQuery(countQuery, null);

        int count = cursor.getCount();
        cursor.close();


        // return count
        return count;
    }

    public int updateRecent(Recent recent) {
        SQLiteDatabase db = this.getWritableDatabase();

        ContentValues values = new ContentValues();
        values.put(Recent.COLUMN_NAME, recent.getName());
        values.put(Recent.COLUMN_URL, recent.getUrl());
        values.put(Recent.COLUMN_FUNCTION, recent.getFunction());
        // updating row
        return db.update(Recent.TABLE_NAME, values, Recent.COLUMN_ID + " = ?",
                new String[]{String.valueOf(recent.getId())});
    }

    public void deleteRecent(Recent recent) {
        SQLiteDatabase db = this.getWritableDatabase();
        db.delete(Recent.TABLE_NAME, Recent.COLUMN_ID + " = ?",
                new String[]{String.valueOf(recent.getId())});
        db.close();
    }
}