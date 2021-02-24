package com.Coco.facade.facade;

//灯光
public class Lamplight {
    //使用单例模式---懒汉式---线程不安全

    //构造器私有化
    private void Lamplight() {
    }

    //实例
    private static Lamplight instance;
    //获得实例
    public static Lamplight getInstance() {
        if (instance == null) {
            instance = new Lamplight();
        }
        return instance;
    }

    //开启灯光
    public void on() {
        System.out.println("开启灯光!");
    }

    //关闭灯光
    public void off() {
        System.out.println("关闭灯光!");
    }

    //亮度
    private int luminance = 50;

    //调节亮度
    public void luminance(int luminance) {
        if (this.luminance + luminance > 100) {
            System.out.println("灯光亮度+" + (100 - this.luminance));
            this.luminance = 100;
            return;
        }

        if (this.luminance + luminance < 0) {
            System.out.println("灯光亮度-" + this.luminance);
            this.luminance = 0;
            return;
        }

        this.luminance += luminance;
        System.out.println("灯光亮度" + luminance);
    }
}
