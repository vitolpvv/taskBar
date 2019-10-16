package com.geekbrains.repo;

import com.geekbrains.domain.Project;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

public interface ProjectRepository extends PagingAndSortingRepository<Project, Long> {

    List<Project> findAllBySupervisorUsername(String username);
}
