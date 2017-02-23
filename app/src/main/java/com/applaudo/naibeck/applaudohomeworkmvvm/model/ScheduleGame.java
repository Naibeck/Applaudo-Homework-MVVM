package com.applaudo.naibeck.applaudohomeworkmvvm.model;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.SerializedName;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

public class ScheduleGame extends RealmObject implements Parcelable {
    @PrimaryKey
    @SerializedName("data")
    private String mDate;

    @SerializedName("stadium")
    private String mStadium;

    public String getDate() {
        return mDate;
    }

    public void setDate(String mDate) {
        this.mDate = mDate;
    }

    public String getStadium() {
        return mStadium;
    }

    public void setStadium(String mStadium) {
        this.mStadium = mStadium;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.mDate);
        dest.writeString(this.mStadium);
    }

    public ScheduleGame() {
    }

    protected ScheduleGame(Parcel in) {
        this.mDate = in.readString();
        this.mStadium = in.readString();
    }

    public static final Parcelable.Creator<ScheduleGame> CREATOR = new Parcelable.Creator<ScheduleGame>() {
        @Override
        public ScheduleGame createFromParcel(Parcel source) {
            return new ScheduleGame(source);
        }

        @Override
        public ScheduleGame[] newArray(int size) {
            return new ScheduleGame[size];
        }
    };
}
