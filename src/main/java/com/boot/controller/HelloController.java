package com.boot.controller;

import com.boot.Bean.Stu;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

@Controller
public class HelloController {
@RequestMapping("/")
    public String handle01(){
        return "login";
    }
    @PostMapping("/login")
    public String login(Stu user, HttpSession session, Model model){
    if(user.getUsername().length()!=0&&user.getPassword().length()!=0){
        session.setAttribute("loginUser",user);
        return "redirect:/main";
    }
    else{
        model.addAttribute("msg","账号密码错误");
        return "login";
    }
    }

    @GetMapping("/main")
    public String mainPage(HttpSession session){
    Object loginuser=session.getAttribute("loginUser");
    if(loginuser==null){
        return "login";
    }
    else{
        return "index";
    }
    }
}
