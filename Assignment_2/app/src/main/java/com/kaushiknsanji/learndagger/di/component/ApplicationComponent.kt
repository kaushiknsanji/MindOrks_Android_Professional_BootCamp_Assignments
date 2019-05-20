package com.kaushiknsanji.learndagger.di.component

import android.content.Context
import com.kaushiknsanji.learndagger.MyApplication
import com.kaushiknsanji.learndagger.data.local.DatabaseService
import com.kaushiknsanji.learndagger.data.remote.NetworkService
import com.kaushiknsanji.learndagger.di.ApplicationContext
import com.kaushiknsanji.learndagger.di.module.ApplicationModule
import com.kaushiknsanji.learndagger.utils.NetworkHelper
import dagger.Component
import javax.inject.Singleton

/**
 * Dagger Component for exposing dependencies from the Module [ApplicationModule]
 *
 * @author Kaushik N Sanji
 */
@Singleton
@Component(modules = [ApplicationModule::class])
interface ApplicationComponent {

    fun inject(application: MyApplication): Unit

    @ApplicationContext
    fun getContext(): Context

    fun getNetworkService(): NetworkService

    fun getDatabaseService(): DatabaseService

    fun getNetworkHelper(): NetworkHelper
}