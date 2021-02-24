package com.Coco.decorate.decorate.spices;

import com.Coco.decorate.decorate.Decorator;
import com.Coco.decorate.decorate.Drink;

//豆浆,即具体的 Decorator , 这里就是调味品
public class Soy extends Decorator {
    public Soy(Drink drink) {
        super(drink);
        setDes("豆浆");
        setPrice(1.5f);
    }
}
