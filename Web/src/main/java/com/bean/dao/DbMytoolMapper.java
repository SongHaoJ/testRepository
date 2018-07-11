package com.bean.dao;

import com.bean.model.DbMytool;
import java.math.BigDecimal;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public interface DbMytoolMapper {
    DbMytool selectByCriteria(DbMytool DbMytool);

    void deleteByPrimaryKey(String SEQUENCEID);

    void deleteByCriteria(DbMytool DbMytool);

    int insertByCriteria(DbMytool DbMytool);

    int updateByCriteria(DbMytool DbMytool);

    DbMytool selectByPrimaryKey(BigDecimal sequenceid);

    List<DbMytool> selectAll();
}