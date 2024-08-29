package com.example.thymeleafDemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DemoController {
//    create mapping for "hello.html"
    @GetMapping("/hello")
    public String sayHello(Model theModel){
        theModel.addAttribute("theDate", java.time.LocalDateTime.now());
//        return o day la return htmlWorld.html
        return "helloWorld";
    }
}
