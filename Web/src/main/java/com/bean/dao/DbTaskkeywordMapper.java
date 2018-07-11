package com.bean.dao;

import com.bean.model.DbTaskkeyword;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public interface DbTaskkeywordMapper {
    DbTaskkeyword selectByCriteria(DbTaskkeyword DbTaskkeyword);

    void deleteByPrimaryKey(String SID);

    void deleteByCriteria(DbTaskkeyword DbTaskkeyword);

    int insertByCriteria(DbTaskkeyword DbTaskkeyword);

    int updateByCriteria(DbTaskkeyword DbTaskkeyword);

    DbTaskkeyword selectByPrimaryKey(String sid);

    List<DbTaskkeyword> selectAll();
}