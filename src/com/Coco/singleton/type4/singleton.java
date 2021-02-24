package com.Coco.singleton.type4;

//懒汉式(线程安全, 同步方法)
public class singleton {
    //1. 构造器私有化
    private singleton() {
    }

    //2. 本类内部提供私有实例
    private static singleton instance;

    //3. 向外提供一个公有地静态方法, 当用到该方法时, 才去创建实例
    public static synchronized singleton getInstance() {
        if (instance == null) {
            instance = new singleton();
        }
        return instance;
    }


    //优缺点说明:

    //1. 优点:起到里 lazy loading 的效果, 解决了线程不安全的问题.

    //2. 缺点:效率低下, 每个线程在想要获取类实例的时候, 执行 getInstance()方法都要进行同步.
    // 而其实这个方法只执行一次实例化就够了, 后面的想要直接 return 就行. 方法进行同步效率太低.

    //3. 结论: 在实际开发中, 不推荐使用这种方式.
}
