package com.bean.dao;

import com.bean.model.DbOrderlableTransform;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DbOrderlableTransformMapper {
    DbOrderlableTransform selectByCriteria(DbOrderlableTransform DbOrderlableTransform);

    void deleteByPrimaryKey(String ID);

    void deleteByCriteria(DbOrderlableTransform DbOrderlableTransform);

    int insertByCriteria(DbOrderlableTransform DbOrderlableTransform);

    int updateByCriteria(DbOrderlableTransform DbOrderlableTransform);

    DbOrderlableTransform selectByPrimaryKey(Long id);

    List<DbOrderlableTransform> selectAll();
}