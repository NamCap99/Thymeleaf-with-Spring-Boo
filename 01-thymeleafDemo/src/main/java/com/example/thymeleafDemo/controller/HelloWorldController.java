package com.example.thymeleafDemo.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloWorldController {
    // need a controller method to show initial HTML form
    @GetMapping("/showForm")
    public String showForm(){
        return "helloworld-form";
    }
//    need a controller method to process the HTML form
    @RequestMapping("/processFormVersionTwo")
    public String processFormVersionTwo(HttpServletRequest request, Model model){
//        read the request parameter from the HTML form
        String theName = request.getParameter("studentName");
        theName = theName.toUpperCase();
//        model.addAttribute("studentName", theName);
//        create the message
        String results = "Welcome back " + theName;
////        add message to the model
        model.addAttribute("message ", results);

        return "helloWorld";
    }

    @RequestMapping("/processFormVersionThree")
    public String processFormVersionTwo(@RequestParam("studentName") String theName
    , Model model){

        theName = theName.toUpperCase();
//        model.addAttribute("studentName", theName);
//        create the message
        String results = "Welcome back v3" + theName;
////        add message to the model
        model.addAttribute("message ", results);

        return "helloWorld";
    }
}
