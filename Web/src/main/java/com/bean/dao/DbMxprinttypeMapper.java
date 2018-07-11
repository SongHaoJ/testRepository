package com.bean.dao;

import com.bean.model.DbMxprinttype;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public interface DbMxprinttypeMapper {
    DbMxprinttype selectByCriteria(DbMxprinttype DbMxprinttype);

    void deleteByPrimaryKey(String ID);

    void deleteByCriteria(DbMxprinttype DbMxprinttype);

    int insertByCriteria(DbMxprinttype DbMxprinttype);

    int updateByCriteria(DbMxprinttype DbMxprinttype);

    DbMxprinttype selectByPrimaryKey(Integer id);

    List<DbMxprinttype> selectAll();
}