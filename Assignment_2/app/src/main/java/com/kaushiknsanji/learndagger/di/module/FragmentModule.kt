package com.kaushiknsanji.learndagger.di.module

import android.content.Context
import androidx.fragment.app.Fragment
import com.kaushiknsanji.learndagger.di.ActivityContext
import dagger.Module
import dagger.Provides

/**
 * Dagger Module for creating and exposing dependencies, tied to the Fragment Lifecycle
 *
 * @author Kaushik N Sanji
 */
@Module
class FragmentModule(private val fragment: Fragment) {

    @ActivityContext
    @Provides
    fun provideContext(): Context = fragment.requireContext()

}