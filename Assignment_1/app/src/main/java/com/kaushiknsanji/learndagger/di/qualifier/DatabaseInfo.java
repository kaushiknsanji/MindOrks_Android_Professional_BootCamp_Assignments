package com.kaushiknsanji.learndagger.di.qualifier;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.inject.Qualifier;

/**
 * {@link Qualifier} annotation used for distinguishing the dependencies
 * required by {@link com.kaushiknsanji.learndagger.data.local.DatabaseService}, which is
 * provided by {@link com.kaushiknsanji.learndagger.di.module.ApplicationModule}
 */
@Qualifier
@Retention(RetentionPolicy.SOURCE)
public @interface DatabaseInfo {
}
