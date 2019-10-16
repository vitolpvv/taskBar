package com.geekbrains.service.impl;

import com.geekbrains.domain.Task;
import com.geekbrains.domain.TaskStatus;
import com.geekbrains.repo.TaskRepository;
import com.geekbrains.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class TaskServiceImpl extends ServiceImpl<Task, Long> implements TaskService {

    @Autowired
    private TaskRepository repository;

    @Override
    PagingAndSortingRepository<Task, Long> getRepository() {
        return repository;
    }

    @Override
    public List<Task> getAllByAuthorUsername(String name) {
        return repository.findAllByAuthorUsername(name);
    }

    @Override
    public List<Task> getAllByStatus(TaskStatus status) {
        return repository.findAllByStatus(status);
    }

    @Override
    public List<Task> getAllByTargetDate(LocalDate date) {
        return repository.findAllByTargetDate(date);
    }

    @Override
    public List<Task> getAllByCreateDate(LocalDate date) {
        return repository.findAllByCreateDate(date);
    }

    @Override
    public List<Task> getAllByProjectId(Long id) {
        return repository.findByProjectId(id);
    }
}
