package com.Coco.memo.game;

import java.util.ArrayList;
import java.util.HashMap;

//守护者对象, 保存游戏角色对象的状态
//用来还原备忘对象
public class Caretaker {
    //只保存一次状态
    private Memento memento;

    //保存多次状态
    private ArrayList<Memento> mementos;

    //保存多个游戏角色的状态
    private HashMap<String, ArrayList<Memento>> rolesMemento;


    //这里只写 保存一个角色对象的状态
    public Memento getMemento() {
        return memento;
    }

    public void setMemento(Memento memento) {
        this.memento = memento;
    }
}
