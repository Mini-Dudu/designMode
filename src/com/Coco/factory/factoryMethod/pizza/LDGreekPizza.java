package com.Coco.factory.factoryMethod.pizza;

public class LDGreekPizza extends Pizza{
    @Override
    public void prepare() {
        setName("伦敦口味的胡椒披萨");
        System.out.println("为制作伦敦口味的胡椒披萨:GreekPizza 准备原材料");
    }
}
