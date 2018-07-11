package com.bean.dao;

import com.bean.model.DbTaskcustomertypelog;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public interface DbTaskcustomertypelogMapper {
    DbTaskcustomertypelog selectByCriteria(DbTaskcustomertypelog DbTaskcustomertypelog);

    void deleteByPrimaryKey(String SEQUENCEID);

    void deleteByCriteria(DbTaskcustomertypelog DbTaskcustomertypelog);

    int insertByCriteria(DbTaskcustomertypelog DbTaskcustomertypelog);

    int updateByCriteria(DbTaskcustomertypelog DbTaskcustomertypelog);

    DbTaskcustomertypelog selectByPrimaryKey(String sequenceid);

    List<DbTaskcustomertypelog> selectAll();
}