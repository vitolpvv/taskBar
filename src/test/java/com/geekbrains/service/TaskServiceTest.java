package com.geekbrains.service;

import com.geekbrains.domain.Task;
import com.geekbrains.repo.TaskRepository;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@ContextConfiguration(classes = TaskServiceTestConfig.class)
public class TaskServiceTest {

    @Autowired
    private TaskService taskService;

    @MockBean
    private TaskRepository taskRepository;

    @Before
    public void setUp() {
        Task task = new Task();
        task.setId(1L);

        Mockito.when(taskRepository.findAll())
                .thenReturn(Collections.singletonList(task));

        Mockito.when(taskRepository.findById(Mockito.anyLong()))
                .thenReturn(Optional.empty());

        Mockito.when(taskRepository.findById(task.getId()))
                .thenReturn(Optional.of(task));

        Mockito.when(taskRepository.save(Mockito.any(Task.class)))
                .thenReturn(task);
    }

    @Test
    public void whenGetAll_thenListReturn() {
        List<Task> tasks = taskService.getAll();

        assertThat(tasks).isNotNull();
        assertThat(tasks.size()).isEqualTo(1);
    }

    @Test
    public void whenGetByExistedId_thenTaskReturn() {
        Task task = taskService.getById(1L);

        assertThat(task).isNotNull();
    }

    @Test
    public void whenGetByNotExistedId_thenNullReturn() {
        Task task = taskService.getById(2L);

        assertThat(task).isNull();
    }

    @Test
    public void whenSave_thenTaskReturn() {
        Task task = new Task();

        Task savedTask = taskService.save(task);

        assertThat(savedTask).isNotNull();
    }
}