package com.Coco.mediator.smarthouse;

//具体的同事类, 窗帘
public class Curtains extends Colleague {
    public Curtains(Mediator mediator, String name) {
        super(mediator, name);

        mediator.Register(name, this);
    }

    @Override
    public void SendMessage(int stateChange) {
        //调用中介者对象的 GetMessage
        this.getMediator().GetMessage(stateChange, this.name);
    }

    public void UpCurtains() {
        System.out.println("I an holding Up Curtains!");
    }
}
