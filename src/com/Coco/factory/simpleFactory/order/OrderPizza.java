package com.Coco.factory.simpleFactory.order;

import com.Coco.factory.simpleFactory.pizza.Pizza;
import com.Coco.factory.simpleFactory.simpleFactory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//Pizza 订购类
public class OrderPizza {
    //定义一个简单工厂对象,使用聚合的方式进行设置简单工厂;
    private simpleFactory simpleFactory;

    ////定义一个简单工厂对象,使用组合的方式进行设置简单工厂;
//    private simpleFactory simpleFactory = new simpleFactory();

    private Pizza pizza;

    //构造器, 使用聚合的方式进行设置简单工厂,也可以使用组合的方式;具体视情况而定.
    public OrderPizza(simpleFactory simpleFactory){
        setSimpleFactory(simpleFactory);
    }

    public void setSimpleFactory(simpleFactory simpleFactory) {
        //用户输入的 Pizza 类型
        String type = "";

        //设置简单工厂对象
        this.simpleFactory = simpleFactory;

        ////循环订购, Dudu认为订购多少应该由 PizzaStore 来决定;
//        do {
//            type = getType();
//            pizza = this.simpleFactory.createPizza(type);
//
//            if (pizza != null) {
//                //输出 Pizza 制作过程
//                pizza.prepare();
//                pizza.bake();
//                pizza.cut();
//                pizza.box();
//            } else {
//                System.out.println("订购失败!");
//                break;
//            }
//        }while (true);

        type = getType();
        pizza = this.simpleFactory.createPizza(type);

        if (pizza != null) {
            //输出 Pizza 制作过程
            pizza.prepare();
            pizza.bake();
            pizza.cut();
            pizza.box();
        } else {
            System.out.println("订购失败!");
        }
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
