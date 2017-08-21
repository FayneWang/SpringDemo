package com.fayne.springdemo.restful.ModelAttribute;

import com.fayne.springdemo.restful.HelloSpring;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by fayne on 2017/8/18
 */
@ControllerAdvice(basePackageClasses = {ModelAttributeController.class})
class ModelAttributeDemo {

    /**
     * @param value 的值从请求参数中得到
     */
    @ModelAttribute()
    public void GetPrimitiveTypeFromNoNameModel(@RequestParam(value = "intValue",required = false) Integer value,Model model){
        model.addAttribute("intValue",value);
    }

    @ModelAttribute
    public UserInfo GetCustomTypeBindingDemo(){
        return null;
    }


    @ModelAttribute(value="user",binding = false)
    public User GetCustomType(){
        return new User("Fayne","Wang");
    }

    @ModelAttribute("user2")
    public User GetCustomType2(){
        return new User("Zezhou","Wang");
    }
}
