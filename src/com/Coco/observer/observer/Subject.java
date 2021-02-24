package com.Coco.observer.observer;

//接口, 让 WeatherData 来实现
public interface Subject {
    void register(Observer observer);
    void remove(Observer observer);
    void notify_();
}
