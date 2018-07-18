package com.bean.dao;

import com.bean.model.DbSmtmessage;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DbSmtmessageMapper {
    DbSmtmessage selectByCriteria(DbSmtmessage DbSmtmessage);

    void deleteByPrimaryKey(String SID);

    void deleteByCriteria(DbSmtmessage DbSmtmessage);

    int insertByCriteria(DbSmtmessage DbSmtmessage);

    int updateByCriteria(DbSmtmessage DbSmtmessage);

    DbSmtmessage selectByPrimaryKey(String sid);

    List<DbSmtmessage> selectAll();
}