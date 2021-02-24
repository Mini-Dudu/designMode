package com.Coco.factory.abstractFactory.pizza;

public class BJGreekPizza extends Pizza {
    @Override
    public void prepare() {
        setName("北京口味的希腊披萨");
        System.out.println("为制作北京口味的希腊披萨:GreekPizza 准备原材料");
    }
}
