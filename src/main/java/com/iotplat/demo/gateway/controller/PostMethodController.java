package com.iotplat.demo.gateway.controller;

import com.iotplat.demo.dao.mysql.domain.Device;
import com.iotplat.demo.dao.mysql.mapper.DeviceMapper;
import com.iotplat.demo.gateway.controller.vo.AddDeviceMesReqVo;
import com.iotplat.demo.gateway.controller.vo.AddDeviceMesResVo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.BeanUtils;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
@Api(tags="Post接口示例controller")
@RestController
public class PostMethodController {

    @Resource
    DeviceMapper deviceMapper;


    @RequestMapping(value="/addDeviceMes", method = RequestMethod.POST)
    public AddDeviceMesResVo getList(@ApiParam(value="新增设备信息",required=true) @RequestBody AddDeviceMesReqVo addDeviceMesReqVo){
        AddDeviceMesResVo addDeviceMesResVo = new AddDeviceMesResVo();
        if(!addDeviceMesReqVo.getDeviceid().isEmpty()){
            try {
                Device device=new Device();
                BeanUtils.copyProperties(addDeviceMesReqVo,device);
                deviceMapper.insert(device);
                addDeviceMesResVo.setResponseCode("0");
                addDeviceMesResVo.setResponseMessage("success");
            }catch (Exception e){
                addDeviceMesResVo.setResponseCode("9");
                addDeviceMesResVo.setResponseMessage("fail");
            }
        }else{
            addDeviceMesResVo.setResponseCode("8");
            addDeviceMesResVo.setResponseMessage("Param is null");
        }
        return addDeviceMesResVo;
    }
}
