package com.kaushiknsanji.learndagger.di

import javax.inject.Scope

/**
 * Kotlin file for all the [Scope] annotations used in the app
 *
 * @author Kaushik N Sanji
 */

/**
 * [Scope] annotation for scoping the dependencies
 * exposed by [com.kaushiknsanji.learndagger.di.component.ActivityComponent]
 * and for distinguishing with the scoped dependencies exposed by its dependent
 * [com.kaushiknsanji.learndagger.di.component.ApplicationComponent]
 */
@Scope
@Retention(AnnotationRetention.SOURCE)
annotation class ActivityScope

/**
 * [Scope] annotation for scoping the dependencies
 * exposed by [com.kaushiknsanji.learndagger.di.component.FragmentComponent]
 * and for distinguishing with the scoped dependencies exposed by its dependent
 * [com.kaushiknsanji.learndagger.di.component.ApplicationComponent]
 */
@Scope
@Retention(AnnotationRetention.SOURCE)
annotation class FragmentScope