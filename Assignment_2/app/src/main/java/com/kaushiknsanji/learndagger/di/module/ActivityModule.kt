package com.kaushiknsanji.learndagger.di.module

import android.app.Activity
import android.content.Context
import com.kaushiknsanji.learndagger.di.ActivityContext
import dagger.Module
import dagger.Provides

/**
 * Dagger Module for creating and exposing dependencies, tied to the Activity Lifecycle
 *
 * @author Kaushik N Sanji
 */
@Module
class ActivityModule(private val activity: Activity) {

    @ActivityContext
    @Provides
    fun provideContext(): Context = activity

}