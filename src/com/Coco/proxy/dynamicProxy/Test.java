package com.Coco.proxy.dynamicProxy;

public class Test {
    public static void main(String[] args) {
        //创建目标对象
        ITeacherDao target = new TeacherDao();

        //给目标对象创建代理对象
        ITeacherDao proxyInstance = (ITeacherDao)new ProxyFactory(target).getProxyInstance();

        System.out.println(proxyInstance.getClass());
    }
}
