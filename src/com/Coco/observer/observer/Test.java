package com.Coco.observer.observer;

public class Test {
    public static void main(String[] args) {
        //创建一个 WeatherData
        WeatherData weatherData = new WeatherData();

        //创建观察者
        CurrentConditions currentConditions = new CurrentConditions();

        //将观察中注册到 WeatherData
        weatherData.register(currentConditions);

        //更新天气数据 并通知 所有观察者
        //weatherData.setData(15, 120, 45);

        //扩展观察者
        BaiDuSite baiDuSite = new BaiDuSite();
        //注册到 WeatherData
        weatherData.register(baiDuSite);

        //更新天气数据 并通知 所有观察者
        weatherData.setData(21.5f, 125.3f, 53.8f);

        /**
         * 观察者模式的好处
         * 1. 观察者模式设计后, 会议集合的方式来管理用户, 包括注册, 移出, 以及通知
         * 2. 这样当我们增加观察者, 就不需要去修改核心类 WeatherData 的代码, 遵守了 OCP原则
         */

    }
}
