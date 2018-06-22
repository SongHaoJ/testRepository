package com.controller;

import com.threadModel.ThreadModel;
import org.springframework.stereotype.Component;

import java.util.HashMap;

@Component
public class Priority {
    /**
     * 记录线程每个下载线程执行的任务数量,分配优先级
     * map中记录 name，number
     * (name为All，记录总数量)
     */
    private static HashMap<String, Long> orderThreadNumber;

    static {
        orderThreadNumber = new HashMap<>();
        orderThreadNumber.put("ALL", 0L);
    }


    public static void changePriority() {
        ThreadModel tm = (ThreadModel) Thread.currentThread();
        //status:1、start   2、end
        int status = tm.getStatus();
        if (status == 1) {
            //status==1,线程刚开始运行，需要设置优先级
            setPriority(tm);

        } else if (status == 2) {
            //status==2,,线程运行完毕，更新优先级数据
            updatePriority(tm);

        } else {
            //就俩状态，要是到这。。。。
            tm.setStop(true);
        }


    }

    private static void setPriority(ThreadModel tm) {
        String threadType = tm.getThreadType();
        String type = tm.getType();
        Long all = orderThreadNumber.get("ALL");
        if ("order".equals(threadType)) {
            Long number = orderThreadNumber.get(type);
            int pri = Integer.valueOf(Long.toString(number / all));
            if (pri < 1) {
                tm.setPriority(Thread.MIN_PRIORITY);
            } else if (pri > 10) {
                tm.setPriority(Thread.MAX_PRIORITY);
            } else {
                tm.setPriority(pri);
            }
        } else {
            //其他类型
            tm.setPriority(Thread.NORM_PRIORITY);
        }
    }

    private static void updatePriority(ThreadModel tm) {
        String threadType = tm.getThreadType();
        String type = tm.getType();
        Long taskNumber = tm.getTaskNumber();
        Long all = orderThreadNumber.get("ALL");
        Long number = 0L;
        if ("order".equals(threadType)) {
            if (orderThreadNumber.get(type) != null) {
                number = orderThreadNumber.get(type);
            }
            orderThreadNumber.put("All", all + taskNumber);
            orderThreadNumber.put(type, number + taskNumber);
        } else {
            //其他类型
        }

    }


}
