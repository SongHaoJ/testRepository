package com.bean.dao;

import com.bean.model.DbEndiciamailpieceshape;
import java.util.List;
import org.springframework.stereotype.Service;

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