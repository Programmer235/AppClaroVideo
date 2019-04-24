package com.example.mx.com.myproject.appclarovideo.common.pojo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ResponseInfo {

    @SerializedName("group")
    @Expose
    private GroupInfo group;

    public GroupInfo getGroup() {
        return group;
    }

    public void setGroup(GroupInfo group) {
        this.group = group;
    }
}
