package com.genie.fineapple.member.login;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/member")
public class LoginController {

    @GetMapping(value = "/login")
    public String test(){
        return "index";
    }
}
