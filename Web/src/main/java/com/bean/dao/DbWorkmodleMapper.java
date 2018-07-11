package com.bean.dao;

import com.bean.model.DbWorkmodle;
import java.math.BigDecimal;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public interface DbWorkmodleMapper {
    DbWorkmodle selectByCriteria(DbWorkmodle DbWorkmodle);

    void deleteByPrimaryKey(String SEQUENCEID);

    void deleteByCriteria(DbWorkmodle DbWorkmodle);

    int insertByCriteria(DbWorkmodle DbWorkmodle);

    int updateByCriteria(DbWorkmodle DbWorkmodle);

    DbWorkmodle selectByPrimaryKey(BigDecimal sequenceid);

    List<DbWorkmodle> selectAll();
}