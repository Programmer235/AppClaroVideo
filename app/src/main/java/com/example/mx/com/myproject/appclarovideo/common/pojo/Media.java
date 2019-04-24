package com.example.mx.com.myproject.appclarovideo.common.pojo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Media {

    @SerializedName("originaltitle")
    @Expose
    private String originaltitle;
    @SerializedName("description_extended")
    @Expose
    private String descriptionExtended;
    @SerializedName("publishyear")
    @Expose
    private String publishyear;
    @SerializedName("boxoffice")
    @Expose
    private String boxoffice;
    @SerializedName("duration")
    @Expose
    private String duration;
    @SerializedName("haspreview")
    @Expose
    private String haspreview;
    @SerializedName("profile")
    @Expose
    private Profile profile;
    @SerializedName("islive")
    @Expose
    private String islive;
    @SerializedName("livetype")
    @Expose
    private Object livetype;
    @SerializedName("liveref")
    @Expose
    private Object liveref;
    @SerializedName("channel_number")
    @Expose
    private Object channelNumber;
    @SerializedName("timeshift")
    @Expose
    private Object timeshift;
    @SerializedName("resource_name")
    @Expose
    private Object resourceName;
    @SerializedName("rollingcreditstime")
    @Expose
    private String rollingcreditstime;
    @SerializedName("rollingcreditstimedb")
    @Expose
    private String rollingcreditstimedb;
    @SerializedName("rating")
    @Expose
    private Rating rating;


    public String getOriginaltitle() {
        return originaltitle;
    }

    public void setOriginaltitle(String originaltitle) {
        this.originaltitle = originaltitle;
    }

    public String getDescriptionExtended() {
        return descriptionExtended;
    }

    public void setDescriptionExtended(String descriptionExtended) {
        this.descriptionExtended = descriptionExtended;
    }

    public String getPublishyear() {
        return publishyear;
    }

    public void setPublishyear(String publishyear) {
        this.publishyear = publishyear;
    }

    public String getBoxoffice() {
        return boxoffice;
    }

    public void setBoxoffice(String boxoffice) {
        this.boxoffice = boxoffice;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getHaspreview() {
        return haspreview;
    }

    public void setHaspreview(String haspreview) {
        this.haspreview = haspreview;
    }

    public Profile getProfile() {
        return profile;
    }

    public void setProfile(Profile profile) {
        this.profile = profile;
    }

    public String getIslive() {
        return islive;
    }

    public void setIslive(String islive) {
        this.islive = islive;
    }

    public Object getLivetype() {
        return livetype;
    }

    public void setLivetype(Object livetype) {
        this.livetype = livetype;
    }

    public Object getLiveref() {
        return liveref;
    }

    public void setLiveref(Object liveref) {
        this.liveref = liveref;
    }

    public Object getChannelNumber() {
        return channelNumber;
    }

    public void setChannelNumber(Object channelNumber) {
        this.channelNumber = channelNumber;
    }

    public Object getTimeshift() {
        return timeshift;
    }

    public void setTimeshift(Object timeshift) {
        this.timeshift = timeshift;
    }

    public Object getResourceName() {
        return resourceName;
    }

    public void setResourceName(Object resourceName) {
        this.resourceName = resourceName;
    }

    public String getRollingcreditstime() {
        return rollingcreditstime;
    }

    public void setRollingcreditstime(String rollingcreditstime) {
        this.rollingcreditstime = rollingcreditstime;
    }

    public String getRollingcreditstimedb() {
        return rollingcreditstimedb;
    }

    public void setRollingcreditstimedb(String rollingcreditstimedb) {
        this.rollingcreditstimedb = rollingcreditstimedb;
    }

    public Rating getRating() {
        return rating;
    }

    public void setRating(Rating rating) {
        this.rating = rating;
    }

}
