package com.bean.dao;

import com.bean.model.DbSmspromptlog;
import java.util.List;

public interface DbSmspromptlogMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_smspromptlog
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(String sequenceid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_smspromptlog
     *
     * @mbg.generated
     */
    int insert(DbSmspromptlog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_smspromptlog
     *
     * @mbg.generated
     */
    DbSmspromptlog selectByPrimaryKey(String sequenceid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_smspromptlog
     *
     * @mbg.generated
     */
    List<DbSmspromptlog> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_smspromptlog
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(DbSmspromptlog record);
}