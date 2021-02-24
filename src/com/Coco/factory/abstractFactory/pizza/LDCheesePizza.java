package com.Coco.factory.abstractFactory.pizza;

public class LDCheesePizza extends Pizza {
    @Override
    public void prepare() {
        setName("伦敦口味的奶酪披萨");
        System.out.println("为制作伦敦口味的奶酪披萨:CheesePizza 准备原材料");
    }
}