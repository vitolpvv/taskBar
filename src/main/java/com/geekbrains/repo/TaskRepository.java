package com.geekbrains.repo;

import com.geekbrains.Task;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface TaskRepository extends CrudRepository<Task, Long> {

    /**
     * Find all tasks by username.
     *
     * @param username - username (@see java.lang.String)
     * @return list of tasks (@see com.geekbrains.Task)
     */
    List<Task> findAllByUsername(String username);

    /**
     * Find all tasks by target date.
     *
     * @param date - date (@see java.time.LocalDate)
     * @return list of tasks (@see com.geekbrains.Task)
     */
    List<Task> findAllByTargetDate(LocalDate date);
}
