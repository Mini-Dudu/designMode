package com.Coco.observer.tradition;

//核心类,
public class WeatherData {
    //温度
    private float temperature;

    //气压
    private float pressure;

    //湿度
    private float humidity;

    //第三方
    private CurrentConditions currentConditions; //气象站自己的网站

    public WeatherData(CurrentConditions currentConditions) {
        this.currentConditions = currentConditions;
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

    //更新天气数据
    public void dataChange() {
        currentConditions.upData(getTemperature(), getPressure(), getHumidity());
    }

    //设置并更新第三方天气数据, 模拟气象站测量天气数据
    public void setData(float temperature, float pressure, float humidity) {
        this.temperature = temperature;
        this.pressure = pressure;
        this.humidity = humidity;
        dataChange();
    }


}
