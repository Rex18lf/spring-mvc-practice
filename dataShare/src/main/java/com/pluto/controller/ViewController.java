package com.pluto.controller;

import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ViewController {
    @RequestMapping("/view")
    public String testThymeleafView(){
        return "servlettest";
    }

    @RequestMapping("test-view")
    public String testView(){
        return "view";
    }
}
