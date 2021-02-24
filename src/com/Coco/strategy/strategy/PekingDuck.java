package com.Coco.strategy.strategy;

//北京鸭
public class PekingDuck extends Duck {
    //构造器
    public PekingDuck() {
        //组合
        this.flyBehavior = new BadFlyBehavior();
    }

    @Override
    public void show() {
        System.out.println("北京鸭!");
    }

}
