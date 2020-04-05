package com.iotplat.demo.dao.mongodb;


import com.iotplat.demo.dao.mongodb.domain.MongoTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class MongoTestDao {


    @Autowired
    private MongoTemplate mongoTemplate;

    /**
     * 创建对象
     */
    public void saveTest(MongoTest test) {
        mongoTemplate.save(test);
    }

    /**
     * 根据用户名查询对象
     * @return
     */
    public List<MongoTest> findTestByName(String name) {
        Query query=new Query(Criteria.where("name").is(name));
        List<MongoTest> mgt =  mongoTemplate.find(query,MongoTest.class);
        return mgt;
    }

    /**
     * 更新对象
     */
    public void updateTest(MongoTest test) {
        Query query=new Query(Criteria.where("name").is("ceshi"));
        Update update= new Update().set("age", test.getAge()).set("name", test.getName());
        //更新查询返回结果集的第一条
        //mongoTemplate.updateFirst(query,update,MongoTest.class);
        //更新查询返回结果集的所有
         mongoTemplate.updateMulti(query,update,MongoTest.class);
    }

    /**
     * 删除对象
     * @param id
     */
    public void deleteTestById(Integer id) {
        Query query=new Query(Criteria.where("id").is(id));
        mongoTemplate.remove(query,MongoTest.class);
    }
}