package com.bean.dao;

import com.bean.model.StatCountryDaily;
import java.util.List;
import org.springframework.stereotype.Service;

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