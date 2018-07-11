package com.bean.dao;

import com.bean.model.Emp;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public interface EmpMapper {
    Emp selectByCriteria(Emp Emp);

    void deleteByPrimaryKey(String EID);

    void deleteByCriteria(Emp Emp);

    int insertByCriteria(Emp Emp);

    int updateByCriteria(Emp Emp);

    Emp selectByPrimaryKey(String eid);

    List<Emp> selectAll();
}