package com.bean.dao;

import com.bean.model.DbProtocolLog;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public interface DbProtocolLogMapper {
    DbProtocolLog selectByCriteria(DbProtocolLog DbProtocolLog);

    void deleteByPrimaryKey(String SEQUENCEID);

    void deleteByCriteria(DbProtocolLog DbProtocolLog);

    int insertByCriteria(DbProtocolLog DbProtocolLog);

    int updateByCriteria(DbProtocolLog DbProtocolLog);

    DbProtocolLog selectByPrimaryKey(String sequenceid);

    List<DbProtocolLog> selectAll();
}