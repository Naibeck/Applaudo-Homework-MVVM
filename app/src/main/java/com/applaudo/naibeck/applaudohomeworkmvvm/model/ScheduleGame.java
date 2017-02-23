package com.applaudo.naibeck.applaudohomeworkmvvm.model;

import com.google.gson.annotations.SerializedName;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

public class ScheduleGame extends RealmObject {
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
}
