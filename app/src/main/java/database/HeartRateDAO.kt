package edu.neu.myfirstwearableapp.database

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query

@Dao
interface HeartRateDAO {
    @Insert
    fun insertAll(vararg hr:HeartRate)

    @Query("SELECT * FROM heart_rate_history")
    fun getAll(): List<HeartRate>
}