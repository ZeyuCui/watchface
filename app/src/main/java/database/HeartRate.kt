package edu.neu.myfirstwearableapp.database

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "heart_rate_history")
data class HeartRate(
    @PrimaryKey(autoGenerate = true)
    var id: Int = 0,

    @ColumnInfo(name = "time")
    var current: Long = System.currentTimeMillis(),

    @ColumnInfo(name = "heartrate")
    var current_heart_rate: Float = 90.0F
)