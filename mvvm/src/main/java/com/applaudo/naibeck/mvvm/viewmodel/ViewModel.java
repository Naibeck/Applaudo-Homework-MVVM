package com.applaudo.naibeck.mvvm.viewmodel;

import android.databinding.BaseObservable;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.annotation.CallSuper;
import android.support.annotation.Nullable;

public abstract class ViewModel extends BaseObservable {
    protected ViewModel(@Nullable State savedInstanceState) {

    }

    public State getInstanceState() {
        return new State(this);
    }

    @CallSuper
    public void onStart() {

    }

    @CallSuper
    public void onStop() {

    }

    public static class State implements Parcelable {
        protected State(ViewModel viewModel) {

        }

        @Override
        public int describeContents() {
            return 0;
        }

        @Override
        public void writeToParcel(Parcel dest, int flags) {
        }

        protected State(Parcel in) {
        }

        public static final Parcelable.Creator<State> CREATOR = new Parcelable.Creator<State>() {
            @Override
            public State createFromParcel(Parcel source) {
                return new State(source);
            }

            @Override
            public State[] newArray(int size) {
                return new State[size];
            }
        };
    }
}
