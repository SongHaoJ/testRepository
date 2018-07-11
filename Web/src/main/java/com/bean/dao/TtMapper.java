package com.bean.dao;

import com.bean.model.Tt;
import java.math.BigDecimal;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public interface TtMapper {
    Tt selectByCriteria(Tt Tt);

    void deleteByPrimaryKey(String id);

    void deleteByCriteria(Tt Tt);

    int insertByCriteria(Tt Tt);

    int updateByCriteria(Tt Tt);

    Tt selectByPrimaryKey(BigDecimal id);

    List<Tt> selectAll();
}