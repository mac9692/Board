package com.plateer.board;

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
    }
}
