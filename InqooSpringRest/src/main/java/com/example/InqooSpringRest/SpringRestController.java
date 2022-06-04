package com.example.InqooSpringRest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
public class SpringRestController {
    @RequestMapping (value = "/helloworld", method = RequestMethod.GET)
    public String hello(){
        return "hello world";
    }
    @GetMapping("/helloworld2/{paramName}")
    public String hello2 (@PathVariable("paramName") String name ){
        return name;
    }

    @GetMapping("/helloworld3/{paramName}")
    public String hello3 (@PathVariable("paramName") String name ){
        return name;
    }

}
