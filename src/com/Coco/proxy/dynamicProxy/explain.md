# 动态代理



### 基本介绍

1. 代理对象不需要实现接口, 但是目标对象要实现接口, 否则不能动态代理
2. 代理对象的生成是利用 JDK 中的 API , 动态的在内存中构建代理对象.
3. 动态代理也叫做JDK代理, 接口代理. 

* JDK 中生成代理对象的 API

  * 代理类所在包: java.lang.reflect.Proxy

  * JDk 实现代理只需要使用 newProxyInstance 方法, 但是该方法需要接受三个参数, 完整的写法:

    ```
    static Object newProxyInstance(ClassLoader loader, Class<?>[] instance, InvocationHandler h)
    ```

    ​