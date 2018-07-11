package com.bean.dao;

import com.bean.model.DbPostdetail;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public interface DbPostdetailMapper {
    DbPostdetail selectByCriteria(DbPostdetail DbPostdetail);

    void deleteByPrimaryKey(String SID);

    void deleteByCriteria(DbPostdetail DbPostdetail);

    int insertByCriteria(DbPostdetail DbPostdetail);

    int updateByCriteria(DbPostdetail DbPostdetail);

    DbPostdetail selectByPrimaryKey(String sid);

    List<DbPostdetail> selectAll();
}