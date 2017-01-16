package com.example.student.crudsqlite.DB;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import com.example.student.crudsqlite.Config;
import com.example.student.crudsqlite.Model.Persona;

import java.util.ArrayList;

/**
 * Created by student on 06.01.2017.
 */

public class CRUDSQLite {

    SQliteDBHelper sqLiteDBHelper;

    public CRUDSQLite(Context context) {
        this.sqLiteDBHelper = new SQliteDBHelper(context);
    }

//    public class CRUDSQLite {
//        SQliteDBHelper sqLiteDBHelper;
//        public CRUDSQLite(Context context){
//            this.sqLiteDBHelper = new SQLiteDBHelper(context);
//        }

        public ArrayList<Persona> getAllPersons()
        {
            ArrayList<Persona> persons = new ArrayList<Persona>();
            SQLiteDatabase db = sqLiteDBHelper.getWritableDatabase();
            Cursor cursor = db.rawQuery(Config.COMMAND_SELECT, null);
            Persona person = null;
            if (cursor.moveToFirst())
            {
                do{
                    person = new Persona();
                    person.setId(Integer.parseInt(cursor.getString(0)));
                    person.setmName(cursor.getString(1));
                    person.setmLastName(cursor.getString(2));
                    person.setmPhoneNumber(cursor.getString(3));
                    person.setmMail(cursor.getString(4));
                    person.setmSkype(cursor.getString(5));
                    persons.add(person);
                }
                while (cursor.moveToNext());
            }
            return persons;

        }

        public void addperson (Persona person)
        {
            SQLiteDatabase db = sqLiteDBHelper.getWritableDatabase();
            ContentValues values = new ContentValues();

            values.put(Config.KEY_ID,person.getId());
            values.put(Config.KEY_NAME,person.getId());
            values.put(Config.KEY_SURNAME,person.getId());
            values.put(Config.KEY_PHONE,person.getId());
            values.put(Config.KEY_MAIL,person.getId());
            values.put(Config.KEY_SKYPE,person.getId());
            db.insert(Config.TABLE_PERSON, null, values);
            db.close();
        }


    public void deleteAllPerson()
    {
        SQLiteDatabase db=sqLiteDBHelper.getWritableDatabase();
        db.delete(Config.TABLE_PERSON,null,null);
        db.close();
    }

}
