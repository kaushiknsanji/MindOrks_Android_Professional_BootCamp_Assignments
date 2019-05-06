package com.kaushiknsanji.learndagger.data.local;

import android.content.Context;

import com.kaushiknsanji.learndagger.di.qualifier.ApplicationContext;
import com.kaushiknsanji.learndagger.di.qualifier.DatabaseInfo;

import javax.inject.Inject;
import javax.inject.Singleton;

/**
 * Dummy class to simulate the actual Database using Room or Realm etc
 */
@Singleton
public class DatabaseService {

    @Inject
    public DatabaseService(@ApplicationContext Context context,
                           @DatabaseInfo String databaseName,
                           @DatabaseInfo Integer version) {
        // do the initialisation here
    }

    public String getDummyData() {
        return "DATABASE_DUMMY_DATA";
    }
}
