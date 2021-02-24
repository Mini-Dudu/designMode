package com.Coco.iterator.iterator;

//系 (专业)
public class Department {
    //系名称
    private String name;

    //描述
    private String des;

    //构造器
    public Department(String name, String des) {
        this.name = name;
        this.des = des;
    }

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
