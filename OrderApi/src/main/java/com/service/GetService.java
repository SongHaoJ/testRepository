package com.service;

import com.bean.yml.LazadaYml;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

//Srping 不会为线程自动注入，所以手动获取
@Component
public class GetService {

    private static LazadaYml yml;

    private static LazadaService service;

    public static LazadaService getService() {
        return service;
    }

    public static LazadaYml getYml() {
        return yml;
    }

    @Resource
    public void setService(LazadaService service) {
        GetService.service = service;
    }

    @Resource
    public void setService(LazadaYml yml) {
        GetService.yml = yml;
    }
}
