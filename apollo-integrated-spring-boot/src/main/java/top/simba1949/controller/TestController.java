package top.simba1949.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Anthony
 * @date 2020/7/25 15:27
 */
@RestController
@RequestMapping("test")
public class TestController {

    @Value("${sms.enable}")
    private Boolean smsEnable;

    @GetMapping("sms")
    public Boolean getSmsEnableStr(){
        return smsEnable;
    }

    @GetMapping("value")
    public String getValueByKey(@Value("${test.key}")String value){
        System.out.println("value is " + value);
        return value;
    }
}