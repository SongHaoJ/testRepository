package com.bean.orderUtil;

public class LazadaUtil {
    //TODO yml
    private String fershHost = "";


    public static String getScApiHost(String countryCode) {
        if ("my".equals(countryCode)) {
            return "https://api.lazada.com.my/rest";
        } else if ("id".equals(countryCode)) {
            return "https://api.lazada.co.id/rest";
        } else if ("th".equals(countryCode)) {
            return "https://api.lazada.co.th/rest";
        } else if ("ph".equals(countryCode)) {
            return "https://api.lazada.com.ph/rest";
        } else if ("vn".equals(countryCode)) {
            return "https://api.lazada.vn/rest";
        } else {
            return "https://api.lazada.sg/rest";
        }
    }

}
