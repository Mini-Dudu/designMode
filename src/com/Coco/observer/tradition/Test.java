package com.Coco.observer.tradition;

public class Test {
    public static void main(String[] args) {
        //第三方
        //气象站自己的网站
        CurrentConditions currentConditions = new CurrentConditions();

        //气象站
        WeatherData weatherData = new WeatherData(currentConditions);

        //气象站测量并更新天气数据
        weatherData.setData(30, 150, 40);

        System.out.println("==============天气发生变化==============");
        //天气发生变化
        weatherData.setData(32, 155, 30);
    }
}
