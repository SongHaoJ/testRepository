package com.bean.dao;

import com.bean.model.DbAlifeedbackorder;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public interface DbAlifeedbackorderMapper {
    DbAlifeedbackorder selectByCriteria(DbAlifeedbackorder DbAlifeedbackorder);

    void deleteByPrimaryKey(String TRADEID);

    void deleteByCriteria(DbAlifeedbackorder DbAlifeedbackorder);

    int insertByCriteria(DbAlifeedbackorder DbAlifeedbackorder);

    int updateByCriteria(DbAlifeedbackorder DbAlifeedbackorder);

    DbAlifeedbackorder selectByPrimaryKey(String tradeid);

    List<DbAlifeedbackorder> selectAll();
}