package com.plateer.board.controller;

import com.plateer.board.dao.BoardDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class BoardController {

    @Autowired
    BoardDAO dao;

    @RequestMapping("/")
    public String root() throws Exception{
        return "/index";
    }

    @RequestMapping("/board/list")
    public String boardList(Model model){
        model.addAttribute("list",dao.listDAO());
        return "/board/list";
    }

    @RequestMapping("/board/view")
    public String viewList(HttpServletRequest request, Model model){
        String id = request.getParameter("id");
        model.addAttribute("dto",dao.viewDAO(id));
        return "/board/view";
    }

    @RequestMapping("/board/writeForm")
    public String writeForm(){

        return "/board/writeForm";
    }

    @RequestMapping("/board/write")
    public String write(HttpServletRequest request, Model model){
        dao.writeDAO(request.getParameter("writer"),
                     request.getParameter("title"),
                     request.getParameter("content"));
        return "redirect:/board/list";
    }

    @RequestMapping("/board/updateForm")
    public String updateForm(){

        return "/board/updateForm";
    }

    @RequestMapping("/board/update")
    public String update(HttpServletRequest request){
        dao.updateDAO(request.getParameter("writer"),
                      request.getParameter("title"),
                      request.getParameter("content"),
                      request.getParameter("id"));
        return "redirect:/board/list";
    }

    @RequestMapping("/board/delete")
    public String delete(HttpServletRequest request){
        dao.deleteDAO(request.getParameter("id"));
        return "redirect:/board/list";
    }


//    하단은 JDBC Template을 이용하여 CRUD를 구현한 코드입니다.
    /*@Autowired
    BoardDAO dao;

    @RequestMapping("/")
    public String root() throws Exception{
        return "redirect:list";
    }

    @RequestMapping("/list")
    public String userList(Model model){
        model.addAttribute("list", dao.listDAO());
        return "list";
    }

    @RequestMapping("/view")
    public String viewList(HttpServletRequest request, Model model){
        String id = request.getParameter("id");
        model.addAttribute("dto", dao.viewDAO(id));
        return "view";
    }

    @RequestMapping("/writeForm")
    public String writeForm(){
        return "writeForm";
    }

    @RequestMapping("/write")
    public String write(Model model, HttpServletRequest request){
        dao.writeDAO(request.getParameter("writer"),
                     request.getParameter("title"),
                     request.getParameter("content"));
        return "redirect:list";
    }

    @RequestMapping("/updateForm")
    public String updateForm(){
        return "updateForm";
    }

    @RequestMapping("/update")
    public String update(Model model, HttpServletRequest request){
        dao.updateDAO(request.getParameter("writer"),
                      request.getParameter("title"),
                      request.getParameter("content"),
                      request.getParameter("id"));
        return "redirect:list";
    }

    @RequestMapping("/delete")
    public String delete(HttpServletRequest request, Model model){
        dao.deleteDAO(request.getParameter("id"));
        return "redirect:list";
    }*/
}
