package com.Coco.facade.facade;

//DVD播放器
public class DVD {
    //使用单例模式---饿汉式---静态常量

    //构造器私有化
    private DVD() {}

    //实例
    private static DVD instance = new DVD();

    //获得实例
    public static DVD getInstance() {
        return instance;
    }

    //开机
    public void on() {
        System.out.println("DVD开机!");
    }

    //关机
    public void off() {
        System.out.println("DVD关机!");
    }

    //true 为暂停, false 为播放
    private boolean isPlayer = false;

    //暂停/播放
    public void player() {
        if (!isPlayer) {
            System.out.println("开始播放!");
            isPlayer = !isPlayer;
        } else {
            System.out.println("暂停播放!");
            isPlayer = !isPlayer;
        }
    }
}
