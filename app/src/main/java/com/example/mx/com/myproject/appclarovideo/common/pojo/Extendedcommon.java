package com.example.mx.com.myproject.appclarovideo.common.pojo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Extendedcommon {

    @SerializedName("media")
    @Expose
    private Media media;
    @SerializedName("genres")
    @Expose
    private Generes genres;
    @SerializedName("roles")
    @Expose
    private Roles roles;



    public Media getMedia() {
        return media;
    }

    public void setMedia(Media media) {
        this.media = media;
    }

    public Generes getGenres() {
        return genres;
    }

    public void setGenres(Generes genres) {
        this.genres = genres;
    }

    public Roles getRoles() {
        return roles;
    }

    public void setRoles(Roles roles) {
        this.roles = roles;
    }
}
