package com.Coco.mediator.smarthouse;

import java.util.HashMap;

//具体的中介类
public class ConcreteMediator extends Mediator {
    //集合, 放入所有的同事对象
    private HashMap<String, Colleague> colleagueMap;
    private HashMap<String, String> interMap;

    //构造器


    public ConcreteMediator() {
        colleagueMap = new HashMap<String, Colleague>();
        interMap = new HashMap<>();
        //interMap = new HashMap<String, String>();
    }

    @Override
    public void Register(String colleagueName, Colleague colleague) {
        colleagueMap.put(colleagueName, colleague);

        if (colleague instanceof Alarm) {
            interMap.put("Alarm", colleagueName);
        } else if (colleague instanceof CoffeeMechine) {
            interMap.put("CoffeeMechine", colleagueName);
        } else if (colleague instanceof Tv) {
            interMap.put("Tv", colleagueName);
        } else if (colleague instanceof Curtains) {
            interMap.put("Curtains", colleagueName);
        }
    }

    //具体中介者的核心方法,
    //根据得到的消息, 完成对应任务
    @Override
    public void GetMessage(int stateChange, String colleagueName) {
        if (colleagueMap.get(colleagueName) instanceof Alarm) {
            if (stateChange == 0) {
                ((CoffeeMechine) (colleagueMap.get(interMap.get("CoffeeMechine")))).StartCoffee();
                ((Tv) (colleagueMap.get(interMap.get("Tv")))).StartTv();
            } else if (stateChange == 1) {
                ((Tv) (colleagueMap.get(interMap.get("Tv")))).StopTv();
            }
        } else if (colleagueMap.get(colleagueName) instanceof CoffeeMechine) {
            ((Curtains) (colleagueMap.get(interMap.get("Curtains")))).UpCurtains();
        } else if (colleagueMap.get(colleagueName) instanceof Tv) {
            //处理Tv发出的消息
        } else if (colleagueMap.get(colleagueName) instanceof Curtains) {
            //处理 Curtains (窗帘)发出的消息
        }
    }

    @Override
    public void SendMessage() {

    }
}
