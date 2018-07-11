package com.bean.dao;

import com.bean.model.DbEdisexpresstype;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public interface DbEdisexpresstypeMapper {
    DbEdisexpresstype selectByCriteria(DbEdisexpresstype DbEdisexpresstype);

    void deleteByPrimaryKey(String SID);

    void deleteByCriteria(DbEdisexpresstype DbEdisexpresstype);

    int insertByCriteria(DbEdisexpresstype DbEdisexpresstype);

    int updateByCriteria(DbEdisexpresstype DbEdisexpresstype);

    DbEdisexpresstype selectByPrimaryKey(String sid);

    List<DbEdisexpresstype> selectAll();
}