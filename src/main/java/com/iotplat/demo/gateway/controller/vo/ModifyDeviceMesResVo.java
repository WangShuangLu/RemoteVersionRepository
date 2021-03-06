package com.iotplat.demo.gateway.controller.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
@ApiModel("修改设备信息返回")
public class ModifyDeviceMesResVo {
    @ApiModelProperty(value="返回码")
    private String responseCode;
    @ApiModelProperty(value="返回信息")
    private String responseMessage;

    public String getResponseCode() {
        return responseCode;
    }

    public void setResponseCode(String responseCode) {
        this.responseCode = responseCode;
    }

    public String getResponseMessage() {
        return responseMessage;
    }

    public void setResponseMessage(String responseMessage) {
        this.responseMessage = responseMessage;
    }
}
