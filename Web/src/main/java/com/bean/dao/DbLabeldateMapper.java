package com.bean.dao;

import com.bean.model.DbLabeldate;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public interface DbLabeldateMapper {
    DbLabeldate selectByCriteria(DbLabeldate DbLabeldate);

    void deleteByPrimaryKey(String SEQUENCEID);

    void deleteByCriteria(DbLabeldate DbLabeldate);

    int insertByCriteria(DbLabeldate DbLabeldate);

    int updateByCriteria(DbLabeldate DbLabeldate);

    DbLabeldate selectByPrimaryKey(String sequenceid);

    List<DbLabeldate> selectAll();
}