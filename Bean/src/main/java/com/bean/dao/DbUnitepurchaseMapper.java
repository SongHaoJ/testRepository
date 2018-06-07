package com.bean.dao;

import com.bean.model.DbUnitepurchase;
import java.math.BigDecimal;
import java.util.List;

public interface DbUnitepurchaseMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_unitepurchase
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(BigDecimal sequenceid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_unitepurchase
     *
     * @mbg.generated
     */
    int insert(DbUnitepurchase record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_unitepurchase
     *
     * @mbg.generated
     */
    DbUnitepurchase selectByPrimaryKey(BigDecimal sequenceid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_unitepurchase
     *
     * @mbg.generated
     */
    List<DbUnitepurchase> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_unitepurchase
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(DbUnitepurchase record);
}