package com.bean.dao;

import com.bean.model.DbOrderlableTransform;
import java.util.List;

public interface DbOrderlableTransformMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_orderlable_transform
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_orderlable_transform
     *
     * @mbg.generated
     */
    int insert(DbOrderlableTransform record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_orderlable_transform
     *
     * @mbg.generated
     */
    DbOrderlableTransform selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_orderlable_transform
     *
     * @mbg.generated
     */
    List<DbOrderlableTransform> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_orderlable_transform
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(DbOrderlableTransform record);
}