package com.Coco.memo.memento;

public class Memento {
    //状态信息
    private String state;

    //构造器
    public Memento(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }
}
