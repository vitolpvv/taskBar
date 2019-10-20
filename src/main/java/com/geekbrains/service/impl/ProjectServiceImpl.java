package com.geekbrains.service.impl;

import com.geekbrains.domain.Project;
import com.geekbrains.domain.User;
import com.geekbrains.repo.ProjectRepository;
import com.geekbrains.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProjectServiceImpl extends ServiceImpl<Project, Long> implements ProjectService {

    @Override
    public List<Project> getAllAvailableForUser(User user) {
        List<Project> result = new ArrayList<>();
        List<Project> all = (List<Project>) repository.findAll();

        for (Project project : all) {
            if (project.getSupervisor().equals(user)) {
                result.add(project);
            } else if (project.getMembers().contains(user)) {
                result.add(project);
            }

        }

        return result;
    }

    @Autowired
    private ProjectRepository repository;

    @Override
    PagingAndSortingRepository<Project, Long> getRepository() {
        return repository;
    }

    @Override
    public List<Project> getAllBySupervisorUsername(String username) {
        return repository.findAllBySupervisorUsername(username);
    }
}
