package com.fayne.springdemo.mvctest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by fayne on 2017/8/23
 */
@Controller
@RequestMapping("test")
public class TestController {

    @Autowired
    private TestService testService;


    @GetMapping
    @ResponseBody
    Object GetTest(){
        return "Hello controller test!!!";
    }

    @GetMapping(value = "/{data}")
    @ResponseBody
    Object GetTest(@PathVariable("data") String data){
        return "Hello " + data;
    }
}
