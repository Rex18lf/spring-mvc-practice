package com.pluto.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
public class Scope {
    @RequestMapping("/servlet")
    public String servlet(HttpServletRequest request,HttpSession s){
        request.setAttribute("test","MyObject");
        ServletContext context = request.getServletContext();
        ServletContext context1 = s.getServletContext();
        System.out.println(context.equals(context1));
        return "servlettest";
    }

    @RequestMapping("/session")
    public String sess(HttpSession session){
        session.setAttribute("test","session");
        return "servlettest";
    }
}
