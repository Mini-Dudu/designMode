package com.Coco.memo.memento;

import java.util.ArrayList;
import java.util.List;

public class Caretaker {
    //备忘录对象列表
    private List<Memento> mementos = new ArrayList<Memento>();

    //添加备忘录对象到列表中
    public void add(Memento memento) {
        mementos.add(memento);
    }

    //获取备忘录对象
    public Memento getMemento(int index) {
        return mementos.get(index);
    }
}
