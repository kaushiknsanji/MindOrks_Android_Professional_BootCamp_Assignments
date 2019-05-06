package com.kaushiknsanji.learndagger.di.component;

import com.kaushiknsanji.learndagger.di.module.ActivityModule;
import com.kaushiknsanji.learndagger.di.scope.ActivityScope;
import com.kaushiknsanji.learndagger.ui.MainActivity;

import dagger.Component;

/**
 * Dagger Component for exposing dependencies from the Module {@link ActivityModule}
 * and its dependent component {@link ApplicationComponent}
 */
@ActivityScope
@Component(dependencies = {ApplicationComponent.class}, modules = {ActivityModule.class})
public interface ActivityComponent {

    void inject(MainActivity activity);
}
