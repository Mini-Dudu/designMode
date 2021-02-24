package com.Coco.visitor.visitor;

import com.Coco.visitor.visitor.estimate.Action;
import com.Coco.visitor.visitor.spectator.Person;

import java.util.LinkedList;
import java.util.List;

//数据结构, 管理很多的 person (观众, 评分者)
public class ObjectStructure {

    //维护了一个集合
    private List<Person> personList = new LinkedList<>();

    //用于记录上一次添加测评者的人数, 防止显示测评结果时更改以前的测评;
    int len = 0;

    //添加到 personList
    public void attach(Person person) {
        personList.add(person);
    }

    //将 person 从 personList 中移除
    public void detach(Person person) {
        personList.remove(person);
    }

    //显示测评情况
    public void show(Action action) {
        for (int i = len; i < personList.size(); i++) {
            personList.get(i).accept(action);
        }
       this.len = personList.size();
    }
}
