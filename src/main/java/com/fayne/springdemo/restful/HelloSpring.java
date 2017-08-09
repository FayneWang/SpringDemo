package com.fayne.springdemo.restful;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by fayne on 2017/8/8
 */
@RestController
@RequestMapping("/")
public class HelloSpring {

    @GetMapping
    public String responseHello(@RequestHeader("content-type") String contentType){
        return "Hello Spring!";
    }
}
