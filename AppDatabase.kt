package com.example.simondice.model.room

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase



    //Clase de base da datos

@Database(entities = [Record::class], version = 1, exportSchema = false)
abstract class AppDatabase : RoomDatabase(){

    abstract fun DAORecord(): DAORecord


    companion object {
        @Volatile
        private var INSTANCE: AppDatabase? = null

        fun getDatabase(context: Context): AppDatabase {

            //Codigo que se ejecuta si no existe una instancia de la clase
            if (INSTANCE == null) {
                synchronized(this) {
                    INSTANCE = Room.databaseBuilder(
                        context.applicationContext,
                        AppDatabase::class.java,
                        "myDatabase.db"
                    ).allowMainThreadQueries().build()
                }
            }
            return INSTANCE!!
        }
    }

}