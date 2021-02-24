package com.Coco.factory.abstractFactory.factory;

import com.Coco.factory.abstractFactory.pizza.LDCheesePizza;
import com.Coco.factory.abstractFactory.pizza.LDGreekPizza;
import com.Coco.factory.abstractFactory.pizza.Pizza;

public class LDFactory implements AbsFactory {
    @Override
    public Pizza createPizza(String type) {
        System.out.println("使用抽象工厂制作 Pizza");
        Pizza pizza = null;
        if (type.equals("cheese")) {
            pizza = new LDCheesePizza();
        } else if (type.equals("greek")) {
            pizza = new LDGreekPizza();
        }
        return pizza;
    }
}
