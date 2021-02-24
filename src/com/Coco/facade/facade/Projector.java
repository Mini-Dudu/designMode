package com.Coco.facade.facade;

//投影仪
public class Projector {
    //使用单例模式---双重检查

    //构造器
    private void Projector() {}

    //实例
    private static Projector instance;

    //获得实例
    public static Projector getInstance() {
        if(instance == null) {
            synchronized (Projector.class) {
                if(instance == null) {
                    instance = new Projector();
                }
            }
        }
        return instance;
    }

    //开机
    public void on() {
        System.out.println("投影仪开机!");
    }

    //聚焦
    public void focus() {
        System.out.println("投影仪自动聚焦");
    }

    //关机
    public void off() {
        System.out.println("投影仪关机!");
    }

}
