package com.kaushiknsanji.learndagger.ui.main

import com.kaushiknsanji.learndagger.data.local.DatabaseService
import com.kaushiknsanji.learndagger.data.remote.NetworkService
import com.kaushiknsanji.learndagger.di.ActivityScope
import javax.inject.Inject

/**
 * Dummy ViewModel class for the [MainActivity]
 *
 * @author Kaushik N Sanji
 */
@ActivityScope
class MainViewModel @Inject constructor(
    private val databaseService: DatabaseService,
    private val networkService: NetworkService
) {

    /**
     * Method that returns some dummy data
     *
     * @return String containing some dummy data
     */
    fun getSomeData(): String = "${databaseService.getDummyData()} : ${networkService.getDummyData()}"

}