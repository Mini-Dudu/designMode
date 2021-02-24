package com.Coco.state.app;

//奖品领完的状态
public class DispenseOutState implements State {
    RaffleActivity activity;

    public DispenseOutState(RaffleActivity activity) {
        this.activity = activity;
    }

    @Override
    public void deductMoney() {
        System.out.println("奖品已发放完毕, 请下次再来参与!");
        System.exit(0);
    }

    @Override
    public boolean raffle() {
        System.out.println("奖品已发放完毕, 请下次再来参与!");
        System.exit(0);
        return false;
    }

    @Override
    public void dispensePrize() {
        System.out.println("奖品已发放完毕, 请下次再来参与!");
        System.exit(0);
    }
}
