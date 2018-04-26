package com.test.ServiceIMPL;

import com.test.Dao.TtDao;
import com.test.DataSource.TargetDataSource;
import com.test.Service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;


@Service
public class TestServiceimpl implements TestService {

    @Autowired
    private TtDao ttDao;



    @Override
    public String t1() {
        return ttDao.selectByPrimaryKey(1l).getT1();
    }

    @Override
    @TargetDataSource(name = "test2")
    public String t2() {
        return ttDao.selectByPrimaryKey(1l).getT1();
    }

    @Override
    @TargetDataSource(name = "test3")
    public String t3() {
        return ttDao.selectByPrimaryKey(1l).getT1();
    }

    @Override
    @Cacheable(value = "keycache")
    public String testCache(String key){
        System.out.println("testCache:" + key);
        return key;
    }
}
