package com.bean.yml;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Data
@Component
@ConfigurationProperties(prefix = "Lazada")
public class LazadaYml {

    private static String appkey;
    private static String secret;
    private static String fershHost;

    public static String getAppkey(){
        return appkey;
    }
    public static String getSecret(){
        return secret;
    }
    public static String getFershHost(){
        return fershHost;
    }


}
