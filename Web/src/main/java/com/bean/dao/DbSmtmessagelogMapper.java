package com.bean.dao;

import com.bean.model.DbSmtmessagelog;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public interface DbSmtmessagelogMapper {
    DbSmtmessagelog selectByCriteria(DbSmtmessagelog DbSmtmessagelog);

    void deleteByPrimaryKey(String SEQUENCEID);

    void deleteByCriteria(DbSmtmessagelog DbSmtmessagelog);

    int insertByCriteria(DbSmtmessagelog DbSmtmessagelog);

    int updateByCriteria(DbSmtmessagelog DbSmtmessagelog);

    DbSmtmessagelog selectByPrimaryKey(String sequenceid);

    List<DbSmtmessagelog> selectAll();
}