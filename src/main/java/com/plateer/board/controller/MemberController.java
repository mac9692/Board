package com.plateer.board.controller;

import com.plateer.board.dao.MemberDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;


@Controller
public class MemberController {

    @Autowired
    MemberDAO dao;

    @RequestMapping("/member/home")
    public String memberHome(){

        return "/member/memberHome";
    }

    @RequestMapping("/guest/home")
    public String guestHome(){

        return "/guest/guestHome";
    }

    @RequestMapping("/admin/home")
    public String adminHome(){

        return "/admin/adminHome";
    }

    @RequestMapping("/memberList")
    public String memberList(Model model) {
        model.addAttribute("memberList", dao.memberListDAO());
        return "/admin/memberList";
    }

    @RequestMapping("/memberView")
    public String memberView(HttpServletRequest request, Model model){
        String id = request.getParameter("id");
        model.addAttribute("memberView",dao.memberViewDAO(id));
        return "/admin/memberView";
    }

}
