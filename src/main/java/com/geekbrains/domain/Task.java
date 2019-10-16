package com.geekbrains.domain;


import javax.persistence.*;
import javax.validation.constraints.Size;
import java.time.LocalDate;
import java.util.List;

@Entity
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long   id;
    @Size(min = 1)
    private String title;
    @Size(min = 1)
    private String description;
    @ManyToOne(optional = false)
    private User author;
    @ManyToMany
    private List<User> inspectors;
    @ManyToMany
    private List<User> doers;
    @Column(name = "create_date")
    private LocalDate createDate = LocalDate.now();
    @Column(name = "target_date")
    private LocalDate targetDate;
    @ManyToOne
    private Project project;
    @Enumerated(EnumType.STRING)
    private TaskStatus status = TaskStatus.CREATED;

    public Task() {}

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public User getAuthor() {
        return author;
    }

    public void setAuthor(User author) {
        this.author = author;
    }

    public List<User> getInspectors() {
        return inspectors;
    }

    public void setInspectors(List<User> inspectors) {
        this.inspectors = inspectors;
    }

    public List<User> getDoers() {
        return doers;
    }

    public void setDoers(List<User> doers) {
        this.doers = doers;
    }

    public LocalDate getCreateDate() {
        return createDate;
    }

    public void setCreateDate(LocalDate createDate) {
        this.createDate = createDate;
    }

    public LocalDate getTargetDate() {
        return targetDate;
    }

    public void setTargetDate(LocalDate targetDate) {
        this.targetDate = targetDate;
    }

    public Project getProject() {
        return project;
    }

    public void setProject(Project project) {
        this.project = project;
    }

    public TaskStatus getStatus() {
        return status;
    }

    public void setStatus(TaskStatus status) {
        this.status = status;
    }
}
