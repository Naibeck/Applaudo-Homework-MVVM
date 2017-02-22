package com.applaudo.naibeck.applaudohomeworkmvvm.ui.fragment;

import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.os.Bundle;
import android.support.annotation.LayoutRes;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.applaudo.naibeck.mvvm.fragment.ViewModelFragment;
import com.applaudo.naibeck.mvvm.viewmodel.ViewModel;

public abstract class BaseFragment<VB extends ViewDataBinding, VM extends ViewModel> extends ViewModelFragment {
    private VB mViewBinding;
    private VM mViewModel;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        mViewBinding = DataBindingUtil.inflate(inflater, getLayout(), container, false);
        return mViewBinding.getRoot();
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        configureViewModelToViewBinding(getViewBinding(), mViewModel);
    }

    @Nullable
    @Override
    protected ViewModel createViewModel(ViewModel.State savedViewModelState) {
        mViewModel = getViewModel(savedViewModelState);
        return mViewModel;
    }

    @LayoutRes
    protected abstract int getLayout();

    protected abstract VM getViewModel(ViewModel.State savedViewModelState);

    protected abstract void configureViewModelToViewBinding(VB viewBinding, VM viewModel);

    public VB getViewBinding() {
        return mViewBinding;
    }
}
