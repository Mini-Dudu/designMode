package com.Coco.singleton.type7;

//懒汉式(静态内部类)
public class singleton {
    //1. 构造器私有化
    private singleton() {
    }

    //2. 本类内部提供静态内部类
    private static class Instance {
        //类内部提供静态常量供私有实例
        private static final singleton instance = new singleton();
    }

    //3. 向外提供一个公有地静态方法, 当用到该方法时, 才去创建实例
    public static singleton getInstance() {
        return Instance.instance;
    }


    //说明:

    //1. 这种方式采用了类装载的机制来保证初始化实例时只有一个线程.

    //2. 静态内部类方式在 singleton 类被装载时并不会立即实例化, 而是在须要的实例化时,
    // 调用 getInstance()方法, 才会装载 Instance 类, 从而完成实例化.

    //3. 类的静态属性只会在第一次加载类的时候初始化, 所以在这里, JVM帮助我们保证了线程的安全性,
    // 在类进行初始化时, 别的线程无法进入.

    //4. 优点: 避免了线程不安全, 利用静态内部类的特点实现 lazy loading 问题, 效率高.

    //3. 结论:在实际开发中,推荐使用.
}
