package com.Coco.state.app;

//抽奖活动
public class RaffleActivity {
    //当前状态
    State state = null;

    //奖品数量
    int count = 0;

    //活动中含有的状态
    State noRaffleState = new NoRaffleState(this);
    State canRaffleState = new CanRaffleState(this);
    State dispenseState = new DispenseState(this);
    State dispenseOutState = new DispenseOutState(this);

    //构造器
    //1. 初始化状态为 noRaffleActivity (即不能抽奖的状态)
    //2. 初始化奖品的数量
    public RaffleActivity(int count) {
        this.state = noRaffleState;
        this.count = count;
    }

    //扣积分
    public void debuctMoney() {
        state.deductMoney();
    }

    //抽奖
    public void raffle() {
        //中奖
        if (state.raffle()) {
            //领取奖品
            state.dispensePrize();
        }
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public int getCount() {
//        int curCount = count;
//        count--;
//        return curCount;
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public State getNoRaffleState() {
        return noRaffleState;
    }

    public void setNoRaffleState(State noRaffleState) {
        this.noRaffleState = noRaffleState;
    }

    public State getCanRaffleState() {
        return canRaffleState;
    }

    public void setCanRaffleState(State canRaffleState) {
        this.canRaffleState = canRaffleState;
    }

    public State getDispenseState() {
        return dispenseState;
    }

    public void setDispenseState(State dispenseState) {
        this.dispenseState = dispenseState;
    }

    public State getDispenseOutState() {
        return dispenseOutState;
    }

    public void setDispenseOutState(State dispenseOutState) {
        this.dispenseOutState = dispenseOutState;
    }
}
