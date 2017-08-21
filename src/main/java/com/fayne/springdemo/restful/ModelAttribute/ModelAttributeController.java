package com.fayne.springdemo.restful.ModelAttribute;


import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

/**
 * Created by fayne on 2017/8/21
 */
@RestController
@RequestMapping("model-attribute")
class ModelAttributeController {

    /**
     *
     * @param user
     * @param model
     */
    void ShowCustomTypeDemo(@ModelAttribute User user,
                            @RequestParam(value = "user2",required = false) User user2,
                            Model model){

        user =user;
    }


    /**
     * The user field,it retrieved based on a URI template variable and type converter (explained in more detail below)
     * The custom type filed must match the path parameters.
     * @param user
     */
    @GetMapping("/{lastName}/{firstName}")
    Object ShowCustomTypeValueFromPath(@ModelAttribute(name = "user3") User user,Model model,BindingResult bindingResult){

        if (bindingResult.hasErrors())
            return "bindingResult.hasErrors()";

        return user;
    }

    /**
     * http://localhost:12345/model-attribute/Wang?intValue=123488
     * @param user
     * @return
     */
    @GetMapping("/{lastName}")
    Object ShowCustomTypeValueFromPath2(@ModelAttribute(name = "user3") User user,Model model){


        return user;
    }

    /**
     * http://localhost:12345/model-attribute/age?age=123
     * @param userInfo
     * @param bindingResult
     * @return
     */
    @GetMapping("/age")
    Object ShowCustomTypeValueFromParam(@ModelAttribute(binding = false) UserInfo userInfo,BindingResult bindingResult,Model model){

        if (bindingResult.hasErrors())
            return "bindingResult.hasErrors()";

        return userInfo;
    }
}
