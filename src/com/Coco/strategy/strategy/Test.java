package com.Coco.strategy.strategy;

public class Test {
    public static void main(String[] args) {
        Duck duck = new WildDuck();
        duck.fly();

        duck = new ToyDuck();
        duck.fly();

        duck = new PekingDuck();
        duck.fly();

        //本示例仅仅实现了一个飞翔的策略, 其他策略没有进行编写.
    }
}
