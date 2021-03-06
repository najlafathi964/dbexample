package com.najla.dbexample;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class DBHelper extends SQLiteOpenHelper {
    public static final String DB_NAME = "data.db";
    public static final int DB_VERSION = 1;

    public DBHelper(Context context) {
        super(context, DB_NAME, null, DB_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        db.execSQL(DBContract.Employee.CREATE_STATEMENT);
        db.execSQL(DBContract.Department.CREATE_STATEMENT);

    }

    @Override
    public void onUpgrade(SQLiteDatabase dp, int i, int i1) {

    }
}
