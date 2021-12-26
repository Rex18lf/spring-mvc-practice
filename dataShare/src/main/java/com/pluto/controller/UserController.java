package com.pluto.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class UserController {
    /**
     * 使用RESTful模拟用户资源的增删改查
     *
     */

    @GetMapping(value = {"/user"})
    public String getAllUser(){
        System.out.println("查询所有用户信息");
        return "simulation";
    }

    @GetMapping(value = {"/user/{id}"})
    public String getUser(@PathVariable("id")String id){
        System.out.println("查询第"+id+"个用户信息");
        return "simulation";
    }

    @GetMapping(value={"/add"})
    @ResponseBody
    public String addUser(){
        System.out.println("addUser");
        return "view";
    }

    @DeleteMapping("/delete")
    public String delete(){
        System.out.println("delete");
        return "view";
    }

}
