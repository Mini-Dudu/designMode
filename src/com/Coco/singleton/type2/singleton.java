package com.Coco.singleton.type2;

//饿汉式(静态代码块)
public class singleton {
    //1. 构造器私有化
    private singleton() {
    }

    //2. 本类内部提供私有实例
    private static singleton instance;

    //在静态代码块中创建单例对象
    static {
        instance = new singleton();
    }

    //3. 向外提供一个公有地静态方法, 返回实例
    public static singleton getInstance() {
        return instance;
    }


    //优缺点说明:

    //1. 优点:写法简单,就是在类装载的时候就完成了实例化.避免了线程同步问题.

    //2. 缺点:在类装载的时候就完成了实例化, 没有达到 Lazy Loading 的效果.如果从始至终都未使用过该实例,则会造成内存的浪费.

    //3. 这种方式基和方式一类似, 只不过将类实例化的过程放在了静态代码块中, 也是在类转载的时候执行静态代码块中的代码进行实例化, 初始化实例.

    //4. 结论: 这种单例模式可以使用, 但是可能造成内存浪费.
}
