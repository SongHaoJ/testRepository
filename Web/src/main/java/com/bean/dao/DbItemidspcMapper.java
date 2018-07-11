package com.bean.dao;

import com.bean.model.DbItemidspc;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public interface DbItemidspcMapper {
    DbItemidspc selectByCriteria(DbItemidspc DbItemidspc);

    void deleteByPrimaryKey(String SID);

    void deleteByCriteria(DbItemidspc DbItemidspc);

    int insertByCriteria(DbItemidspc DbItemidspc);

    int updateByCriteria(DbItemidspc DbItemidspc);

    DbItemidspc selectByPrimaryKey(String sid);

    List<DbItemidspc> selectAll();
}