package com.fayne.springdemo.restful;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by fayne on 2017/8/9
 */
@RestController
@RequestMapping("web-data-binder")
public class WebDataBinderDemo {

    @InitBinder
    protected void initBinder(WebDataBinder binder){
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        dateFormat.setLenient(false);
        binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, true));
    }

    /**
     *
     * @param date url path = /web-data-binder/date-string?date=2017-08-10
     * @return
     */
    @PostMapping(value = "/date-string",produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public Object binder(@RequestParam("date")  Date date){

        return date;
    }


}
