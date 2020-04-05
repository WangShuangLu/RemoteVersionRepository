package com.iotplat.demo.dao.mysql.domain;

import java.io.Serializable;

public class Sensor implements Serializable {
    private String sensorid;

    private String sensortype;

    private String deviceid;

    private String remarks;

    private String location;

    private static final long serialVersionUID = 1L;

    public String getSensorid() {
        return sensorid;
    }

    public void setSensorid(String sensorid) {
        this.sensorid = sensorid == null ? null : sensorid.trim();
    }

    public String getSensortype() {
        return sensortype;
    }

    public void setSensortype(String sensortype) {
        this.sensortype = sensortype == null ? null : sensortype.trim();
    }

    public String getDeviceid() {
        return deviceid;
    }

    public void setDeviceid(String deviceid) {
        this.deviceid = deviceid == null ? null : deviceid.trim();
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks == null ? null : remarks.trim();
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location == null ? null : location.trim();
    }
}