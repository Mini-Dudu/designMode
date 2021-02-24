package com.Coco.state.app;

//状态接口
public interface State {
    //扣除积分
    public void deductMoney();

    //是否抽中奖品
    public boolean raffle();

    //发放jiangpin
    public void dispensePrize();
}
