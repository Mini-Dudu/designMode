package com.Coco.singleton.type8;

//枚举
enum singleton {
    Instance    //属性
}

//优缺点说明:

//1. 枚举借助JDK1.5中添加的枚举来实现单例模式. 不仅能避免多线程同步问题, 而且还能防止反序列化重新创建新的对象.

//2. 这种方式是 Effective Java 作者 Josh Bloch 提倡的方式.

//3. 结论: 推荐使用.