package com.bean.dao;

import com.bean.model.Product;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public interface ProductMapper {
    Product selectByCriteria(Product Product);

    void deleteByPrimaryKey(String pid);

    void deleteByCriteria(Product Product);

    int insertByCriteria(Product Product);

    int updateByCriteria(Product Product);

    Product selectByPrimaryKey(Integer pid);

    List<Product> selectAll();
}