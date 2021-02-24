package com.Coco.factory.factoryMethod.order;

import com.Coco.factory.factoryMethod.pizza.BJCheesePizza;
import com.Coco.factory.factoryMethod.pizza.BJGreekPizza;
import com.Coco.factory.factoryMethod.pizza.Pizza;


public class BJOrderPizza extends OrderPizza {
    public Pizza createPizza(String type) {
        Pizza pizza = null;

        if (type.equals("cheese")) {
            pizza = new BJCheesePizza();
        }else if (type.equals("greek")) {
            pizza = new BJGreekPizza();
        }
        return pizza;
    }
}
