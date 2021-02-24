package com.Coco.factory.abstractFactory.factory;

import com.Coco.factory.abstractFactory.pizza.Pizza;

//抽象工厂模式的抽象层(接口)
public interface AbsFactory {
    //让工厂子类来具体实现
    Pizza createPizza(String type);
}
