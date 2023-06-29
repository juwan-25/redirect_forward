package kr.hs.study.redirect_forward.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class testController {

    @GetMapping("/redirect")
    public String redirect(){
        return "redirect:result";
    }

    @GetMapping("/result")
    public String result(){
        return "result";
    }

    @GetMapping("/forward")
    public String forward(){
        return "forward:result";
    }
}
