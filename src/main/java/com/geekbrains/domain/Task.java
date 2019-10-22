package com.geekbrains.domain;


import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "task_generator")
    @SequenceGenerator(name = "task_generator", sequenceName = "task_id_seq", allocationSize = 1)
    private Long   id;

    @Column(nullable = false)
    private String title;

    private String description;

    @ManyToOne(optional = false)
    @JoinColumn(name = "author_id", foreignKey = @ForeignKey(name = "task_author_FK"))
    private User author;

    @ManyToMany
    @JoinTable(name = "task_inspector",
            joinColumns = @JoinColumn(name = "task_id"),
            inverseJoinColumns = @JoinColumn(name = "user_id"),
            foreignKey = @ForeignKey(name = "task_inspector_task_FK"),
            inverseForeignKey = @ForeignKey(name = "task_inspector_inspector_FK"))
    private List<User> inspectors;

    @ManyToMany
    @JoinTable(name = "task_doer",
            joinColumns = @JoinColumn(name = "task_id"),
            inverseJoinColumns = @JoinColumn(name = "user_id"),
            foreignKey = @ForeignKey(name = "task_doer_task_FK"),
            inverseForeignKey = @ForeignKey(name = "task_doer_doer_FK"))
    private List<User> doers;

    @Column(name = "create_date", nullable = false)
    private LocalDate createDate = LocalDate.now();

    @Column(name = "target_date")
    private LocalDate targetDate;

    @ManyToOne(optional = false)
    @JoinColumn(name = "project_id", foreignKey = @ForeignKey(name = "task_project_FK"))
    private Project project;

    @ManyToMany
    @JoinTable(name = "task_comment",
            joinColumns = @JoinColumn(name = "task_id"),
            inverseJoinColumns = @JoinColumn(name = "comment_id"),
            foreignKey = @ForeignKey(name = "task_comment_task_FK"),
            inverseForeignKey = @ForeignKey(name = "task_comment_comment_FK"))
    private List<Comment> comments;

    @Enumerated(EnumType.STRING)
    @Column(length = 20, nullable = false)
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
