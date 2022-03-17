package com.plateer.board.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MemberController {

    @RequestMapping("/login")
    public String loginForm(){
        return "/member/login";
    }

    @RequestMapping("loginError")
    public String loginError(){
        return "/member/loginError";
    }
}
