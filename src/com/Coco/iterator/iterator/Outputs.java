package com.Coco.iterator.iterator;

import java.util.Iterator;
import java.util.List;

//输出类
public class Outputs {
    //学院集合
    List<College> collegeList;

    public Outputs(List<College> collegeList) {
        this.collegeList = collegeList;
    }

    //遍历所有学院, 然后调用 printDeparment() 输出各个学院的系
    public void printCollege() {
        // 先从 collegeList 中取出各个学院, Java 中的 List 已经实现了 Iterator
        Iterator<College> iterator = collegeList.iterator();

        while (iterator.hasNext()) {
            College next = iterator.next();
            System.out.println("==========" + next.getName() + "==========");
            //得到对应的迭代器, 并进行输出
            printDeparment(next.createIterator());
        }
    }

    //输出 学院输出 系
    public void printDeparment(Iterator iterator) {
        while (iterator.hasNext()) {
            Department d = (Department)iterator.next();
            System.out.println(d.getName() + "-----" + d.getDes());
        }
    }
}
