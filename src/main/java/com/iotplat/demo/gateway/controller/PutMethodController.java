package com.iotplat.demo.gateway.controller;

import com.iotplat.demo.dao.mysql.domain.Device;
import com.iotplat.demo.dao.mysql.mapper.DeviceMapper;
import com.iotplat.demo.gateway.controller.vo.ModifyDeviceMesReqVo;
import com.iotplat.demo.gateway.controller.vo.ModifyDeviceMesResVo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.BeanUtils;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
@Api(tags="Put接口示例controller")
@RestController
public class PutMethodController {

    @Resource
    DeviceMapper deviceMapper;

    @ApiOperation(value = "Put接口", notes="示例")
    @ApiImplicitParam(name = "deviceId", value = "设备ID", paramType = "path", required = true, dataType = "String")
    @RequestMapping(value="/modifyDeviceMes/{deviceId}", method = RequestMethod.PUT)
    public ModifyDeviceMesResVo getList(@PathVariable String deviceId, @ApiParam(value="新增设备信息",required=true) @RequestBody ModifyDeviceMesReqVo modifyDeviceMesReqVo){
        ModifyDeviceMesResVo modifyDeviceMesResVo = new ModifyDeviceMesResVo();
        if(!deviceId.isEmpty()&&deviceId.equals(modifyDeviceMesReqVo.getDeviceid())){
            try{
                Device device = new Device();
                BeanUtils.copyProperties(modifyDeviceMesReqVo,device);
                deviceMapper.updateByPrimaryKeySelective(device);
                modifyDeviceMesResVo.setResponseCode("0");
                modifyDeviceMesResVo.setResponseMessage("success");
            }catch (Exception e){
                modifyDeviceMesResVo.setResponseCode("9");
                modifyDeviceMesResVo.setResponseMessage("fail");
            }
        }else{
            modifyDeviceMesResVo.setResponseCode("8");
            modifyDeviceMesResVo.setResponseMessage("params wrong");
        }
        return modifyDeviceMesResVo;
    }
}
