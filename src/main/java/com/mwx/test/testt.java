package com.mwx.test;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class testt {
    @GetMapping("/hello")
    String hello(String name){
        return "hello" + name;
    }
    @PostMapping("/hello")
    String hello(@RequestBody Map<String,Object> map){
        return map.toString();
    }

}
