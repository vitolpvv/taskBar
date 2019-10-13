package com.geekbrains.service;

import com.geekbrains.service.impl.TaskServiceImpl;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.context.annotation.Bean;

@TestConfiguration
class TaskServiceTestConfig {

    @Bean
    public TaskService taskService() {
        return new TaskServiceImpl();
    }
}
