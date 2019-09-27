package com.tangsir.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {

    @RequestMapping({"", "/index", "/index"})
    public String index(){
        int a = 1/0;
        return "index";
    }

    @RequestMapping({"", "/header", "/inc/header"})
    public String header(){
        return "header";
    }

    @RequestMapping({"", "/footer", "/inc/footer"})
    public String footer(){
        return "footer";
    }
}
