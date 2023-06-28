package kr.hs.study.redirect_forward.controller;

import org.springframework.web.bind.annotation.GetMapping;

public class homeController {
    @GetMapping("/")
    public String home(){
        return "index";
    }
}
