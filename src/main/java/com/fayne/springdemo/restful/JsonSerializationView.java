package com.fayne.springdemo.restful;

import com.fayne.springdemo.restful.domain.Person;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

/**
 * Created by fayne on 2017/8/9
 */
@RestController
@RequestMapping("json")
public class JsonSerializationView {

    /**
     *   http://localhost:7777/json/serialization
      * @return
     */
    @GetMapping(value = "/serialization",produces = MediaType.APPLICATION_JSON_VALUE)
    public Person getPerson(){
        return new Person("fayne",28);
    }

    /**
     *   http://localhost:7777/json/serialization
     *    { "name": "fayne", "age": 28 }
     *    @return
     */
    @PostMapping(value = "/serialization",produces = MediaType.APPLICATION_JSON_VALUE)
    public Person postPerson(@RequestBody Person person){
        return person;
    }
}
