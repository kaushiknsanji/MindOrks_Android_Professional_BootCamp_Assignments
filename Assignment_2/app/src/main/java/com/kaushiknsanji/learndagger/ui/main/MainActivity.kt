package com.kaushiknsanji.learndagger.ui.main

import android.os.Bundle
import android.widget.TextView
import com.kaushiknsanji.learndagger.R
import com.kaushiknsanji.learndagger.ui.base.BaseActivity
import com.kaushiknsanji.learndagger.ui.home.HomeFragment
import javax.inject.Inject

/**
 * [BaseActivity] subclass that inflates the layout 'R.layout.activity_main'
 * and displays dummy data from [MainViewModel] and [HomeFragment].
 *
 * @author Kaushik N Sanji
 */
class MainActivity : BaseActivity() {

    @Inject
    lateinit var mainViewModel: MainViewModel

    /**
     * Called when the activity is starting.
     *
     * @param savedInstanceState If the activity is being re-initialized after
     *                           previously being shut down then this Bundle contains the data it most
     *                           recently supplied in [onSaveInstanceState].  <b><i>Note: Otherwise it is null.</i></b>
     */
    override fun onCreate(savedInstanceState: Bundle?) {
        //Inject the MainActivity's dependencies
        getActivityComponent().inject(this)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Load the dummy data
        val tvData: TextView = findViewById(R.id.tv_message)
        tvData.text = mainViewModel.getSomeData()

        //Load the HomeFragment
        addHomeFragment()
    }

    /**
     * Method that loads the [HomeFragment] at the container id 'R.id.container_fragment' if not loaded
     */
    private fun addHomeFragment() {
        with(supportFragmentManager) {
            findFragmentByTag(HomeFragment.TAG) ?: beginTransaction()
                .add(R.id.container_fragment, HomeFragment.newInstance(), HomeFragment.TAG)
                .commit()
        }
    }

}
