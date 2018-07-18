package com.service;

import com.bean.yml.LazadaYml;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

//Srping 不会为线程自动注入，所以手动获取
@Component
public class GetOrderService {

    private static LazadaYml lazadaYml;

    private static LazadaService lazadaService;



    public static LazadaService getLazadaService() {
        return lazadaService;
    }

    public static LazadaYml getLazadaYml() {
        return lazadaYml;
    }


    @Resource
    public void setLazadaService(LazadaService service) {
        GetOrderService.lazadaService = service;
    }

    @Resource
    public void setLazadaYml(LazadaYml lazadaYml) {
        GetOrderService.lazadaYml = lazadaYml;
    }
}
