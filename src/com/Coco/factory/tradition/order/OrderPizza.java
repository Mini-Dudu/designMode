package com.Coco.factory.tradition.order;

import com.Coco.factory.tradition.pizza.CheesePizza;
import com.Coco.factory.tradition.pizza.GreekPizza;
import com.Coco.factory.tradition.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//Pizza 订购类
public class OrderPizza {
    //构造器
    public OrderPizza() {
        //披萨
        Pizza pizza = null;

        //订购的披萨类型
        String type;

        do {
            type = getType();
            if (type.equals("greek")) {
                pizza = new GreekPizza();
            } else if (type.equals("cheese")) {
                pizza = new CheesePizza();
            } else {
                break;
            }

            //输出 Pizza 制作过程
            pizza.prepare();
            pizza.bake();
            pizza.cut();
            pizza.box();
        }while (true);
    }

    //获取用户想要订购的 Pizza
    private String getType() {
        try {
            BufferedReader strIn = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("input Pizza Type:");
            String str = strIn.readLine();
            return str;
        }catch (IOException e) {
            e.printStackTrace();
            return "";
        }
    }
}
