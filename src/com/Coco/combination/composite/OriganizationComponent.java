package com.Coco.combination.composite;

public abstract class OriganizationComponent {
    private String name;
    private String des;

    //添加操作
    protected void add(OriganizationComponent origanizationComponent) {
        throw new UnsupportedOperationException();
    }

    //移出操作
    protected void remove(OriganizationComponent origanizationComponent) {
        throw new UnsupportedOperationException();
    }

    //构造器
    public OriganizationComponent(String name, String des) {
        this.name = name;
        this.des = des;
    }

    //抽象打印的方法
    protected abstract void print();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }
}
