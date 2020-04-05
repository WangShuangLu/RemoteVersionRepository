package com.iotplat.demo.gateway.util;

import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;

@Configuration
@EnableScheduling
public class SaticScheduleTastTest {

    public static int id=10;

/*    @Scheduled(cron = "0/5 * * * * ?")
    private void configureTasks() {
        String jsonParam = "{\"name\":\"ScheduleTest\",\"sex\":\"test\",\"id\":\""+id+"\"}";
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
        id=id+1;
        System.out.println(id);
    }*/
}
