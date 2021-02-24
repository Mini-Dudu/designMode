package com.Coco.factory.simpleFactory.order;

import com.Coco.factory.simpleFactory.simpleFactory;

public class pizzaStore {
    public static void main(String[] args) {
        //使用简单工厂模式
        new OrderPizza(new simpleFactory());
    }
}
