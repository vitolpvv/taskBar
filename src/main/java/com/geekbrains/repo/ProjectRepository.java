package com.geekbrains.repo;

import com.geekbrains.domain.Project;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface ProjectRepository extends PagingAndSortingRepository<Project, Long> {
}
