package com.kaushiknsanji.learndagger

import android.app.Application
import com.kaushiknsanji.learndagger.data.local.DatabaseService
import com.kaushiknsanji.learndagger.data.remote.NetworkService
import com.kaushiknsanji.learndagger.di.component.ApplicationComponent
import com.kaushiknsanji.learndagger.di.component.DaggerApplicationComponent
import com.kaushiknsanji.learndagger.di.module.ApplicationModule
import com.kaushiknsanji.learndagger.utils.NetworkHelper
import javax.inject.Inject

/**
 * [Application] subclass for exposing [ApplicationComponent]
 *
 * @author Kaushik N Sanji
 */
class MyApplication : Application() {

    @Inject
    lateinit var networkService: NetworkService

    @Inject
    lateinit var databaseService: DatabaseService

    @Inject
    lateinit var networkHelper: NetworkHelper

    //[ApplicationComponent] built lazily and only once
    val applicationComponent: ApplicationComponent by lazy {
        DaggerApplicationComponent.builder()
            .applicationModule(ApplicationModule(this))
            .build()
    }

    override fun onCreate() {
        super.onCreate()

        applicationComponent.inject(this)
    }

}