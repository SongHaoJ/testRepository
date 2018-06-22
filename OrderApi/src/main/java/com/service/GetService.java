package com.service;

import org.springframework.stereotype.Component;

import javax.annotation.Resource;
//Srping 不会为线程自动注入，所以手动获取
@Component
public class GetService {

    private static LazadaService service;

    public static LazadaService getService() {
        return service;
    }
    @Resource
    public void setService(LazadaService service) {
        GetService.service = service;
    }
}
