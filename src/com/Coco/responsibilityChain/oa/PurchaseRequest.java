package com.Coco.responsibilityChain.oa;

//采购请求
public class PurchaseRequest {

    //属性
    private int type = 0; //请求类型
    //private int number = 0;
    private float price = 0.0f; //价格
    private int id = 0;

    //构造器

    public PurchaseRequest(int type, float price, int id) {
        this.type = type;
        //this.number = number;
        this.price = price;
        this.id = id;
    }

    public int getType() {
        return type;
    }

    public float getPrice() {
        return price;
    }

    public int getId() {
        return id;
    }
}
