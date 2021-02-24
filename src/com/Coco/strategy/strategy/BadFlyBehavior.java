package com.Coco.strategy.strategy;

//飞翔技术不是很好的策略略
public class BadFlyBehavior implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("飞向技术一般!");
    }
}
