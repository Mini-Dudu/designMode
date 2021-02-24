package com.Coco.decorate.decorate;

//装饰者
public class Decorator extends Drink {
    //饮品
    private Drink drink;

    public Decorator(Drink drink) {
        this.drink = drink;
    }

    @Override
    public float cost() {
        //getPrice() 自己的价格
        return super.getPrice() + drink.cost();
    }

    @Override
    public String getDes() {
        //drink.getDes() 得到被装饰者的信息
        return des + " " + super.getPrice() + " + " + drink.getDes();
    }
}
