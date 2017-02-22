package com.applaudo.naibeck.mvvm.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;

import com.applaudo.naibeck.mvvm.viewmodel.ViewModel;

public abstract class ViewModelFragment extends Fragment {
    private static final String EXTRA_VIEW_MODEL_STATE = "viewModelState";

    private ViewModel mViewModel;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
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
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        if (mViewModel != null) {
            outState.putParcelable(EXTRA_VIEW_MODEL_STATE, mViewModel.getInstanceState());
        }
    }

    @Override
    public void onStart() {
        super.onStart();
        if (mViewModel != null) {
            mViewModel.onStart();
        }
    }

    @Override
    public void onStop() {
        super.onStop();
        if (mViewModel != null) {
            mViewModel.onStop();
        }
    }
}
