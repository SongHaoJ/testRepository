package com.bean.dao;

import com.bean.model.StatMoneyDaily;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public interface StatMoneyDailyMapper {
    StatMoneyDaily selectByCriteria(StatMoneyDaily StatMoneyDaily);

    void deleteByPrimaryKey(String SEQUENCEID);

    void deleteByCriteria(StatMoneyDaily StatMoneyDaily);

    int insertByCriteria(StatMoneyDaily StatMoneyDaily);

    int updateByCriteria(StatMoneyDaily StatMoneyDaily);

    StatMoneyDaily selectByPrimaryKey(String sequenceid);

    List<StatMoneyDaily> selectAll();
}