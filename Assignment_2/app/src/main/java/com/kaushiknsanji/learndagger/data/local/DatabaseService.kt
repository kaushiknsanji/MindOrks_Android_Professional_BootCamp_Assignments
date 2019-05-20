package com.kaushiknsanji.learndagger.data.local

import android.content.Context
import com.kaushiknsanji.learndagger.di.ApplicationContext
import com.kaushiknsanji.learndagger.di.DatabaseInfo
import javax.inject.Inject
import javax.inject.Singleton

/**
 * Dummy class to simulate the actual Database using Room or Realm etc
 *
 * @author Kaushik N Sanji
 */
@Singleton
class DatabaseService @Inject constructor(
    @ApplicationContext private val context: Context,
    @DatabaseInfo private val databaseName: String,
    @DatabaseInfo private val version: Int
) {

    /**
     * Method that returns some dummy data
     *
     * @return String containing some dummy data
     */
    fun getDummyData(): String = "DATABASE_DUMMY_DATA"

}