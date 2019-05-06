package com.kaushiknsanji.learndagger.ui;

import android.os.Bundle;
import android.widget.TextView;

import com.kaushiknsanji.learndagger.R;
import com.kaushiknsanji.learndagger.ui.base.BaseActivity;

import javax.inject.Inject;

/**
 * {@link BaseActivity} subclass that inflates the layout 'R.layout.activity_main'
 * and displays dummy data from {@link MainViewModel}.
 */
public class MainActivity extends BaseActivity {

    @Inject
    MainViewModel viewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Inject the MainActivity's dependencies
        getActivityComponent().inject(this);

        //Load the dummy data
        TextView tvData = findViewById(R.id.tvData);
        tvData.setText(viewModel.getSomeData());
    }

}
