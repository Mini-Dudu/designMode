package com.Coco.strategy.strategy;

//野鸭
public class WildDuck extends Duck {
    //构造器
    public WildDuck() {
        //组合
        this.flyBehavior = new GoodFly();
    }

    @Override
    public void show() {
        System.out.println("野鸭!");
    }
}
