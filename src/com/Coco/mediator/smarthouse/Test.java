package com.Coco.mediator.smarthouse;

public class Test {
    public static void main(String[] args) {
        //创建中介者对象
        Mediator mediator = new ConcreteMediator();

        //创建智能家居, 并且加入到 ConcreteMediator 对象的 HashMap 中
        Alarm alarm = new Alarm(mediator, "alarm");
        CoffeeMechine coffeeMachine = new CoffeeMechine(mediator, "coffeeMachine");
        Curtains curtains = new Curtains(mediator, "curtains");
        Tv tv = new Tv(mediator, "tv");

        alarm.SendMessage(0);
        coffeeMachine.FinishCoffee();
        alarm.SendMessage(1);
    }
}
