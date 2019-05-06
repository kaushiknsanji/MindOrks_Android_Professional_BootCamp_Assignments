package com.kaushiknsanji.learndagger.utils;

import android.content.Context;

import com.kaushiknsanji.learndagger.di.qualifier.ApplicationContext;

import javax.inject.Inject;
import javax.inject.Singleton;

/**
 * Dummy Utility class for Network related operations.
 *
 * @author Kaushik N Sanji
 */
@Singleton
public class NetworkHelper {

    @ApplicationContext
    private final Context context;

    @Inject
    public NetworkHelper(@ApplicationContext Context context) {
        this.context = context;
    }

    public boolean isNetworkConnected() {
        // will check for network connectivity
        return false;
    }
}