package com.bean.dao;

import com.bean.model.Task;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public interface TaskMapper {
    Task selectByCriteria(Task Task);

    void deleteByPrimaryKey(String id);

    void deleteByCriteria(Task Task);

    int insertByCriteria(Task Task);

    int updateByCriteria(Task Task);

    Task selectByPrimaryKey(Integer id);

    List<Task> selectAll();
}