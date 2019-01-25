package com;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * @author songhao
 */
@Component
public class DaeThread extends Thread {
    private Boolean start = true;
    private static DaeThread daeThread = new DaeThread();
    private static final Logger log = LoggerFactory.getLogger(DaeThread.class);

    static{
        daeThread.setDaemon(true);
        daeThread.start();
    }

    private DaeThread() {

    }

    public static DaeThread getDaeThread() {
        return daeThread;
    }

    @Override
    public void run() {
        System.out.println("111111");
        while (start) {
            //TODO 处理不急需进行的操作与其他线程状态的修改,暂时无用
            try {
                sleep(10 * 1000);
                log.debug("DeaThread is Healthy");
                System.out.println("121212");
            } catch (Exception e) {
                log.error("DaeThread Throws Exception:" + e.getMessage(), e);
                start = false;
            }
        }
    }
}
