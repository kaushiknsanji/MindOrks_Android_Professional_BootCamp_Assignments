package com.kaushiknsanji.learndagger.ui.base;

import androidx.annotation.UiThread;
import androidx.fragment.app.Fragment;

import com.kaushiknsanji.learndagger.MyApplication;
import com.kaushiknsanji.learndagger.di.component.ApplicationComponent;
import com.kaushiknsanji.learndagger.di.component.DaggerFragmentComponent;
import com.kaushiknsanji.learndagger.di.component.FragmentComponent;
import com.kaushiknsanji.learndagger.di.module.FragmentModule;

/**
 * An Abstract {@link Fragment} class which is the base class
 * for all the Fragments in this application.
 *
 * @author Kaushik N Sanji
 */
public abstract class BaseFragment extends Fragment {

    //Tracks if the FragmentComponent is used more than once in a Fragment to inject dependencies
    private boolean isComponentUsed;

    /**
     * Method that creates and returns the FragmentComponent tied to the Fragment Lifecycle.
     *
     * @return A New instance of {@link FragmentComponent}
     */
    @UiThread
    protected FragmentComponent getFragmentComponent() {
        if (isComponentUsed) {
            //Throwing exception when invoked more than once in the same Fragment
            throw new RuntimeException("No need to use FragmentComponent more than once");
        }
        isComponentUsed = true;
        return DaggerFragmentComponent.builder()
                .applicationComponent(getApplicationComponent())
                .fragmentModule(new FragmentModule(requireActivity()))
                .build();
    }

    /**
     * Method that returns {@link ApplicationComponent} instance
     *
     * @return An {@link ApplicationComponent} instance
     */
    private ApplicationComponent getApplicationComponent() {
        return ((MyApplication) requireActivity().getApplication()).getApplicationComponent();
    }
}
