package com.Coco.factory.factoryMethod.order;


import com.Coco.factory.factoryMethod.pizza.LDCheesePizza;
import com.Coco.factory.factoryMethod.pizza.LDGreekPizza;
import com.Coco.factory.factoryMethod.pizza.Pizza;

public class LDOrderPizza extends OrderPizza {
    public Pizza createPizza(String type) {
        Pizza pizza = null;

        if (type.equals("cheese")) {
            pizza = new LDCheesePizza();
        }else if (type.equals("greek")) {
            pizza = new LDGreekPizza();
        }
        return pizza;
    }
}