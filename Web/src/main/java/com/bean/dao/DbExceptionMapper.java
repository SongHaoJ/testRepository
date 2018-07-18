package com.bean.dao;

import com.bean.model.DbException;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

@Service
public interface DbExceptionMapper {
    DbException selectByCriteria(DbException DbException);

    void deleteByPrimaryKey(String COMPANYID);

    void deleteByCriteria(DbException DbException);

    int insertByCriteria(DbException DbException);

    int updateByCriteria(DbException DbException);

    DbException selectByPrimaryKey(@Param("companyid") Long companyid, @Param("shopid") Long shopid, @Param("platformid") Long platformid, @Param("platformorderid") String platformorderid);

    List<DbException> selectAll();
}