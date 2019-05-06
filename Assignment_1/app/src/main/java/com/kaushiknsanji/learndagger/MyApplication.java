package com.kaushiknsanji.learndagger;

import android.app.Application;

import com.kaushiknsanji.learndagger.data.local.DatabaseService;
import com.kaushiknsanji.learndagger.data.remote.NetworkService;
import com.kaushiknsanji.learndagger.di.component.ApplicationComponent;
import com.kaushiknsanji.learndagger.di.component.DaggerApplicationComponent;
import com.kaushiknsanji.learndagger.di.module.ApplicationModule;
import com.kaushiknsanji.learndagger.utils.NetworkHelper;

import javax.inject.Inject;

/**
 * {@link Application} subclass for exposing {@link ApplicationComponent}
 */
public class MyApplication extends Application {

    @Inject
    NetworkService networkService;
    @Inject
    DatabaseService databaseService;
    @Inject
    NetworkHelper networkHelper;
    private ApplicationComponent applicationComponent;

    @Override
    public void onCreate() {
        super.onCreate();

        getApplicationComponent().inject(this);
    }

    public ApplicationComponent getApplicationComponent() {
        if (applicationComponent == null) {
            applicationComponent = DaggerApplicationComponent
                    .builder()
                    .applicationModule(new ApplicationModule(this))
                    .build();
        }
        return applicationComponent;
    }

}
