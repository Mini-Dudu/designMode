package com.Coco.facade.facade;

//爆米花机
public class Popcorn {
    //使用单例模式---懒汉式---静态代码块

    //构造器私有化
    public Popcorn() {
    }

    //实例
    private static Popcorn instance;

    static {
        instance = new Popcorn();
    }

    //获得实例
    public static Popcorn getInstance() {
        return instance;
    }

    //开机
    public void on() {
        System.out.println("爆米花机开机!");
    }

    //true 为暂停, false 为播放
    private boolean isPause = false;

    //暂停/播放
    public void player() {
        if (!isPause) {
            System.out.println("开始爆米花!");
            isPause = !isPause;
        } else {
            System.out.println("暂停爆米花!");
            isPause = !isPause;
        }
    }

    //true 为暂停出爆米花, false 为出爆米花
    private Boolean isPop = false;

    //出爆米花/暂停出爆米花
    public void pop() {
        if (!isPop) {
            System.out.println("正在出爆米花!");
            isPop = !isPop;
        } else {
            System.out.println("暂停出爆米花!");
            isPop = !isPop;
        }
    }

    //关机
    public void off() {
        System.out.println("爆米花机关机!");
    }
}
