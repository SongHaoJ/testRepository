package com.bean.dao;

import com.bean.model.DbTokenconfig;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public interface DbTokenconfigMapper {
    DbTokenconfig selectByCriteria(DbTokenconfig DbTokenconfig);

    void deleteByPrimaryKey(String SID);

    void deleteByCriteria(DbTokenconfig DbTokenconfig);

    int insertByCriteria(DbTokenconfig DbTokenconfig);

    int updateByCriteria(DbTokenconfig DbTokenconfig);

    DbTokenconfig selectByPrimaryKey(String sid);

    List<DbTokenconfig> selectAll();
}