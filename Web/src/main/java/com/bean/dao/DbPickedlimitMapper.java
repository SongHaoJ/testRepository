package com.bean.dao;

import com.bean.model.DbPickedlimit;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public interface DbPickedlimitMapper {
    DbPickedlimit selectByCriteria(DbPickedlimit DbPickedlimit);

    void deleteByPrimaryKey(String ID);

    void deleteByCriteria(DbPickedlimit DbPickedlimit);

    int insertByCriteria(DbPickedlimit DbPickedlimit);

    int updateByCriteria(DbPickedlimit DbPickedlimit);

    DbPickedlimit selectByPrimaryKey(Integer id);

    List<DbPickedlimit> selectAll();
}