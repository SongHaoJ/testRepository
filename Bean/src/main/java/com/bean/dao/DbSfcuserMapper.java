package com.bean.dao;

import com.bean.model.DbSfcuser;
import java.util.List;

public interface DbSfcuserMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_sfcuser
     *
     * @mbg.generated
     */
    int insert(DbSfcuser record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_sfcuser
     *
     * @mbg.generated
     */
    List<DbSfcuser> selectAll();
}