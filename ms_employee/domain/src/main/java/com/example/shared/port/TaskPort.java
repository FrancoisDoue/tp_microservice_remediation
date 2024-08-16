package com.example.shared.port;

import com.example.shared.dto.impl.TaskDTO;

import java.util.List;

public interface TaskPort {
    TaskDTO getById(int id);
    List<TaskDTO> getAll();
    TaskDTO save(TaskDTO taskDTO);
    TaskDTO update(TaskDTO taskDTO);
    void deleteById(int id);

}
