package com.kaushiknsanji.learndagger.ui.base

import androidx.annotation.UiThread
import androidx.fragment.app.Fragment
import com.kaushiknsanji.learndagger.MyApplication
import com.kaushiknsanji.learndagger.di.component.ApplicationComponent
import com.kaushiknsanji.learndagger.di.component.DaggerFragmentComponent
import com.kaushiknsanji.learndagger.di.component.FragmentComponent
import com.kaushiknsanji.learndagger.di.module.FragmentModule

/**
 * An Abstract [Fragment] class which is the base class
 * for all the Fragments in this application.
 *
 * @author Kaushik N Sanji
 */
abstract class BaseFragment : Fragment() {

    //Tracks if the FragmentComponent is used more than once in a Fragment to inject dependencies
    private var isComponentUsed: Boolean = false

    /**
     * Method that creates and returns the FragmentComponent tied to the Fragment Lifecycle.
     *
     * @return A New instance of [FragmentComponent]
     */
    @UiThread
    protected fun getFragmentComponent(): FragmentComponent {
        if (isComponentUsed) {
            //Throwing exception when invoked more than once in the same Fragment
            throw RuntimeException("No need to use FragmentComponent more than once")
        }

        isComponentUsed = true
        return DaggerFragmentComponent.builder()
            .applicationComponent(getApplicationComponent())
            .fragmentModule(FragmentModule(this))
            .build()
    }

    /**
     * Method that returns [ApplicationComponent] instance
     *
     * @return An [ApplicationComponent] instance
     */
    private fun getApplicationComponent(): ApplicationComponent =
        (context!!.applicationContext as MyApplication).applicationComponent

}