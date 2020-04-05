package com.iotplat.demo.gateway.controller;

import com.iotplat.demo.dao.mysql.mapper.DeviceMapper;
import com.iotplat.demo.gateway.controller.vo.GetDeviceMesResVo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.BeanUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
/**
 * @Description:get接口示例
 * @Author: zjz
 * @Date:
 */
@Api(tags="get接口示例controller")
@RestController
public class GetMethodController {

    @Resource
    DeviceMapper deviceMapper;

    @ApiOperation(value = "简单的get接口", notes="示例")
    @ApiImplicitParam(name = "deviceId", value = "设备ID", paramType = "query", required = true, dataType = "String")
    @RequestMapping(value="/getDeviceMesByDeviceId", method = RequestMethod.GET)
    public GetDeviceMesResVo getList(@RequestParam String deviceId){
        GetDeviceMesResVo getDeviceMesResVo = new GetDeviceMesResVo();
        BeanUtils.copyProperties(deviceMapper.selectByPrimaryKey(deviceId),getDeviceMesResVo);
        return getDeviceMesResVo;
    }

}
