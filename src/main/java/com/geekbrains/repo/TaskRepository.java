package com.geekbrains.repo;

import com.geekbrains.domain.Task;
import com.geekbrains.domain.TaskStatus;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface TaskRepository extends PagingAndSortingRepository<Task, Long> {

    List<Task> findAllByAuthorUsername(String username);

    List<Task> findAllByTargetDate(LocalDate date);

    List<Task> findAllByCreateDate(LocalDate date);

    List<Task> findAllByStatus(TaskStatus status);

    List<Task> findByProjectId(Long id);
}
