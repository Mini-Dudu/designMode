package com.Coco.factory.abstractFactory.factory;

import com.Coco.factory.abstractFactory.pizza.BJCheesePizza;
import com.Coco.factory.abstractFactory.pizza.BJGreekPizza;
import com.Coco.factory.abstractFactory.pizza.Pizza;

public class BJFactory implements AbsFactory {
    @Override
    public Pizza createPizza(String type) {
        System.out.println("使用抽象工厂制作 Pizza");
        Pizza pizza = null;
        if (type.equals("cheese")) {
            pizza = new BJCheesePizza();
        } else if (type.equals("greek")) {
            pizza = new BJGreekPizza();
        }
        return pizza;
    }
}
