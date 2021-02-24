package com.Coco.state.app;

//发放奖品的状态
public class DispenseState implements State {

    RaffleActivity activity;

    public DispenseState(RaffleActivity activity) {
        this.activity = activity;
    }

    @Override
    public void deductMoney() {
        System.out.println("发放奖品中, 不能再次扣积分了!");
    }

    @Override
    public boolean raffle() {
        System.out.println("发放奖品中, 请等待奖品发放完成后再参与抽奖!");
        return false;
    }

    @Override
    public void dispensePrize() {
        if (activity.getCount() > 0) {
            System.out.println("恭喜中奖, 奖品发放中!");
            //修改奖品数量
            activity.setCount(activity.getCount()-1);
            //更改状态
            activity.setState(activity.getCanRaffleState());
        }
        //else {
        //    System.out.println("很遗憾, 奖品已发放完!");
        //    activity.setState(activity.getDispenseOutState());
        //}
    }
}
