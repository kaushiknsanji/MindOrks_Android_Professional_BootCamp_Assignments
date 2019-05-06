package com.kaushiknsanji.learndagger.di.module;

import android.content.Context;

import com.kaushiknsanji.learndagger.MyApplication;
import com.kaushiknsanji.learndagger.di.qualifier.ApplicationContext;
import com.kaushiknsanji.learndagger.di.qualifier.DatabaseInfo;
import com.kaushiknsanji.learndagger.di.qualifier.NetworkInfo;

import dagger.Module;
import dagger.Provides;

/**
 * Dagger Module for creating and exposing dependencies, tied to the Application Lifecycle
 */
@Module
public class ApplicationModule {

    private MyApplication application;

    public ApplicationModule(MyApplication application) {
        this.application = application;
    }

    @ApplicationContext
    @Provides
    Context provideContext() {
        return application;
    }

    @Provides
    @DatabaseInfo
    String provideDatabaseName() {
        return "dummy_db";
    }

    @Provides
    @DatabaseInfo
    Integer provideDatabaseVersion() {
        return 1;
    }

    @Provides
    @NetworkInfo
    String provideApiKey() {
        return "SOME_API_KEY";
    }
}
