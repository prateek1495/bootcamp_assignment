package com.demo.answer9and10;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/coDemo")
public class CODemo {

    @RequestMapping(value = "/index", method = RequestMethod.GET)
    ModelAndView index() {
        ModelAndView modelAndView = new ModelAndView("form.jsp");
        return modelAndView;
    }

    @RequestMapping(value = "/submitForm", method = RequestMethod.POST)
    @ResponseBody
    String submitForm(StudentCO studentCO) {
        return "FirstName: " + studentCO.getFirstname() + " LastName: " + studentCO.getLastname();
    }

    @ModelAttribute
    void addingObject(Model model){
        model.addAttribute("heading","This is spring mvc");
    }
}
