package com.kaushiknsanji.learndagger.ui.base

import androidx.annotation.UiThread
import androidx.appcompat.app.AppCompatActivity
import com.kaushiknsanji.learndagger.MyApplication
import com.kaushiknsanji.learndagger.di.component.ActivityComponent
import com.kaushiknsanji.learndagger.di.component.ApplicationComponent
import com.kaushiknsanji.learndagger.di.component.DaggerActivityComponent
import com.kaushiknsanji.learndagger.di.module.ActivityModule

/**
 * An [AppCompatActivity] class which is the base class
 * for all the activities in this application
 *
 * @author Kaushik N Sanji
 */
abstract class BaseActivity : AppCompatActivity() {

    //Tracks if the ActivityComponent is used more than once in an Activity to inject dependencies
    private var isComponentUsed: Boolean = false

    /**
     * Method that creates and returns the ActivityComponent tied to the Activity Lifecycle.
     *
     * @return A New instance of [ActivityComponent]
     */
    @UiThread
    protected fun getActivityComponent(): ActivityComponent {
        if (isComponentUsed) {
            //Throwing exception when invoked more than once in the same Activity
            throw RuntimeException("No need to use ActivityComponent more than once")
        }

        isComponentUsed = true
        return DaggerActivityComponent.builder()
            .applicationComponent(getApplicationComponent())
            .activityModule(ActivityModule(this))
            .build()
    }

    /**
     * Method that returns [ApplicationComponent] instance
     *
     * @return An [ApplicationComponent] instance
     */
    private fun getApplicationComponent(): ApplicationComponent =
        (application as MyApplication).applicationComponent

}