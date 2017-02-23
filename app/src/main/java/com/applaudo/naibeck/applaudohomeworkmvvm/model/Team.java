package com.applaudo.naibeck.applaudohomeworkmvvm.model;

import com.google.gson.annotations.SerializedName;

import io.realm.RealmList;
import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

public class Team extends RealmObject {
    @PrimaryKey
    @SerializedName("id")
    private int mId;

    @SerializedName("team_name")
    private String mTeamName;

    @SerializedName("since")
    private int mSince;

    @SerializedName("coach")
    private String mCoach;

    @SerializedName("team_nickname")
    private String mTeamNickname;

    @SerializedName("stadium")
    private String mStadium;

    @SerializedName("img_logo")
    private String mImgLogo;

    @SerializedName("img_stadium")
    private String mImgStadium;

    @SerializedName("latitude")
    private double mLatitude;

    @SerializedName("longitude")
    private double mLongitude;

    @SerializedName("website")
    private String mWebsite;

    @SerializedName("tickets_url")
    private String mTicketsUrl;

    @SerializedName("address")
    private String mAddress;

    @SerializedName("phone_number")
    private String mPhoneNumber;

    @SerializedName("description")
    private String mDescription;

    @SerializedName("video_url")
    private String mVideoUrl;

    @SerializedName("schedule_games")
    private RealmList<ScheduleGame> mScheduleGame;

    public int getId() {
        return mId;
    }

    public void setId(int mId) {
        this.mId = mId;
    }

    public String getTeamName() {
        return mTeamName;
    }

    public void setTeamName(String mTeamName) {
        this.mTeamName = mTeamName;
    }

    public int getSince() {
        return mSince;
    }

    public void setSince(int mSince) {
        this.mSince = mSince;
    }

    public String getCoach() {
        return mCoach;
    }

    public void setCoach(String mCoach) {
        this.mCoach = mCoach;
    }

    public String getTeamNickname() {
        return mTeamNickname;
    }

    public void setTeamNickname(String mTeamNickname) {
        this.mTeamNickname = mTeamNickname;
    }

    public String getStadium() {
        return mStadium;
    }

    public void setStadium(String mStadium) {
        this.mStadium = mStadium;
    }

    public String getImgLogo() {
        return mImgLogo;
    }

    public void setImgLogo(String mImgLogo) {
        this.mImgLogo = mImgLogo;
    }

    public String getImgStadium() {
        return mImgStadium;
    }

    public void setImgStadium(String mImgStadium) {
        this.mImgStadium = mImgStadium;
    }

    public double getLatitude() {
        return mLatitude;
    }

    public void setLatitude(double mLatitude) {
        this.mLatitude = mLatitude;
    }

    public double getLongitude() {
        return mLongitude;
    }

    public void setLongitude(double mLongitude) {
        this.mLongitude = mLongitude;
    }

    public String getWebsite() {
        return mWebsite;
    }

    public void setWebsite(String mWebsite) {
        this.mWebsite = mWebsite;
    }

    public String getTicketsUrl() {
        return mTicketsUrl;
    }

    public void setTicketsUrl(String mTicketsUrl) {
        this.mTicketsUrl = mTicketsUrl;
    }

    public String getAddress() {
        return mAddress;
    }

    public void setAddress(String mAddress) {
        this.mAddress = mAddress;
    }

    public String getPhoneNumber() {
        return mPhoneNumber;
    }

    public void setPhoneNumber(String mPhoneNumber) {
        this.mPhoneNumber = mPhoneNumber;
    }

    public String getDescription() {
        return mDescription;
    }

    public void setDescription(String mDescription) {
        this.mDescription = mDescription;
    }

    public String getVideoUrl() {
        return mVideoUrl;
    }

    public void setVideoUrl(String mVideoUrl) {
        this.mVideoUrl = mVideoUrl;
    }

    public RealmList<ScheduleGame> getScheduleGame() {
        return mScheduleGame;
    }

    public void setScheduleGame(RealmList<ScheduleGame> mScheduleGame) {
        this.mScheduleGame = mScheduleGame;
    }
}
