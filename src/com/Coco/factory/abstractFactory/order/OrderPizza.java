package com.Coco.factory.abstractFactory.order;

import com.Coco.factory.abstractFactory.factory.AbsFactory;
import com.Coco.factory.abstractFactory.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//Pizza 订购类
public class OrderPizza {
    //抽象工厂
    private AbsFactory absFactory;

    //构造器
    public OrderPizza(AbsFactory factory) {
        Order(factory);
    }

    private void Order(AbsFactory factory) {
        //1. 设置抽象工厂
        setAbsFactory(factory);

        //2. 定购 Pizza
        //Pizza
        Pizza pizza = null;

        //用户输入的 Pizza 类型
        String type = "";

        type = getType();
        pizza = absFactory.createPizza(type);

        if (pizza != null) {
            //输出 Pizza 制作过程
            pizza.prepare();
            pizza.bake();
            pizza.cut();
            pizza.box();
        }

    }

    private void setAbsFactory(AbsFactory factory) {
        ////Pizza
//        Pizza pizza = null;
//
//        //用户输入的 Pizza 类型
//        String type = "";
//
        this.absFactory = factory;

        //订购一个 Pizza
//        type = getType();
//        pizza = absFactory.createPizza(type);
//
//        if (pizza != null) {
//            //输出 Pizza 制作过程
//            pizza.prepare();
//            pizza.bake();
//            pizza.cut();
//            pizza.box();
//        }

        //循环订购 Pizza
//        do {
//            type = getType();
//            pizza = absFactory.createPizza(type);
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
