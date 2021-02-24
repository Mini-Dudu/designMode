package com.Coco.prototype.prototype;

public class Client {
    public static void main(String[] args) {
        //使用原型模式
        Sheep sheep = new Sheep("Dorey", 1, "白色");
        System.out.println(sheep);

        //使用原型模式进行克隆
        Sheep clone = sheep.clone();
        System.out.println(clone);
        //...
        Sheep cloneN = sheep.clone();
        System.out.println(cloneN);
    }
}
