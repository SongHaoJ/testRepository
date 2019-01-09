package com.bean.util;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.util.Collection;
import java.util.List;
import java.util.Map;

public class CommonUtil {


    public static boolean isEmpty(Object obj) {
        if (obj == null) {
            return true;
        } else if (obj instanceof Collection) {
            return ((Collection) obj).isEmpty();
        } else if (obj instanceof Map) {
            return ((Map) obj).isEmpty();
        } else if (obj instanceof CharSequence) {
            return ((CharSequence) obj).length() == 0;
        } else if (obj.getClass().isArray()) {
            return Array.getLength(obj) == 0;
        }
        return false;
    }

    public static boolean numberIsEmpty(Number number) {
        if (number == null) {
            return true;
        } else if (number.doubleValue() == 0) {
            return true;
        }
        return false;
    }

    /**
     * 传入对象属性是否全部为空
     *
     * @param obj   判断的对象
     * @param names 忽略的属性 null判断全部
     * @return
     */
    public static boolean classIsEmpty(Object obj, List names) {
        if (obj == null) {
            return true;
        }
        Class clazz = obj.getClass();
        Field[] fs = clazz.getDeclaredFields();
        boolean result = true;
        boolean b = true;
        if (isEmpty(names)) {
            b = false;
        }
        for (Field field : fs) {
            field.setAccessible(true);
            if (b && names.contains(field.getName())) {
                continue;
            }
            try {
                if (field.get(obj) != null && field.get(obj) != "" && !"null".equalsIgnoreCase((String) field.get(obj))) {
                    result = false;
                }
            } catch (Exception e) {
            }
        }
        return result;
    }

    /**
     * 传入的对象属性是否存在空值
     *
     * @param obj   判断的对象
     * @param names 判断的属性 null判断全部
     * @return
     */
    public static boolean classHasNoEmptyInChoose(Object obj, List names) {
        if (obj == null) {
            return false;
        }
        Class clazz = obj.getClass();
        Field[] fs = clazz.getDeclaredFields();
        boolean result = true;
        boolean b = true;
        if (isEmpty(names)) {
            b = false;
        }
        for (Field field : fs) {
            field.setAccessible(true);
            if (b && !names.contains(field.getName())) {
                continue;
            }
            try {
                if (field.get(obj) == null || field.get(obj) == "" || "null".equalsIgnoreCase((String) field.get(obj))) {
                    result = false;
                }
            } catch (Exception e) {
            }
        }
        return result;
    }

    public static boolean isJSON(String jsonInString) {
        System.out.println(jsonInString);
        if (jsonInString == null) {
            return false;
        }
        try {
            final ObjectMapper mapper = new ObjectMapper();
            mapper.readTree(jsonInString);
            return true;
        } catch (IOException e) {
            return false;
        }
    }
}
