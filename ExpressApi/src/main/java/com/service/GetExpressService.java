package com.service;

import com.bean.yml.EdisYml;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

//Srping 不会为线程自动注入，所以手动获取
@Component
public class GetExpressService {

    private static EdisYml edisYml;

    private static EdisEbayService service;

    public static EdisYml getEdisYml() {
        return edisYml;
    }

    public static EdisEbayService getService() {
        return service;
    }

    @Resource
    public void setEdisYml(EdisYml edisYml) {
        GetExpressService.edisYml = edisYml;
    }

    @Resource
    public void setService(EdisEbayService service) {
        GetExpressService.service = service;
    }
}
