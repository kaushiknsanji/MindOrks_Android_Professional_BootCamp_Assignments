package com.kaushiknsanji.learndagger.utils

import android.content.Context
import com.kaushiknsanji.learndagger.di.ApplicationContext
import javax.inject.Inject
import javax.inject.Singleton

/**
 * Dummy Utility class for Network related operations.
 *
 * @author Kaushik N Sanji
 */
@Singleton
class NetworkHelper @Inject constructor(
    @ApplicationContext private val context: Context
) {

    /**
     * Method that checks for Network Connectivity and reports its status as Boolean.
     *
     * @return Boolean indicating the status of Network Connectivity.
     * [true] if connected; [false] otherwise
     */
    fun isNetworkConnected(): Boolean = false

}