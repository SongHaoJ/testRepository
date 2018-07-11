package com.config;

enum ExpressConfig {

    EdisEbay("EdisEbay", 66);

    private String name;
    private int code;

    private ExpressConfig(String name, int code) {
        this.name = name;
        this.code = code;
    }

    private void setName(String name){
        this.name=name;
    }
    private void setCode(int code){
        this.code=code;
    }
    public String getName(){
        return name;
    }
    public int getCode(){
        return code;
    }

}
