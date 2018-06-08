package com.bean.dao;

import com.bean.model.DbForumlist;
import java.util.List;

public interface DbForumlistMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_forumlist
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(String sequenceid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_forumlist
     *
     * @mbg.generated
     */
    int insert(DbForumlist record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_forumlist
     *
     * @mbg.generated
     */
    DbForumlist selectByPrimaryKey(String sequenceid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_forumlist
     *
     * @mbg.generated
     */
    List<DbForumlist> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_forumlist
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(DbForumlist record);
}