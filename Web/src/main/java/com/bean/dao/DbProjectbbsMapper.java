package com.bean.dao;

import com.bean.model.DbProjectbbs;
import java.math.BigDecimal;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public interface DbProjectbbsMapper {
    DbProjectbbs selectByCriteria(DbProjectbbs DbProjectbbs);

    void deleteByPrimaryKey(String SEQUENCEID);

    void deleteByCriteria(DbProjectbbs DbProjectbbs);

    int insertByCriteria(DbProjectbbs DbProjectbbs);

    int updateByCriteria(DbProjectbbs DbProjectbbs);

    DbProjectbbs selectByPrimaryKey(BigDecimal sequenceid);

    List<DbProjectbbs> selectAll();
}