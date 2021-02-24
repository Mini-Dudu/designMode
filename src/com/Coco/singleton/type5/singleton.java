package com.Coco.singleton.type5;

//懒汉式(线程不安全, 同步代码块)
public class singleton {
    //1. 构造器私有化
    private singleton() {
    }

    //2. 本类内部提供私有实例
    private static singleton instance;

    //3. 向外提供一个公有地静态方法, 当用到该方法时, 才去创建实例
    public static singleton getInstance() {
        if (instance == null) {
            synchronized (singleton.class) {
                instance = new singleton();
            }
        }
        return instance;
    }


    //优缺点说明:

    //1. 这种方式, 本意是想对方式四进行改进, 因为方式四的同步方法效率太低. 改为同步产生实例化的代码.

    //2. 但是这种同步方式起不到线程同步的作用. 会和方式三遇到一样的情形, 假如一个线程进入了 if 语句中,
    // 还未来得及进行实例化, 另一个(或者多个)线程也刚好进入了 if 语句, 这时候会有一个线程先进入实例化,
    // 而其他线程在等待,会依次进行实例化的操作, 这时便会产生多个实例.

    //3. 结论:在实际开发中,禁止使用这种方式.
}
