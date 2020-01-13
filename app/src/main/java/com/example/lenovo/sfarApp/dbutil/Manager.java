package com.example.lenovo.sfarApp.dbutil;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;



public class Manager
{


    Context context;
    Helper ch;
    SQLiteDatabase sb;

    public Manager(Context context)
    {
        this.context=context;
        ch=new Helper(context, Constants.DB_NAME,null,Constants.DB_VERSION);

    }

    public SQLiteDatabase openDb()
    {


        sb=  ch.getWritableDatabase();
        return sb;
    }

    public  void closeDb()
    {

        ch.close();


    }



}
