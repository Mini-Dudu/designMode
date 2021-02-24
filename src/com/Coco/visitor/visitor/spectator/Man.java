package com.Coco.visitor.visitor.spectator;

import com.Coco.visitor.visitor.estimate.Action;

//男性
public class Man extends Person {

    //说明:
    //1. 这里我们使用到了双分派, 即首先在客户端程序中, 将具体状态作为参数传递到 Man 中(第一册分派)
    //2. 然后 Man 类调用作为参数的 "具体方法" 中的 getManResult() 方法, 同时将自己(this)作为参数传入, 完成第二次分派.

    @Override
    public void accept(Action action) {
        action.getManResult(this);
    }
}
