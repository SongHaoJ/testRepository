package com.bean.dao;

import com.bean.model.StatCountryDaily;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface StatCountryDailyMapper {
    StatCountryDaily selectByCriteria(StatCountryDaily StatCountryDaily);

    void deleteByPrimaryKey(String SEQUENCEID);

    void deleteByCriteria(StatCountryDaily StatCountryDaily);

    int insertByCriteria(StatCountryDaily StatCountryDaily);

    int updateByCriteria(StatCountryDaily StatCountryDaily);

    StatCountryDaily selectByPrimaryKey(String sequenceid);

    List<StatCountryDaily> selectAll();
}