package com.pluto.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping({"/test","/"})
public class MyController {

    @RequestMapping("/")
    public String index(){
        return "index";
    }

    @RequestMapping("/target")
    public String toTarget(){
        return "target";
    }

    @RequestMapping(value = "/testPut",method = RequestMethod.POST)
    public String testPut(){
        return "target";
    }

    @RequestMapping("/testRest/{id}/{username}")
    public String testRest(@PathVariable("id") String id,@PathVariable("username") String username){
        System.out.println(id+", "+username);
        return "index";
    }
}
