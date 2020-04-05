package com.iotplat.demo.gateway.controller.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel("新增设备信息Vo")
public class AddDeviceMesReqVo {
    @ApiModelProperty(value="设备ID",required=true)
    private String deviceid;
    @ApiModelProperty(value="设备类型",required=false)
    private String devicetype;
    @ApiModelProperty(value="地点",required=false)
    private String location;
    @ApiModelProperty(value="用途",required=false)
    private String uses;
    @ApiModelProperty(value="备注",required=false)
    private String remarks;

    private static final long serialVersionUID = 1L;

    public String getDeviceid() {
        return deviceid;
    }

    public void setDeviceid(String deviceid) {
        this.deviceid = deviceid == null ? null : deviceid.trim();
    }

    public String getDevicetype() {
        return devicetype;
    }

    public void setDevicetype(String devicetype) {
        this.devicetype = devicetype == null ? null : devicetype.trim();
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location == null ? null : location.trim();
    }

    public String getUses() {
        return uses;
    }

    public void setUses(String uses) {
        this.uses = uses == null ? null : uses.trim();
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks == null ? null : remarks.trim();
    }
}
