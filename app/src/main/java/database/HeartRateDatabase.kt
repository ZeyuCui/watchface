package edu.neu.myfirstwearableapp.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = [HeartRate::class],version = 1)
abstract class HeartDatabase : RoomDatabase(){
    abstract  fun hrDao(): HeartRateDAO?
    companion object {
        private var INSTANCE : HeartDatabase? = null

        fun getAppDatabase(context: Context): HeartDatabase? {
            if(INSTANCE ==  null ) {
                INSTANCE =  Room.databaseBuilder<HeartDatabase>(
                    context.applicationContext, HeartDatabase::class.java,"demo_HeartRate"
                )
                    .allowMainThreadQueries()
                    .build()

            }

            return INSTANCE
        }
    }
}