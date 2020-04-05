package com.iotplat.demo.gateway.controller.vo;
import com.iotplat.demo.gateway.controller.vo.GetDeviceMessage;
import java.util.List;
import java.util.ArrayList;
import javax.annotation.Resource;
import org.springframework.stereotype.Component;
@Component
public class GetDeviceMessageRespVoList {
  
	private List<GetDeviceMessage> list = new ArrayList<GetDeviceMessage>();
	
		private void setList(List<GetDeviceMessage> list1)
		{
			this.list=list1;
		}
	   
		private List<GetDeviceMessage> getList()
		{
			return list;
		}
}
