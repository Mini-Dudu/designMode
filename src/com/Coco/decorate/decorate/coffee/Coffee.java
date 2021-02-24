package com.Coco.decorate.decorate.coffee;

import com.Coco.decorate.decorate.Drink;

//咖啡
public class Coffee extends Drink {
    @Override
    public float cost() {
        return super.getPrice();
    }
}
