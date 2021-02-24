package com.Coco.facade.facade;

//屏幕
public class Screen {
    //使用单例模式---静态内部类

    //1. 构造器私有化
    private void Screen() {}

    //2. 本类内部提供静态内部类
    private static class Instance {
        //类内部提供静态常量供私有实例
        private static final Screen instance = new Screen();
    }

    //3. 获得实例
    public static Screen getInstance() {
        return Instance.instance;
    }

    //上升
    public void up() {
        System.out.println("屏幕上升!");
    }

    //下降
    public void down() {
        System.out.println("屏幕下降!");
    }
}
