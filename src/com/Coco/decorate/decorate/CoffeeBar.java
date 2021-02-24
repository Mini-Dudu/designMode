package com.Coco.decorate.decorate;

import com.Coco.decorate.decorate.coffee.LongBrank;
import com.Coco.decorate.decorate.spices.Chocolate;
import com.Coco.decorate.decorate.spices.Milk;

public class CoffeeBar {
    public static void main(String[] args) {
        //装饰者模式下的订单: 两份巧克力 + 一份牛奶的LongBlank

        //1. 先点一份 LongBlank
        Drink order = new LongBrank();
        System.out.println(order.getDes() + " 费用: " + order.cost());

        //2. 加入一份牛奶
        order = new Milk(order);
        System.out.println(order.getDes() + " 费用: " + order.cost());

        //3. 加入一份巧克力
        order = new Chocolate(order);
        System.out.println(order.getDes() + " 费用: " + order.cost());

        //4. 再加入一份巧克力
        order = new Chocolate(order);
        System.out.println(order.getDes() + " 费用: " + order.cost());
    }
}
