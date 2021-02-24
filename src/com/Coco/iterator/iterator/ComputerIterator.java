package com.Coco.iterator.iterator;

import java.util.Iterator;

//计算机系
public class ComputerIterator implements Iterator {
    //这里我们需要知道 department 是以怎样的方式存放
    Department[] departments;

    //遍历的位置
    int position = 0;

    //构造器
    public ComputerIterator(Department[] departments) {
        this.departments = departments;
    }

    @Override
    public boolean hasNext() {
        if (position >= departments.length || departments[position] == null) {
            return false;
        }
        return true;
    }

    @Override
    public Object next() {
        Department departnet = departments[position];
        position++;
        return departnet;
    }

    @Override
    public void remove() {
        //默认空实现
    }
}
