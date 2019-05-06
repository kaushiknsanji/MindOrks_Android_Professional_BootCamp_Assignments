package com.kaushiknsanji.learndagger.di.module;

import android.app.Activity;
import android.content.Context;

import com.kaushiknsanji.learndagger.di.qualifier.ActivityContext;

import dagger.Module;
import dagger.Provides;

/**
 * Dagger Module for creating and exposing dependencies, tied to the Fragment Lifecycle
 *
 * @author Kaushik N Sanji
 */
@Module
public class FragmentModule {

    private Activity activity;

    public FragmentModule(Activity activity) {
        this.activity = activity;
    }

    @ActivityContext
    @Provides
    Context provideContext() {
        return activity;
    }
}
