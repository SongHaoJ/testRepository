package com.bean.dao;

import com.bean.model.DbPostitemTemp;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public interface DbPostitemTempMapper {
    DbPostitemTemp selectByCriteria(DbPostitemTemp DbPostitemTemp);

    void deleteByPrimaryKey(String SID);

    void deleteByCriteria(DbPostitemTemp DbPostitemTemp);

    int insertByCriteria(DbPostitemTemp DbPostitemTemp);

    int updateByCriteria(DbPostitemTemp DbPostitemTemp);

    DbPostitemTemp selectByPrimaryKey(String sid);

    List<DbPostitemTemp> selectAll();
}