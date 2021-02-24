package com.Coco.factory.factoryMethod.pizza;

public class BJCheesePizza extends Pizza {
    @Override
    public void prepare() {
        setName("北京口味的奶酪披萨");
        System.out.println("为制作北京口味的奶酪披萨:CheesePizza 准备原材料");
    }
}
