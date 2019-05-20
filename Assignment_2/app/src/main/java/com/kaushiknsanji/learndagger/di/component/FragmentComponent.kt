package com.kaushiknsanji.learndagger.di.component

import com.kaushiknsanji.learndagger.di.FragmentScope
import com.kaushiknsanji.learndagger.di.module.FragmentModule
import com.kaushiknsanji.learndagger.ui.home.HomeFragment
import dagger.Component

/**
 * Dagger Component for exposing dependencies from the Module [FragmentModule]
 * and its dependent component [ApplicationComponent]
 *
 * @author Kaushik N Sanji
 */
@FragmentScope
@Component(dependencies = [ApplicationComponent::class], modules = [FragmentModule::class])
interface FragmentComponent {

    fun inject(fragment: HomeFragment): Unit

}