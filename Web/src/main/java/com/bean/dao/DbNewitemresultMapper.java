package com.bean.dao;

import com.bean.model.DbNewitemresult;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public interface DbNewitemresultMapper {
    DbNewitemresult selectByCriteria(DbNewitemresult DbNewitemresult);

    void deleteByPrimaryKey(String SID);

    void deleteByCriteria(DbNewitemresult DbNewitemresult);

    int insertByCriteria(DbNewitemresult DbNewitemresult);

    int updateByCriteria(DbNewitemresult DbNewitemresult);

    DbNewitemresult selectByPrimaryKey(String sid);

    List<DbNewitemresult> selectAll();
}