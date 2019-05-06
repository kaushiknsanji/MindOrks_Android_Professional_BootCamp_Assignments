package com.kaushiknsanji.learndagger.di.scope;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.inject.Scope;

/**
 * {@link Scope} annotation for scoping the dependencies
 * exposed by {@link com.kaushiknsanji.learndagger.di.component.FragmentComponent}
 * and for distinguishing with the scoped dependencies exposed by its dependent
 * {@link com.kaushiknsanji.learndagger.di.component.ApplicationComponent}
 *
 * @author Kaushik N Sanji
 */
@Scope
@Retention(RetentionPolicy.SOURCE)
public @interface FragmentScope {
}