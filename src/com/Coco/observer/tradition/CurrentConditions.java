package com.Coco.observer.tradition;

//显示当前天气情况 (可以理解为是气象站自己的网站)
public class CurrentConditions {
    //温度
    private float temperature;

    //气压
    private float pressure;

    //湿度
    private float humidity;

    //更新天气数据 并显示 由气象站调用, 使用推送模式.
    public void upData(float temperature, float pressure, float humidity) {
        this.temperature = temperature;
        this.pressure = pressure;
        this.humidity = humidity;
        display();
    }

    //显示天气情况
    public void display() {
        System.out.println("==========当前天气情况==========");
        System.out.println("==温度==              " + this.temperature);
        System.out.println("==湿度==              " + this.pressure);
        System.out.println("==气压==              " + this.humidity);
    }
}
