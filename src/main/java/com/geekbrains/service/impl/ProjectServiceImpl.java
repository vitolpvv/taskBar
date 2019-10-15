package com.geekbrains.service.impl;

import com.geekbrains.domain.Project;
import com.geekbrains.repo.ProjectRepository;
import com.geekbrains.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;

public class ProjectServiceImpl extends ServiceImpl<Project, Long> implements ProjectService {

    @Autowired
    private ProjectRepository repository;

    @Override
    CrudRepository<Project, Long> getRepository() {
        return repository;
    }
}
