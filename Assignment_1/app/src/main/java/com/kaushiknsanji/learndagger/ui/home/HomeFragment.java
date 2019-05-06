package com.kaushiknsanji.learndagger.ui.home;


import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;

import com.kaushiknsanji.learndagger.R;
import com.kaushiknsanji.learndagger.ui.base.BaseFragment;

import javax.inject.Inject;

/**
 * {@link BaseFragment} subclass that inflates the layout 'R.layout.fragment_home'
 * and displays dummy data from {@link HomeViewModel}. This fragment is displayed as part
 * of the {@link com.kaushiknsanji.learndagger.ui.MainActivity}
 *
 * @author Kaushik N Sanji
 */
public class HomeFragment extends BaseFragment {

    @Inject
    HomeViewModel homeViewModel;

    /**
     * Mandatory Empty Constructor of {@link HomeFragment}.
     * This is required by the {@link androidx.fragment.app.FragmentManager} to instantiate
     * the fragment (e.g. upon screen orientation changes).
     */
    public HomeFragment() {
    }

    /**
     * Called to do initial creation of a fragment.  This is called after
     * {@link #onAttach(Context)} and before
     * {@link #onCreateView(LayoutInflater, ViewGroup, Bundle)}.
     *
     * @param savedInstanceState If the fragment is being re-created from
     *                           a previous saved state, this is the state.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //Inject the HomeFragment's dependencies
        getFragmentComponent().inject(this);
    }

    /**
     * Called to have the fragment instantiate its user interface view.
     * This is optional, and non-graphical fragments can return null (which
     * is the default implementation).  This will be called between
     * {@link #onCreate(Bundle)} and {@link #onActivityCreated(Bundle)}.
     * <p>
     * <p>If you return a View from here, you will later be called in
     * {@link #onDestroyView} when the view is being released.
     *
     * @param inflater           The LayoutInflater object that can be used to inflate
     *                           any views in the fragment,
     * @param container          If non-null, this is the parent view that the fragment's
     *                           UI should be attached to. The fragment should not add the view itself,
     *                           but this can be used to generate the LayoutParams of the view.
     * @param savedInstanceState If non-null, this fragment is being re-constructed
     *                           from a previous saved state as given here.
     * @return Returns the View for the fragment's UI ('R.layout.fragment_home')
     */
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        //Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_home, container, false);

        //Load the dummy data
        TextView textViewDummyData = rootView.findViewById(R.id.tvDummyData);
        textViewDummyData.setText(homeViewModel.getSomeData());

        //Return the prepared layout
        return rootView;
    }

}
