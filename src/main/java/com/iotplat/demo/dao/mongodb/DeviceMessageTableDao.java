package com.iotplat.demo.dao.mongodb;

import com.iotplat.demo.dao.mongodb.domain.DeviceMessageTable;
//import com.iotplat.demo.dao.mongodb.domain.MongoTest;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Component;
import java.util.Date;
import org.joda.time.DateTime;
@Component
public class DeviceMessageTableDao {
  
	@Autowired
	private MongoTemplate mongoTemplate;
	
	/**
     * 创建对象
     */
    public void saveTest(DeviceMessageTable deviecMessage) {
        mongoTemplate.save(deviecMessage);
    }

    /**
     * 根据Product_ID&Device_ID查询对象
     * @return
     */
    public List<DeviceMessageTable> findByProIDandDevID(String Product_ID,String Device_ID,String StartDateTime,String EndDateTime) {
        Query query=new Query((Criteria.where("Product_ID").is(Product_ID)).and("Device_ID").is(Device_ID).and("StartDateTime").is(StartDateTime).and("EndDateTime").is(EndDateTime));
        List<DeviceMessageTable> dm =  mongoTemplate.find(query,DeviceMessageTable.class);
        return dm;
    }

    /**
     * 删除对象
     * @param id
     */
    public void deleteTestById(Integer id) {
        Query query=new Query(Criteria.where("id").is(id));
        mongoTemplate.remove(query,DeviceMessageTable.class);
    }
}
