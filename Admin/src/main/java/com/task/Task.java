package com.task;

import com.demo.MakeMoneyTask;
import com.orderThread.LazadaOrderThread;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ForkJoinTask;
import java.util.concurrent.TimeUnit;

@Component
public class Task {

  /*  @Scheduled(cron = "0 0 /3 * * ?")
    public void orderOne(){
        LazadaOrderThread lot = new LazadaOrderThread();
        lot.run();
    }
*/

  @Scheduled(fixedRate = 60*60*1000,initialDelay = 10*1000)
  public void orderOne(){
      //后台线程，暂时不用
    /*  DaeThread dae = DaeThread.getDaeThread();
      dae.start();
*/



      LazadaOrderThread lot = new LazadaOrderThread("order","lazada",1,2L,false);
      lot.run();

//测试forkJoinTask
      long start = System.currentTimeMillis();
      ForkJoinPool pool = new ForkJoinPool();
      ForkJoinTask<Integer> task = pool.submit(new MakeMoneyTask(10000000));
      do {
          try {
              TimeUnit.MILLISECONDS.sleep(5);
          }catch (InterruptedException e){
              e.printStackTrace();
          }
      }while (!task.isDone());
      pool.shutdown();
      long end = System.currentTimeMillis();
      System.out.println(end-start);
      try{
          System.out.println(task.get());
      }catch(Exception e){
      }
  }
}
