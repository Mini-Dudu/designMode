package com.Coco.mediator.smarthouse;

//具体的同事类, Tv
public class Tv extends Colleague {
    public Tv(Mediator mediator, String name) {
        super(mediator, name);

        mediator.Register(name, this);
    }

    @Override
    public void SendMessage(int stateChange) {
        //调用中介者对象的 GetMessage
        this.getMediator().GetMessage(stateChange, this.name);
    }

    public void StartTv() {
        System.out.println("It's time to StartTv!");
    }

    public void StopTv() {
        System.out.println("It's time to StopTv!");
    }
}
