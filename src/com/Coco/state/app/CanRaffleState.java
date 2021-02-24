package com.Coco.state.app;

import java.util.Random;

//可以抽奖的状态
public class CanRaffleState implements State {
    RaffleActivity activity;

    public CanRaffleState(RaffleActivity activity) {
        this.activity = activity;
    }

    @Override
    public void deductMoney() {
        System.out.println("已经扣过积分了!");
    }

    @Override
    public boolean raffle() {
        System.out.println("正在抽奖, 请稍等!");
        Random r = new Random();
        int num = r.nextInt(100);
        //10%的中奖概率
        if (num % 10 == 0) {
            //将状态改为发放奖品的状态
            activity.setState(activity.getDispenseState());
            return true;
        }
        System.out.println("很遗憾, 没有中奖!");

        //将状态改为不能抽奖的状态
        activity.setState(activity.getNoRaffleState());
        return false;
    }

    @Override
    public void dispensePrize() {
        System.out.println("未中奖, 不能发放奖品!");
    }
}
