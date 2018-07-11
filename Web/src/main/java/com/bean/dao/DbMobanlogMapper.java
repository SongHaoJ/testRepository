package com.bean.dao;

import com.bean.model.DbMobanlog;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public interface DbMobanlogMapper {
    DbMobanlog selectByCriteria(DbMobanlog DbMobanlog);

    void deleteByPrimaryKey(String SEQUENCEID);

    void deleteByCriteria(DbMobanlog DbMobanlog);

    int insertByCriteria(DbMobanlog DbMobanlog);

    int updateByCriteria(DbMobanlog DbMobanlog);

    DbMobanlog selectByPrimaryKey(String sequenceid);

    List<DbMobanlog> selectAll();
}