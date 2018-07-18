package com.bean.dao;

import com.bean.model.DbLinioexpresstype;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public interface DbLinioexpresstypeMapper {
    DbLinioexpresstype selectByCriteria(DbLinioexpresstype DbLinioexpresstype);

    void deleteByPrimaryKey(String SID);

    void deleteByCriteria(DbLinioexpresstype DbLinioexpresstype);

    int insertByCriteria(DbLinioexpresstype DbLinioexpresstype);

    int updateByCriteria(DbLinioexpresstype DbLinioexpresstype);

    DbLinioexpresstype selectByPrimaryKey(String sid);

    List<DbLinioexpresstype> selectAll();
}