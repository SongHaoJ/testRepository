package com.bean.dao;

import com.bean.model.DbProtocol;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DbProtocolMapper {
    DbProtocol selectByCriteria(DbProtocol DbProtocol);

    void deleteByPrimaryKey(String SEQUENCEID);

    void deleteByCriteria(DbProtocol DbProtocol);

    int insertByCriteria(DbProtocol DbProtocol);

    int updateByCriteria(DbProtocol DbProtocol);

    DbProtocol selectByPrimaryKey(String sequenceid);

    List<DbProtocol> selectAll();
}