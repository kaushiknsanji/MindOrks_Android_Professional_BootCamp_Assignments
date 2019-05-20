package com.kaushiknsanji.learndagger.ui.home

import com.kaushiknsanji.learndagger.data.local.DatabaseService
import com.kaushiknsanji.learndagger.data.remote.NetworkService
import com.kaushiknsanji.learndagger.di.FragmentScope
import com.kaushiknsanji.learndagger.utils.NetworkHelper
import javax.inject.Inject

/**
 * Dummy ViewModel class for the [HomeFragment]
 *
 * @author Kaushik N Sanji
 */
@FragmentScope
class HomeViewModel @Inject constructor(
    private val databaseService: DatabaseService,
    private val networkService: NetworkService,
    private val networkHelper: NetworkHelper
) {

    /**
     * Method that returns some dummy data
     *
     * @return String containing some dummy data
     */
    fun getSomeData(): String =
        "${databaseService.getDummyData()} : ${networkService.getDummyData()} : ${networkHelper.isNetworkConnected()}"

}