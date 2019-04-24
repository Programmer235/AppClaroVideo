package com.example.mx.com.myproject.appclarovideo.common.pojo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Movie {

    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("title_episode")
    @Expose
    private Object titleEpisode;
    @SerializedName("title_uri")
    @Expose
    private String titleUri;
    @SerializedName("title_original")
    @Expose
    private String titleOriginal;
    @SerializedName("description")
    @Expose
    private String description;
    @SerializedName("description_large")
    @Expose
    private String descriptionLarge;
    @SerializedName("image_large")
    @Expose
    private String imageLarge;
    @SerializedName("image_medium")
    @Expose
    private String imageMedium;
    @SerializedName("image_small")
    @Expose
    private String imageSmall;
    @SerializedName("image_still")
    @Expose
    private String imageStill;
    @SerializedName("image_background")
    @Expose
    private String imageBackground;
    @SerializedName("url_imagen_t1")
    @Expose
    private String urlImagenT1;
    @SerializedName("url_imagen_t2")
    @Expose
    private String urlImagenT2;
    @SerializedName("image_base_horizontal")
    @Expose
    private String imageBaseHorizontal;
    @SerializedName("image_base_vertical")
    @Expose
    private String imageBaseVertical;
    @SerializedName("image_base_square")
    @Expose
    private String imageBaseSquare;
    @SerializedName("image_clean_horizontal")
    @Expose
    private String imageCleanHorizontal;
    @SerializedName("image_clean_vertical")
    @Expose
    private String imageCleanVertical;
    @SerializedName("image_clean_square")
    @Expose
    private String imageCleanSquare;
    @SerializedName("image_sprites")
    @Expose
    private String imageSprites;
    @SerializedName("image_frames")
    @Expose
    private String imageFrames;
    @SerializedName("duration")
    @Expose
    private String duration;
    @SerializedName("date")
    @Expose
    private String date;
    @SerializedName("year")
    @Expose
    private String year;
    @SerializedName("preview")
    @Expose
    private String preview;
    @SerializedName("season_number")
    @Expose
    private Object seasonNumber;
    @SerializedName("episode_number")
    @Expose
    private Object episodeNumber;
    @SerializedName("format_types")
    @Expose
    private String formatTypes;
    @SerializedName("live_enabled")
    @Expose
    private String liveEnabled;
    @SerializedName("live_type")
    @Expose
    private Object liveType;
    @SerializedName("live_ref")
    @Expose
    private Object liveRef;
    @SerializedName("channel_number")
    @Expose
    private Object channelNumber;
    @SerializedName("timeshift")
    @Expose
    private Object timeshift;
    @SerializedName("votes_average")
    @Expose
    private Integer votesAverage;
    @SerializedName("rating_code")
    @Expose
    private String ratingCode;
    @SerializedName("proveedor_name")
    @Expose
    private String proveedorName;
    @SerializedName("proveedor_code")
    @Expose
    private String proveedorCode;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Object getTitleEpisode() {
        return titleEpisode;
    }

    public void setTitleEpisode(Object titleEpisode) {
        this.titleEpisode = titleEpisode;
    }

    public String getTitleUri() {
        return titleUri;
    }

    public void setTitleUri(String titleUri) {
        this.titleUri = titleUri;
    }

    public String getTitleOriginal() {
        return titleOriginal;
    }

    public void setTitleOriginal(String titleOriginal) {
        this.titleOriginal = titleOriginal;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescriptionLarge() {
        return descriptionLarge;
    }

    public void setDescriptionLarge(String descriptionLarge) {
        this.descriptionLarge = descriptionLarge;
    }

    public String getImageLarge() {
        return imageLarge;
    }

    public void setImageLarge(String imageLarge) {
        this.imageLarge = imageLarge;
    }

    public String getImageMedium() {
        return imageMedium;
    }

    public void setImageMedium(String imageMedium) {
        this.imageMedium = imageMedium;
    }

    public String getImageSmall() {
        return imageSmall;
    }

    public void setImageSmall(String imageSmall) {
        this.imageSmall = imageSmall;
    }

    public String getImageStill() {
        return imageStill;
    }

    public void setImageStill(String imageStill) {
        this.imageStill = imageStill;
    }

    public String getImageBackground() {
        return imageBackground;
    }

    public void setImageBackground(String imageBackground) {
        this.imageBackground = imageBackground;
    }

    public String getUrlImagenT1() {
        return urlImagenT1;
    }

    public void setUrlImagenT1(String urlImagenT1) {
        this.urlImagenT1 = urlImagenT1;
    }

    public String getUrlImagenT2() {
        return urlImagenT2;
    }

    public void setUrlImagenT2(String urlImagenT2) {
        this.urlImagenT2 = urlImagenT2;
    }

    public String getImageBaseHorizontal() {
        return imageBaseHorizontal;
    }

    public void setImageBaseHorizontal(String imageBaseHorizontal) {
        this.imageBaseHorizontal = imageBaseHorizontal;
    }

    public String getImageBaseVertical() {
        return imageBaseVertical;
    }

    public void setImageBaseVertical(String imageBaseVertical) {
        this.imageBaseVertical = imageBaseVertical;
    }

    public String getImageBaseSquare() {
        return imageBaseSquare;
    }

    public void setImageBaseSquare(String imageBaseSquare) {
        this.imageBaseSquare = imageBaseSquare;
    }

    public String getImageCleanHorizontal() {
        return imageCleanHorizontal;
    }

    public void setImageCleanHorizontal(String imageCleanHorizontal) {
        this.imageCleanHorizontal = imageCleanHorizontal;
    }

    public String getImageCleanVertical() {
        return imageCleanVertical;
    }

    public void setImageCleanVertical(String imageCleanVertical) {
        this.imageCleanVertical = imageCleanVertical;
    }

    public String getImageCleanSquare() {
        return imageCleanSquare;
    }

    public void setImageCleanSquare(String imageCleanSquare) {
        this.imageCleanSquare = imageCleanSquare;
    }

    public String getImageSprites() {
        return imageSprites;
    }

    public void setImageSprites(String imageSprites) {
        this.imageSprites = imageSprites;
    }

    public String getImageFrames() {
        return imageFrames;
    }

    public void setImageFrames(String imageFrames) {
        this.imageFrames = imageFrames;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getPreview() {
        return preview;
    }

    public void setPreview(String preview) {
        this.preview = preview;
    }

    public Object getSeasonNumber() {
        return seasonNumber;
    }

    public void setSeasonNumber(Object seasonNumber) {
        this.seasonNumber = seasonNumber;
    }

    public Object getEpisodeNumber() {
        return episodeNumber;
    }

    public void setEpisodeNumber(Object episodeNumber) {
        this.episodeNumber = episodeNumber;
    }

    public String getFormatTypes() {
        return formatTypes;
    }

    public void setFormatTypes(String formatTypes) {
        this.formatTypes = formatTypes;
    }

    public String getLiveEnabled() {
        return liveEnabled;
    }

    public void setLiveEnabled(String liveEnabled) {
        this.liveEnabled = liveEnabled;
    }

    public Object getLiveType() {
        return liveType;
    }

    public void setLiveType(Object liveType) {
        this.liveType = liveType;
    }

    public Object getLiveRef() {
        return liveRef;
    }

    public void setLiveRef(Object liveRef) {
        this.liveRef = liveRef;
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

    public Integer getVotesAverage() {
        return votesAverage;
    }

    public void setVotesAverage(Integer votesAverage) {
        this.votesAverage = votesAverage;
    }

    public String getRatingCode() {
        return ratingCode;
    }

    public void setRatingCode(String ratingCode) {
        this.ratingCode = ratingCode;
    }

    public String getProveedorName() {
        return proveedorName;
    }

    public void setProveedorName(String proveedorName) {
        this.proveedorName = proveedorName;
    }

    public String getProveedorCode() {
        return proveedorCode;
    }

    public void setProveedorCode(String proveedorCode) {
        this.proveedorCode = proveedorCode;
    }
}
