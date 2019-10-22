package com.geekbrains.service;

import com.geekbrains.domain.Project;

import java.util.List;

public interface ProjectService extends Service<Project, Long> {

    List<Project> getAllBySupervisorUsername(String username);
}
