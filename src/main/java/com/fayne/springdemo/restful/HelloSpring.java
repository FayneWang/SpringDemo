package com.fayne.springdemo.restful;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

/**
 * Created by fayne on 2017/8/8
 */
@RestController
@RequestMapping("/")
public class HelloSpring {

    @GetMapping
    public String responseHello(@RequestHeader("content-type") String contentType,@ModelAttribute("modeAttr") long value,Model model){
        return "Hello Spring!" + value;
    }
}
