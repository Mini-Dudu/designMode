package com.Coco.strategy.strategy;

//鸭子抽象类
public abstract class Duck {
    //采用聚合的方式

    //属性, 策略接口
    FlyBehavior flyBehavior;
    //其他属性, (策略接口)
    //......

    //构造器
    public Duck() {
    }

    //显示鸭子的信息
    public abstract void show();

    //鸭子叫的方法
    public void quack() {
        System.out.println("鸭子嘎嘎叫......");
    }

    //游泳
    public void swim() {
        System.out.println("鸭子会游泳!");
    }

    //飞翔
    public void fly() {
        if (flyBehavior != null) {
            flyBehavior.fly();
        }
    }
}
