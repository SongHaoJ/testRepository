package com.bean.dao;

import com.bean.model.DbSmtmessage;
import java.util.List;
import org.springframework.stereotype.Service;

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