package com.fayne.springdemo.restful;

import org.springframework.web.bind.annotation.*;

/**
 * Created by fayne on 2017/8/8
 */
@RestController
@RequestMapping("hello")
public class HelloSpring {

    @GetMapping
    public String responseHello(@RequestHeader("content-type") String contentType){
        return "Hello Spring!";
    }
}
