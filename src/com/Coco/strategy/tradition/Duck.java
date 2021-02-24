package com.Coco.strategy.tradition;

//鸭子抽象类
public abstract class Duck {
    //构造器
    public Duck() {}

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
        System.out.println("鸭子会飞翔!");
    }
}
