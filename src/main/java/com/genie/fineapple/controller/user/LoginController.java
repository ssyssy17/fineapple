package com.genie.fineapple.controller.user;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class LoginController {
    @GetMapping(value = "/login")
    public String test(){
        return "index";
    }
}
