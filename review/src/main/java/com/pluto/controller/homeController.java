package com.pluto.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping({"/","/home"})
public class homeController {
    @RequestMapping("/")
    public String menuPage(){
        return "index";
    }

    @RequestMapping("/menu")
    public String menu(){
        System.out.println(-2147483645>2147483646);
        return "menu";
    }
}
