package com.example.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @RequestMapping("/")
    public String hello() {
        return "Hello Spring Larisya";
    }

    @RequestMapping("/bye")
    public String bye(){
        return "Good Bye Spring";
    }
}
