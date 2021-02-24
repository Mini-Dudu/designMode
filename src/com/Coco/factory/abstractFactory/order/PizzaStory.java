package com.Coco.factory.abstractFactory.order;

import com.Coco.factory.abstractFactory.factory.BJFactory;

public class PizzaStory {
    public static void main(String[] args) {
        BJFactory factory = new BJFactory();
        new OrderPizza(factory);
    }
}
