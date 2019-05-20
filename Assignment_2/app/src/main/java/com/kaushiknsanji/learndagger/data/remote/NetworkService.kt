package com.kaushiknsanji.learndagger.data.remote

import android.content.Context
import com.kaushiknsanji.learndagger.di.ApplicationContext
import com.kaushiknsanji.learndagger.di.NetworkInfo
import javax.inject.Inject
import javax.inject.Singleton

/**
 * Dummy class to simulate the actual NetworkService using Retrofit or OkHttp etc
 *
 * @author Kaushik N Sanji
 */
@Singleton
class NetworkService @Inject constructor(
    @ApplicationContext private val context: Context,
    @NetworkInfo private val apiKey: String
) {

    /**
     * Method that returns some dummy data
     *
     * @return String containing some dummy data
     */
    fun getDummyData(): String = "NETWORK_DUMMY_DATA"

}