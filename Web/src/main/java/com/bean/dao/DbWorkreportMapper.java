package com.bean.dao;

import com.bean.model.DbWorkreport;
import java.math.BigDecimal;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public interface DbWorkreportMapper {
    DbWorkreport selectByCriteria(DbWorkreport DbWorkreport);

    void deleteByPrimaryKey(String SEQUENCEID);

    void deleteByCriteria(DbWorkreport DbWorkreport);

    int insertByCriteria(DbWorkreport DbWorkreport);

    int updateByCriteria(DbWorkreport DbWorkreport);

    DbWorkreport selectByPrimaryKey(BigDecimal sequenceid);

    List<DbWorkreport> selectAll();
}