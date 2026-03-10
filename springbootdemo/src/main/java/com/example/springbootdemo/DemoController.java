package com.example.springbootdemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    @GetMapping("/get")
    public String hello() {
        return "Hello";
    }
    @GetMapping("/{id}/{name}")
    public String return_id(@PathVariable String id,@PathVariable String name){
        return "user id fetched from path variable "+id+" "+name;
    }

}
