package com.bean.plugin;

import org.mybatis.generator.api.PluginAdapter;

import java.util.List;

/**
 * 修改mapper.xml,生成需要的sql块或者语句(对应dao接口的方法)
 */
public class MyPlugin extends PluginAdapter {

    @Override
    public boolean validate(List<String> warnings) {

        return true;
    }


}