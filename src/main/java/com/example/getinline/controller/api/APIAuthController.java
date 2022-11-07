package com.example.getinline.controller.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/** Controller는 리퀘스트를 보냈지만 RestContorller 여기서 그냥 내보내준다.*/
@RequestMapping("/api")
@RestController//Body를 그대로 내보내준다.
public class APIAuthController {

    @GetMapping("/sign-up")
    public String signup(){
        return "done";
    }

    @GetMapping("/login")
    public String login(){
        return "done";
    }
}
