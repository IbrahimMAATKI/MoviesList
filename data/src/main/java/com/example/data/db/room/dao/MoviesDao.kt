package com.example.data.db.room.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Transaction
import com.example.data.db.room.models.MovieDataEntity
import kotlinx.coroutines.flow.Flow

@Dao
abstract class MoviesDao {

    @Transaction
    @Query("SELECT * FROM Movies")
    abstract fun getAllMovies(): Flow<List<MovieDataEntity>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    abstract suspend fun insertMovies(movies: List<MovieDataEntity>)

}