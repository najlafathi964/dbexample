package com.najla.dbexample;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        DBHelper dbHelper = new DBHelper(this);
        SQLiteDatabase database =dbHelper.getWritableDatabase();

        ContentValues contentValues = new ContentValues();
        contentValues.put(DBContract.Department.COLUMN_NAME ,"Delivery");
        long depid = database.insert(DBContract.Department.TABLE_NAME ,null ,contentValues);
      /*  if (depid != -1){
            ContentValues empValues = new ContentValues();
            empValues.put(DBContract.Employee.COLUMN_NAME , "Najla");
            empValues.put(DBContract.Employee.COLUMN_AGE , 23);
            empValues.put(DBContract.Employee.COLUMN_PHONE , "0599010820");
            empValues.put(DBContract.Employee.COLUMN_GENDER , "Female");
            empValues.put(DBContract.Employee.COLUMN_DEP_ID , 1);

            database.insert(DBContract.Employee.TABLE_NAME,null,empValues);

            ContentValues empValues2 = new ContentValues();
            empValues.put(DBContract.Employee.COLUMN_NAME , "Ameer");
            empValues.put(DBContract.Employee.COLUMN_AGE , 25);
            empValues.put(DBContract.Employee.COLUMN_PHONE , "0599010820");
            empValues.put(DBContract.Employee.COLUMN_GENDER , "Male");
            empValues.put(DBContract.Employee.COLUMN_DEP_ID , 1);

            database.insert(DBContract.Employee.TABLE_NAME,null,empValues);

        }*/

      Cursor cursor =database.rawQuery("SELECT * FROM "+ DBContract.Employee.TABLE_NAME + " WHERE "+ DBContract.Employee.COLUMN_DEP_ID +" = 1 ",null);
        while(cursor.moveToNext()){

        }
    }
}
