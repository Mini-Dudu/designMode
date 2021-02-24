package com.Coco.strategy.tradition;

//北京鸭
public class PekingDuck extends Duck {
    @Override
    public void show() {
        System.out.println("北京鸭!");
    }

    //因为北京鸭不会飞翔, 所以要重写方法 fly()
    @Override
    public void fly() {
        System.out.println("北京鸭不会飞翔!");
    }
}
