package com.kaushiknsanji.learndagger.di.qualifier;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.inject.Qualifier;

/**
 * {@link Qualifier} annotation used for distinguishing the {@link android.content.Context}
 * provided by {@link com.kaushiknsanji.learndagger.di.module.ApplicationModule}
 */
@Qualifier
@Retention(RetentionPolicy.SOURCE)
public @interface ApplicationContext {
}
