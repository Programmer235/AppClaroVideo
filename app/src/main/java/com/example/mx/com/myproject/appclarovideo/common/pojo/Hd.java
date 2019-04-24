package com.example.mx.com.myproject.appclarovideo.common.pojo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Hd {

    @SerializedName("enabled")
    @Expose
    private String enabled;
    @SerializedName("detail")
    @Expose
    private String detail;

    public String getEnabled() {
        return enabled;
    }

    public void setEnabled(String enabled) {
        this.enabled = enabled;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }
}
