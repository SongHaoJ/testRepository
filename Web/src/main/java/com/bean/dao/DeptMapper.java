package com.bean.dao;

import com.bean.model.Dept;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public interface DeptMapper {
    Dept selectByCriteria(Dept Dept);

    void deleteByPrimaryKey(String DID);

    void deleteByCriteria(Dept Dept);

    int insertByCriteria(Dept Dept);

    int updateByCriteria(Dept Dept);

    Dept selectByPrimaryKey(String did);

    List<Dept> selectAll();
}