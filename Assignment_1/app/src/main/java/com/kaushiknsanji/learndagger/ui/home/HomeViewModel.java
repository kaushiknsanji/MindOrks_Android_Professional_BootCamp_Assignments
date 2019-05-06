package com.kaushiknsanji.learndagger.ui.home;

import com.kaushiknsanji.learndagger.data.local.DatabaseService;
import com.kaushiknsanji.learndagger.data.remote.NetworkService;
import com.kaushiknsanji.learndagger.di.scope.FragmentScope;
import com.kaushiknsanji.learndagger.utils.NetworkHelper;

import javax.inject.Inject;

/**
 * Dummy ViewModel class for the {@link HomeFragment}
 *
 * @author Kaushik N Sanji
 */
@FragmentScope
public class HomeViewModel {

    private DatabaseService databaseService;
    private NetworkService networkService;
    private NetworkHelper networkHelper;

    @Inject
    public HomeViewModel(DatabaseService databaseService, NetworkService networkService, NetworkHelper networkHelper) {
        this.databaseService = databaseService;
        this.networkService = networkService;
        this.networkHelper = networkHelper;
    }

    public String getSomeData() {
        return databaseService.getDummyData() + " : "
                + networkService.getDummyData()
                + "\nIs Network Connected? "
                + networkHelper.isNetworkConnected();
    }
}
