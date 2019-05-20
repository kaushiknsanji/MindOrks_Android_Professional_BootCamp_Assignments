package com.kaushiknsanji.learndagger.ui.home


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.kaushiknsanji.learndagger.R
import com.kaushiknsanji.learndagger.ui.base.BaseFragment
import javax.inject.Inject

/**
 * [BaseFragment] subclass that inflates the layout 'R.layout.fragment_home'
 * and displays dummy data from [HomeViewModel]. This fragment is displayed as part
 * of the [com.kaushiknsanji.learndagger.ui.MainActivity]
 *
 * @author Kaushik N Sanji
 */
class HomeFragment : BaseFragment() {

    @Inject
    lateinit var homeViewModel: HomeViewModel

    /**
     * Called to do initial creation of a fragment.  This is called after
     * [onAttach] and before [onCreateView].
     *
     * @param savedInstanceState If the fragment is being re-created from
     *                           a previous saved state, this is the state.
     */
    override fun onCreate(savedInstanceState: Bundle?) {
        getFragmentComponent().inject(this)
        super.onCreate(savedInstanceState)
    }

    /**
     * Called to have the fragment instantiate its user interface view.
     * This is optional, and non-graphical fragments can return null (which
     * is the default implementation).  This will be called between
     * [onCreate] and [onActivityCreated].
     * <p>
     * <p>If you return a View from here, you will later be called in
     * [onDestroyView] when the view is being released.
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
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    /**
     * Called immediately after [onCreateView]
     * has returned, but before any saved state has been restored in to the view.
     * This gives subclasses a chance to initialize themselves once
     * they know their view hierarchy has been completely created.  The fragment's
     * view hierarchy is not however attached to its parent at this point.
     *
     * @param view The View returned by [onCreateView].
     * @param savedInstanceState If non-null, this fragment is being re-constructed
     * from a previous saved state as given here.
     */
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        //Load the dummy data
        val tvMessage: TextView = view.findViewById(R.id.tv_message)
        tvMessage.text = homeViewModel.getSomeData()
    }

    companion object {

        //Constant used as an Identifier for Fragment management
        const val TAG: String = "HomeFragment"

        /**
         * Factory method to create a new instance of this fragment.
         *
         * @return A new instance of fragment [HomeFragment]
         */
        @JvmStatic
        fun newInstance() = HomeFragment()
    }
}
