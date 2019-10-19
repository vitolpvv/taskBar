package com.geekbrains.controller;

import com.geekbrains.domain.Task;
import com.geekbrains.service.impl.TaskServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class EditController {

    private static final String ATTRIBUTE = "task";
    private static final String REDIRECTION = "redirect:/main";
    private static final String VIEW = "edit";

    @Autowired
    private TaskServiceImpl taskService;

    @GetMapping("${url.edit}")
    public String edit(@RequestParam Long id, Model model){

        model.addAttribute(ATTRIBUTE, taskService.getById(id));

        return VIEW;
    }

    @PostMapping("${url.edit}")
    public String update(String title, String description, Long id ){
        Task task = taskService.getById(id);

        task.setTitle(title);
        task.setDescription(description);
        taskService.save(task);

        return REDIRECTION;
    }

}
