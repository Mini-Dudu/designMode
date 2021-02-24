package com.Coco.proxy.staticProxy;

public class TeacherDao implements ITeacherDao {
    @Override
    public void teacher() {
        System.out.println("老师授课中....");
    }
}
