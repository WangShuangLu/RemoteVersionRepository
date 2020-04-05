package com.iotplat.demo.gateway.controller;

import com.alibaba.fastjson.JSONObject;
import com.iotplat.demo.gateway.controller.vo.AddDataReqVo;
import com.iotplat.demo.gateway.controller.vo.PublicResVo;
import com.iotplat.demo.service.AddData.AddDataService;
import com.iotplat.demo.service.AddData.DTO.AddDataDTO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.BeanUtils;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
@Api(tags="Restful接口插入数据")
@RestController
public class AddDataController {

    @Resource
    private  AddDataService addDataService;


    @ApiOperation(value = "Restful接口", notes="插入数据")
    @RequestMapping(value="/device/{device_id}/sensor/{sensor_id}/{data}", method = RequestMethod.POST)
    public PublicResVo getList(@ApiParam(value="设备ID",required=true) @PathVariable("device_id") String deviceId, @ApiParam(value="传感器ID",required=true) @PathVariable("sensor_id") String sensorId, @ApiParam(value="数据",required=true) @PathVariable("data") String data){
        PublicResVo publicResVo = new PublicResVo();
        AddDataReqVo addDataReqVo = JSONObject.parseObject(data,AddDataReqVo.class);
        AddDataDTO addDataDTO = new AddDataDTO();
        BeanUtils.copyProperties(addDataReqVo,addDataDTO);
        String resp= addDataService.addData(addDataDTO);
        publicResVo.setResponseCode(resp);
        if(resp=="0"){
            publicResVo.setResponseMessage("success");
        }else{
            publicResVo.setResponseMessage("fail");
        }
        return publicResVo;
    }
}
