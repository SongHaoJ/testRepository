package com.bean.dao;

import com.bean.model.DbAmazonsell;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public interface DbAmazonsellMapper {
    DbAmazonsell selectByCriteria(DbAmazonsell DbAmazonsell);

    void deleteByPrimaryKey(String SID);

    void deleteByCriteria(DbAmazonsell DbAmazonsell);

    int insertByCriteria(DbAmazonsell DbAmazonsell);

    int updateByCriteria(DbAmazonsell DbAmazonsell);

    DbAmazonsell selectByPrimaryKey(String sid);

    List<DbAmazonsell> selectAll();
}