package com.kaushiknsanji.learndagger.di.component;

import com.kaushiknsanji.learndagger.di.module.FragmentModule;
import com.kaushiknsanji.learndagger.di.scope.FragmentScope;
import com.kaushiknsanji.learndagger.ui.home.HomeFragment;

import dagger.Component;

/**
 * Dagger Component for exposing dependencies from the Module {@link FragmentModule}
 * and its dependent component {@link ApplicationComponent}
 *
 * @author Kaushik N Sanji
 */
@FragmentScope
@Component(dependencies = {ApplicationComponent.class}, modules = {FragmentModule.class})
public interface FragmentComponent {

    void inject(HomeFragment homeFragment);

}