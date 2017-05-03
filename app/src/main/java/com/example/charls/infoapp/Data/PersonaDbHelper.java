package com.example.charls.infoapp.Data;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by charls on 05-03-17.
 */

public class PersonaDbHelper extends SQLiteOpenHelper {
    public static final int DATABASE_VERSION = 1;
    public static final String DATABASE_NAME = "Persona.db";
   public PersonaDbHelper(Context context){
       super(context, DATABASE_NAME, null, DATABASE_VERSION);
   }


    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL("CREATE TABLE " + PeronaContract.PersonaEntry.TABLE_NAME + " ("
                + PeronaContract.PersonaEntry._ID + " INTEGER PRIMARY KEY AUTOINCREMENT,"
                + PeronaContract.PersonaEntry.Nombre + " TEXT  NULL,"
                + PeronaContract.PersonaEntry.Apellido + " TEXT  NULL,"
                + PeronaContract.PersonaEntry.Celular + " TEXT  NULL,"
                + PeronaContract.PersonaEntry.Especialidad + " TEXT NULL,"
                + PeronaContract.PersonaEntry.Foto + " TEXT  NULL,"
                + "UNIQUE (" + PeronaContract.PersonaEntry.ID + "))");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }

}
