package com.Coco.observer.observer;

import java.util.ArrayList;

/**
 * 核心类
 * 1. 包含最新的天气情况
 * 2. 含有 观察者集合 , 使用 ArrayList 管理
 * 3. 当数据有更新时, 就主动调用 ArrayList , 通知所用的(接入方)
 */
public class WeatherData implements Subject {
    //温度
    private float temperature;

    //气压
    private float pressure;

    //湿度
    private float humidity;

    //第三方, 观察者集合
    private ArrayList<Observer> observers;

    //构造器
    public WeatherData() {
        this.observers = new ArrayList<Observer>();
    }

    //更新天气数据
    public void dataChange() {
        notify_();
    }

    //设置并更新第三方天气数据, 模拟气象站测量天气数据
    public void setData(float temperature, float pressure, float humidity) {
        this.temperature = temperature;
        this.pressure = pressure;
        this.humidity = humidity;
        dataChange();
    }

    @Override
    public void register(Observer observer) {
        this.observers.add(observer);
    }

    @Override
    public void remove(Observer observer) {
        if(this.observers.contains(observer)) {
            this.observers.remove(observer);
        }
    }

    //遍历所有观察者, 并通知
    @Override
    public void notify_() {
        for(int i = 0; i < this.observers.size(); i++) {
            this.observers.get(i).upData(this.temperature, this.pressure, this.humidity);
        }
    }

    public float getTemperature() {
        return temperature;
    }

    public float getPressure() {
        return pressure;
    }

    public float getHumidity() {
        return humidity;
    }
}
