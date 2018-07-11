package com.bean.dao;

import com.bean.model.StatProductdetilDaily;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public interface StatProductdetilDailyMapper {
    StatProductdetilDaily selectByCriteria(StatProductdetilDaily StatProductdetilDaily);

    void deleteByPrimaryKey(String SEQUENCEID);

    void deleteByCriteria(StatProductdetilDaily StatProductdetilDaily);

    int insertByCriteria(StatProductdetilDaily StatProductdetilDaily);

    int updateByCriteria(StatProductdetilDaily StatProductdetilDaily);

    StatProductdetilDaily selectByPrimaryKey(String sequenceid);

    List<StatProductdetilDaily> selectAll();
}