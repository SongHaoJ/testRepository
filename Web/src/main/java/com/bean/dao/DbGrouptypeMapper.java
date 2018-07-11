package com.bean.dao;

import com.bean.model.DbGrouptype;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public interface DbGrouptypeMapper {
    DbGrouptype selectByCriteria(DbGrouptype DbGrouptype);

    void deleteByPrimaryKey(String GROUPID);

    void deleteByCriteria(DbGrouptype DbGrouptype);

    int insertByCriteria(DbGrouptype DbGrouptype);

    int updateByCriteria(DbGrouptype DbGrouptype);

    DbGrouptype selectByPrimaryKey(String groupid);

    List<DbGrouptype> selectAll();
}