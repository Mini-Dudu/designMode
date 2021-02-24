package com.Coco.observer.observer;

//观察者, 百度第三方
public class BaiDuSite implements Observer {
    //温度
    private float temperature;

    //气压
    private float pressure;

    //湿度
    private float humidity;

    //更新天气数据 并显示 由气象站调用
    public void upData(float temperature, float pressure, float humidity) {
        this.temperature = temperature;
        this.pressure = pressure;
        this.humidity = humidity;
        display();
    }

    //显示天气情况
    public void display() {
        System.out.println("==========百度天气==========");
        System.out.println("==温度==              " + this.temperature);
        System.out.println("==湿度==              " + this.pressure);
        System.out.println("==气压==              " + this.humidity);
    }
}
