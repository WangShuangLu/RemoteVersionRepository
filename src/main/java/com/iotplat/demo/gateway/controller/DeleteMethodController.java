package com.iotplat.demo.gateway.controller;

import com.iotplat.demo.dao.mysql.mapper.DeviceMapper;
import com.iotplat.demo.gateway.controller.vo.DeleteDeviceMesResVo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
@Api(tags="delete接口示例controller")
@RestController
public class DeleteMethodController {

    @Resource
    DeviceMapper deviceMapper;

    @ApiOperation(value = "delete接口", notes="示例")
    @ApiImplicitParam(name = "deviceId", value = "设备ID", paramType = "path", required = true, dataType = "String")
    @RequestMapping(value="/deleteDeviceMes/{deviceId}", method = RequestMethod.DELETE)
    public DeleteDeviceMesResVo getList(@PathVariable String deviceId){
        DeleteDeviceMesResVo deleteDeviceMesResVo = new DeleteDeviceMesResVo();
        if(!deviceId.isEmpty()){
            try{
                deviceMapper.deleteByPrimaryKey(deviceId);
                deleteDeviceMesResVo.setResponseCode("0");
                deleteDeviceMesResVo.setResponseMessage("success");
            }catch (Exception e){
                deleteDeviceMesResVo.setResponseCode("9");
                deleteDeviceMesResVo.setResponseMessage("fail");
            }
        }else{
            deleteDeviceMesResVo.setResponseCode("8");
            deleteDeviceMesResVo.setResponseMessage("params wrong");
        }
        return deleteDeviceMesResVo;
    }
}



