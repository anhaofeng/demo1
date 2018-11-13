package com.demo.actuator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
//    @Autowired
////    private  CounterService  counterService;

    @RequestMapping(value = "/user/home")
    public String home(){
    return "home";
    }

    @RequestMapping(value = "/user/create")
    public  String create(){
        return "create";
    }
}
