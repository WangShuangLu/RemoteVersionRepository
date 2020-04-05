package com.iotplat.demo.dao.mongodb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Component;
import com.iotplat.demo.dao.mongodb.domain.DataDevice;

@Component
public class DataDeviceDao {
	 @Autowired
	    MongoTemplate mongoTemplate;

	    public void saveDevice(DataDevice device) {
	        mongoTemplate.save(device);
	    }
}
