package com.Coco.prototype.tradition;

public class Client {
    public static void main(String[] args) {
        //传统的实现方式
        Sheep sheep = new Sheep("Doley", 1, "白色");
        System.out.println(sheep);

        //创建N只羊
        Sheep sheep1 = new Sheep(sheep.getName(), sheep.getAge(), sheep.getColor());
        Sheep sheep2 = new Sheep(sheep.getName(), sheep.getAge(), sheep.getColor());
        Sheep sheep3 = new Sheep(sheep.getName(), sheep.getAge(), sheep.getColor());
        Sheep sheep4 = new Sheep(sheep.getName(), sheep.getAge(), sheep.getColor());
        Sheep sheepN = new Sheep(sheep.getName(), sheep.getAge(), sheep.getColor());
        System.out.println(sheep1);
        System.out.println(sheep2);
        System.out.println(sheep3);
        System.out.println(sheep4);
        System.out.println(sheepN);
    }
}
