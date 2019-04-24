package com.example.mx.com.myproject.appclarovideo.common.pojo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Talents {

    @SerializedName("talent")
    @Expose
    private List<Talent> talent = null;

    public List<Talent> getTalent() {
        return talent;
    }

    public void setTalent(List<Talent> talent) {
        this.talent = talent;
    }
}
