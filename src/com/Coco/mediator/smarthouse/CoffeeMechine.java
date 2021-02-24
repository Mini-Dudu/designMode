package com.Coco.mediator.smarthouse;

//具体的同事类, 咖啡机
public class CoffeeMechine extends Colleague {
    public CoffeeMechine(Mediator mediator, String name) {
        super(mediator, name);

        mediator.Register(name, this);
    }

    public void StartCoffee() {
        System.out.println("It's time to StartCoffee!");
    }

    public void StopCoffee() {
        System.out.println("It's time to StopCoffee!");
    }

    @Override
    public Mediator getMediator() {
        return super.getMediator();
    }

    @Override
    public void SendMessage(int stateChange) {
        //调用中介者对象的 GetMessage
        this.getMediator().GetMessage(stateChange, this.name);
    }

    public void FinishCoffee() {

    }
}
