package com.scaler.productserviceself.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class SampleController {

    @GetMapping("/say/{name}/{times}")
    public String sayHello(@PathVariable("name") String name,@PathVariable("times") int times) {
        return "Hello"+name;
    }
    @GetMapping("/bye")
    public String sayBye(){
        return "Bye Everyone!";

    }
}
