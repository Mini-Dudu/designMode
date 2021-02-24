package com.Coco.facade.facade;

//立体声系统
public class Stereo {
    //使用单例模式---静态内部类

    //构造器私有化
    private void Stereo() {
    }

    //本类内部提供私有化静态内部类
    private static class Instance {
        //静态内部类内 提供私有化静态常量
        private static final Stereo instance = new Stereo();
    }

    //获得实例
    public static Stereo getInstance() {
        return Instance.instance;
    }

    //开机
    public void on() {
        System.out.println("立体声开机!");
    }

    //关机
    public void off() {
        System.out.println("立体声关机!");
    }

    //音量
    private int volume = 50;

    //音量的加减
    public void volume(int volume) {
        if (this.volume + volume > 100) {
            this.volume = 100;
            return;
        }

        if (this.volume + volume < 0) {
            this.volume = 0;
            return;
        }

        this.volume += volume;
    }

}
