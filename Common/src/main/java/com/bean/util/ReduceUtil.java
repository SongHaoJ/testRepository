package com.bean.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class ReduceUtil {
    private static final Logger log = LoggerFactory.getLogger(ReduceUtil.class);
    private static final int SCALE = 2;
    private static final Double MIN_MONEY = 0.01D;
    private static final Integer MIN_TIME = 2;

    private static DecimalFormat df = new DecimalFormat("########.00");
    private Double minReduceMoney;
    private BigDecimal totalReduceMoney;
    private BigDecimal calcMoney;
    private Integer totalReduceTimes;

    private Integer reduceStage;
    private List<BigDecimal> stageReduceMoney;

    public ReduceUtil(Double totalReduceMoney, Integer totalReduceTimes) {
        if (totalReduceMoney < 1) {
            throw new IllegalArgumentException("totalReduceMoney must gte 1");
        }
        if (totalReduceTimes < MIN_TIME) {
            throw new IllegalArgumentException("totalReduceTimes must gte 2");
        }
        BigDecimal decimalMoney = BigDecimal.valueOf(totalReduceMoney);
        if (decimalMoney.divide(BigDecimal.valueOf(totalReduceTimes), SCALE, RoundingMode.DOWN).doubleValue() < 0.01) {
            throw new IllegalArgumentException("totalReduceMoney divide totalReduceTimes must gte 0.01");
        }
        this.totalReduceMoney = decimalMoney.setScale(SCALE, RoundingMode.DOWN);
        this.totalReduceTimes = totalReduceTimes;
        initializationMin();
    }

    public ReduceUtil(Double totalReduceMoney, Integer totalReduceTimes,Double minReduceMoney) {
        if (totalReduceMoney < 1) {
            throw new IllegalArgumentException("totalReduceMoney must gte 1");
        }
        if (totalReduceTimes < MIN_TIME) {
            throw new IllegalArgumentException("totalReduceTimes must gte 2");
        }
        if(minReduceMoney<MIN_MONEY||minReduceMoney*totalReduceTimes>totalReduceMoney){
            throw new IllegalArgumentException("minReduceMoney range fail");
        }
        BigDecimal decimalMoney = BigDecimal.valueOf(totalReduceMoney);
        if (decimalMoney.divide(BigDecimal.valueOf(totalReduceTimes), SCALE, RoundingMode.DOWN).doubleValue() < 0.01) {
            throw new IllegalArgumentException("totalReduceMoney divide totalReduceTimes must gte 0.01");
        }
        this.totalReduceMoney = decimalMoney.setScale(SCALE, RoundingMode.DOWN);
        this.totalReduceTimes = totalReduceTimes;
        this.minReduceMoney = minReduceMoney;
        this.calcMoney = this.totalReduceMoney.subtract(BigDecimal.valueOf(minReduceMoney*totalReduceTimes).setScale(SCALE,RoundingMode.DOWN));
        initializationReduceStageCenter();
    }

    private void initializationMin() {
        this.minReduceMoney = totalReduceMoney.divide(BigDecimal.valueOf(totalReduceTimes * 3), SCALE, RoundingMode.DOWN).doubleValue();
        if (this.minReduceMoney < MIN_MONEY) {
            this.minReduceMoney = MIN_MONEY;
        }
        this.calcMoney = totalReduceMoney.subtract(BigDecimal.valueOf(minReduceMoney*totalReduceTimes).setScale(SCALE,RoundingMode.DOWN));
        initializationReduceStageCenter();
    }

    public List<BigDecimal> getStageReduceMoney() {
        return stageReduceMoney;
    }

    private void initializationReduceStageCenter() {
        this.reduceStage = 1;
    }

    public void initializationReduceStageLeft() {
        stageReduceMoney = new ArrayList<>();
        this.reduceStage = 2;
        Double d = 0.30D;
        BigDecimal firstStage = BigDecimal.valueOf(d).multiply(calcMoney).setScale(SCALE, RoundingMode.DOWN);
        BigDecimal secondStage = calcMoney.subtract(firstStage);
        stageReduceMoney.add(firstStage);
        stageReduceMoney.add(secondStage);
    }

    public void initializationReduceStageRight() {
        initializationReduceStageLeft();
        Collections.reverse(this.stageReduceMoney);
    }

    public void setStagePercentage(List<Double> stagePercentage) {
        if (CommonUtil.isEmpty(stagePercentage)) {
            throw new IllegalArgumentException("stagePercentage is empty");
        }
        Double sum = 0.00D;
        for (Double d : stagePercentage) {
            sum += d;
        }
        if (sum != 1) {
            throw new IllegalArgumentException("sum of stagePercentage should equals 1");
        }
        this.stageReduceMoney = new ArrayList<>();
        this.reduceStage = stagePercentage.size();
        BigDecimal total = BigDecimal.valueOf(0);
        for (int i = 0; i < reduceStage - 1; i++) {
            BigDecimal reduceMoney = calcMoney.multiply(BigDecimal.valueOf(stagePercentage.get(i))).setScale(SCALE, RoundingMode.DOWN);
            total = total.add(reduceMoney);
            this.stageReduceMoney.add(reduceMoney);
        }
        this.stageReduceMoney.add(calcMoney.subtract(total).setScale(2, RoundingMode.DOWN));
    }

    public void setStageReduceMoney(List<Double> stageReduceMoney) {
        if (CommonUtil.isEmpty(stageReduceMoney)) {
            throw new IllegalArgumentException("stageReduceMoney is empty");
        }
        Double total = 0.00D;
        for(Double d:stageReduceMoney){
            total+=d;
        }
        if(total!=totalReduceMoney.doubleValue()){
            throw new IllegalArgumentException("sum of stageReduceMoney is not equals totalReduceMoney");
        }
        this.reduceStage = stageReduceMoney.size();
        this.stageReduceMoney = new ArrayList<>();
        BigDecimal sum = BigDecimal.valueOf(0);
        for (int i = 0; i < reduceStage-1; i++) {
            this.stageReduceMoney.add(BigDecimal.valueOf(stageReduceMoney.get(i)*calcMoney.doubleValue()/totalReduceMoney.doubleValue()).setScale(SCALE, RoundingMode.DOWN));
            sum = sum.add(this.stageReduceMoney.get(i));
        }
        this.stageReduceMoney.add(calcMoney.subtract(sum));
    }

    public List<Double> getReduceMoneyList() {
        switch (reduceStage) {
            case 1:
                return getStageList(totalReduceTimes, calcMoney);
            default:
                List<Double> returnList = new ArrayList<>();
                Integer totalTime = 0;
                for (int i = 0; i < reduceStage - 1; i++) {
                    Integer times = totalReduceTimes / reduceStage;
                    totalTime += times;
                    List<Double> reduceList = getStageList(times, stageReduceMoney.get(i));
                    returnList.addAll(reduceList);
                }
                returnList.addAll(getStageList(totalReduceTimes - totalTime, stageReduceMoney.get(stageReduceMoney.size() - 1)));
                return returnList;
        }
    }

    private List<Double> getStageList(Integer times, BigDecimal stageReduceMoney) {
        Random random = new Random();
        Double d = 0.00D;
        List<BigDecimal> reduceList = new ArrayList<>();
        for (int i = 0; i < times; i++) {
            Double percentage = random.nextDouble();
            BigDecimal reduceMoney = stageReduceMoney.multiply(BigDecimal.valueOf(percentage)).setScale(SCALE, RoundingMode.DOWN);
            d += percentage;
            reduceList.add(reduceMoney);
        }
        return getReturnList(reduceList, d, stageReduceMoney);
    }

    private List<Double> getReturnList(List<BigDecimal> reduceList, Double d, BigDecimal stageReduceMoney) {
        List<Double> returnList = new ArrayList<>();
        BigDecimal total = BigDecimal.valueOf(0);
        for (int i = 0; i < reduceList.size() - 1; i++) {
            BigDecimal reduceMoney = reduceList.get(i).divide(BigDecimal.valueOf(d), SCALE, RoundingMode.DOWN);
            total = total.add(reduceMoney);
            returnList.add(Double.parseDouble(df.format(reduceMoney.doubleValue()+minReduceMoney)));
        }
        returnList.add(Double.parseDouble(df.format(stageReduceMoney.subtract(total).setScale(SCALE, RoundingMode.UP).doubleValue()+minReduceMoney)));
        return returnList;
    }
}
