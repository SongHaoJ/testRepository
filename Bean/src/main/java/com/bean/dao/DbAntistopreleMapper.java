package com.bean.dao;

import com.bean.model.DbAntistoprele;

public interface DbAntistopreleMapper {
    int deleteByPrimaryKey(String sequenceid);

    int insert(DbAntistoprele record);

    int insertSelective(DbAntistoprele record);

    DbAntistoprele selectByPrimaryKey(String sequenceid);

    int updateByPrimaryKeySelective(DbAntistoprele record);

    int updateByPrimaryKeyWithBLOBs(DbAntistoprele record);

    int updateByPrimaryKey(DbAntistoprele record);
}