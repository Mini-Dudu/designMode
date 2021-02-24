package com.Coco.factory.tradition.pizza;

public class CheesePizza extends Pizza {
    @Override
    public void prepare() {
        setName("奶酪披萨");
        System.out.println("为制作奶酪披萨:CheesePizza 准备原材料");
    }
}
