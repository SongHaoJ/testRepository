package com.bean.dao;

import com.bean.model.DbChildsku;
import java.math.BigDecimal;
import java.util.List;

public interface DbChildskuMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_childsku
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(BigDecimal sid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_childsku
     *
     * @mbg.generated
     */
    int insert(DbChildsku record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_childsku
     *
     * @mbg.generated
     */
    DbChildsku selectByPrimaryKey(BigDecimal sid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_childsku
     *
     * @mbg.generated
     */
    List<DbChildsku> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_childsku
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(DbChildsku record);
}