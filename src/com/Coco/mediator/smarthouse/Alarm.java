package com.Coco.mediator.smarthouse;

//具体的同事类, 闹钟
public class Alarm extends Colleague {
    //构造器
    public Alarm(Mediator mediator, String name) {
        super(mediator, name);
        //在创建 Alart 同事对象类时, 将自己放入到 ConcreteMediator 对象的集合中
        mediator.Register(name, this);
    }

    public void SendAlart(int stateChange) {
        SendMessage(stateChange);
    }

    @Override
    public void SendMessage(int stateChange) {
        //调用中介者对象的GetMessage
        this.getMediator().GetMessage(stateChange, this.name);
    }
}
