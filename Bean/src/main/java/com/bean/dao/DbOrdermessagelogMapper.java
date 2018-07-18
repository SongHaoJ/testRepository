package com.bean.dao;

import com.bean.model.DbOrdermessagelog;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DbOrdermessagelogMapper {
    DbOrdermessagelog selectByCriteria(DbOrdermessagelog DbOrdermessagelog);

    void deleteByPrimaryKey(String SID);

    void deleteByCriteria(DbOrdermessagelog DbOrdermessagelog);

    int insertByCriteria(DbOrdermessagelog DbOrdermessagelog);

    int updateByCriteria(DbOrdermessagelog DbOrdermessagelog);

    DbOrdermessagelog selectByPrimaryKey(String sid);

    List<DbOrdermessagelog> selectAll();
}