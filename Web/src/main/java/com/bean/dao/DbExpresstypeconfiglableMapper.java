package com.bean.dao;

import com.bean.model.DbExpresstypeconfiglable;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public interface DbExpresstypeconfiglableMapper {
    DbExpresstypeconfiglable selectByCriteria(DbExpresstypeconfiglable DbExpresstypeconfiglable);

    void deleteByPrimaryKey(String EXPRESSTYPEID);

    void deleteByCriteria(DbExpresstypeconfiglable DbExpresstypeconfiglable);

    int insertByCriteria(DbExpresstypeconfiglable DbExpresstypeconfiglable);

    int updateByCriteria(DbExpresstypeconfiglable DbExpresstypeconfiglable);

    DbExpresstypeconfiglable selectByPrimaryKey(String expresstypeid);

    List<DbExpresstypeconfiglable> selectAll();
}