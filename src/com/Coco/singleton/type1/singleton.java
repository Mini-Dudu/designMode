package com.Coco.singleton.type1;

//饿汉式(静态常量)
public class singleton {
    //1. 构造器私有化
    private singleton() {
    }

    //2. 本类内部创建实例
    private static final singleton instance = new singleton();

    //3. 向外提供一个公有地静态方法, 返回实例
    public static singleton getInstance() {
        return instance;
    }


    //优缺点说明:

    //1. 优点:写法简单,就是在类装载的时候就完成了实例化.避免了线程同步问题.

    //2. 缺点:在类装载的时候就完成了实例化, 没有达到 Lazy Loading 的效果.如果从始至终都未使用过该实例,则会造成内存的浪费.

    //3. 这种方式基于 classloder 机制避免了多线程的同步问题,不过, instance 在类装载的时候就实例化,
    // 在单例模式中大多都是调用getInstance方法, 但是导致类装载的原因有多种, 因此不能确定没有其他的方式(或者其他的静态方法)导致类装载
    // 这个时候初始化 instance 就没有达到 lazy loading 的效果

    //4. 结论: 这种单例模式可以使用, 但是可能造成内存浪费.
}
