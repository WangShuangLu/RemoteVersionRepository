package com.iotplat.demo.gateway.controller;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.BeanUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.iotplat.demo.gateway.controller.vo.AddDataReqVo;
import com.iotplat.demo.gateway.controller.vo.GetDeviceMessage;
import com.alibaba.fastjson.JSONObject;
import com.iotplat.demo.dao.mongodb.DeviceMessageTableDao;
import org.springframework.beans.BeanUtils;
import com.iotplat.demo.dao.mongodb.domain.DeviceMessageTable;
import java.util.List;
import java.util.Date;
import javax.annotation.Resource;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.text.DateFormat;
import java.util.Calendar;
import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;
import com.iotplat.demo.service.GetDeviceMessage.GetMessageService;
import com.iotplat.demo.gateway.controller.vo.GetDeviceMessageRespVoList;

@Api(tags="get接口示例controller，取得设备数据")
@RestController
public class GetDeviceMessageControllor {
  @Resource
  DeviceMessageTableDao deviceMessageDao;
  @Resource
  GetMessageService getMessageService;
  @Resource
  GetDeviceMessageRespVoList ls;

	/*
	 * @Resource List<GetDeviceMessageRespVo> list;
	 */
  @RequestMapping(value="/Product/{Product_ID}/Device/{Device_ID}/{StartDateTime}{EndDateTime}{Limit}",method=RequestMethod.GET)
  public List<DeviceMessageTable> getDeviceMessage(@RequestParam("Product_ID")String Product_ID,
		  @RequestParam("Device_ID") String Device_ID,
		  @RequestParam("StartDateTime")String StartDateTime,
		  @RequestParam("EndDateTime")String EndDateTime){
	    //GetDeviceMessageRespVo devicemessageResp=new GetDeviceMessageRespVo();
	    ////DateTime StartDateTime1 = parseTime(StartDateTime);
	    ////DateTime EndDateTime1 = parseTime(StartDateTime);
	    //AddDataReqVo addDataReqVo = JSONObject.parseObject(data,AddDataReqVo.class);
	    List<DeviceMessageTable> Result=getMessageService.getDeviceMessage(Product_ID,Device_ID,StartDateTime,EndDateTime);
	    BeanUtils.copyProperties(Result,ls);
	    //return devicemessageResp;
	    return Result;
	  }
    
	/*
	 * public static DateTime parseTime(String time) { DateTime DT= null; try {
	 * DateTimeFormatter format=DateTimeFormat.forPattern("yyyy-MM-dd HH:mm:ss");
	 * DT=DateTime.parse(time); } catch (Exception e) { e.printStackTrace(); }
	 * return DT; }
	 */
}
