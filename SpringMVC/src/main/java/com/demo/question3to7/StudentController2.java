package com.demo.question3to7;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;

@Controller
public class StudentController2 {

    //answer3
    @RequestMapping("/")
    ModelAndView index() {
        return new ModelAndView("index.jsp");
    }

    //answer 4
    @RequestMapping("/hello")
    @ResponseBody
    String getHello()
    {
        return "Hello";
    }

    //Answer 5
    @RequestMapping("/model")
    ModelAndView modelAttribute() {
        return new ModelAndView("index.jsp").
                addObject("msg","Hello World from model");
    }


    //Answer 6
    @RequestMapping("/name/{firstName}/{lastName}")
    @ResponseBody
    String firstAndLastName(@PathVariable String firstName ,@PathVariable String lastName) {
        return firstName + " " + lastName;
    }

    //Answer 7
    @RequestMapping("/nameWithMap/{firstName}/{lastName}")
    @ResponseBody
    String firstAndLastNameMap(@PathVariable Map<String,String> requestMap) {
        return requestMap.get("firstName") + " " + requestMap.get("lastName");
    }


}