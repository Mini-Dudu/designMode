package com.Coco.iterator.iterator;

import java.util.Iterator;

//计算机学院
public class Computer implements College {
    Department[] departments;

    //保存当前数组的对象个数
    int numOf = 0;

    public Computer() {
        //为了测试方便; 这里直接写死
        departments = new Department[5];
        addDepartment("Java 专业", "Java 有点难!");
        addDepartment("PHP 专业", "PHP 不是很难!");
        addDepartment("C++ 专业", "C++ 也有点难!");
        addDepartment("C# 专业", "C# 有点晕!");
        addDepartment("Go 专业", "Go 一点都不难!");
    }

    @Override
    public String getName() {
        return "计算机系";
    }

    @Override
    public void addDepartment(String name, String desc) {
        Department department = new Department(name, desc);
        this.departments[numOf] = department;
        numOf++;
    }

    @Override
    public Iterator createIterator() {
        return new ComputerIterator(departments);
    }
}
