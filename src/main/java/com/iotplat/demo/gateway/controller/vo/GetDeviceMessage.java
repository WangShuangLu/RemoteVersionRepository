package com.iotplat.demo.gateway.controller.vo;
import java.io.Serializable;
import java.util.Date;
import java.util.ArrayList;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.List;

@ApiModel("设备上送信息")
public class GetDeviceMessage implements Serializable{
	    @ApiModelProperty(value="序号ID")
	    private String ID;
	    @ApiModelProperty(value="产品ID")
	    private String Product_ID;
	    @ApiModelProperty(value="设备ID")
	    private String Device_ID;
	    @ApiModelProperty(value="设备安装位置")
	    private String Location;
	    @ApiModelProperty(value="数据产生的起始日期/时间")
	    private String StartDateTime;
	    @ApiModelProperty(value="数据产生的结束日期/时间")
	    private String EndDateTime;
	    @ApiModelProperty(value="设备产生的数据")
	    private String Data;
	    
	    
	    private static final long serialVersionUID = 1L;

	    public String getID() {
	        return ID;
	    }

	    public void setID(String ID) {
	        this.ID = ID == null ? null : ID.trim();
	    }
	    public String getProduct_ID() {
	        return Product_ID;
	    }

	    public void setProduct_ID(String Product_ID) {
	        this.Product_ID = Product_ID == null ? null : Product_ID.trim();
	    }
	    public String getDevice_ID() {
	        return Device_ID;
	    }

	    public void setDevice_ID(String Device_ID) {
	        this.Device_ID = Device_ID == null ? null : Device_ID.trim();
	    }

	    public String getLocation() {
	        return Location;
	    }

	    public void setLocation(String Location) {
	        this.Location = Location == null ? null : Location.trim();
	    }

	    public String getStartDateTime() {
	        return StartDateTime;
	    }

	    public void setDataDateTime(String StartDateTime) {
	        this.StartDateTime = StartDateTime;
	    }
	    
	    public String getEndDateTime() {
	        return EndDateTime;
	    }

	    public void setEndDateTime(String EndDateTime) {
	        this.EndDateTime = EndDateTime;
	    }

	    public String getData() {
	        return Data;
	    }

	    public void setData(String Data) {
	        this.Data = Data == null ? null : Data.trim();
	    }
	}
