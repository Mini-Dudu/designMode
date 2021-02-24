package com.Coco.strategy.strategy;

//可以飞, 并且飞翔技术很好的策略
public class GoodFly implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("飞翔技术高超!");
    }
}
