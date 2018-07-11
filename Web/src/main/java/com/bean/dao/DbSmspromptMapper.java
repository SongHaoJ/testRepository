package com.bean.dao;

import com.bean.model.DbSmsprompt;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public interface DbSmspromptMapper {
    DbSmsprompt selectByCriteria(DbSmsprompt DbSmsprompt);

    void deleteByPrimaryKey(String SEQUENCEID);

    void deleteByCriteria(DbSmsprompt DbSmsprompt);

    int insertByCriteria(DbSmsprompt DbSmsprompt);

    int updateByCriteria(DbSmsprompt DbSmsprompt);

    DbSmsprompt selectByPrimaryKey(String sequenceid);

    List<DbSmsprompt> selectAll();
}