package com.Coco.singleton.type6;

//双重检查
//懒汉式(双重检查)
public class singleton {
    //1. 构造器私有化
    private singleton() {
    }

    //2. 本类内部提供私有实例
    private static volatile singleton instance;

    //3. 向外提供一个公有地静态方法, 当用到该方法时, 才去创建实例
    public static singleton getInstance() {
        if (instance == null) {
            synchronized (singleton.class) {
                if (instance == null) {
                    instance = new singleton();
                }
            }
        }
        return instance;
    }


    //说明:

    //1. 优点:既解决了线程安全, 又解决了 lazy loading 问题, 同时保证了效率,推荐使用.

    //2. double-check概念是多线程开发中常使用到的, 如上代码中, 我们进行了两次 if 判断, 这样就可以保证只进行一次实例化操作了,
    // 后面在次访问时, 实例对象已经不为 null 了,会直接 return 实例化对象, 也避免代码块的反复同步.

    //3. 结论:在实际开发中,推荐使用这种单例模式.
}
