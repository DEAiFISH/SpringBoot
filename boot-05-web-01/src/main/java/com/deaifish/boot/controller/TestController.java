package com.deaifish.boot.controller;

import com.deaifish.boot.bean.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpSession;

@Controller
public class TestController {
    @GetMapping({"/", "/index"})
    public String index() {
        return "index";
    }

    @PostMapping("/login")
    public String main(User user, HttpSession session, Model model) {
        if (user.getFirstName() != "" && user.getLastName() != "") {
            session.setAttribute("loginUser", user);
            return "redirect:success";
        } else {
            model.addAttribute("msg", "请填写姓、名！");
            return "index";
        }
    }

    @GetMapping("/success")
    public String successPage() {
        return "success";
    }
}
