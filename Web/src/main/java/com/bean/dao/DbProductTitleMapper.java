package com.bean.dao;

import com.bean.model.DbProductTitle;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public interface DbProductTitleMapper {
    DbProductTitle selectByCriteria(DbProductTitle DbProductTitle);

    void deleteByPrimaryKey(String SEQUENCEID);

    void deleteByCriteria(DbProductTitle DbProductTitle);

    int insertByCriteria(DbProductTitle DbProductTitle);

    int updateByCriteria(DbProductTitle DbProductTitle);

    DbProductTitle selectByPrimaryKey(String sequenceid);

    List<DbProductTitle> selectAll();
}