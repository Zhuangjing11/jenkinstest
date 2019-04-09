package com.zhuangjing.jenkinstest;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;

@Slf4j
public class TestController {

    @GetMapping("/hello")
    public void hello(){
        log.info("hello");
    }
}
