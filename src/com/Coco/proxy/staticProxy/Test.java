package com.Coco.proxy.staticProxy;

public class Test {
    public static void main(String[] args) {
        //创建目标对象, 被代理对象
        TeacherDao teacherDao = new TeacherDao();

        //代理对象
        TeacherDaoProxy teacherDaoProxy = new TeacherDaoProxy(teacherDao);

        //通过代理对象, 调用被代理对象的方法. 即执行的是代理对象的方法, 代理对象在去调用目标对象的方法.
        teacherDaoProxy.teacher();
    }
}
