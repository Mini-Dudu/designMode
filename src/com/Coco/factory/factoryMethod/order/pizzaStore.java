package com.Coco.factory.factoryMethod.order;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class pizzaStore {
    public static void main(String[] args) {
        getPizza();
    }

    //获取用户的地址
    private static String getAddress() {
        try {
            BufferedReader strIn = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("input Address:");
            String str = strIn.readLine();
            return str;
        } catch (IOException e) {
            e.printStackTrace();
            return "";
        }
    }

    //根据用户的地址创建不同地区的 OrderPizza 类,并返回披萨
    private static void getPizza() {
        String add = getAddress();
        if (add.equals("BJ")) {
            new BJOrderPizza();
        }else if (add.equals("LD")) {
            new LDOrderPizza();
        }
    }
}
