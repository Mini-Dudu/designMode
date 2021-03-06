package com.Coco.strategy.strategy;

//玩具鸭
public class ToyDuck extends Duck {
    //构造器

    public ToyDuck() {
        //组合
        this.flyBehavior = new NoFlyBehavior();
    }

    @Override
    public void show() {
        System.out.println("玩具鸭!");
    }

    //我们认为玩具鸭没有真实的鸭子的行为, 所以需要重写所有方法
    @Override
    public void quack() {
        System.out.println("玩具鸭不会叫!");
    }

    @Override
    public void swim() {
        System.out.println("玩具鸭不会游泳!");
    }
}
