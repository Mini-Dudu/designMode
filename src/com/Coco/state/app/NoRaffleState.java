package com.Coco.state.app;

//不能抽奖的状态
public class NoRaffleState implements State {
    //初始化时传入活动引用, 扣除积分后改变其状态
    RaffleActivity activity;

    public NoRaffleState(RaffleActivity activity) {
        this.activity = activity;
    }

    //当前状态可以扣积分, 扣除后, 将状态设置为可以抽奖状态
    @Override
    public void deductMoney() {
        if (activity.getCount() <= 0) {
            System.out.println("很遗憾, 奖品已发放完!");
            //活动结束
            activity.setState(activity.getDispenseOutState());
            return;
        }
        System.out.println("成功扣除积分, 您可以抽奖了!");
        activity.setState(activity.getCanRaffleState());
    }

    //当前状态不能抽奖
    @Override
    public boolean raffle() {
        System.out.println("扣除积分后才能抽奖哦!");
        return false;
    }

    //当前状态不能发放奖品
    @Override
    public void dispensePrize() {
        System.out.println("不能发放奖品!");
    }
}
