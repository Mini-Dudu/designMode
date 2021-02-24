package com.Coco.decorate.decorate;

//饮品
public abstract class Drink {
    //描述
    public String des;

    //价格
    private float price = 0.0f;

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    //计算费用的抽象方法, 由子类具体实现
    public abstract float cost();
}
