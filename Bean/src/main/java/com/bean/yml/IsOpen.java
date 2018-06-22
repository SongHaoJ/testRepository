package com.bean.yml;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Data
@Component
@ConfigurationProperties(prefix = "is-open")
public class IsOpen {

    private static Boolean lazada;

    public static Boolean getLazada() {
        return lazada;
    }
}
