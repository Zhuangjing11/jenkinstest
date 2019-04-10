package com.zhuangjing.jenkinstest;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

@Slf4j
@RestController
public class TestController {

    @GetMapping("/hello")
    public Object hello(){
        Map<String, String> map = new HashMap<>();
        map.put("name", "zhuagnjing111111");
        return map;
    }
}
