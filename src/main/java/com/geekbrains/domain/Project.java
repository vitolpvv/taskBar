package com.geekbrains.domain;

import javax.persistence.*;
import java.util.List;

@Entity
public class Project {

    @Id
    private Long id;

    @ManyToMany
    private List<User> members;

    @OneToMany
    private User supervisor;

    @ManyToOne
    private List<Task> tasks;

    public Project() {}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<User> getMembers() {
        return members;
    }

    public void setMembers(List<User> members) {
        this.members = members;
    }

    public User getSupervisor() {
        return supervisor;
    }

    public void setSupervisor(User supervisor) {
        this.supervisor = supervisor;
    }

    public List<Task> getTasks() {
        return tasks;
    }

    public void setTasks(List<Task> tasks) {
        this.tasks = tasks;
    }

}
