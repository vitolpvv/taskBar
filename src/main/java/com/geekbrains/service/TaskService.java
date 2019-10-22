package com.geekbrains.service;

import com.geekbrains.domain.Task;
import com.geekbrains.domain.TaskStatus;

import java.time.LocalDate;
import java.util.List;

public interface TaskService extends Service<Task, Long> {

    List<Task> getAllByAuthorUsername(String name);

    List<Task> getAllByStatus(TaskStatus status);

    List<Task> getAllByTargetDate(LocalDate date);

    List<Task> getAllByCreateDate(LocalDate date);

    List<Task> getAllByProjectId(Long id);

}
