package com.geekbrains.repo;

import com.geekbrains.domain.Task;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface TaskRepository extends CrudRepository<Task, Long> {

    List<Task> findAllByUsername(String username);

    List<Task> findAllByTargetDate(LocalDate date);
}
