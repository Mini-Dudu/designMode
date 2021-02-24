package com.Coco.factory.simpleFactory;

import com.Coco.factory.simpleFactory.pizza.Pizza;
import com.Coco.factory.simpleFactory.pizza.GreekPizza;
import com.Coco.factory.simpleFactory.pizza.CheesePizza;

//简单工厂类
public class simpleFactory {

    //根据 type 返回一个 Pizza 实例
    public Pizza createPizza(String type) {
        System.out.println("使用简单工厂模式");

        Pizza pizza = null;

        if (type.equals("greek")) {
            pizza = new GreekPizza();
        } else if (type.equals("cheese")) {
            pizza = new CheesePizza();
        }

        return pizza;
    }
}
