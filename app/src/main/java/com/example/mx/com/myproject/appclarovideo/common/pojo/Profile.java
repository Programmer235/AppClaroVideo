package com.example.mx.com.myproject.appclarovideo.common.pojo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Profile {

    @SerializedName("audiotype")
    @Expose
    private String audiotype;
    @SerializedName("videotype")
    @Expose
    private String videotype;
    @SerializedName("screenformat")
    @Expose
    private String screenformat;
    @SerializedName("hd")
    @Expose
    private Hd hd;

    public String getAudiotype() {
        return audiotype;
    }

    public void setAudiotype(String audiotype) {
        this.audiotype = audiotype;
    }

    public String getVideotype() {
        return videotype;
    }

    public void setVideotype(String videotype) {
        this.videotype = videotype;
    }

    public String getScreenformat() {
        return screenformat;
    }

    public void setScreenformat(String screenformat) {
        this.screenformat = screenformat;
    }

    public Hd getHd() {
        return hd;
    }

    public void setHd(Hd hd) {
        this.hd = hd;
    }
}
