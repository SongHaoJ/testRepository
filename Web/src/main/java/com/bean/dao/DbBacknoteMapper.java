package com.bean.dao;

import com.bean.model.DbBacknote;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public interface DbBacknoteMapper {
    DbBacknote selectByCriteria(DbBacknote DbBacknote);

    void deleteByPrimaryKey(String SEQUENCEID);

    void deleteByCriteria(DbBacknote DbBacknote);

    int insertByCriteria(DbBacknote DbBacknote);

    int updateByCriteria(DbBacknote DbBacknote);

    DbBacknote selectByPrimaryKey(String sequenceid);

    List<DbBacknote> selectAll();
}