package com.Coco.state.app;

public class Test {
    public static void main(String[] args) {
        //创建活动对象, 奖品池中设置5个奖品
        RaffleActivity activity = new RaffleActivity(5);

        //连续进行抽奖
        for (int i = 0; i < 200; i++) {
            System.out.println("----------第 " + (i +1) + " 次抽奖!----------");

            //参与抽奖, 第一步点击抽奖扣除积分
            activity.debuctMoney();

            //第二步抽奖
            activity.raffle();
        }
    }
}
