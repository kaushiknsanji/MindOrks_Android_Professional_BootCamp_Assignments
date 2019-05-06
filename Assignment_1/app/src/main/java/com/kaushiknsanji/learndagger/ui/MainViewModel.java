package com.kaushiknsanji.learndagger.ui;

import com.kaushiknsanji.learndagger.data.local.DatabaseService;
import com.kaushiknsanji.learndagger.data.remote.NetworkService;
import com.kaushiknsanji.learndagger.di.scope.ActivityScope;

import javax.inject.Inject;

/**
 * Dummy ViewModel class for the {@link MainActivity}
 */
@ActivityScope
public class MainViewModel {

    private DatabaseService databaseService;
    private NetworkService networkService;

    @Inject
    public MainViewModel(DatabaseService databaseService, NetworkService networkService) {
        this.databaseService = databaseService;
        this.networkService = networkService;
    }

    public String getSomeData() {
        return databaseService.getDummyData() + " : " + networkService.getDummyData();
    }
}
