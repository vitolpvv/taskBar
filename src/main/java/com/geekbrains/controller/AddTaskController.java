package com.geekbrains.controller;

import com.geekbrains.domain.Task;
import com.geekbrains.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class AddTaskController {

    @Autowired
    TaskService taskService;

    private static final String MAPPING = "/add";
    private static final String VIEW = "add_task";
    private static final String REDIRECTION = "redirect:/main";

    @GetMapping(MAPPING)
    public String addContact() {

        return VIEW;
    }

    @PostMapping(MAPPING)
    public String save(String title, String description, Long id ) {
        Task task = new Task();

        task.setId(id);
        task.setTitle(title);
        task.setDescription(description);
        taskService.save(task);

        return REDIRECTION;
    }

}
