package com.bean.dao;

import com.bean.model.DbOpermenuTmp;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public interface DbOpermenuTmpMapper {
    DbOpermenuTmp selectByCriteria(DbOpermenuTmp DbOpermenuTmp);

    void deleteByPrimaryKey(String OPER);

    void deleteByCriteria(DbOpermenuTmp DbOpermenuTmp);

    int insertByCriteria(DbOpermenuTmp DbOpermenuTmp);

    int updateByCriteria(DbOpermenuTmp DbOpermenuTmp);

    DbOpermenuTmp selectByPrimaryKey(String oper);

    List<DbOpermenuTmp> selectAll();
}