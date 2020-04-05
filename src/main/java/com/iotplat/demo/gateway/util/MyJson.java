package com.iotplat.demo.gateway.util;

import org.springframework.http.*;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;


public class MyJson {

    public static int i=1;

    public static void main(String[] args) {
        String jsonParam = "{\"name\":\"ScheduleTest\",\"sex\":\"test\",\"id\":\"10\"}";
        String ip="http://localhost:8090";
        String testurl = ip+"/device/9/sensor/8/{json}";
        RestTemplate client = new RestTemplate();
        HttpHeaders headers = new HttpHeaders();
        HttpMethod method = HttpMethod.POST;
        // 以表单的方式提交
        headers.setContentType(MediaType.APPLICATION_FORM_URLENCODED);
        MultiValueMap<String, String> map= new LinkedMultiValueMap<>();
        HttpEntity<MultiValueMap<String, String>> request = new HttpEntity<>(map, headers);
        //执行HTTP请求，将返回的结构使用ResultVO类格式化
        ResponseEntity<String> response = client.postForEntity( testurl, request , String.class ,jsonParam);
        System.out.println(response.getBody());
        i=i+1;
        System.out.println(i);
    }
}