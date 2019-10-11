package com.geekbrains.repo;

import com.geekbrains.domain.Task;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface TaskRepository extends PagingAndSortingRepository<Task, Long> {

    List<Task> findAllByUsername(String username);

    List<Task> findAllByTargetDate(LocalDate date);
}
