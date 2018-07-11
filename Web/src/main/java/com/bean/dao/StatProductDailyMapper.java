package com.bean.dao;

import com.bean.model.StatProductDaily;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public interface StatProductDailyMapper {
    StatProductDaily selectByCriteria(StatProductDaily StatProductDaily);

    void deleteByPrimaryKey(String SEQUENCEID);

    void deleteByCriteria(StatProductDaily StatProductDaily);

    int insertByCriteria(StatProductDaily StatProductDaily);

    int updateByCriteria(StatProductDaily StatProductDaily);

    StatProductDaily selectByPrimaryKey(String sequenceid);

    List<StatProductDaily> selectAll();
}