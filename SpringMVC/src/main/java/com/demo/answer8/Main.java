package com.demo.answer8;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/formDemo")
public class Main {

    @RequestMapping(value = "/form", method = RequestMethod.GET)
    ModelAndView index() {
        ModelAndView modelAndView = new ModelAndView("form.jsp");
        return modelAndView;
    }

    @RequestMapping(value = "/submitForm", method = RequestMethod.POST)
    @ResponseBody
    String submitForm(@RequestParam("username") String username,
                      @RequestParam("password") String password) {
        return "Username " + username + " Password " + password;
    }
}

