package com.Coco.proxy.staticProxy;

//代理对象, 静态代理
public class TeacherDaoProxy implements ITeacherDao{
    //目标对象, 通过接口来聚合
    private ITeacherDao target;

    //构造器
    public TeacherDaoProxy(ITeacherDao target) {
        this.target = target;
    }

    @Override
    public void teacher() {
        //其他操作
        System.out.println("开始代理....");
        target.teacher();
        //其他操作
    }
}
