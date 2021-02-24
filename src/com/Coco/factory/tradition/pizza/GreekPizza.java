package com.Coco.factory.tradition.pizza;

public class GreekPizza extends Pizza {
    @Override
    public void prepare() {
        setName("希腊披萨");
        System.out.println("为制作希腊披萨:GreekPizza 准备原材料");
    }
}
