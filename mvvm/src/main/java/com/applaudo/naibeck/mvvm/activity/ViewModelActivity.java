package com.applaudo.naibeck.mvvm.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.applaudo.naibeck.mvvm.viewmodel.ViewModel;

public abstract class ViewModelActivity extends AppCompatActivity {
    private static final String EXTRA_VIEW_MODEL_STATE = "viewModelState";

    private ViewModel mViewModel;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ViewModel.State savedViewModelState = null;
        if (savedInstanceState != null) {
            savedViewModelState = savedInstanceState.getParcelable(EXTRA_VIEW_MODEL_STATE);
        }
        mViewModel = createViewModel(savedViewModelState);
    }

    @Nullable
    protected abstract ViewModel createViewModel(ViewModel.State savedViewModelState);

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        if (mViewModel != null) {
            outState.putParcelable(EXTRA_VIEW_MODEL_STATE, mViewModel.getInstanceState());
        }
    }

    @Override
    protected void onStart() {
        super.onStart();
        if (mViewModel != null) {
            mViewModel.onStart();
        }
    }

    @Override
    protected void onStop() {
        super.onStop();
        if (mViewModel != null) {
            mViewModel.onStop();
        }
    }
}
