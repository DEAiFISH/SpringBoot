package com.deaifish.boot.controller;

import com.deaifish.boot.bean.User;
import org.springframework.boot.Banner;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;

@Controller
public class TestController {
    @GetMapping({"/", "/index"})
    public String index(){
        return "index";
    }

    @PostMapping("/index")
    public String main(User user, HttpSession session, Model mode){
        if(user.getFirstName() != "" && user.getLastName() != ""){
            session.setAttribute("loginUser",user);
            return "redirect:/success.html";
        }
        mode.addAttribute("msg","登录错误！");
        return "index";
    }

    @GetMapping("/success.html")
    public String success(){
        return "success";
    }
}
