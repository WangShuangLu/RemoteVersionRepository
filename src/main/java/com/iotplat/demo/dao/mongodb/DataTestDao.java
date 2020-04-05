package com.iotplat.demo.dao.mongodb;


import com.iotplat.demo.dao.mongodb.domain.DataTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Component;

@Component
public class DataTestDao {


    @Autowired
    MongoTemplate mongoTemplate;

    public void saveTest(DataTest test) {
        mongoTemplate.insert(test);
    }
}
