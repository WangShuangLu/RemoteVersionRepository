package com.iotplat.demo.gateway.controller;


import com.iotplat.demo.dao.mongodb.MongoTestDao;
import com.iotplat.demo.dao.mongodb.domain.MongoTest;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;
@Api(tags="Mongodb接口示例controller")
@RestController
public class MongoTestController {

    @Resource
    private MongoTestDao mtdao;

    @ApiOperation(value = "mongodb插入接口", notes="示例")
    @PostMapping(value="/test1")
    public void saveTest() throws Exception {
        MongoTest mgtest=new MongoTest();
        mgtest.setId(11);
        mgtest.setAge(33);
        mgtest.setName("ceshi");
        mtdao.saveTest(mgtest);
    }

    @ApiOperation(value = "mongodb查询接口", notes="示例")
    @GetMapping(value="/test2")
    public List<MongoTest> findTestByName(){
        List<MongoTest> mgtest= mtdao.findTestByName("ceshi");
        System.out.println("mgtest is "+mgtest);
        return mgtest;
    }

    @ApiOperation(value = "mongodb修改接口", notes="示例")
    @PutMapping(value="/test3")
    public void updateTest(){
        MongoTest mgtest=new MongoTest();
        mgtest.setId(11);
        mgtest.setAge(44);
        mgtest.setName("ceshi2");
        mtdao.updateTest(mgtest);
    }

    @ApiOperation(value = "mongodb删除接口", notes="示例")
    @DeleteMapping(value="/test4")
    public void deleteTestById(){
        mtdao.deleteTestById(11);
    }
}
