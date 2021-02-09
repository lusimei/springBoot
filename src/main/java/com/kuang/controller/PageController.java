package com.kuang.controller;

import com.kuang.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Arrays;

@Controller
public class PageController {

    @RequestMapping("/login")
    public String login(Model model){
        model.addAttribute("name","shimei");
        model.addAttribute("age",24);
        model.addAttribute("user",new User("@163.com","武汉"));
        model.addAttribute("html","<h5 style='color: aqua'>测试</h5>");
        model.addAttribute("list", Arrays.asList(12,13,14));
        return "login";
    }

//    @RequestMapping("/index")
//    public String index(Model model){
//        model.addAttribute("name","shimei");
//        model.addAttribute("age",24);
//        model.addAttribute("user",new User("@163.com","武汉"));
//        model.addAttribute("html","<h5 style='color: aqua'>测试</h5>");
//        model.addAttribute("list", Arrays.asList(12,13,14));
//        return "login";
//    }
}
