package com.bean.dao;

import com.bean.model.DbInstocklog;
import java.util.List;

public interface DbInstocklogMapper {
    List<DbInstocklog> selectAll();
}