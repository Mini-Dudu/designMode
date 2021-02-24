package com.Coco.singleton.type3;

//懒汉式(线程不安全)
public class singleton {
    //1. 构造器私有化
    private singleton() {
    }

    //2. 本类内部提供私有实例
    private static singleton instance;

    //3. 向外提供一个公有地静态方法, 返回实例
    public static singleton getInstance() {
        if (instance == null) {
            instance = new singleton();
        }
        return instance;
    }


    //优缺点说明:

    //1. 起到里 lazy loading 的效果, 但是只能在单线程下使用.

    //2. 缺点:在多线程下使用, 一个线程进入了 if 语句中,还未来得及往下执行,另一个线程也进入 if 语句中,
    // 这时便会产生多个实例. 所以在多线程环境下不可以使用这种方式.

    //3. 结论: 在实际开发中, 禁止使用这种方式.
}
