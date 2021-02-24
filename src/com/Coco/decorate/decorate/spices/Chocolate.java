package com.Coco.decorate.decorate.spices;

import com.Coco.decorate.decorate.Decorator;
import com.Coco.decorate.decorate.Drink;

//巧克力,即具体的 Decorator , 这里就是调味品
public class Chocolate  extends Decorator {
    public Chocolate(Drink drink) {
        super(drink);
        setDes("巧克力");
        setPrice(3.0f);
    }
}
