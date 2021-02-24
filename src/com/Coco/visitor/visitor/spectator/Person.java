package com.Coco.visitor.visitor.spectator;

import com.Coco.visitor.visitor.estimate.Action;

//评分的人  被访问者
public abstract class Person {
    //提供一个方法, 让访问者可以访问
    public abstract void accept(Action action);
}
