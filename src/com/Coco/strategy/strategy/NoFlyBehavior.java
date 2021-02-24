package com.Coco.strategy.strategy;

//不会飞翔的策略
public class NoFlyBehavior implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("不会飞翔!");
    }
}
