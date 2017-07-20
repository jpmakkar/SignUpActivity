package com.example.hp2.signupactivity;

import android.net.Uri;

/**
 * Created by hp 2 on 20-07-2017.
 */

public class Util {


    public static final String DB_NAME = "cpdemo.db";
    public static final int DB_VERSION = 1;

    public static final String TAB_NAME = "User";

    public static final String COL_ID = "_ID";
    public static final String COL_NAME="NAME";
    public static final String COL_EMAIL = "EMAIL";
    public static final String COL_PASSWORD = "PASSWORD";
    public static final String COL_GENDER = "GENDER";
    public static final String COL_CITY = "CITY";

    public static final String CREATE_TAB_QUERY = "create table User(" +
            "_ID integer primary key autoincrement," +
            "NAME text," +
            "EMAIL text," +
            "PASSWORD text," +
            "GENDER text," +
            "CITY text" +
            ")";

    public static final Uri USER_URI = Uri.parse("content://abcd/"+TAB_NAME);
}
