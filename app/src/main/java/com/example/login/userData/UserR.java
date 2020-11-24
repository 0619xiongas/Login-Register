package com.example.login.userData;

import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import java.util.concurrent.Callable;

public class UserR {
    private UserDataHelper dbHelper;
    public UserR(Context context){
        dbHelper = new UserDataHelper(context);
    }
   /* public boolean login(String userName,String userPwd){
        SQLiteDatabase db = dbHelper.getWritableDatabase();
        String sql = "select * from DATA where userName = ? and userPwd = ?";
        Cursor c = db.rawQuery(sql,new String[]{userName,userPwd});
        if(c.moveToFirst() == true){
            c.close();
            return true;
        }
        return false;
    }*/
    public boolean loginName(String userName){
        SQLiteDatabase db = dbHelper.getWritableDatabase();
        String sql = "select * from DATA where userName = ?";
        Cursor c = db.rawQuery(sql,new String[]{userName});
        if(c.moveToFirst() == true){
            c.close();
            return true;
        }
        return false;
    }
    public boolean loginPwd(String userPwd){
        SQLiteDatabase db = dbHelper.getWritableDatabase();
        String sql = "select * from DATA where userPwd = ?";
        Cursor c = db.rawQuery(sql,new String[]{userPwd});
        if(c.moveToFirst() == true){
            c.close();
            return true;
        }
        return false;
    }
    public boolean register(UserData userData){
        SQLiteDatabase db = dbHelper.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put("userName",userData.getUserName());
        values.put("userPwd",userData.getUserPwd());
        db.insert("DATA",null,values);
        values.clear();
        return true;
    }
    public boolean registerName(String uesrName){
        SQLiteDatabase db = dbHelper.getWritableDatabase();
        String sql = "select * from DATA where userName = ?";
        Cursor c = db.rawQuery(sql,new String[]{uesrName});
        if(c.moveToFirst() == true){
            c.close();
            return true;
        }
        return false;
    }
}
