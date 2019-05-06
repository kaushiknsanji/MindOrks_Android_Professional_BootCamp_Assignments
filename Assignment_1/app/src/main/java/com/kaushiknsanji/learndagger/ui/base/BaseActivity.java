package com.kaushiknsanji.learndagger.ui.base;

import androidx.annotation.UiThread;
import androidx.appcompat.app.AppCompatActivity;

import com.kaushiknsanji.learndagger.MyApplication;
import com.kaushiknsanji.learndagger.di.component.ActivityComponent;
import com.kaushiknsanji.learndagger.di.component.ApplicationComponent;
import com.kaushiknsanji.learndagger.di.component.DaggerActivityComponent;
import com.kaushiknsanji.learndagger.di.module.ActivityModule;

/**
 * An {@link AppCompatActivity} class which is the base class
 * for all the activities in this application
 *
 * @author Kaushik N Sanji
 */
public abstract class BaseActivity extends AppCompatActivity {

    //Tracks if the ActivityComponent is used more than once in an Activity to inject dependencies
    private boolean isComponentUsed;

    /**
     * Method that creates and returns the ActivityComponent tied to the Activity Lifecycle.
     *
     * @return A New instance of {@link ActivityComponent}
     */
    @UiThread
    protected ActivityComponent getActivityComponent() {
        if (isComponentUsed) {
            //Throwing exception when invoked more than once in the same Activity
            throw new RuntimeException("No need to use ActivityComponent more than once");
        }
        isComponentUsed = true;
        return DaggerActivityComponent.builder()
                .applicationComponent(getApplicationComponent())
                .activityModule(new ActivityModule(this))
                .build();
    }

    /**
     * Method that returns {@link ApplicationComponent} instance
     *
     * @return An {@link ApplicationComponent} instance
     */
    private ApplicationComponent getApplicationComponent() {
        return ((MyApplication) getApplication()).getApplicationComponent();
    }
}
