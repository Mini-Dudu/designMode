package com.Coco.proxy.dynamicProxy;

public class TeacherDao implements ITeacherDao {
    @Override
    public void teacher() {
        System.out.println("老师授课中....");
    }
}
