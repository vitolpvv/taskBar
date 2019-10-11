package com.geekbrains.service.impl;

import com.geekbrains.domain.Task;
import com.geekbrains.repo.TaskRepository;
import com.geekbrains.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

@Service
public class TaskServiceImpl extends ServiceImpl<Task, Long> implements TaskService {

    @Autowired
    private TaskRepository repository;

    @Override
    CrudRepository<Task, Long> getRepository() {
        return repository;
    }
}
