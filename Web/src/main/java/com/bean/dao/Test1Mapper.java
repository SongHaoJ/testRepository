package com.bean.dao;

import com.bean.model.Test1;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public interface Test1Mapper {
    Test1 selectByCriteria(Test1 Test1);

    void deleteByPrimaryKey(String id);

    void deleteByCriteria(Test1 Test1);

    int insertByCriteria(Test1 Test1);

    int updateByCriteria(Test1 Test1);

    Test1 selectByPrimaryKey(Integer id);

    List<Test1> selectAll();
}