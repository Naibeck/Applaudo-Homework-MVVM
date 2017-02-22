package com.applaudo.naibeck.applaudohomeworkmvvm;

import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.os.Bundle;
import android.support.annotation.LayoutRes;
import android.support.annotation.Nullable;

import com.applaudo.naibeck.mvvm.activity.ViewModelActivity;
import com.applaudo.naibeck.mvvm.viewmodel.ViewModel;

public abstract class BaseActivity<VB extends ViewDataBinding, VM extends ViewModel> extends ViewModelActivity {
    private VB mViewBinding;
    private VM mViewModel;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
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

    public abstract VM getViewModel(ViewModel.State savedViewModelState);

    protected abstract void configureViewModelToViewBinding(VB viewBinding, VM mViewModel);

    public VB getViewBinding() {
        if (mViewBinding != null) {
            return mViewBinding;
        }

        mViewBinding = DataBindingUtil.setContentView(this, getLayout());
        return mViewBinding;
    }

}