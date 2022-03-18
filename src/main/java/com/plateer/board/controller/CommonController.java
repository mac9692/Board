package com.plateer.board.controller;

import com.plateer.board.dao.MemberDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class CommonController {

    @Autowired
    MemberDAO dao;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @RequestMapping("/login")
    public String loginForm() {
        return "/common/login";
    }

    @RequestMapping("/common/signupForm")
    public String signupForm() {
        return "/common/signupForm";
    }

    @RequestMapping("/common/signup")
    public String signup(HttpServletRequest request){
        String encodedPassword = passwordEncoder.encode(request.getParameter("password"));

        dao.signupDAO(request.getParameter("email"),
                      encodedPassword,
                      request.getParameter("name"),
                      request.getParameter("authority"));

        return "redirect:/";
    }
}
