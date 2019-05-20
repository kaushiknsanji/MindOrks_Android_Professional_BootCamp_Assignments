package com.kaushiknsanji.learndagger.di

import javax.inject.Qualifier

/**
 * Kotlin file for all the [Qualifier] annotations used in the app
 *
 * @author Kaushik N Sanji
 */

/**
 * [Qualifier] annotation used for distinguishing the [android.content.Context]
 * provided by [com.kaushiknsanji.learndagger.di.module.ApplicationModule]
 */
@Qualifier
@Retention(AnnotationRetention.SOURCE)
annotation class ApplicationContext

/**
 * [Qualifier] annotation used for distinguishing the [android.content.Context]
 * provided by [com.kaushiknsanji.learndagger.di.module.ActivityModule]
 */
@Qualifier
@Retention(AnnotationRetention.SOURCE)
annotation class ActivityContext

/**
 * [Qualifier] annotation used for distinguishing the dependencies
 * required by [com.kaushiknsanji.learndagger.data.local.DatabaseService], which is
 * provided by [com.kaushiknsanji.learndagger.di.module.ApplicationModule]
 */
@Qualifier
@Retention(AnnotationRetention.SOURCE)
annotation class DatabaseInfo

/**
 * [Qualifier] annotation used for distinguishing the dependencies
 * required by [com.kaushiknsanji.learndagger.data.remote.NetworkService], which is
 * provided by [com.kaushiknsanji.learndagger.di.module.ApplicationModule]
 */
@Qualifier
@Retention(AnnotationRetention.SOURCE)
annotation class NetworkInfo