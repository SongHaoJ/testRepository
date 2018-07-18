package com.bean.dao;

import com.bean.model.DbRepeatproductlocation;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public interface DbRepeatproductlocationMapper {
    DbRepeatproductlocation selectByCriteria(DbRepeatproductlocation DbRepeatproductlocation);

    void deleteByPrimaryKey(String ID);

    void deleteByCriteria(DbRepeatproductlocation DbRepeatproductlocation);

    int insertByCriteria(DbRepeatproductlocation DbRepeatproductlocation);

    int updateByCriteria(DbRepeatproductlocation DbRepeatproductlocation);

    DbRepeatproductlocation selectByPrimaryKey(Long id);

    List<DbRepeatproductlocation> selectAll();
}