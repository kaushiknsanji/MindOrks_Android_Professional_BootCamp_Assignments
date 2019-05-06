package com.kaushiknsanji.learndagger.di.component;

import android.content.Context;

import com.kaushiknsanji.learndagger.MyApplication;
import com.kaushiknsanji.learndagger.data.local.DatabaseService;
import com.kaushiknsanji.learndagger.data.remote.NetworkService;
import com.kaushiknsanji.learndagger.di.module.ApplicationModule;
import com.kaushiknsanji.learndagger.di.qualifier.ApplicationContext;
import com.kaushiknsanji.learndagger.utils.NetworkHelper;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Dagger Component for exposing dependencies from the Module {@link ApplicationModule}
 */
@Singleton
@Component(modules = {ApplicationModule.class})
public interface ApplicationComponent {

    void inject(MyApplication application);

    @ApplicationContext
    Context getContext();

    NetworkService getNetworkService();

    DatabaseService getDatabaseService();

    NetworkHelper getNetworkHelper();

}
