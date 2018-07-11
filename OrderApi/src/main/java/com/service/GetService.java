package com.service;

import com.bean.yml.LazadaYml;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

//Srping 不会为线程自动注入，所以手动获取
@Component
public class GetService {

    private static LazadaYml yml;

    private static LazadaService lazadaService;

    private static EdisEbayService edisEbayService;



    public static LazadaService getLazadaService() {
        return lazadaService;
    }

    public static LazadaYml getYml() {
        return yml;
    }

    public static EdisEbayService getEdisEbayService(){return edisEbayService;}





    @Resource
    public void setLazadaService(LazadaService service) {
        GetService.lazadaService = service;
    }

    @Resource
    public void setYml(LazadaYml yml) {
        GetService.yml = yml;
    }

    @Resource
    public void setEdisEbayService(EdisEbayService service){GetService.edisEbayService = service;}
}
