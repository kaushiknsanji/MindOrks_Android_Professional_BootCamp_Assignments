package com.kaushiknsanji.learndagger.di.component

import com.kaushiknsanji.learndagger.di.ActivityScope
import com.kaushiknsanji.learndagger.di.module.ActivityModule
import com.kaushiknsanji.learndagger.ui.main.MainActivity
import dagger.Component

/**
 * Dagger Component for exposing dependencies from the Module [ActivityModule]
 * and its dependent component [ApplicationComponent]
 *
 * @author Kaushik N Sanji
 */
@ActivityScope
@Component(dependencies = [ApplicationComponent::class], modules = [ActivityModule::class])
interface ActivityComponent {

    fun inject(activity: MainActivity): Unit

}