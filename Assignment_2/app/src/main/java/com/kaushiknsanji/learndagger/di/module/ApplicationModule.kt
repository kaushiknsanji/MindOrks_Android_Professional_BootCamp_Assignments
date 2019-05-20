package com.kaushiknsanji.learndagger.di.module

import android.content.Context
import com.kaushiknsanji.learndagger.MyApplication
import com.kaushiknsanji.learndagger.di.ApplicationContext
import com.kaushiknsanji.learndagger.di.DatabaseInfo
import com.kaushiknsanji.learndagger.di.NetworkInfo
import dagger.Module
import dagger.Provides

/**
 * Dagger Module for creating and exposing dependencies, tied to the Application Lifecycle
 *
 * @author Kaushik N Sanji
 */
@Module
class ApplicationModule(private val application: MyApplication) {

    @ApplicationContext
    @Provides
    fun provideContext(): Context = application

    @DatabaseInfo
    @Provides
    fun provideDatabaseName(): String = "dummy_db"

    @DatabaseInfo
    @Provides
    fun provideDatabaseVersion(): Int = 1

    @NetworkInfo
    @Provides
    fun provideApiKey(): String = "SOME_API_KEY"

}