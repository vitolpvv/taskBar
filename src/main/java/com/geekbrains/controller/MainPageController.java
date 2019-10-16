package com.geekbrains.controller;


import com.geekbrains.domain.Task;
import com.geekbrains.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Map;


@Controller
public class MainPageController {

    private static final String MAIN_VIEW = "main";
    private static final String REDIRECTION = "redirect:/main";
    private static final String ATTRIBUTE = "tasks";
    private static final String MAIN_MAPPING = "/main";
    private static final String DELETE_MAPPING = "/delete";

    @Autowired
    private TaskService taskService;

    @GetMapping(MAIN_MAPPING)
    public String main(Model model) {

        List<Task> tasks = taskService.getAll();

        model.addAttribute(ATTRIBUTE, tasks);

        return MAIN_VIEW;
    }

    @PostMapping(DELETE_MAPPING)
    public String delete(
            @RequestParam Long id,
            Map<String, Object> model) {

        taskService.delete(id);

        return REDIRECTION;
    }

}
