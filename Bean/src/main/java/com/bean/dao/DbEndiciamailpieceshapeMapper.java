package com.bean.dao;

import com.bean.model.DbEndiciamailpieceshape;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DbEndiciamailpieceshapeMapper {
    DbEndiciamailpieceshape selectByCriteria(DbEndiciamailpieceshape DbEndiciamailpieceshape);

    void deleteByPrimaryKey(String SID);

    void deleteByCriteria(DbEndiciamailpieceshape DbEndiciamailpieceshape);

    int insertByCriteria(DbEndiciamailpieceshape DbEndiciamailpieceshape);

    int updateByCriteria(DbEndiciamailpieceshape DbEndiciamailpieceshape);

    DbEndiciamailpieceshape selectByPrimaryKey(String sid);

    List<DbEndiciamailpieceshape> selectAll();
}