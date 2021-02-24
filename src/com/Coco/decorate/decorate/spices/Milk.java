package com.Coco.decorate.decorate.spices;

import com.Coco.decorate.decorate.Decorator;
import com.Coco.decorate.decorate.Drink;

//牛奶,即具体的 Decorator , 这里就是调味品
public class Milk extends Decorator {
    public Milk(Drink drink) {
        super(drink);
        setDes("牛奶");
        setPrice(2.0f);
    }
}
