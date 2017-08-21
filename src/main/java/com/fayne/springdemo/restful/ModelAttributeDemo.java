package com.fayne.springdemo.restful;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by fayne on 2017/8/18
 */
@ControllerAdvice(basePackageClasses = {HelloSpring.class})
public class ModelAttributeDemo {

    /**
     * @param value 的值从请求参数中得到
     */
    @ModelAttribute("modeAttr")
    public long GetPrimitiveTypeFromNoNameModel(@RequestParam("value") long value){
        return value;
    }

    @ModelAttribute
    public void SetPrimitiveTypeFromParameterModel(Model model){

    }
}
