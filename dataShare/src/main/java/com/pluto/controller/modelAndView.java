package com.pluto.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class modelAndView {
    @RequestMapping("/MAV")
    public ModelAndView test(){
        ModelAndView mav=new ModelAndView();
        mav.addObject("test","attribute");
        mav.setViewName("servlettest");
        return mav;
    }

    @RequestMapping("/model")
    public String model(Model m){
        m.addAttribute("test",1);
        return "servlettest";
    }

}
