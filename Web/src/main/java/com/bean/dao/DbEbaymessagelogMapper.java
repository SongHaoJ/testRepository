package com.bean.dao;

import com.bean.model.DbEbaymessagelog;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public interface DbEbaymessagelogMapper {
    DbEbaymessagelog selectByCriteria(DbEbaymessagelog DbEbaymessagelog);

    void deleteByPrimaryKey(String SEQUENCEID);

    void deleteByCriteria(DbEbaymessagelog DbEbaymessagelog);

    int insertByCriteria(DbEbaymessagelog DbEbaymessagelog);

    int updateByCriteria(DbEbaymessagelog DbEbaymessagelog);

    DbEbaymessagelog selectByPrimaryKey(String sequenceid);

    List<DbEbaymessagelog> selectAll();
}