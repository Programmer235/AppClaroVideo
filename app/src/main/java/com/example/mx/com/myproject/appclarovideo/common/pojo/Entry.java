package com.example.mx.com.myproject.appclarovideo.common.pojo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Entry {
    @SerializedName("api_version")
    @Expose
    private String apiVersion;
    @SerializedName("authpn")
    @Expose
    private String authpn;
    @SerializedName("authpt")
    @Expose
    private String authpt;
    @SerializedName("format")
    @Expose
    private String format;
    @SerializedName("region")
    @Expose
    private String region;
    @SerializedName("device_id")
    @Expose
    private String deviceId;
    @SerializedName("device_category")
    @Expose
    private String deviceCategory;
    @SerializedName("device_model")
    @Expose
    private String deviceModel;
    @SerializedName("device_type")
    @Expose
    private String deviceType;
    @SerializedName("device_so")
    @Expose
    private String deviceSo;
    @SerializedName("device_manufacturer")
    @Expose
    private String deviceManufacturer;
    @SerializedName("HKS")
    @Expose
    private String hKS;
    @SerializedName("quantity")
    @Expose
    private String quantity;
    @SerializedName("order_way")
    @Expose
    private String orderWay;
    @SerializedName("order_id")
    @Expose
    private String orderId;
    @SerializedName("level_id")
    @Expose
    private String levelId;
    @SerializedName("from")
    @Expose
    private String from;
    @SerializedName("node_id")
    @Expose
    private String nodeId;
    @SerializedName("group_id")
    @Expose
    private String groupId;

    public String getApiVersion() {
        return apiVersion;
    }

    public void setApiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
    }

    public String getAuthpn() {
        return authpn;
    }

    public void setAuthpn(String authpn) {
        this.authpn = authpn;
    }

    public String getAuthpt() {
        return authpt;
    }

    public void setAuthpt(String authpt) {
        this.authpt = authpt;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    public String getDeviceCategory() {
        return deviceCategory;
    }

    public void setDeviceCategory(String deviceCategory) {
        this.deviceCategory = deviceCategory;
    }

    public String getDeviceModel() {
        return deviceModel;
    }

    public void setDeviceModel(String deviceModel) {
        this.deviceModel = deviceModel;
    }

    public String getDeviceType() {
        return deviceType;
    }

    public void setDeviceType(String deviceType) {
        this.deviceType = deviceType;
    }

    public String getDeviceSo() {
        return deviceSo;
    }

    public void setDeviceSo(String deviceSo) {
        this.deviceSo = deviceSo;
    }

    public String getDeviceManufacturer() {
        return deviceManufacturer;
    }

    public void setDeviceManufacturer(String deviceManufacturer) {
        this.deviceManufacturer = deviceManufacturer;
    }

    public String getHKS() {
        return hKS;
    }

    public void setHKS(String hKS) {
        this.hKS = hKS;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public String getOrderWay() {
        return orderWay;
    }

    public void setOrderWay(String orderWay) {
        this.orderWay = orderWay;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getLevelId() {
        return levelId;
    }

    public void setLevelId(String levelId) {
        this.levelId = levelId;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getNodeId() {
        return nodeId;
    }

    public void setNodeId(String nodeId) {
        this.nodeId = nodeId;
    }


    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

}
