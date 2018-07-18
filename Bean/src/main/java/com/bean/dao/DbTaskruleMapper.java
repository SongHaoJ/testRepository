package com.bean.dao;

import com.bean.model.DbTaskrule;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DbTaskruleMapper {
    DbTaskrule selectByCriteria(DbTaskrule DbTaskrule);

    void deleteByPrimaryKey(String ID);

    void deleteByCriteria(DbTaskrule DbTaskrule);

    int insertByCriteria(DbTaskrule DbTaskrule);

    int updateByCriteria(DbTaskrule DbTaskrule);

    DbTaskrule selectByPrimaryKey(Long id);

    List<DbTaskrule> selectAll();
}