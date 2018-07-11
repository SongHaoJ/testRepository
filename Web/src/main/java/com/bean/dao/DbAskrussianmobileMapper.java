package com.bean.dao;

import com.bean.model.DbAskrussianmobile;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public interface DbAskrussianmobileMapper {
    DbAskrussianmobile selectByCriteria(DbAskrussianmobile DbAskrussianmobile);

    void deleteByPrimaryKey(String ORDERID);

    void deleteByCriteria(DbAskrussianmobile DbAskrussianmobile);

    int insertByCriteria(DbAskrussianmobile DbAskrussianmobile);

    int updateByCriteria(DbAskrussianmobile DbAskrussianmobile);

    DbAskrussianmobile selectByPrimaryKey(String orderid);

    List<DbAskrussianmobile> selectAll();
}