package com.example.student.crudsqlite.DB;

import android.content.Context;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.example.student.crudsqlite.Config;

import static com.example.student.crudsqlite.Config.DB_NAME;

/**
 * Created by student on 06.01.2017.
 */

public class SQliteDBHelper extends SQLiteOpenHelper {


    public SQliteDBHelper(Context context) {
        super(context, DB_NAME, null, Config.DB_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL(Config.COMMAND_CREATE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        sqLiteDatabase.execSQL(Config.COMMAND_DELETE);
        this.onCreate(sqLiteDatabase);
    }
}
