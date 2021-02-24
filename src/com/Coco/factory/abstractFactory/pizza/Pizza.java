package com.Coco.factory.abstractFactory.pizza;

//将 Pizza 做成抽象类
public abstract class Pizza {
    //Pizza 的名字
    protected String name;

    //为 Pizza 准备原材料
    public abstract void prepare();

    //烘烤 Pizza
    public void bake() {
        System.out.println("烘烤 " + name);
    }

    //切割
    public void cut() {
        System.out.println("切割 "+name);
    }

    //打包 Pizza
    public void box() {
        System.out.println("打包 " + name);
    }

    public void setName(String name) {
        this.name = name;
    }
}
