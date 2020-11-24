package com.example.login.userData;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import javax.xml.namespace.QName;

public class UserDataHelper extends SQLiteOpenHelper {
    private Context mContext;
    private SQLiteDatabase db;
    static String tableName = "DATA.db";
    public static final String sql = "create table DATA("
            + "id integer primary key autoincrement,"
            + "userName text,"
            + "userPwd text)";

    public UserDataHelper(Context context){
        super(context,tableName,null,1);
        mContext = context;
        db = getWritableDatabase();
    }
    //建立数据库
    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(sql);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("drop table if exists DATA");
        onCreate(db);
    }
}
