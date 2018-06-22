package com.demo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.RecursiveTask;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.atomic.AtomicLong;
//测试forkJoinTask
public class MakeMoneyTask  extends RecursiveTask<Integer> {

    private static final int MIN_GOAL_MONEY = 100000;
    private int goalMoney;
    private String name;
    private static final AtomicLong employeeNo = new AtomicLong();
    public MakeMoneyTask(int goalMoney){
        this.goalMoney = goalMoney;
        this.name = "员工" + employeeNo.getAndIncrement() + "号";
    }
    @Override
    protected Integer compute() {
        //根据条件判断是否要拆分任务
        if (this.goalMoney < MIN_GOAL_MONEY){
            //不需要，直接执行
            return makeMoney();
        }else{
            //需要，拆分后执行
            int subThreadCount = ThreadLocalRandom.current().nextInt(10) + 2;

            List<MakeMoneyTask> tasks = new ArrayList<>();
            for (int i = 0; i < subThreadCount; i ++){
                tasks.add(new MakeMoneyTask(goalMoney / subThreadCount));
            }
            Collection<MakeMoneyTask> makeMoneyTasks = invokeAll(tasks);
            int sum = 0;
            for (MakeMoneyTask moneyTask : makeMoneyTasks){
                try {
                    sum += moneyTask.get();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            return sum;
        }
    }

    private Integer makeMoney(){
        int sum = 0;
        int day = 1;
        try {
            while (true){
                Thread.sleep(ThreadLocalRandom.current().nextInt(500));
                int money = ThreadLocalRandom.current().nextInt(MIN_GOAL_MONEY / 3);
                sum += money;
                if (sum >= goalMoney){
                    break;
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return sum;
    }
}
