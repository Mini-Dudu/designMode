package com.Coco.observer.observer;

//观察者接口, 由观察者实现
public interface Observer {
    public void upData(float temperature, float pressure, float humidity);
}
