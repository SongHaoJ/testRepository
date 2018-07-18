package com.bean.dao;

import com.bean.model.DbFailtaskitem;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DbFailtaskitemMapper {
    DbFailtaskitem selectByCriteria(DbFailtaskitem DbFailtaskitem);

    void deleteByPrimaryKey(String SID);

    void deleteByCriteria(DbFailtaskitem DbFailtaskitem);

    int insertByCriteria(DbFailtaskitem DbFailtaskitem);

    int updateByCriteria(DbFailtaskitem DbFailtaskitem);

    DbFailtaskitem selectByPrimaryKey(String sid);

    List<DbFailtaskitem> selectAll();
}