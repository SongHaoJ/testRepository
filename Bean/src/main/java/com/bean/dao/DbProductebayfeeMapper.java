package com.bean.dao;

import com.bean.model.DbProductebayfee;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

@Service
public interface DbProductebayfeeMapper {
    DbProductebayfee selectByCriteria(DbProductebayfee DbProductebayfee);

    void deleteByPrimaryKey(String SID);

    void deleteByCriteria(DbProductebayfee DbProductebayfee);

    int insertByCriteria(DbProductebayfee DbProductebayfee);

    int updateByCriteria(DbProductebayfee DbProductebayfee);

    DbProductebayfee selectByPrimaryKey(BigDecimal sid);

    List<DbProductebayfee> selectAll();
}