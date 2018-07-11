package com.bean.dao;

import com.bean.model.DbAddfunction;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public interface DbAddfunctionMapper {
    DbAddfunction selectByCriteria(DbAddfunction DbAddfunction);

    void deleteByPrimaryKey(String SEQUENCEID);

    void deleteByCriteria(DbAddfunction DbAddfunction);

    int insertByCriteria(DbAddfunction DbAddfunction);

    int updateByCriteria(DbAddfunction DbAddfunction);

    DbAddfunction selectByPrimaryKey(String sequenceid);

    List<DbAddfunction> selectAll();
}