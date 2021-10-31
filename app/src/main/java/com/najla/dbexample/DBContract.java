package com.najla.dbexample;

import android.provider.BaseColumns;
//contain all columns in tables in database
public class DBContract {
    public DBContract () {

    }

    public  class Employee implements BaseColumns {
        public static final String TABLE_NAME = "employee";
        public static final String COLUMN_NAME = "name";
        public static final String COLUMN_AGE = "age";
        public static final String COLUMN_GENDER = "gender";
        public static final String COLUMN_PHONE = "phone";
        public static final String COLUMN_DEP_ID = "dep_id";

        public static final String CREATE_STATEMENT = "CREATE TABLE "+TABLE_NAME + "("+_ID+"INTEGER PRIMARY KEY AUTOINCREMENT,"+COLUMN_NAME +"TEXT,"+COLUMN_AGE+"INTEGER,"+
                COLUMN_GENDER + "TEXT,"+COLUMN_PHONE + "TEXT,"+COLUMN_DEP_ID+"INTEGER,";
        public static final String DELETE_STATEMENT = "DROP TABLE IF EXISTS"+TABLE_NAME;


    }

    public  class Department implements BaseColumns {
        public static final String TABLE_NAME = "department";
        public static final String COLUMN_NAME = "name";


        public static final String CREATE_STATEMENT = "CREATE TABLE "+TABLE_NAME + "("+_ID+"INTEGER PRIMARY KEY AUTOINCREMENT,"+COLUMN_NAME +"TEXT )";
        public static final String DELETE_STATEMENT = "DROP TABLE IF EXISTS"+TABLE_NAME;


    }
}
