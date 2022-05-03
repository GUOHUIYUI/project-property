package com.fc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("index")
public class indexController {
    @RequestMapping("test")
    public String test(Model model){
        model.addAttribute("username","郭慧源");
        return "/index.jsp";
    }
}
