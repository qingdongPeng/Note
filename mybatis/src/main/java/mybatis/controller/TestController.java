package mybatis.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Create by peng.qd on 2019/2/22 0022.
 */
@RestController
public class TestController {

    @GetMapping(value = "/")
    public String aa(){
        return "test";
    }

    @GetMapping(value = "/test")
    public String dd(){
        System.out.println("hello");
        return  "hello";
    }
}
