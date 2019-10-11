package com.geekbrains.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;


@Controller
public class MainPageController {

    private static final String MAIN_VIEW = "main";
    
    @GetMapping("/main")
    public String main(Model model) {
        return "main";
    }

    @PostMapping("/main")
    public String add(String name, java.util.Map<String, Object>model) {
        return "main";
    }

    @PostMapping("/delete")
    public String delete(
            @RequestParam(value = "id") long id,
            Map<String, Object> model){
        return "main";
    }
}
