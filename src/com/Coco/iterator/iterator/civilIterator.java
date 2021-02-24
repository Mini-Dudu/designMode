package com.Coco.iterator.iterator;

import java.util.Iterator;
import java.util.List;

public class civilIterator implements Iterator {

    //信息工程学院以 List 方式存储系
    List<Department> departmentList;

    //索引
    int index = -1;

    public civilIterator(List<Department> departmentList) {
        this.departmentList = departmentList;
    }

    @Override
    public boolean hasNext() {
        if (index >= departmentList.size() - 1) {
            return false;
        }else {
            index++;
        }
        return true;
    }

    @Override
    public Object next() {
        return departmentList.get(index);
    }

    @Override
    public void remove() {
        //空实现
    }
}
