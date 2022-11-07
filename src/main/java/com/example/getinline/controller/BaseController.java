package com.example.getinline.controller;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BaseController implements ErrorController {//error페이지를 custom하는 주도권 탈취

    @GetMapping("/")
    public String root(){
        return "index";
    }
    @RequestMapping("/error")
    public String error(){
        return "error";
    }
}
