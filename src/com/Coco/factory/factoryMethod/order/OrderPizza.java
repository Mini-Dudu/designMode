package com.Coco.factory.factoryMethod.order;

import com.Coco.factory.factoryMethod.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//Pizza 抽象订购类
public abstract class OrderPizza {

    //定义一个抽象方法, 让各个工厂子类自己实现.
    public abstract Pizza createPizza(String type);

    //构造器
    public OrderPizza() {
        //披萨
        Pizza pizza = null;

        //订购的披萨类型
        String type;

        type = getType();
        pizza = createPizza(type);

        if (pizza != null) {
            //输出 Pizza 制作过程
            pizza.prepare();
            pizza.bake();
            pizza.cut();
            pizza.box();
        }

        //do {
//            type = getType();
//            pizza = createPizza();
//
//            if (pizza != null) {
//                //输出 Pizza 制作过程
//                pizza.prepare();
//                pizza.bake();
//                pizza.cut();
//                pizza.box();
//            }else {
//                System.out.println("订购失败!");
//                break;
//            }
//
//        }while (true);
    }

    //获取用户想要订购的 Pizza
    private String getType() {
        try {
            BufferedReader strIn = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("input Pizza Type:");
            String str = strIn.readLine();
            return str;
        } catch (IOException e) {
            e.printStackTrace();
            return "";
        }
    }

}
